CREATE DATABASE  IF NOT EXISTS `mortgage_form`;
USE `mortgage_form`;

DROP TABLE IF EXISTS `loan`;

CREATE TABLE `loan` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `sales_price` int(10) DEFAULT NULL,
  `down_payment` int(10) UNSIGNED,
  `mortgage_term` int(10) DEFAULT NULL,
  `length_of_employment` int(10) DEFAULT NULL,
  `monthly_income` int(10) DEFAULT NULL,
  `monthly_commitment` int(10) DEFAULT NULL,
  `first_name` varchar(30) DEFAULT NULL,
  `last_name` varchar(30) DEFAULT NULL,
  `phone_number` int(10) DEFAULT NULL,
   `status` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

INSERT INTO `loan` VALUES 
	(1,500000, 10000, 30, 2, 5000, 1000, 'John', 'Bon', 566464346, ''),
	(2,600000, 20000, 30, 5, 6000, 4000, 'Tom', 'Clone', 676445765, ''),
	(3,300000, 50000, 20, 0, 8000, 2000, 'Leon', 'Zon', 566443342, ''),
	(4,250000, 30000, 10, 5, 13000, 1000, 'Martin', 'Paper', 554354345, ''),
	(5,800000, 20000, 30, 9, 15000, 8000, 'Steven', 'Lee', 600776554, '');