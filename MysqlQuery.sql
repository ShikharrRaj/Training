use banksystem;
/*create table bankdemo(id int primary key auto_increment,BankName varchar(255) not null,BankLocation text not null );
--insert into bankdemo(BankName,BankLocation) values('Axis','Mumbai'),('SBI','Delhi');
/*Alter table Customer_Table modify customer_phno biginit;*/
/*insert into Customer_Table(customer_name,customer_email,customer_password,customer_phno,customer_cardNo,id) values('rohan','rohan@gmail.com','123456',254622331,665645587213,5);*/
/*insert into Account(account_no,accounttype,accountbalance,customerid) values(123456,'savings',20000,5);*/
select customer_name,customer_email,account_no,accountbalance,accounttype from customer_table inner join Account ON customer_table.id=Account.customerid;
select customer_name,customer_email,account_no,accountbalance,accounttype from customer_table left join Account ON customer_table.id=Account.customerid;
select customer_name,customer_email,account_no,accountbalance,accounttype from customer_table right join Account ON customer_table.id=Account.customerid;
select customer_name,customer_email,account_no,accountbalance,accounttype from customer_table cross join Account ON customer_table.id=Account.customerid;
select * from customer_table join Account where customer_table.id=Account.customerid;