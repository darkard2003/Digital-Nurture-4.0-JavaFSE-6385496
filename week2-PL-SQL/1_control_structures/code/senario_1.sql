set serveroutput on;

DECLARE
    cursor old_customers is 
        select customer_id, age, loan_interest_rate
        from customers
        where age > 60
        for update of loan_interest_rate;

        new_rate number(4, 2);
BEGIN
    dbms_output.put_line('Discounting 1% to each customer older than 60');
    for rec in old_customers loop
        new_rate := rec.loan_interest_rate - 1;
        if new_rate < 0 then
            new_rate := 0;
        end if;

        update customers
            set loan_interest_rate = new_rate
            where customer_id = rec.customer_id;
        dbms_output.put_line('updated ' || rec.customer_id || ' interest from ' || rec.loan_interest_rate || ' to ' || new_rate);
    end loop;
END;
/
