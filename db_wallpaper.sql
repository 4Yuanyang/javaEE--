-- MySQL dump 10.13  Distrib 8.1.0, for Win64 (x86_64)
--
-- Host: localhost    Database: wallpaper
-- ------------------------------------------------------
-- Server version	8.1.0

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tb_img`
--

DROP TABLE IF EXISTS `tb_img`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_img` (
  `id` int NOT NULL AUTO_INCREMENT,
  `phead` varchar(40) NOT NULL COMMENT '图片标题',
  `purl` varchar(255) NOT NULL COMMENT '图片地址',
  `hid` int NOT NULL COMMENT '上传照片人的id',
  `create_time` date DEFAULT NULL COMMENT '上传时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_img`
--

LOCK TABLES `tb_img` WRITE;
/*!40000 ALTER TABLE `tb_img` DISABLE KEYS */;
INSERT INTO `tb_img` VALUES (3,'紫色小梦','http://swg6gfdig.hn-bkt.clouddn.com/FjPxZ8yu2LFQ8l4kl7SSQD_bZhNk?e=1747669155&token=zLFxIwO5vDPmK_uYuQZTI6aLFo33HLAkUBFlOPMW:42aFYtsn02RkjSd0AIrespe3hAA=',5,'2025-05-20'),(4,'甜美阿紫','http://swg6gfdig.hn-bkt.clouddn.com/FtW1ruU1IIRuUT3k7T4U42zh63mi?e=1747669259&token=zLFxIwO5vDPmK_uYuQZTI6aLFo33HLAkUBFlOPMW:o-PpzF9WWlx504SSbFOsqjTScmI=',5,'2025-05-20'),(6,'html','http://swg6gfdig.hn-bkt.clouddn.com/FvOKuyxWmrNxJFaobKNQlXRR4co9?e=1747677340&token=zLFxIwO5vDPmK_uYuQZTI6aLFo33HLAkUBFlOPMW:GLeSY1VI2M2ua0xCSWgkBnnnxao=',5,'2025-05-20'),(7,'黄发美女','http://swg6gfdig.hn-bkt.clouddn.com/Fs1AD_bFXPzYv1fcRIQF_YjHB1X7',8,'2025-05-20'),(8,'紫色妹妹','http://swg6gfdig.hn-bkt.clouddn.com/FhPJaWwdsAunJ6cfGrCSgTaUOB-_',4,'2025-05-21'),(9,'阳光小店','http://swg6gfdig.hn-bkt.clouddn.com/FuUHMPdT-3L2nhDxc9fcX4YoNNQF',4,'2025-05-21'),(10,'尤哈尔','http://swg6gfdig.hn-bkt.clouddn.com/FtGA201Hb67FVwts72zdGTb2qsuR',3,'2025-05-21'),(11,'永劫无间','http://swg6gfdig.hn-bkt.clouddn.com/FgKeoZwjhOK76u2PsUhk1iZX-xns',3,'2025-05-21'),(12,'动漫美女','http://swg6gfdig.hn-bkt.clouddn.com/FlerZp9nRCFfFELRhywqf2Mr1syP',3,'2025-05-21'),(13,'雪之下雪乃','http://swg6gfdig.hn-bkt.clouddn.com/Fl0vsMdu9LYHGow_Fu2GN_-F5SJ9',9,'2025-05-21'),(14,'仙逆','http://swg6gfdig.hn-bkt.clouddn.com/Fv-oZ7cv7_qM-SDhI2x22vVUVEkX',9,'2025-05-21'),(15,'水下梦境','http://swg6gfdig.hn-bkt.clouddn.com/Flw-kEBOaxPyw9uwCsKXCtTqRGTd',8,'2025-05-21');
/*!40000 ALTER TABLE `tb_img` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_user`
--

DROP TABLE IF EXISTS `tb_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(40) NOT NULL,
  `password` varchar(25) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_user`
--

LOCK TABLES `tb_user` WRITE;
/*!40000 ALTER TABLE `tb_user` DISABLE KEYS */;
INSERT INTO `tb_user` VALUES (3,'春天之歌','HymWVUBvcz'),(4,'乌鸦','vQGYWf0Tr4'),(5,'幻听嵩的留香','123123'),(6,'哈基米','000000'),(7,'菜就多练','999999'),(8,'xyy','000999'),(9,'寻最美之花','111111'),(10,'甜甜的','123456');
/*!40000 ALTER TABLE `tb_user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-05-21 11:48:18
