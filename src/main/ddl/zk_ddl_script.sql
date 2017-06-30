CREATE TABLE `employee_db`.`login_info` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(200) NOT NULL,
  `password` VARCHAR(200) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


CREATE TABLE `employee_db`.`employee_details` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `employee_name` VARCHAR(150) NOT NULL,
  `designation` VARCHAR(100) NOT NULL,
  `salary` DOUBLE NOT NULL,
  `eamil_id` VARCHAR(255) NOT NULL,
  `mobile_no` INT NOT NULL,
  `status` VARCHAR(45) NOT NULL,
  `created_date` DATE NOT NULL,
  `version` INT NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

