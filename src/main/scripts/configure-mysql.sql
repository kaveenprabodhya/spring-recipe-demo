#Create Databases
CREATE DATABASE demo_dev;
CREATE DATABASE demo_prod;

#Create database service accounts
CREATE USER 'demo_dev_user'@'localhost' IDENTIFIED BY 'qwerty';
CREATE USER 'demo_prod_user'@'localhost' IDENTIFIED BY 'qwerty';
CREATE USER 'demo_dev_user'@'%' IDENTIFIED BY 'qwerty';
CREATE USER 'demo_prod_user'@'%' IDENTIFIED BY 'qwerty';

#Database grants
GRANT SELECT ON demo_dev.* to 'demo_dev_user'@'localhost';
GRANT INSERT ON demo_dev.* to 'demo_dev_user'@'localhost';
GRANT DELETE ON demo_dev.* to 'demo_dev_user'@'localhost';
GRANT UPDATE ON demo_dev.* to 'demo_dev_user'@'localhost';
GRANT SELECT ON demo_prod.* to 'demo_prod_user'@'localhost';
GRANT INSERT ON demo_prod.* to 'demo_prod_user'@'localhost';
GRANT DELETE ON demo_prod.* to 'demo_prod_user'@'localhost';
GRANT UPDATE ON demo_prod.* to 'demo_prod_user'@'localhost';
GRANT SELECT ON demo_dev.* to 'demo_dev_user'@'%';
GRANT INSERT ON demo_dev.* to 'demo_dev_user'@'%';
GRANT DELETE ON demo_dev.* to 'demo_dev_user'@'%';
GRANT UPDATE ON demo_dev.* to 'demo_dev_user'@'%';
GRANT SELECT ON demo_prod.* to 'demo_prod_user'@'%';
GRANT INSERT ON demo_prod.* to 'demo_prod_user'@'%';
GRANT DELETE ON demo_prod.* to 'demo_prod_user'@'%';
GRANT UPDATE ON demo_prod.* to 'demo_prod_user'@'%';