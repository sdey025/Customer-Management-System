/*
MySQL Data Transfer
Source Host: localhost
Source Database: test
Target Host: localhost
Target Database: test
Date: 25-04-2021 00:20:22
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for customers1
-- ----------------------------
DROP TABLE IF EXISTS `customers1`;
CREATE TABLE `customers1` (
  `ID` int(11) NOT NULL,
  `NAME` varchar(20) NOT NULL,
  `ADDRESS` char(25) default NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `customers1` VALUES ('101', 'Raja', 'Bhagalpur');
INSERT INTO `customers1` VALUES ('105', 'Narayan', 'Bekapur');
INSERT INTO `customers1` VALUES ('106', 'Dev', 'Deep');
INSERT INTO `customers1` VALUES ('109', 'Shivasish', 'Munger');
INSERT INTO `customers1` VALUES ('110', 'Shivasish', 'Munger');
INSERT INTO `customers1` VALUES ('113', 'Giles', 'Khagaria');
