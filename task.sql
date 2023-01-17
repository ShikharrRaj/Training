create database bank_system;
use bank_system;

/*making bank table*/
create table bank(name char(255) not null,address varchar(255) not null,bankid int primary key auto_increment);
insert into bank (name ,address , bankid) values ('AXIS', 'Mumbai',11),('SBI', 'bangalore',22);

/*making customer table*/
create table customer(customer_id int primary key auto_increment,customer_name char(255) not null, customer_email char(255) not null, customer_password int not null,customer_phno int not null,customer_cardNo BIGINT not null);
insert into customer(customer_name,customer_email,customer_password,customer_phno,customer_cardNo) values('shikhar','shikhar@gmail.com','1234',996956415,44372561254),('saket','saket@gmail.com','12364',57846955,7751261254);;

/*making account table*/
create table account( account_id int primary key auto_increment,account_no bigint, account_balance BIGINT not null, account_type varchar(255) not null,customer_id int, bankid int,foreign key(customer_id) references customer(customer_id),foreign key(bankid) references bank(bankid));
insert into account(account_no , account_balance , account_type,customer_id) values (123456, 1000.00, 'savings',1 ),(578946, 15000.00, 'current',2 );

/*making transaction table*/
create table transaction(transaction_id int primary key auto_increment, account_id int, foreign key(account_id) references account(account_id),transaction_date date, transaction_amount bigint,transaction_type varchar(255),current_balance int );
insert into transaction(account_id,transaction_date,transaction_amount,transaction_type,transaction_time) values(6,CURDATE(),2000,'Withdraw',CURRENT_TIMESTAMP),(7,CURDATE(),5000,'depost',CURRENT_TIMESTAMP);

/*making atm table*/
create table atm(atm_id int primary key auto_increment,Deposit bit,Withdraw bit,Check_Balance bit,transaction_id int,foreign key(transaction_id) references transaction(transaction_id) );
insert into atm(Deposit , Withdraw , Check_Balance,transaction_id) values (0, 1, 0,8),(1,0,0,9);


select customer_name,customer_email,account_no,account_balance,account_type, name, address, bankid,Deposit, Withdraw, Check_Balance from customer inner join account ON customer.id=account.customer_id inner join bank ON account.account_id=bank.bankid inner join atm ON bank.bankid=atm.atm_id ;







