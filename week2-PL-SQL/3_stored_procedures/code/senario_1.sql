CREATE PROCEDURE ProcessMonthlyInterest 
IS 
    interest_rate number := 0.01;
BEGIN
    UPDATE Accounts
    SET balance=balance * (1+interest_rate)
    where account_type = 'Savings';

    dbms_output.put_line(SQL%ROWCOUNT || ' Rows updated');
END;

execute PROCESSMONTHLYINTEREST;

