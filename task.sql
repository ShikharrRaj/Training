create database bank_system;
use bank_system;

create table bank(name char(255) not null,address varchar(255) not null,bankid int primary key auto_increment);
insert into bank (name ,address , bankid) values ('AXIS', 'Mumbai',11),('SBI', 'bangalore',22);

create table customer(customer_id int primary key auto_increment,customer_name char(255) not null, customer_email char(255) not null, customer_password int not null,customer_phno int not null,customer_cardNo BIGINT not null);
insert into customer(customer_name,customer_email,customer_password,customer_phno,customer_cardNo) values('shikhar','shikhar@gmail.com','1234',996956415,44372561254),('saket','saket@gmail.com','12364',57846955,7751261254);;


create table account( account_id int primary key auto_increment,account_no bigint, account_balance BIGINT not null, account_type varchar(255) not null,customer_id int, bankid int,foreign key(customer_id) references customer(customer_id),foreign key(bankid) references bank(bankid));
insert into account(account_no , account_balance , account_type,customer_id) values (123456, 1000.00, 'savings',1 ),(578946, 15000.00, 'current',2 );


create table transaction(transaction_id int primary key auto_increment, account_id int, foreign key(account_id) references account(account_id),transaction_date date, transaction_amount bigint,transaction_type varchar(255),current_balance int );
insert into account(account_no , account_balance , account_type,customer_id) values (123456, 1000.00, 'savings',1 ),(578946, 15000.00, 'current',2 );

create table atm ( ATM_ID int primary key auto_increment, Deposit bool, Withdraw bool, Check_Balance bool,foreign key(ATM_ID) references transaction(transaction_id) );

insert into atm(Deposit , Withdraw , Check_Balance) values (0, 1, 0),(1,0,0);

insert into transaction(account_id,transaction_date,transaction_amount,transaction_type,transaction_time) values(1,CURDATE(),2000,'Withdraw',CURRENT_TIMESTAMP),(2,CURDATE(),5000,'depost',CURRENT_TIMESTAMP);

//insert into transaction (Transaction_Type, Transaction_Amount, Transaction_Date, Transaction_TIme, Account_ID) values ('withdraw',200.00, CURDATE(), CURRENT_TIMESTAMP,1 ),('deposit',400.00,CURDATE() ,CURRENT_TIMESTAMP ,2);



select customer_name,customer_email,account_no,account_balance,account_type, name, address, bankid,Deposit, Withdraw, Check_Balance from customer inner join account ON customer.ID=account.customer_id inner join bank ON account.account_id=bank.bankid inner join atm ON bank.bankid=ATM.ATM_ID ;

create table transaction ( Transaction_ID int primary key auto_increment, Transaction_Type varchar(255) not null, Transaction_Amount float not null, Transaction_Date date, Transaction_TIme time, Account_ID int, foreign key(Account_ID) references account(Account_ID) );

insert into transaction (Transaction_Type, Transaction_Amount, Transaction_Date, Transaction_TIme, Account_ID) values ('withdraw',200.00, CURDATE(), CURRENT_TIMESTAMP,1 ),('deposit',400.00,CURDATE() ,CURRENT_TIMESTAMP ,2);





select Customer_Name,Customer_Email,Account_No,Account_Balance,Account_Type, Bank_Name, Bank_Address, Bank_Code,Deposit, Withdraw, Check_Balance from customer inner join account ON customer.ID=account.Customer_ID inner join bank ON account.Account_ID=bank.Bank_ID inner join atm ON bank.Bank_ID=ATM.ATM_ID ;


perform the last query to check if everything working.

