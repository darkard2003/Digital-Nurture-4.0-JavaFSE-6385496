CREATE OR REPLACE PROCEDURE TransferFunds(
    source_id number,
    dest_id number,
    amount number
)
IS
    source_balance Accounts.BALANCE%TYPE;
    v_count NUMBER;
    SOURCE_NOT_FOUND EXCEPTION;
    DEST_NOT_FOUND EXCEPTION;
    INSUFFICIENT_FUND EXCEPTION;
    NON_POSITIVE_AMOUNT EXCEPTION;
BEGIN
    SELECT COUNT(*) INTO v_count FROM ACCOUNTS WHERE ACCOUNT_ID = source_id;
    IF v_count = 0 THEN
        RAISE SOURCE_NOT_FOUND;
    END IF;

    SELECT COUNT(*) INTO v_count FROM ACCOUNTS WHERE ACCOUNT_ID = dest_id;
    IF v_count = 0 THEN
        RAISE DEST_NOT_FOUND;
    END IF;

    IF amount <= 0 THEN
        RAISE NON_POSITIVE_AMOUNT;
    END IF;

    SELECT balance into source_balance
    from ACCOUNTS
    WHERE ACCOUNT_ID = source_id;

    IF source_balance < amount THEN
        RAISE INSUFFICIENT_FUND;
    END IF;

    UPDATE ACCOUNTS
    SET BALANCE = BALANCE - amount
    WHERE ACCOUNT_ID = source_id;

    UPDATE ACCOUNTS
    SET BALANCE = BALANCE + amount
    WHERE ACCOUNT_ID = dest_id;

    dbms_output.put_line('Amount ' || amount || ' Transfered from ' || source_id || ' to ' || dest_id);

EXCEPTION
    WHEN SOURCE_NOT_FOUND THEN
        ROLLBACK;
        dbms_output.put_line('Source account not found');
    WHEN DEST_NOT_FOUND THEN
        ROLLBACK;
        dbms_output.put_line('Destination account not found');
    WHEN NON_POSITIVE_AMOUNT THEN
        ROLLBACK;
        dbms_output.put_line('Amount must be a positive number');
    WHEN INSUFFICIENT_FUND THEN
        ROLLBACK;
        dbms_output.put_line('Insufficient funds in source account');
    WHEN OTHERS THEN
        ROLLBACK;
        dbms_output.put_line('An unexpected error occurred: ' || SQLERRM);
END;

EXECUTE TRANSFERFUNDS(1, 3, 500);
