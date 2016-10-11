# servlet-request-test
servlet-request-test

The Database

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
```
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `sex` varchar(2) NOT NULL,
  `hobby` varchar(50) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `userName` (`userName`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
```

-- ----------------------------
-- Records of user
-- ----------------------------
```
INSERT INTO `user` VALUES ('1', '张三', '123456', '男', '计算机,科幻', '1996-01-01');
INSERT INTO `user` VALUES ('2', '李四', '654321', '男', '攀岩, 蹦极', '1995-01-01');
```
