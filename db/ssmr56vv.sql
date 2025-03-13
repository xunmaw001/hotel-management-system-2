-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: ssmr56vv
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `canyindingdan`
--

DROP TABLE IF EXISTS `canyindingdan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `canyindingdan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `dingdanbianhao` varchar(200) DEFAULT NULL COMMENT '订单编号',
  `canyinmingcheng` varchar(200) DEFAULT NULL COMMENT '餐饮名称',
  `fenlei` varchar(200) DEFAULT NULL COMMENT '分类',
  `jiudianmingcheng` varchar(200) DEFAULT NULL COMMENT '酒店名称',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `jiage` varchar(200) DEFAULT NULL COMMENT '价格',
  `shuliang` int(11) NOT NULL COMMENT '数量',
  `zongjiage` int(11) DEFAULT NULL COMMENT '总价格',
  `xiadanshijian` datetime NOT NULL COMMENT '下单时间',
  `liuyanbeizhu` longtext COMMENT '留言备注',
  `yonghuming` varchar(200) DEFAULT NULL COMMENT '用户名',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `kefangmingcheng` varchar(200) NOT NULL COMMENT '客房名称',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  `ispay` varchar(200) DEFAULT '未支付' COMMENT '是否支付',
  PRIMARY KEY (`id`),
  UNIQUE KEY `dingdanbianhao` (`dingdanbianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=1610343792476 DEFAULT CHARSET=utf8 COMMENT='餐饮订单';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `canyindingdan`
--

LOCK TABLES `canyindingdan` WRITE;
/*!40000 ALTER TABLE `canyindingdan` DISABLE KEYS */;
INSERT INTO `canyindingdan` VALUES (1610343525699,'2021-01-11 05:38:45','202111113383344622154','餐饮名称2','主食','B酒店','http://localhost:8080/ssmr56vv/upload/jiudiancanyin_tupian2.jpg','26',2,52,'2021-01-23 13:38:38',NULL,'001','13823888881','1212','否',NULL,'已支付'),(1610343792475,'2021-01-11 05:43:12','202111113425050041886','餐饮名称4','其它','D酒店','http://localhost:8080/ssmr56vv/upload/jiudiancanyin_tupian4.jpg','66',2,132,'2021-01-21 00:00:00',NULL,'666','16459878982','A-1102','是','收到订单  正在准备','已支付');
/*!40000 ALTER TABLE `canyindingdan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `canyinpeisong`
--

DROP TABLE IF EXISTS `canyinpeisong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `canyinpeisong` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `dingdanbianhao` varchar(200) DEFAULT NULL COMMENT '订单编号',
  `canyinmingcheng` varchar(200) DEFAULT NULL COMMENT '餐饮名称',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `jiudianmingcheng` varchar(200) DEFAULT NULL COMMENT '酒店名称',
  `fenlei` varchar(200) DEFAULT NULL COMMENT '分类',
  `shuliang` varchar(200) DEFAULT NULL COMMENT '数量',
  `dingdanzhuangtai` varchar(200) NOT NULL COMMENT '订单状态',
  `xiadanshijian` varchar(200) DEFAULT NULL COMMENT '下单时间',
  `gengxinshijian` datetime DEFAULT NULL COMMENT '更新时间',
  `yonghuming` varchar(200) DEFAULT NULL COMMENT '用户名',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `kefangmingcheng` varchar(200) DEFAULT NULL COMMENT '客房名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1610344160782 DEFAULT CHARSET=utf8 COMMENT='餐饮配送';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `canyinpeisong`
--

LOCK TABLES `canyinpeisong` WRITE;
/*!40000 ALTER TABLE `canyinpeisong` DISABLE KEYS */;
INSERT INTO `canyinpeisong` VALUES (1610344160781,'2021-01-11 05:49:19','202111113425050041886','餐饮名称4','http://localhost:8080/ssmr56vv/upload/jiudiancanyin_tupian4.jpg','D酒店','其它','2','已送达','2021-01-21 00:00:00','2021-01-22 00:00:00','666','16459878982','A-1102');
/*!40000 ALTER TABLE `canyinpeisong` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chat`
--

DROP TABLE IF EXISTS `chat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chat` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `adminid` bigint(20) DEFAULT NULL COMMENT '管理员id',
  `ask` longtext COMMENT '提问',
  `reply` longtext COMMENT '回复',
  `isreply` int(11) DEFAULT NULL COMMENT '是否回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1610344235415 DEFAULT CHARSET=utf8 COMMENT='客服聊天表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chat`
--

LOCK TABLES `chat` WRITE;
/*!40000 ALTER TABLE `chat` DISABLE KEYS */;
INSERT INTO `chat` VALUES (111,'2021-01-11 05:23:57',1,1,'提问1','回复1',1),(112,'2021-01-11 05:23:57',2,2,'提问2','回复2',2),(113,'2021-01-11 05:23:57',3,3,'提问3','回复3',3),(114,'2021-01-11 05:23:57',4,4,'提问4','回复4',4),(115,'2021-01-11 05:23:57',5,5,'提问5','回复5',5),(116,'2021-01-11 05:23:57',6,6,'提问6','回复6',6),(1610343531196,'2021-01-11 05:38:50',51,NULL,'1212',NULL,1),(1610343831309,'2021-01-11 05:43:51',1610343653966,NULL,'这里可以跟管理员咨询',NULL,0),(1610344235414,'2021-01-11 05:50:34',1610343653966,1,NULL,'这里能回复用户的咨询',NULL);
/*!40000 ALTER TABLE `chat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','http://localhost:8080/ssmr56vv/upload/1610344200632.png'),(2,'picture2','http://localhost:8080/ssmr56vv/upload/picture2.jpg'),(3,'picture3','http://localhost:8080/ssmr56vv/upload/picture3.jpg'),(6,'homepage',NULL);
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussjiudiancanyin`
--

DROP TABLE IF EXISTS `discussjiudiancanyin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussjiudiancanyin` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=167 DEFAULT CHARSET=utf8 COMMENT='酒店餐饮评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussjiudiancanyin`
--

LOCK TABLES `discussjiudiancanyin` WRITE;
/*!40000 ALTER TABLE `discussjiudiancanyin` DISABLE KEYS */;
INSERT INTO `discussjiudiancanyin` VALUES (161,'2021-01-11 05:23:57',1,1,'评论内容1','回复内容1'),(162,'2021-01-11 05:23:57',2,2,'评论内容2','回复内容2'),(163,'2021-01-11 05:23:57',3,3,'评论内容3','回复内容3'),(164,'2021-01-11 05:23:57',4,4,'评论内容4','回复内容4'),(165,'2021-01-11 05:23:57',5,5,'评论内容5','回复内容5'),(166,'2021-01-11 05:23:57',6,6,'评论内容6','回复内容6');
/*!40000 ALTER TABLE `discussjiudiancanyin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussjiudianxinxi`
--

DROP TABLE IF EXISTS `discussjiudianxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussjiudianxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=147 DEFAULT CHARSET=utf8 COMMENT='酒店信息评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussjiudianxinxi`
--

LOCK TABLES `discussjiudianxinxi` WRITE;
/*!40000 ALTER TABLE `discussjiudianxinxi` DISABLE KEYS */;
INSERT INTO `discussjiudianxinxi` VALUES (141,'2021-01-11 05:23:57',1,1,'评论内容1','回复内容1'),(142,'2021-01-11 05:23:57',2,2,'评论内容2','回复内容2'),(143,'2021-01-11 05:23:57',3,3,'评论内容3','回复内容3'),(144,'2021-01-11 05:23:57',4,4,'评论内容4','回复内容4'),(145,'2021-01-11 05:23:57',5,5,'评论内容5','回复内容5'),(146,'2021-01-11 05:23:57',6,6,'评论内容6','回复内容6');
/*!40000 ALTER TABLE `discussjiudianxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discusskefangxinxi`
--

DROP TABLE IF EXISTS `discusskefangxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discusskefangxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1610343695856 DEFAULT CHARSET=utf8 COMMENT='客房信息评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discusskefangxinxi`
--

LOCK TABLES `discusskefangxinxi` WRITE;
/*!40000 ALTER TABLE `discusskefangxinxi` DISABLE KEYS */;
INSERT INTO `discusskefangxinxi` VALUES (151,'2021-01-11 05:23:57',1,1,'评论内容1','回复内容1'),(152,'2021-01-11 05:23:57',2,2,'评论内容2','回复内容2'),(153,'2021-01-11 05:23:57',3,3,'评论内容3','回复内容3'),(154,'2021-01-11 05:23:57',4,4,'评论内容4','回复内容4'),(155,'2021-01-11 05:23:57',5,5,'评论内容5','回复内容5'),(156,'2021-01-11 05:23:57',6,6,'评论内容6','回复内容6'),(1610343695855,'2021-01-11 05:41:35',32,1610343653966,'登录后可以评论  收藏  预约 跟客服咨询等操作','这里可以回复用户在前台的评论');
/*!40000 ALTER TABLE `discusskefangxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiudiancanyin`
--

DROP TABLE IF EXISTS `jiudiancanyin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiudiancanyin` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `canyinmingcheng` varchar(200) NOT NULL COMMENT '餐饮名称',
  `jiudianmingcheng` varchar(200) DEFAULT NULL COMMENT '酒店名称',
  `fenlei` varchar(200) NOT NULL COMMENT '分类',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `jiudiandizhi` varchar(200) DEFAULT NULL COMMENT '酒店地址',
  `zixundianhua` varchar(200) DEFAULT NULL COMMENT '咨询电话',
  `jiage` int(11) NOT NULL COMMENT '价格',
  `xiangqing` longtext COMMENT '详情',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1610343994392 DEFAULT CHARSET=utf8 COMMENT='酒店餐饮';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiudiancanyin`
--

LOCK TABLES `jiudiancanyin` WRITE;
/*!40000 ALTER TABLE `jiudiancanyin` DISABLE KEYS */;
INSERT INTO `jiudiancanyin` VALUES (41,'2021-01-11 05:23:57','餐饮名称1','A酒店','主食','http://localhost:8080/ssmr56vv/upload/jiudiancanyin_tupian1.jpg','酒店地址1','咨询电话1',38,'<p>详情1</p>'),(42,'2021-01-11 05:23:57','餐饮名称2','B酒店','主食','http://localhost:8080/ssmr56vv/upload/jiudiancanyin_tupian2.jpg','酒店地址2','咨询电话2',26,'<p>详情2</p>'),(43,'2021-01-11 05:23:57','餐饮名称3','C酒店','小吃','http://localhost:8080/ssmr56vv/upload/jiudiancanyin_tupian3.jpg','酒店地址3','咨询电话3',39,'<p>详情3</p>'),(44,'2021-01-11 05:23:57','餐饮名称4','D酒店','其它','http://localhost:8080/ssmr56vv/upload/jiudiancanyin_tupian4.jpg','酒店地址4','咨询电话4',66,'<p>详情4</p>'),(45,'2021-01-11 05:23:57','餐饮名称5','酒店名称5','主食','http://localhost:8080/ssmr56vv/upload/jiudiancanyin_tupian5.jpg','酒店地址5','咨询电话5',5,'详情5'),(46,'2021-01-11 05:23:57','餐饮名称6','酒店A','小吃','http://localhost:8080/ssmr56vv/upload/jiudiancanyin_tupian6.jpg','酒店地址6','咨询电话6',16,'<p>详情6</p>'),(1610343994391,'2021-01-11 05:46:33','餐饮在这里添加','A酒店','酒水','http://localhost:8080/ssmr56vv/upload/1610343988304.jpg','酒店地址1','020-89819991',22,'<p><img src=\"http://localhost:8080/ssmr56vv/upload/1610343993062.jpg\"></p>');
/*!40000 ALTER TABLE `jiudiancanyin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiudianxinxi`
--

DROP TABLE IF EXISTS `jiudianxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiudianxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `jiudianmingcheng` varchar(200) NOT NULL COMMENT '酒店名称',
  `leibie` varchar(200) NOT NULL COMMENT '类别',
  `xingji` varchar(200) NOT NULL COMMENT '星级',
  `jiudiantupian` varchar(200) DEFAULT NULL COMMENT '酒店图片',
  `jiudiandizhi` varchar(200) DEFAULT NULL COMMENT '酒店地址',
  `zixundianhua` varchar(200) DEFAULT NULL COMMENT '咨询电话',
  `jiudianjieshao` longtext COMMENT '酒店介绍',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COMMENT='酒店信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiudianxinxi`
--

LOCK TABLES `jiudianxinxi` WRITE;
/*!40000 ALTER TABLE `jiudianxinxi` DISABLE KEYS */;
INSERT INTO `jiudianxinxi` VALUES (21,'2021-01-11 05:23:56','A酒店','连锁酒店','三星','http://localhost:8080/ssmr56vv/upload/jiudianxinxi_jiudiantupian1.jpg','酒店地址1','020-89819991','<p>酒店介绍1</p>'),(22,'2021-01-11 05:23:56','B酒店','豪华酒店','四星','http://localhost:8080/ssmr56vv/upload/jiudianxinxi_jiudiantupian2.jpg','酒店地址2','020-89819992','<p>酒店介绍2</p>'),(23,'2021-01-11 05:23:56','C酒店','快捷酒店','二星','http://localhost:8080/ssmr56vv/upload/jiudianxinxi_jiudiantupian3.jpg','酒店地址3','020-89819993','<p>酒店介绍3</p>'),(24,'2021-01-11 05:23:56','D酒店','民宿','五星','http://localhost:8080/ssmr56vv/upload/jiudianxinxi_jiudiantupian4.jpg','酒店地址4','020-89819994','<p>酒店介绍4</p>'),(25,'2021-01-11 05:23:56','酒店名称5','民宿','一星','http://localhost:8080/ssmr56vv/upload/jiudianxinxi_jiudiantupian5.jpg','酒店地址5','020-89819995','酒店介绍5'),(26,'2021-01-11 05:23:56','酒店名称6','民宿','一星','http://localhost:8080/ssmr56vv/upload/jiudianxinxi_jiudiantupian6.jpg','酒店地址6','020-89819996','酒店介绍6');
/*!40000 ALTER TABLE `jiudianxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kefangfenlei`
--

DROP TABLE IF EXISTS `kefangfenlei`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kefangfenlei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `fenlei` varchar(200) NOT NULL COMMENT '分类',
  PRIMARY KEY (`id`),
  UNIQUE KEY `fenlei` (`fenlei`)
) ENGINE=InnoDB AUTO_INCREMENT=1610343957150 DEFAULT CHARSET=utf8 COMMENT='客房分类';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kefangfenlei`
--

LOCK TABLES `kefangfenlei` WRITE;
/*!40000 ALTER TABLE `kefangfenlei` DISABLE KEYS */;
INSERT INTO `kefangfenlei` VALUES (11,'2021-01-11 05:23:56','大床房'),(12,'2021-01-11 05:23:56','主题房'),(13,'2021-01-11 05:23:56','双人房'),(14,'2021-01-11 05:23:56','三人房'),(15,'2021-01-11 05:23:56','亲子房'),(16,'2021-01-11 05:23:56','套房'),(1610343957149,'2021-01-11 05:45:56','总统套房');
/*!40000 ALTER TABLE `kefangfenlei` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kefangxinxi`
--

DROP TABLE IF EXISTS `kefangxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kefangxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `kefangmingcheng` varchar(200) NOT NULL COMMENT '客房名称',
  `kefangleixing` varchar(200) NOT NULL COMMENT '客房类型',
  `kefangtupian` varchar(200) DEFAULT NULL COMMENT '客房图片',
  `kefangsheshi` varchar(200) DEFAULT NULL COMMENT '客房设施',
  `kefangjiage` int(11) NOT NULL COMMENT '客房价格',
  `kefangzhuangtai` varchar(200) DEFAULT NULL COMMENT '客房状态',
  `jiudianmingcheng` varchar(200) DEFAULT NULL COMMENT '酒店名称',
  `leibie` varchar(200) DEFAULT NULL COMMENT '类别',
  `xingji` varchar(200) DEFAULT NULL COMMENT '星级',
  `jiudiandizhi` varchar(200) DEFAULT NULL COMMENT '酒店地址',
  `zixundianhua` varchar(200) DEFAULT NULL COMMENT '咨询电话',
  `kefangjieshao` longtext COMMENT '客房介绍',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1610344059012 DEFAULT CHARSET=utf8 COMMENT='客房信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kefangxinxi`
--

LOCK TABLES `kefangxinxi` WRITE;
/*!40000 ALTER TABLE `kefangxinxi` DISABLE KEYS */;
INSERT INTO `kefangxinxi` VALUES (31,'2021-01-11 05:23:56','客房A','大床房','http://localhost:8080/ssmr56vv/upload/kefangxinxi_kefangtupian1.jpg','客房设施1',198,'可预订','A酒店','连锁酒店','三星','酒店地址1','020-89819991','<p>客房介绍1</p>','2021-01-11 13:38:07',4),(32,'2021-01-11 05:23:56','客房B','双人房','http://localhost:8080/ssmr56vv/upload/kefangxinxi_kefangtupian2.jpg','客房设施2',268,'可预订','B酒店','豪华酒店','四星','酒店地址2','020-89819992','<p>客房介绍2</p>','2021-01-11 13:42:11',8),(33,'2021-01-11 05:23:56','客房C','三人房','http://localhost:8080/ssmr56vv/upload/kefangxinxi_kefangtupian3.jpg','客房设施3',299,'可预订','C酒店','快捷酒店','二星','酒店地址3','020-89819993','<p>客房介绍3</p>','2021-01-11 13:33:00',4),(34,'2021-01-11 05:23:56','客房D','主题房','http://localhost:8080/ssmr56vv/upload/kefangxinxi_kefangtupian4.jpg','客房设施4',4,'可预订','D酒店','民宿','五星','酒店地址4','020-89819994','<p>客房介绍4</p>','2021-01-11 13:33:14',5),(35,'2021-01-11 05:23:56','客房E','主题房','http://localhost:8080/ssmr56vv/upload/kefangxinxi_kefangtupian5.jpg','客房设施5',198,'可预订','B酒店','豪华酒店','四星','酒店地址2','020-89819992','<p>客房介绍5</p>','2021-01-11 13:33:26',6),(36,'2021-01-11 05:23:57','客房名称6','大床房','http://localhost:8080/ssmr56vv/upload/kefangxinxi_kefangtupian6.jpg','客房设施6',6,'可预订','酒店名称6','类别6','星级6','酒店地址6','咨询电话6','客房介绍6','2021-01-11 13:23:57',6),(1610344059011,'2021-01-11 05:47:38','这里添加新的客房','总统套房','http://localhost:8080/ssmr56vv/upload/1610344039322.jpg','一应齐全',998,'可预订','D酒店','民宿','五星','酒店地址4','020-89819994','<p><img src=\"http://localhost:8080/ssmr56vv/upload/1610344057241.jpg\"></p>',NULL,0);
/*!40000 ALTER TABLE `kefangxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kefangxuding`
--

DROP TABLE IF EXISTS `kefangxuding`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kefangxuding` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `dingdanbianhao` varchar(200) DEFAULT NULL COMMENT '订单编号',
  `kefangmingcheng` varchar(200) DEFAULT NULL COMMENT '客房名称',
  `kefangleixing` varchar(200) DEFAULT NULL COMMENT '客房类型',
  `kefangtupian` varchar(200) DEFAULT NULL COMMENT '客房图片',
  `jiudianmingcheng` varchar(200) DEFAULT NULL COMMENT '酒店名称',
  `kefangjiage` varchar(200) DEFAULT NULL COMMENT '客房价格',
  `xudingtianshu` int(11) NOT NULL COMMENT '续订天数',
  `zongjiage` varchar(200) DEFAULT NULL COMMENT '总价格',
  `ruzhushijian` varchar(200) DEFAULT NULL COMMENT '入住时间',
  `xudingshijian` datetime DEFAULT NULL COMMENT '续订时间',
  `yonghuming` varchar(200) DEFAULT NULL COMMENT '用户名',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `shenfenzheng` varchar(200) DEFAULT NULL COMMENT '身份证',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  `ispay` varchar(200) DEFAULT '未支付' COMMENT '是否支付',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1610343869879 DEFAULT CHARSET=utf8 COMMENT='客房续订';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kefangxuding`
--

LOCK TABLES `kefangxuding` WRITE;
/*!40000 ALTER TABLE `kefangxuding` DISABLE KEYS */;
INSERT INTO `kefangxuding` VALUES (1610343555403,'2021-01-11 05:39:14','202111113374560638504','客房A','大床房','http://localhost:8080/ssmr56vv/upload/kefangxinxi_kefangtupian1.jpg','A酒店','198',2,'396','2021-01-17 13:37:57','2021-01-21 00:00:00','001','小吴','13823888881','440300199101010001','否','','未支付'),(1610343869878,'2021-01-11 05:44:29','202111113414080896789','客房B','双人房','http://localhost:8080/ssmr56vv/upload/kefangxinxi_kefangtupian2.jpg','B酒店','268',1,'268','2021-01-23 10:00:00','2021-01-24 00:00:00','666','李生','16459878988','654598789845987898','是','1','已支付');
/*!40000 ALTER TABLE `kefangxuding` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kefangyuding`
--

DROP TABLE IF EXISTS `kefangyuding`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kefangyuding` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `dingdanbianhao` varchar(200) DEFAULT NULL COMMENT '订单编号',
  `kefangmingcheng` varchar(200) DEFAULT NULL COMMENT '客房名称',
  `kefangleixing` varchar(200) DEFAULT NULL COMMENT '客房类型',
  `kefangtupian` varchar(200) DEFAULT NULL COMMENT '客房图片',
  `kefangzhuangtai` varchar(200) DEFAULT NULL COMMENT '客房状态',
  `jiudianmingcheng` varchar(200) DEFAULT NULL COMMENT '酒店名称',
  `jiudiandizhi` varchar(200) DEFAULT NULL COMMENT '酒店地址',
  `zixundianhua` varchar(200) DEFAULT NULL COMMENT '咨询电话',
  `kefangjiage` int(11) DEFAULT NULL COMMENT '客房价格',
  `ruzhutianshu` int(11) NOT NULL COMMENT '入住天数',
  `zongjiage` int(11) DEFAULT NULL COMMENT '总价格',
  `ruzhurenshu` int(11) NOT NULL COMMENT '入住人数',
  `xiadanshijian` datetime DEFAULT NULL COMMENT '下单时间',
  `ruzhushijian` datetime DEFAULT NULL COMMENT '入住时间',
  `liuyanbeizhu` varchar(200) DEFAULT NULL COMMENT '留言备注',
  `yonghuming` varchar(200) DEFAULT NULL COMMENT '用户名',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `shenfenzheng` varchar(200) DEFAULT NULL COMMENT '身份证',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  `ispay` varchar(200) DEFAULT '未支付' COMMENT '是否支付',
  PRIMARY KEY (`id`),
  UNIQUE KEY `dingdanbianhao` (`dingdanbianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=1610343728869 DEFAULT CHARSET=utf8 COMMENT='客房预订';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kefangyuding`
--

LOCK TABLES `kefangyuding` WRITE;
/*!40000 ALTER TABLE `kefangyuding` DISABLE KEYS */;
INSERT INTO `kefangyuding` VALUES (1610343484114,'2021-01-11 05:38:04','202111113374560638504','客房A','大床房','http://localhost:8080/ssmr56vv/upload/kefangxinxi_kefangtupian1.jpg','可预订','A酒店','酒店地址1','020-89819991',198,1,198,2,'2021-01-16 13:37:52','2021-01-17 13:37:57','121','001','小吴','13823888881','440300199101010001','否',NULL,'已支付'),(1610343506657,'2021-01-11 05:38:26','20211111338772440659','客房B','双人房','http://localhost:8080/ssmr56vv/upload/kefangxinxi_kefangtupian2.jpg','可预订','B酒店','酒店地址2','020-89819992',268,2,536,2,'2021-01-23 13:38:15','2021-01-25 13:38:18','22','001','小吴','13823888881','440300199101010001','否',NULL,'已支付'),(1610343728868,'2021-01-11 05:42:08','202111113414080896789','客房B','双人房','http://localhost:8080/ssmr56vv/upload/kefangxinxi_kefangtupian2.jpg','可预订','B酒店','酒店地址2','020-89819992',268,1,268,2,'2021-01-22 13:41:51','2021-01-23 10:00:00','1212','666','李生','16459878982','654598789845987898','是','11','已支付');
/*!40000 ALTER TABLE `kefangyuding` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `news`
--

DROP TABLE IF EXISTS `news`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `news` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) NOT NULL COMMENT '标题',
  `picture` varchar(200) NOT NULL COMMENT '图片',
  `content` longtext NOT NULL COMMENT '内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=137 DEFAULT CHARSET=utf8 COMMENT='酒店资讯';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `news`
--

LOCK TABLES `news` WRITE;
/*!40000 ALTER TABLE `news` DISABLE KEYS */;
INSERT INTO `news` VALUES (131,'2021-01-11 05:23:57','车站附近不低端！这些车站酒店是城市脸面','http://localhost:8080/ssmr56vv/upload/news_picture1.jpg','<p>提到火车站，人们脑海中不免会浮现出以下画面：匆忙的脚步、陈旧的设施、没有被及时清理的垃圾……但是世界上有些火车站却用漂亮的建筑外观、有趣的内部设计、悠久的历史底蕴打破了人们对火车站的固有印象。小编记得，第一次亲身感受英国圣潘克拉斯火车站时的震惊与激动，这座维多利亚哥特式建筑的火车站宛若宫殿、又似城堡，带着优雅与浪漫的气质装点着伦敦，也诉说着城市的过往。更令人惊喜的是，车站另一侧哥特式风格的酒店也极具魅力，错落有致的窗户、砖红色墙体，在蓝天白云之下，整体就像一幅油画，这也是小编之前从未见过的景象。想象着，住在浪漫优雅的圣潘克拉斯车站旁边，一定是一场舒适又复古的别样体验。今天，小编就将带大家领略一些世界上有名的“车站酒店”，它们以其特殊的地理位置与历史身份，散发着无穷的魅力。</p>'),(132,'2021-01-11 05:23:57','这个时候敢新开酒店，那就一定要见识下了！','http://localhost:8080/ssmr56vv/upload/news_picture2.jpg','<p class=\"ql-align-justify\">暴走姐妹花全员！今年9月澳门重新对内地居民恢复通关至今，已经去过6人／次了！<strong>好得很！</strong></p><p class=\"ql-align-justify\">就在两周前，花花我又一次去了澳门玩，而澳门新口岸智选假日酒店就是我这程的宝藏发现！绝对要认真安利种草！</p><p class=\"ql-align-justify\">我相信在暴走姐妹花的粉丝里应该有不少IHG洲际集团的会员了，对于智选假日这个品牌线应该也不会太陌生。不过我还是要和可能不太了解的花粉科普一下：</p><p><br></p>'),(133,'2021-01-11 05:23:57','重磅！2021时髦避世酒店出炉','http://localhost:8080/ssmr56vv/upload/news_picture3.jpg','<p class=\"ql-align-justify\">过往外滩设计酒店大奖嘉宾</p><p class=\"ql-align-justify\">一年一度，激动人心的时刻到了。</p><p class=\"ql-align-justify\">往年这一天，我们都是和全世界最有品味、又懂生活的人在一起。</p><p class=\"ql-align-justify\">他们有生活美学家、设计大师、行业大佬、媒体同行以及跨行业精英……600多人相聚一堂。</p><p><br></p>'),(134,'2021-01-11 05:23:57','入住酒店，为什么先不要开灯？别问，照做就行了！','http://localhost:8080/ssmr56vv/upload/news_picture4.jpg','<p><span style=\"color: rgb(51, 51, 51);\">隔墙有耳，指的是墙外有人偷听，而今天我们要说的是，隔！墙！有！眼！</span></p><p><span style=\"color: rgb(51, 51, 51);\">酒店客房，是顾客的私密空间，一些别有用心之人通过非法手段，将针孔摄像头安装在房间内的隐蔽地方，满足自己扭曲的窥视欲，这是对个人隐私的严重侵犯！</span></p><p><span style=\"color: rgb(51, 51, 51);\">如今，花样百出的偷拍手段，让人防不胜防！尤其是住酒店的时候，很多不起眼的小地方都会暗藏摄像头。</span></p>'),(135,'2021-01-11 05:23:57','速8酒店新年新气象，3家酒店全新开业！','http://localhost:8080/ssmr56vv/upload/news_picture5.jpg','<p>	酒店说明：速8酒店合肥肥西繁华大道和昌店位于肥西县繁华大道与恒山路交汇处，肥西县因位于合肥之西而得名，有“淮军故里、花木之乡、巢湖明珠”之美誉，自然环境优美，境内有“庐阳第一名山”—紫蓬山，历史文化名镇—三河镇。历史悠久，区内有太平天国“三河大捷”古战场、清代淮军将领庄园圩堡群等，是清代台湾首任巡抚刘铭传，著名物理学家杨振宁的故乡。酒店精心设计，全新装修，设备设施齐全拥有标准间、大床房、商务间，麻将房等房型。房间内提供24小时热水、优质床上用品、免费宽带上网、豪华淋浴设备、网络电视、中央空调等。提供美味丰富的自助早餐、多功能会议室以及免费停车等服务。周边餐饮、购物、娱乐、金融等公共设施一应俱全。速8酒店合肥肥西繁华大道和昌店将秉承速8酒店“干净&amp;友好”的服务理念，为您营造一个温馨舒适的入住环境。</p>'),(136,'2021-01-11 05:23:57','隔离酒店里，19岁的她变了','http://localhost:8080/ssmr56vv/upload/news_picture6.jpg','<p><span style=\"color: rgb(51, 51, 51);\">2020年12月20日，李亭燕在一个电影影迷群中交流时，得知一名影迷是在社区进行防疫志愿工作的志愿者，那位志愿者的经历和精神让刚满19岁的李亭燕十分感动和敬佩，也让她决心投身防疫志愿工作，去帮助那些需要帮助的人。最终，在那位志愿者的帮助下，李亭燕联系到了大连金普新区团委。</span></p>');
/*!40000 ALTER TABLE `news` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `storeup`
--

DROP TABLE IF EXISTS `storeup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `storeup` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `refid` bigint(20) DEFAULT NULL COMMENT '收藏id',
  `tablename` varchar(200) DEFAULT NULL COMMENT '表名',
  `name` varchar(200) NOT NULL COMMENT '收藏名称',
  `picture` varchar(200) NOT NULL COMMENT '收藏图片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1610343773041 DEFAULT CHARSET=utf8 COMMENT='收藏表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `storeup`
--

LOCK TABLES `storeup` WRITE;
/*!40000 ALTER TABLE `storeup` DISABLE KEYS */;
INSERT INTO `storeup` VALUES (1610343467571,'2021-01-11 05:37:47',51,31,'kefangxinxi','客房A','http://localhost:8080/ssmr56vv/upload/kefangxinxi_kefangtupian1.jpg'),(1610343516114,'2021-01-11 05:38:35',51,42,'jiudiancanyin','餐饮名称2','http://localhost:8080/ssmr56vv/upload/jiudiancanyin_tupian2.jpg'),(1610343682530,'2021-01-11 05:41:22',1610343653966,32,'kefangxinxi','客房B','http://localhost:8080/ssmr56vv/upload/kefangxinxi_kefangtupian2.jpg'),(1610343746127,'2021-01-11 05:42:25',1610343653966,24,'jiudianxinxi','D酒店','http://localhost:8080/ssmr56vv/upload/jiudianxinxi_jiudiantupian4.jpg'),(1610343773040,'2021-01-11 05:42:52',1610343653966,44,'jiudiancanyin','餐饮名称4','http://localhost:8080/ssmr56vv/upload/jiudiancanyin_tupian4.jpg');
/*!40000 ALTER TABLE `storeup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,1,'abo','users','管理员','4wiba5c96cj9bmarmibjerq3ssdkr73d','2021-01-11 05:30:45','2021-01-11 06:51:04'),(2,51,'001','yonghu','用户','gd355b029j5kk89hx4lwb14etzljum5f','2021-01-11 05:37:36','2021-01-11 06:37:37'),(3,1610343653966,'666','yonghu','用户','tqfwd8dewslv83whhxq1ch32h15bqshx','2021-01-11 05:40:59','2021-01-11 06:51:26');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tuifangpingjia`
--

DROP TABLE IF EXISTS `tuifangpingjia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tuifangpingjia` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `kefangmingcheng` varchar(200) DEFAULT NULL COMMENT '客房名称',
  `kefangleixing` varchar(200) DEFAULT NULL COMMENT '客房类型',
  `kefangtupian` varchar(200) DEFAULT NULL COMMENT '客房图片',
  `jiudianmingcheng` varchar(200) DEFAULT NULL COMMENT '酒店名称',
  `jiudiandizhi` varchar(200) DEFAULT NULL COMMENT '酒店地址',
  `ruzhushijian` varchar(200) DEFAULT NULL COMMENT '入住时间',
  `tuifangshijian` datetime DEFAULT NULL COMMENT '退房时间',
  `kefangpingfen` varchar(200) DEFAULT NULL COMMENT '客房评分',
  `canyinpingfen` varchar(200) DEFAULT NULL COMMENT '餐饮评分',
  `fuwupingfen` varchar(200) DEFAULT NULL COMMENT '服务评分',
  `pingjianeirong` longtext COMMENT '评价内容',
  `yonghuming` varchar(200) DEFAULT NULL COMMENT '用户名',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1610343900091 DEFAULT CHARSET=utf8 COMMENT='退房评价';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tuifangpingjia`
--

LOCK TABLES `tuifangpingjia` WRITE;
/*!40000 ALTER TABLE `tuifangpingjia` DISABLE KEYS */;
INSERT INTO `tuifangpingjia` VALUES (81,'2021-01-11 05:23:57','客房名称1','客房类型1','http://localhost:8080/ssmr56vv/upload/tuifangpingjia_kefangtupian1.jpg','酒店名称1','酒店地址1','入住时间1','2021-01-11 13:23:57','1','1','1','评价内容1','用户名1','姓名1','手机1','否',''),(82,'2021-01-11 05:23:57','客房名称2','客房类型2','http://localhost:8080/ssmr56vv/upload/tuifangpingjia_kefangtupian2.jpg','酒店名称2','酒店地址2','入住时间2','2021-01-11 13:23:57','1','1','1','评价内容2','用户名2','姓名2','手机2','否',''),(83,'2021-01-11 05:23:57','客房名称3','客房类型3','http://localhost:8080/ssmr56vv/upload/tuifangpingjia_kefangtupian3.jpg','酒店名称3','酒店地址3','入住时间3','2021-01-11 13:23:57','1','1','1','评价内容3','用户名3','姓名3','手机3','否',''),(84,'2021-01-11 05:23:57','客房名称4','客房类型4','http://localhost:8080/ssmr56vv/upload/tuifangpingjia_kefangtupian4.jpg','酒店名称4','酒店地址4','入住时间4','2021-01-11 13:23:57','1','1','1','评价内容4','用户名4','姓名4','手机4','否',''),(85,'2021-01-11 05:23:57','客房名称5','客房类型5','http://localhost:8080/ssmr56vv/upload/tuifangpingjia_kefangtupian5.jpg','酒店名称5','酒店地址5','入住时间5','2021-01-11 13:23:57','1','1','1','评价内容5','用户名5','姓名5','手机5','否',''),(86,'2021-01-11 05:23:57','客房名称6','客房类型6','http://localhost:8080/ssmr56vv/upload/tuifangpingjia_kefangtupian6.jpg','酒店名称6','酒店地址6','入住时间6','2021-01-11 13:23:57','1','1','1','评价内容6','用户名6','姓名6','手机6','否',''),(1610343573129,'2021-01-11 05:39:32','客房B','双人房','http://localhost:8080/ssmr56vv/upload/kefangxinxi_kefangtupian2.jpg','B酒店','酒店地址2','2021-01-25 13:38:18','2021-01-27 00:00:00','5','5','5','<p>666</p>','001','小吴','13823888881','否',''),(1610343900090,'2021-01-11 05:44:59','客房B','双人房','http://localhost:8080/ssmr56vv/upload/kefangxinxi_kefangtupian2.jpg','B酒店','酒店地址2','2021-01-23 10:00:00','2021-01-25 00:00:00','5','5','5','<p>666<img src=\"http://localhost:8080/ssmr56vv/upload/1610343888675.jpg\"></p>','666','李生','16459878988','是','收到评价  谢谢好评');
/*!40000 ALTER TABLE `tuifangpingjia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2021-01-11 05:23:57'),(2,'000','000','管理员','2021-01-11 05:49:45');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yonghu`
--

DROP TABLE IF EXISTS `yonghu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yonghu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yonghuming` varchar(200) NOT NULL COMMENT '用户名',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingming` varchar(200) NOT NULL COMMENT '姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `touxiang` varchar(200) DEFAULT NULL COMMENT '头像',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  `shenfenzheng` varchar(200) DEFAULT NULL COMMENT '身份证',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yonghuming` (`yonghuming`)
) ENGINE=InnoDB AUTO_INCREMENT=1610343653967 DEFAULT CHARSET=utf8 COMMENT='用户';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yonghu`
--

LOCK TABLES `yonghu` WRITE;
/*!40000 ALTER TABLE `yonghu` DISABLE KEYS */;
INSERT INTO `yonghu` VALUES (51,'2021-01-11 05:23:57','001','001','小吴','女','http://localhost:8080/ssmr56vv/upload/yonghu_touxiang1.jpg','13823888881','773890001@qq.com','440300199101010001'),(52,'2021-01-11 05:23:57','002','002','小叶','女','http://localhost:8080/ssmr56vv/upload/yonghu_touxiang2.jpg','13823888882','773890002@qq.com','440300199202020002'),(54,'2021-01-11 05:23:57','用户4','123456','姓名4','男','http://localhost:8080/ssmr56vv/upload/yonghu_touxiang4.jpg','13823888884','773890004@qq.com','440300199404040004'),(55,'2021-01-11 05:23:57','用户5','123456','姓名5','男','http://localhost:8080/ssmr56vv/upload/yonghu_touxiang5.jpg','13823888885','773890005@qq.com','440300199505050005'),(1610343653966,'2021-01-11 05:40:53','666','666','李生','男','http://localhost:8080/ssmr56vv/upload/1610343671425.jpg','16459878988','16532@123.com','654598789845987898');
/*!40000 ALTER TABLE `yonghu` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-01-14 20:51:48
