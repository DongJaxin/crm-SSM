/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50536
Source Host           : localhost:3306
Source Database       : crm

Target Server Type    : MYSQL
Target Server Version : 50536
File Encoding         : 65001

Date: 2018-01-14 22:38:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `cust_id` int(32) NOT NULL AUTO_INCREMENT,
  `cust_name` varchar(50) DEFAULT NULL,
  `cust_user_id` int(32) DEFAULT NULL,
  `cust_create_id` int(32) DEFAULT NULL,
  `cust_source` varchar(50) DEFAULT NULL,
  `cust_industry` varchar(50) DEFAULT NULL,
  `cust_level` varchar(32) DEFAULT NULL,
  `cust_linkman` varchar(50) DEFAULT NULL,
  `cust_phone` varchar(64) DEFAULT NULL,
  `cust_mobile` varchar(16) DEFAULT NULL,
  `cust_zipcode` varchar(10) DEFAULT NULL,
  `cust_address` varchar(100) DEFAULT NULL,
  `cust_createtime` datetime DEFAULT NULL,
  PRIMARY KEY (`cust_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES ('1', '小张', '10', '1', '5', '1', '7', '小张', '12345678', '12345678912', '456400', '安阳', '2018-01-02 16:01:12');
INSERT INTO `customer` VALUES ('2', '小王', '11', '1', '6', '2', '8', '小王', null, '12345678978', '456455', '安阳', '2018-01-02 16:02:57');
INSERT INTO `customer` VALUES ('3', '小李', '12', '1', '5', '3', '7', '小李', null, null, null, null, '2018-01-03 14:42:25');

-- ----------------------------
-- Table structure for dict
-- ----------------------------
DROP TABLE IF EXISTS `dict`;
CREATE TABLE `dict` (
  `dict_id` int(32) NOT NULL AUTO_INCREMENT,
  `dict_type_code` varchar(10) DEFAULT NULL,
  `dict_type_name` varchar(50) DEFAULT NULL,
  `dict_item_name` varchar(50) DEFAULT NULL,
  `dict_item_code` varchar(10) DEFAULT NULL,
  `dict_sort` int(10) DEFAULT NULL,
  `dict_enable` char(1) DEFAULT NULL,
  `dict_memo` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`dict_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dict
-- ----------------------------
INSERT INTO `dict` VALUES ('1', '001', '客户所属行业', '酒店旅游', '', '2', '1', null);
INSERT INTO `dict` VALUES ('2', '001', '客户所属行业', '电子商务', '', '1', '1', null);
INSERT INTO `dict` VALUES ('3', '001', '客户所属行业', '教育培训', null, '3', '1', null);
INSERT INTO `dict` VALUES ('4', '001', '客户所属行业', '房地产', null, '4', '1', null);
INSERT INTO `dict` VALUES ('5', '002', '客户来源', '网络营销', '', '2', '1', '');
INSERT INTO `dict` VALUES ('6', '002', '客户来源', '电话营销', null, '1', '1', null);
INSERT INTO `dict` VALUES ('7', '003', '客户级别', 'VIP客户', null, '2', '1', null);
INSERT INTO `dict` VALUES ('8', '003', '客户级别', '普通客户', null, '1', '1', null);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(32) NOT NULL AUTO_INCREMENT,
  `user_code` varchar(32) DEFAULT NULL,
  `user_name` varchar(50) DEFAULT NULL,
  `user_password` varchar(32) DEFAULT NULL,
  `user_state` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '1', '小明', '1', '1');
