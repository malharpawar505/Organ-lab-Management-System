/*
MySQL Data Transfer
Source Host: localhost
Source Database: organlabmanagement
Target Host: localhost
Target Database: organlabmanagement
Date: 05-10-2021 09:51:20
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for login
-- ----------------------------
DROP TABLE IF EXISTS `login`;
CREATE TABLE `login` (
  `username` varchar(20) DEFAULT NULL,
  `pwd` varchar(8) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for receiver
-- ----------------------------
DROP TABLE IF EXISTS `receiver`;
CREATE TABLE `receiver` (
  `rid` int(11) NOT NULL DEFAULT '0',
  `rname` varchar(30) DEFAULT NULL,
  `rage` int(11) DEFAULT NULL,
  `rgen` varchar(10) DEFAULT NULL,
  `rblood` varchar(10) DEFAULT NULL,
  `rdis` varchar(40) DEFAULT NULL,
  `raddr` varchar(50) DEFAULT NULL,
  `rstate` varchar(20) DEFAULT NULL,
  `rcity` varchar(20) DEFAULT NULL,
  `rorgan` varchar(15) DEFAULT NULL,
  `rdate` date DEFAULT NULL,
  `ph` varchar(10) DEFAULT NULL,
  `status` varchar(10) DEFAULT NULL,
  `did` int(11) DEFAULT NULL,
  `dname` varchar(80) DEFAULT NULL,
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for registration
-- ----------------------------
DROP TABLE IF EXISTS `registration`;
CREATE TABLE `registration` (
  `rid` int(11) NOT NULL DEFAULT '0',
  `pname` varchar(30) DEFAULT NULL,
  `page` int(11) DEFAULT NULL,
  `pgen` varchar(10) DEFAULT NULL,
  `pblood` varchar(4) DEFAULT NULL,
  `pdis` varchar(10) DEFAULT NULL,
  `paddr` varchar(40) DEFAULT NULL,
  `pstate` varchar(15) DEFAULT NULL,
  `pcity` varchar(20) DEFAULT NULL,
  `porgan` varchar(10) DEFAULT NULL,
  `rdate` date DEFAULT NULL,
  `ph` varchar(10) DEFAULT NULL,
  `status` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `login` VALUES ('organlab', 'organ505');
INSERT INTO `receiver` VALUES ('1', 'Adesh Kale', '24', 'Male', 'A+', 'No', 'Varad Road', 'MAHARASHTRA', 'MUMBAI', 'KIDNEY', '2021-10-03', '8888703425', 'y', '1', 'Keshav Mishra');
INSERT INTO `receiver` VALUES ('2', 'Jay Pradhan', '30', 'Male', 'B+', 'No', 'Shivaji Chok', 'MAHARASHTRA', 'AURANGABAD', 'HEART', '2021-10-03', '9439020922', 'y', '2', 'Smita Hare');
INSERT INTO `receiver` VALUES ('3', 'Arti Gupta', '34', 'FeMale', 'AB+', 'No', 'Kalavti Nagar', 'MAHARASHTRA', 'PUNE', 'HEART', '2021-10-23', '3221122112', 'y', '6', 'Rani Kadam');
INSERT INTO `registration` VALUES ('1', 'Keshav Mishra', '59', 'Male', 'A+', 'No', 'Kalavti Hospital', 'MAHARASHTRA', 'PUNE', 'KIDNEY', '2021-10-03', '9423715434', 'Y');
INSERT INTO `registration` VALUES ('2', 'Smita Hare', '60', 'FeMale', 'B+', 'NO', 'Savatamali Chok', 'MAHARASHTRA', 'PUNE', 'HEART', '2021-10-03', '9665432345', 'Y');
INSERT INTO `registration` VALUES ('3', 'Kajal Shinde', '47', 'FeMale', 'A+', 'NO', 'Shinde nagar', 'MAHARASHTRA', 'AURANGABAD', 'KIDNEY', '2021-10-03', '7878675645', 'n');
INSERT INTO `registration` VALUES ('4', 'Tejal Kasture', '34', 'FeMale', 'B+', 'NO', 'Yogeshwari nagari', 'MAHARASHTRA', 'PUNE', 'KIDNEY', '2021-10-03', '7207619045', 'n');
INSERT INTO `registration` VALUES ('5', 'Depali Kadam', '23', 'FeMale', 'A+', 'No', 'Ambedkar Chok', 'MAHARASHTRA', 'PUNE', 'HEART', '2021-10-03', '2021232112', 'n');
INSERT INTO `registration` VALUES ('6', 'Rani Kadam', '67', 'FeMale', 'AB+', 'NO', 'Keshav Nagar', 'MAHARASHTRA', 'PUNE', 'HEART', '2019-10-21', '3443212112', 'Y');
