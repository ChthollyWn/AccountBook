/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80027
 Source Host           : localhost:3306
 Source Schema         : accountbook

 Target Server Type    : MySQL
 Target Server Version : 80027
 File Encoding         : 65001

 Date: 15/09/2022 21:08:54
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for accountdata
-- ----------------------------
DROP TABLE IF EXISTS `accountdata`;
CREATE TABLE `accountdata`  (
  `accountID` int NOT NULL AUTO_INCREMENT,
  `typeID` int NOT NULL,
  `accountType` int NOT NULL COMMENT '账户收支类型（收入、支出）',
  `accountTitle` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `accountMoney` float UNSIGNED ZEROFILL NOT NULL,
  `markText` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注',
  `accountTime` datetime NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`accountID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of accountdata
-- ----------------------------
INSERT INTO `accountdata` VALUES (1, 1, 1, '用水支出', 000000000050, '无', '2022-09-13 22:24:51');

-- ----------------------------
-- Table structure for accounttype
-- ----------------------------
DROP TABLE IF EXISTS `accounttype`;
CREATE TABLE `accounttype`  (
  `typeID` int NOT NULL AUTO_INCREMENT,
  `typeName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`typeID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of accounttype
-- ----------------------------
INSERT INTO `accounttype` VALUES (1, '生活用水');
INSERT INTO `accounttype` VALUES (4, '超市购物');
INSERT INTO `accounttype` VALUES (5, '游戏');
INSERT INTO `accounttype` VALUES (6, 'texttype01');

-- ----------------------------
-- Table structure for testdb
-- ----------------------------
DROP TABLE IF EXISTS `testdb`;
CREATE TABLE `testdb`  (
  `test` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of testdb
-- ----------------------------
INSERT INTO `testdb` VALUES ('这里是测试消息');

-- ----------------------------
-- Table structure for userdata
-- ----------------------------
DROP TABLE IF EXISTS `userdata`;
CREATE TABLE `userdata`  (
  `userID` int NOT NULL AUTO_INCREMENT,
  `userName` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `userPwd` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`userID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of userdata
-- ----------------------------
INSERT INTO `userdata` VALUES (1, 'testname', '123');

SET FOREIGN_KEY_CHECKS = 1;
