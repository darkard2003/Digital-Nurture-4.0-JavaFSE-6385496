set serveroutput on;

DECLARE
    cursor due_customers IS
        select customer_id, customer_name, loan_due_date
        from customers 
        where loan_due_date between SYSDATE and SYSDATE + 30;
BEGIN
    for rec in due_customers loop
        dbms_output.put_line('Dear customer ' || rec.customer_name || ' with id ' || rec.customer_id || ' Your loan is due on ' || TO_CHAR(rec.loan_due_date, 'dd-MON-yyyy'));
    end loop;
END;
/
