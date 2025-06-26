CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
    dept_id NUMBER,
    bonus NUMBER
)
IS
BEGIN
    dbms_output.put_line('Giving ' || bonus || '% bonus to dept ' || dept_id);
    UPDATE EMPLOYEES
    SET SALARY = SALARY * (1 + bonus/100)
    where DEPARTMENT_ID = dept_id;
    dbms_output.put_line(SQL%ROWCOUNT || ' Rows effected');
EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        dbms_output.put_line('Failed to add bonus');
END;

EXECUTE UPDATEEMPLOYEEBONUS(10, 5);
