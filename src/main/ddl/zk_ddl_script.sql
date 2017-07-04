CREATE DATABASE `employee_db`;

USE `employee_db`;

/*Table structure for table `employee_details` */
DROP TABLE IF EXISTS `employee_details`;
CREATE TABLE `employee_details` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `emp_name` varchar(150) NOT NULL,
  `emp_designation` varchar(100) NOT NULL,
  `salary` double NOT NULL,
  `eamil_id` varchar(255) NOT NULL,
  `mobile_no` varchar(200) NOT NULL,
  `status` varchar(45) NOT NULL,
  `created_date` date NOT NULL,
  `version` int(11) NOT NULL,
  `gender` varchar(20) NOT NULL,
  `emptype` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) 
ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;


/*Table structure for table `login_info` */
DROP TABLE IF EXISTS `login_info`;
CREATE TABLE `login_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(200) NOT NULL,
  `password` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) 
ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

