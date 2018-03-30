declare 
pname semp.empname%type;
psal semp.empsal%type;
begin
for i in 1..5
loop
 select empname, empsal into pname, psal from semp where empid=i;
--dbms_output.put_line('Records are' || i.pid || i.psal);
dbms_output.put_line('name'||pname);
dbms_output.put_line('salary'||psal);
end loop;
end;
/