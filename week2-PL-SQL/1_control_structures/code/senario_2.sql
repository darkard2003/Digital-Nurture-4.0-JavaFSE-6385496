set serveroutput on;

DECLARE
    cursor vip_customers is
        select customer_id, balance, is_vip
        from customers
        where balance > 10000; 
BEGIN
    for rec in vip_customers loop
        if rec.is_vip = False then
            update customers
            set is_vip = True
            where customer_id = rec.customer_id;
        end if;
        dbms_output.put_line('Customer ' || rec.customer_id || ' to vip');
    end loop;
END;
/
