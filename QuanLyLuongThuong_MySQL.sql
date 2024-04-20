-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: quanlyluongthuong
-- ------------------------------------------------------
-- Server version	8.0.29

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
-- Table structure for table `chamcong`
--

create database quanlyluongthuong;
use quanlyluongthuong;

--
-- Table structure for table `taikhoan`
--

DROP TABLE IF EXISTS `taikhoan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `taikhoan` (
  `MATAIKHOAN` bigint NOT NULL AUTO_INCREMENT,
  `TAIKHOAN` varchar(100) DEFAULT NULL,
  `MATKHAU` varchar(100) NOT NULL,
  `QUYEN` int DEFAULT NULL,
  PRIMARY KEY (`MATAIKHOAN`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

LOCK TABLES `taikhoan` WRITE;
/*!40000 ALTER TABLE `taikhoan` DISABLE KEYS */;
INSERT INTO `taikhoan`
VALUES (1,'admin','admin',0),
		(2,'Glenna.Mertz','123456',1),
        (3,'Tito.Ondricka30','123456',1),
        (4,'Anna.West17','123456',1),
        (5,'Valentine_Kassulke','123456',1),
        (6,'Pascale_Treutel62','123456',1),
        (7,'Marcelo15','123456',1),
        (8,'Martina_Macejkovic','123456',1),
        (9,'Beth.Hermann57','123456',1),
        (10,'Ernestine.Mertz45','123456',1),
        (11,'Alysson_Mraz43','123456',1);
/*!40000 ALTER TABLE `taikhoan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `phongban`
--

DROP TABLE IF EXISTS `phongban`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `phongban` (
  `MAPHONG` bigint NOT NULL AUTO_INCREMENT,
  `TENPHONG` varchar(30) NOT NULL,
  `TEN_TRUONGPHONG` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`MAPHONG`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;


LOCK TABLES `phongban` WRITE;
/*!40000 ALTER TABLE `phongban` DISABLE KEYS */;
INSERT INTO `phongban` VALUES (1,'TỔ CHỨC CÁN BỘ','Angelo Gislason'),(2,'HÀNH CHÍNH TỔNG HỢP','Dora Schmidt'),(3,'ĐÀO TẠO ĐẠI HỌC','Stewart Dicki'),(4,'HỢP TÁC ĐÀO TẠO NH','Juan Waters'),(5,'ĐÀO TẠO SAU ĐẠI HỌC','Marianne Kling'),(6,'KẾ HOẠCH TÀI CHÍNH','Lyle Rogahn'),(7,'CÔNG TÁC SINH VIÊN','Ms. Alison Block'),(8,'QUẢN LÝ KHOA HỌC','Velma Ebert'),(9,'QUAN HỆ ĐỐI NGOẠI','Michael Moen'),(10,'VẬT TỪ THIẾT BỊ','Natasha Kunde'),(11,'QUẢN TRỊ CSVC','Dana Hermiston'),(12,'Y TE','Terry Rodriguez'),(13,'BẢO ĐẢM CHẤT LƯỢNG GIÁO DỤC','Alexandra Kunde'),(14,'THANH TRA PHAP CHE','Esther Bosco'),(15,'DAU TU & PHAT TRIEN','Ron Carter'),(16,'THƯ VIỆN','Mack Ward'),(17,'ĐOÀN THANH NIÊN','Ronnie Harvey'),(18,'TỔ CHỨC CÁN BỘ','Shane Maggio'),(19,'HÀNH CHÍNH TỔNG HỢP','Jim Gutmann'),(20,'ĐÀO TẠO ĐẠI HỌC','Jacqueline Auer'),(21,'HỢP TÁC ĐÀO TẠO NH','Ervin Breitenberg'),(22,'ĐÀO TẠO SAU ĐẠI HỌC','Connie Bergstrom'),(23,'KẾ HOẠCH TÀI CHÍNH','Cathy Kshlerin'),(24,'CÔNG TÁC SINH VIÊN','Oscar Larson'),(25,'QUẢN LÝ KHOA HỌC','Dexter Terry'),(26,'QUAN HỆ ĐỐI NGOẠI','Roxanne Kessler'),(27,'VẬT TỪ THIẾT BỊ','Ms. Misty Murazik'),(28,'QUẢN TRỊ CSVC','Kristin Padberg'),(29,'Y TE','Terrance Ledner'),(30,'BẢO ĐẢM CHẤT LƯỢNG GIÁO DỤC','Agnes Ryan'),(31,'THANH TRA PHAP CHE','Shaun Turcotte'),(32,'DAU TU & PHAT TRIEN','Herman Kub'),(33,'THƯ VIỆN','Opal Powlowski'),(34,'ĐOÀN THANH NIÊN','Bonnie Gaylord');
/*!40000 ALTER TABLE `phongban` ENABLE KEYS */;
UNLOCK TABLES;

select * from phongban;


--
-- Table structure for table `hesoluong`
--

DROP TABLE IF EXISTS `hesoluong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hesoluong` (
  `MAHESOLUONG` bigint NOT NULL AUTO_INCREMENT,
  `TENHESOLUONG` varchar(30) DEFAULT NULL,
  `HESOLUONG` float DEFAULT NULL,
  PRIMARY KEY (`MAHESOLUONG`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;


LOCK TABLES `hesoluong` WRITE;
/*!40000 ALTER TABLE `hesoluong` DISABLE KEYS */;
INSERT INTO `hesoluong` VALUES (1,'Bậc 1',1),(2,'Bậc 2',2),(3,'Bậc 3',3),(4,'Bậc 4',4);
/*!40000 ALTER TABLE `hesoluong` ENABLE KEYS */;
UNLOCK TABLES;

DROP TABLE IF EXISTS `nhanvien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nhanvien` (
  `MANHANVIEN` bigint NOT NULL AUTO_INCREMENT,
  `TENNHANVIEN` varchar(30) DEFAULT NULL,
  `GIOITINH` bit(1) DEFAULT NULL,
  `NGAYSINH` datetime DEFAULT NULL,
  `DIACHI` varchar(30) DEFAULT NULL,
  `CHUCVU` varchar(30) DEFAULT NULL,
  `TRINHDO` varchar(30) DEFAULT NULL,
  `MAPHONG` bigint DEFAULT NULL,
  `MAHESOLUONG` bigint DEFAULT NULL,
  `MATAIKHOAN` bigint DEFAULT NULL,
  PRIMARY KEY (`MANHANVIEN`),
  KEY `MAPHONG` (`MAPHONG`),
  KEY `MAHESOLUONG` (`MAHESOLUONG`),
  KEY `FK_MATK` (`MATAIKHOAN`),
  CONSTRAINT `FK_MATK` FOREIGN KEY (`MATAIKHOAN`) REFERENCES `taikhoan` (`MATAIKHOAN`),
  CONSTRAINT `nhanvien_ibfk_1` FOREIGN KEY (`MAPHONG`) REFERENCES `phongban` (`MAPHONG`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `nhanvien_ibfk_2` FOREIGN KEY (`MAHESOLUONG`) REFERENCES `hesoluong` (`MAHESOLUONG`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;


LOCK TABLES `nhanvien` WRITE;
/*!40000 ALTER TABLE `nhanvien` DISABLE KEYS */;
INSERT INTO `nhanvien` 
VALUES 
		(1,'Trinity.Lubowitz',_binary '\0','1995-01-19 00:00:00','51201 Loren Mall','Cán bộ','Tiến sĩ',14,2,1),
        (2,'Tess.Kuphal71',_binary '\0','2000-10-24 00:00:00','1586 Franecki Villages','Cán bộ','Tiến sĩ',15,4,2),
        (3,'Graciela16',_binary '\0','1966-07-28 00:00:00','751 Cronin Heights','Cán bộ','Tiến sĩ',2,3,3),
        (4,'Schuyler.Lynch',_binary '\0','1961-07-01 00:00:00','9579 Fiona Place','Cán bộ','Tiến sĩ',7,3,4),
        (5,'Maria_Bergnaum',_binary '\0','1956-05-02 00:00:00','5372 Deckow Shore','Cán bộ','Tiến sĩ',5,3,5),
        (6,'Eriberto26',_binary '\0','1982-02-20 00:00:00','7967 Sporer Glens','Cán bộ','Tiến sĩ',8,4,6),
        (7,'Charles9',_binary '\0','1979-10-18 00:00:00','69315 Kelly Station','Cán bộ','Tiến sĩ',1,3,7),
        (8,'Marc_Oberbrunner',_binary '\0','1985-06-28 00:00:00','8900 Shanel Burgs','Cán bộ','Tiến sĩ',15,3,8),
        (9,'Hillary21',_binary '\0','1991-07-28 00:00:00','53303 Altenwerth Alley','Cán bộ','Tiến sĩ',12,2,9),
        (10,'Claire63',_binary '\0','1968-02-21 00:00:00','5358 Emely Isle','Cán bộ','Tiến sĩ',16,4,10);
/*!40000 ALTER TABLE `nhanvien` ENABLE KEYS */;
UNLOCK TABLES;

DROP TABLE IF EXISTS `chamcong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chamcong` (
  `MACONG` bigint NOT NULL AUTO_INCREMENT,
  `THANG` int DEFAULT NULL,
  `NAM` int DEFAULT NULL,
  `SONGAYLAMVIEC` int DEFAULT NULL,
  `SOGIOLAMTHEM` int DEFAULT NULL,
  `TIENUNGTRUOC` bigint DEFAULT NULL,
  `MANHANVIEN` bigint DEFAULT NULL,
  PRIMARY KEY (`MACONG`),
  KEY `MANHANVIEN` (`MANHANVIEN`),
  CONSTRAINT `chamcong_ibfk_1` FOREIGN KEY (`MANHANVIEN`) REFERENCES `nhanvien` (`MANHANVIEN`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

LOCK TABLES `chamcong` WRITE;
/*!40000 ALTER TABLE `chamcong` DISABLE KEYS */;
INSERT INTO `chamcong` 
VALUES 
		(1,1,2022,24,27,0,1),
		(2,1,2022,11,21,300000,2),
        (3,1,2022,9,23,200000,3),
        (4,1,2022,26,5,400000,4),
        (5,1,2022,3,14,0,5),
        (6,2,2022,12,14,300000,1),
        (7,2,2022,8,20,100000,2),
        (8,2,2022,7,23,400000,3),
        (9,2,2022,4,4,0,4),
        (10,2,2022,2,8,100000,5),
        (11,3,2022,11,14,400000,1),
        (12,3,2022,28,10,100000,2),
        (13,3,2022,2,26,300000,3),
        (14,3,2022,24,22,0,4),
        (15,3,2022,26,20,100000,5),
        (16,4,2022,17,4,400000,1),
        (17,4,2022,9,21,400000,2),
        (18,4,2022,1,9,0,3),
        (19,4,2022,7,12,300000,4),
        (20,4,2022,10,17,300000,5),
        (21,5,2022,6,7,400000,1),
        (22,5,2022,17,6,300000,2),
        (23,5,2022,24,9,200000,3),
        (24,5,2022,21,23,100000,4),
        (25,5,2022,28,13,400000,5),
        (26,1,2022,11,19,200000,1),
        (27,1,2022,27,28,300000,2),
        (28,1,2022,28,14,0,3),(29,1,2022,22,7,300000,4),(30,1,2022,18,28,0,5),
        (31,2,2022,26,22,200000,1),
        (32,2,2022,4,27,400000,2),
        (33,2,2022,8,16,100000,3),
        (34,2,2022,14,19,0,4),
        (35,2,2022,25,21,200000,5),
        (36,3,2022,10,13,0,1),
        (37,3,2022,28,20,0,2),
        (38,3,2022,5,26,0,3),
        (39,3,2022,16,24,300000,4),
        (40,3,2022,21,12,400000,5),
        (41,4,2022,29,24,300000,1),
        (42,4,2022,8,10,100000,2),
        (43,4,2022,17,11,0,3),
        (44,4,2022,27,8,0,4),
        (45,4,2022,4,12,100000,5),
        (46,5,2022,21,27,100000,1),
        (47,5,2022,29,6,0,2),
        (48,5,2022,15,16,0,3),
        (49,5,2022,24,18,0,4),
        (50,5,2022,25,1,300000,5);
/*!40000 ALTER TABLE `chamcong` ENABLE KEYS */;
UNLOCK TABLES;


DROP TABLE IF EXISTS `hocphan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hocphan` (
  `MAHOCPHAN` bigint NOT NULL AUTO_INCREMENT,
  `TENHOCPHAN` varchar(255) NOT NULL,
  `SOTINCHI` int DEFAULT NULL,
  PRIMARY KEY (`MAHOCPHAN`)
) ENGINE=InnoDB AUTO_INCREMENT=303 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

LOCK TABLES `hocphan` WRITE;
/*!40000 ALTER TABLE `hocphan` DISABLE KEYS */;
INSERT INTO `hocphan` VALUES (1,'Tiếng Anh Công nghệ thông tin cơ bản 1',3),(2,'Tiếng Anh công nghệ thông tin cơ bản 2',3),(3,'Tiếng Anh Công nghệ thông tin cơ bản 3',3),(4,'Tiếng Anh Công nghệ thông tin cơ bản 4',3),(5,'Tiếng Anh Công nghệ thông tin cơ bản 5',3),(6,'Chủ nghĩa xã hội khoa học',3),(7,'Kinh tế chính trị Mác-Lênin',3),(8,'Lịch sử Đảng Cộng sản Việt Nam',3),(9,'Triết học Mác-Lênin',3),(10,'Tư tưởng Hồ Chí Minh',3),(11,'Pháp luật đại cương',3),(12,'Đại số tuyến tính',3),(13,'Giải tích',3),(14,'Nhập môn lập trình máy tính',3),(15,'Toán rời rạc',3),(16,'Công tác quốc phòng, an ninh',3),(17,'Đường lối quân sự của Đảng',3),(18,'Quân sự chung và chiến thuật, kỹ thuật bắn súng tiểu liên AK (CKC)',3),(19,'An toàn và bảo mật thông tin',3),(20,'Cấu trúc dữ liệu và giải thuật',3),(21,'Cơ sở dữ liệu',3),(22,'Hệ quản trị cơ sở dữ liệu',3),(23,'Kiến trúc máy tính',3),(24,'Kỹ thuật lập trình',3),(25,'Lập trình hướng đối tượng',3),(26,'Mạng máy tính',3),(27,'Nguyên lý hệ điều hành',3),(28,'Nhập môn Công nghệ phần mềm',3),(29,'Nhập môn về kỹ thuật (CNTT)',3),(30,'Phân tích và đặc tả yêu cầu phần mềm',3),(31,'Quản lý dự án công nghệ thông tin',3),(32,'Thiết kế phần mềm',3),(33,'Thiết kế Web',3),(34,'Thực tập cơ sở ngành',3),(35,'Trí tuệ nhân tạo',3),(36,'Đảm bảo chất lượng phần mềm',3),(37,'Kiểm thử phần mềm',3),(38,'Lập trình .NET',3),(39,'Lập trình Java',3),(40,'Một số công nghệ phát triển phần mềm',3),(41,'Thực tâp chuyên ngành Kỹ thuật phần mềm',3),(42,'Đồ án tốt nghiệp (Kỹ thuật phần mềm)',3),(43,'Thực tập doanh nghiệp (Kỹ thuật phần mềm)',3),(44,'Tiếng Hàn cơ bản 1',3),(45,'Tiếng Hàn cơ bản 2',3),(46,'Tiếng Hàn cơ bản 3',3),(47,'Tiếng Hàn cơ bản 4',3),(48,'Tiếng Hàn cơ bản 5',3),(49,'Tiếng Nhật cơ bản 1',3),(50,'Tiếng Nhật cơ bản 2',3),(51,'Tiếng Nhật cơ bản 3',3),(52,'Tiếng Nhật cơ bản 4',3),(53,'Tiếng Nhật cơ bản 5',3),(54,'Tiếng Trung cơ bản 1',3),(55,'Tiếng Trung cơ bản 2',3),(56,'Tiếng Trung cơ bản 3',3),(57,'Tiếng Trung cơ bản 4',3),(58,'Tiếng Trung cơ bản 5',3),(59,'Kinh tế học đại cương',3),(60,'Tác phong làm việc chuyên nghiệp',3),(61,'Tiếng Anh Công nghệ thông tin',3),(62,'Tiếng Hàn',3),(63,'Tiếng Nhật',3),(64,'Tiếng Trung',3),(65,'Tối ưu hóa',3),(66,'Xác suất thống kê',3),(67,'Aerobic 1',3),(68,'Aerobic 2',3),(69,'Bơi 1',3),(70,'Bơi 2',3),(71,'Bóng bàn 1',3),(72,'Bóng bàn 2',3),(73,'Bóng chuyền 1',3),(74,'Bóng chuyền 2',3),(75,'Bóng đá 1',3),(76,'Bóng đá 2',3),(77,'Bóng rổ 1',3),(78,'Bóng rổ 2',3),(79,'Cầu lông 1',3),(80,'Cầu lông 2',3),(81,'Cầu mây 1',3),(82,'Cầu mây 2',3),(83,'Đá cầu 1',3),(84,'Đá cầu 2',3),(85,'Karate 1',3),(86,'Karate 2',3),(87,'Khiêu vũ 1',3),(88,'Khiêu vũ 2',3),(89,'Pencak Silat 1',3),(90,'Pencak Silat 2',3),(91,'Tennis 1',3),(92,'Tennis 2',3),(93,'Cơ sở lập trình nhúng',3),(94,'Công cụ phát triển phần mềm',3),(95,'Đồ họa máy tính',3),(96,'Thiết kế giao diện người dùng',3),(97,'Ứng dụng thuật toán',3),(98,'Kỹ thuật số',3),(99,'Phương pháp số trong lập trình',3),(100,'Công nghệ đa phương tiện',3),(101,'Công nghệ thực tại ảo',3),(102,'Lập trình Java nâng cao',3),(103,'Lập trình Web bằng ASP.NET',3),(104,'Lập trình web bằng PHP',3),(105,'Phần mềm mã nguồn mở',3),(106,'Phát triển ứng dụng Game',3),(107,'Phát triển ứng dụng trên thiết bị di động',3),(108,'Tích hợp hệ thống phần mềm',3),(109,'Kinh tế học đại cương',3),(110,'Cơ sở lập trình nhúng',3),(111,'Hệ quản trị cơ sở dữ liệu (SQL Server)',3),(112,'Kinh tế học đại cương',3),(113,'Nguyên lý hệ điều hành',3),(114,'Nhập môn tin học',3),(115,'Tư tưởng Hồ Chí Minh',3),(116,'Xác suất thống kê',3),(117,'Công nghệ đa phương tiện',3),(118,'Phát triển ứng dụng Game',3),(119,'Ứng dụng thuật toán',3),(120,'Bóng chuyền 1',3),(121,'Bóng chuyền 1',3),(122,'Tiếng Anh Công nghệ thông tin cơ bản 1',3),(123,'Cầu mây',3),(124,'Đá cầu',3),(125,'Ôn tập Tiếng Anh Công nghệ thông tin cơ bản 1',3),(126,'Ôn tập Tiếng Anh công nghệ thông tin cơ bản 2',3),(127,'Ôn tập Tiếng Anh Công nghệ thông tin cơ bản 3',3),(128,'Ôn tập Tiếng Anh Công nghệ thông tin cơ bản 4',3),(129,'Ôn tập Tiếng Anh Công nghệ thông tin cơ bản 5',3),(130,'Lập trình Web bằng PHP',3),(131,'Kiến trúc máy tính.',3),(132,'Nhập môn Công nghệ phần mềm.',3),(133,'Quân sự chung',3),(134,'Kỹ thuật chiến đấu bộ binh và chiến thuật',3),(135,'Tiếng Hàn 1',3),(136,'Tiếng Hàn 2',3),(137,'Tiếng Nhật 1',3),(138,'Tiếng Nhật 2',3),(139,'Tiếng Trung 1',3),(140,'Tiếng Trung 2',3),(141,'Tiếng Anh Công nghệ thông tin 1',3),(142,'Tiếng Anh Công nghệ thông tin 2',3),(143,'Phát triển ứng dụng di động đơn nền tảng',3),(144,'Nhập môn công nghệ phần mềm ',3),(145,'Mạng máy tính ',3),(146,'Kiểm thử phần mềm ',3),(147,'Đảm bảo chất lượng phần mềm ',3),(148,'Trí tuệ nhân tạo',3),(149,'Tối ưu hóa',3),(150,'Thiết kế phần mềm',3),(151,'Phân tích và đặc tả yêu cầu phần mềm',3),(152,'Tiếng Anh Công nghệ thông tin cơ bản 1',3),(153,'Tiếng Anh công nghệ thông tin cơ bản 2',3),(154,'Tiếng Anh Công nghệ thông tin cơ bản 3',3),(155,'Tiếng Anh Công nghệ thông tin cơ bản 4',3),(156,'Tiếng Anh Công nghệ thông tin cơ bản 5',3),(157,'Chủ nghĩa xã hội khoa học',3),(158,'Kinh tế chính trị Mác-Lênin',3),(159,'Lịch sử Đảng Cộng sản Việt Nam',3),(160,'Triết học Mác-Lênin',3),(161,'Tư tưởng Hồ Chí Minh',3),(162,'Pháp luật đại cương',3),(163,'Đại số tuyến tính',3),(164,'Giải tích',3),(165,'Nhập môn lập trình máy tính',3),(166,'Toán rời rạc',3),(167,'Công tác quốc phòng, an ninh',3),(168,'Đường lối quân sự của Đảng',3),(169,'Quân sự chung và chiến thuật, kỹ thuật bắn súng tiểu liên AK (CKC)',3),(170,'An toàn và bảo mật thông tin',3),(171,'Cấu trúc dữ liệu và giải thuật',3),(172,'Cơ sở dữ liệu',3),(173,'Hệ quản trị cơ sở dữ liệu',3),(174,'Kiến trúc máy tính',3),(175,'Kỹ thuật lập trình',3),(176,'Lập trình hướng đối tượng',3),(177,'Mạng máy tính',3),(178,'Nguyên lý hệ điều hành',3),(179,'Nhập môn Công nghệ phần mềm',3),(180,'Nhập môn về kỹ thuật (CNTT)',3),(181,'Phân tích và đặc tả yêu cầu phần mềm',3),(182,'Quản lý dự án công nghệ thông tin',3),(183,'Thiết kế phần mềm',3),(184,'Thiết kế Web',3),(185,'Thực tập cơ sở ngành',3),(186,'Trí tuệ nhân tạo',3),(187,'Đảm bảo chất lượng phần mềm',3),(188,'Kiểm thử phần mềm',3),(189,'Lập trình .NET',3),(190,'Lập trình Java',3),(191,'Một số công nghệ phát triển phần mềm',3),(192,'Thực tâp chuyên ngành Kỹ thuật phần mềm',3),(193,'Đồ án tốt nghiệp (Kỹ thuật phần mềm)',3),(194,'Thực tập doanh nghiệp (Kỹ thuật phần mềm)',3),(195,'Tiếng Hàn cơ bản 1',3),(196,'Tiếng Hàn cơ bản 2',3),(197,'Tiếng Hàn cơ bản 3',3),(198,'Tiếng Hàn cơ bản 4',3),(199,'Tiếng Hàn cơ bản 5',3),(200,'Tiếng Nhật cơ bản 1',3),(201,'Tiếng Nhật cơ bản 2',3),(202,'Tiếng Nhật cơ bản 3',3),(203,'Tiếng Nhật cơ bản 4',3),(204,'Tiếng Nhật cơ bản 5',3),(205,'Tiếng Trung cơ bản 1',3),(206,'Tiếng Trung cơ bản 2',3),(207,'Tiếng Trung cơ bản 3',3),(208,'Tiếng Trung cơ bản 4',3),(209,'Tiếng Trung cơ bản 5',3),(210,'Kinh tế học đại cương',3),(211,'Tác phong làm việc chuyên nghiệp',3),(212,'Tiếng Anh Công nghệ thông tin',3),(213,'Tiếng Hàn',3),(214,'Tiếng Nhật',3),(215,'Tiếng Trung',3),(216,'Tối ưu hóa',3),(217,'Xác suất thống kê',3),(218,'Aerobic 1',3),(219,'Aerobic 2',3),(220,'Bơi 1',3),(221,'Bơi 2',3),(222,'Bóng bàn 1',3),(223,'Bóng bàn 2',3),(224,'Bóng chuyền 1',3),(225,'Bóng chuyền 2',3),(226,'Bóng đá 1',3),(227,'Bóng đá 2',3),(228,'Bóng rổ 1',3),(229,'Bóng rổ 2',3),(230,'Cầu lông 1',3),(231,'Cầu lông 2',3),(232,'Cầu mây 1',3),(233,'Cầu mây 2',3),(234,'Đá cầu 1',3),(235,'Đá cầu 2',3),(236,'Karate 1',3),(237,'Karate 2',3),(238,'Khiêu vũ 1',3),(239,'Khiêu vũ 2',3),(240,'Pencak Silat 1',3),(241,'Pencak Silat 2',3),(242,'Tennis 1',3),(243,'Tennis 2',3),(244,'Cơ sở lập trình nhúng',3),(245,'Công cụ phát triển phần mềm',3),(246,'Đồ họa máy tính',3),(247,'Thiết kế giao diện người dùng',3),(248,'Ứng dụng thuật toán',3),(249,'Kỹ thuật số',3),(250,'Phương pháp số trong lập trình',3),(251,'Công nghệ đa phương tiện',3),(252,'Công nghệ thực tại ảo',3),(253,'Lập trình Java nâng cao',3),(254,'Lập trình Web bằng ASP.NET',3),(255,'Lập trình web bằng PHP',3),(256,'Phần mềm mã nguồn mở',3),(257,'Phát triển ứng dụng Game',3),(258,'Phát triển ứng dụng trên thiết bị di động',3),(259,'Tích hợp hệ thống phần mềm',3),(260,'Kinh tế học đại cương',3),(261,'Cơ sở lập trình nhúng',3),(262,'Hệ quản trị cơ sở dữ liệu (SQL Server)',3),(263,'Kinh tế học đại cương',3),(264,'Nguyên lý hệ điều hành',3),(265,'Nhập môn tin học',3),(266,'Tư tưởng Hồ Chí Minh',3),(267,'Xác suất thống kê',3),(268,'Công nghệ đa phương tiện',3),(269,'Phát triển ứng dụng Game',3),(270,'Ứng dụng thuật toán',3),(271,'Bóng chuyền 1',3),(272,'Bóng chuyền 1',3),(273,'Tiếng Anh Công nghệ thông tin cơ bản 1',3),(274,'Cầu mây',3),(275,'Đá cầu',3),(276,'Ôn tập Tiếng Anh Công nghệ thông tin cơ bản 1',3),(277,'Ôn tập Tiếng Anh công nghệ thông tin cơ bản 2',3),(278,'Ôn tập Tiếng Anh Công nghệ thông tin cơ bản 3',3),(279,'Ôn tập Tiếng Anh Công nghệ thông tin cơ bản 4',3),(280,'Ôn tập Tiếng Anh Công nghệ thông tin cơ bản 5',3),(281,'Lập trình Web bằng PHP',3),(282,'Kiến trúc máy tính.',3),(283,'Nhập môn Công nghệ phần mềm.',3),(284,'Quân sự chung',3),(285,'Kỹ thuật chiến đấu bộ binh và chiến thuật',3),(286,'Tiếng Hàn 1',3),(287,'Tiếng Hàn 2',3),(288,'Tiếng Nhật 1',3),(289,'Tiếng Nhật 2',3),(290,'Tiếng Trung 1',3),(291,'Tiếng Trung 2',3),(292,'Tiếng Anh Công nghệ thông tin 1',3),(293,'Tiếng Anh Công nghệ thông tin 2',3),(294,'Phát triển ứng dụng di động đơn nền tảng',3),(295,'Nhập môn công nghệ phần mềm ',3),(296,'Mạng máy tính ',3),(297,'Kiểm thử phần mềm ',3),(298,'Đảm bảo chất lượng phần mềm ',3),(299,'Trí tuệ nhân tạo',3),(300,'Tối ưu hóa',3),(301,'Thiết kế phần mềm',3),(302,'Phân tích và đặc tả yêu cầu phần mềm',3);
/*!40000 ALTER TABLE `hocphan` ENABLE KEYS */;
UNLOCK TABLES;

DROP TABLE IF EXISTS `chamcong_hocphan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chamcong_hocphan` (
  `MACONG` bigint NOT NULL,
  `MAHOCPHAN` bigint NOT NULL,
  `SOTIET` int DEFAULT NULL,
  PRIMARY KEY (`MACONG`,`MAHOCPHAN`),
  KEY `MAHOCPHAN` (`MAHOCPHAN`),
  CONSTRAINT `chamcong_hocphan_ibfk_1` FOREIGN KEY (`MACONG`) REFERENCES `chamcong` (`MACONG`),
  CONSTRAINT `chamcong_hocphan_ibfk_2` FOREIGN KEY (`MAHOCPHAN`) REFERENCES `hocphan` (`MAHOCPHAN`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

LOCK TABLES `chamcong_hocphan` WRITE;
/*!40000 ALTER TABLE `chamcong_hocphan` DISABLE KEYS */;
INSERT INTO `chamcong_hocphan` VALUES (1,1,49),(2,3,35),(3,5,16),(4,7,16),(5,9,17),(6,11,49),(7,13,20),(8,15,38),(9,17,48),(10,19,6),(11,21,42),(12,23,46),(13,25,23),(14,27,33),(15,29,34),(16,31,36),(17,33,36),(18,35,27),(19,37,14),(20,39,42),(21,41,8),(22,43,37),(23,45,20),(24,47,25),(25,49,12);
/*!40000 ALTER TABLE `chamcong_hocphan` ENABLE KEYS */;
UNLOCK TABLES;

DROP TABLE IF EXISTS `phucap`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `phucap` (
  `MAPHUCAP` bigint NOT NULL AUTO_INCREMENT,
  `TENPHUCAP` varchar(30) DEFAULT NULL,
  `TIENPHUCAP` bigint DEFAULT NULL,
  PRIMARY KEY (`MAPHUCAP`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

LOCK TABLES `phucap` WRITE;
/*!40000 ALTER TABLE `phucap` DISABLE KEYS */;
INSERT INTO `phucap` VALUES (1,'Phụ cấp chức vụ, chức danh',7600000),(2,'Phụ cấp trách nhiệm',5300000),(3,'Phụ cấp nặng nhọc, độc hại',1500000),(4,'Phụ cấp thâm niên',1400000),(5,'Phụ cấp khu vực',4700000),(6,'Phụ cấp lưu động',3800000),(7,'Phụ cấp thu hút',2900000),(8,'Phụ cấp chức vụ, chức danh',7700000),(9,'Phụ cấp trách nhiệm',1800000),(10,'Phụ cấp nặng nhọc, độc hại',7200000),(11,'Phụ cấp thâm niên',2500000),(12,'Phụ cấp khu vực',5900000),(13,'Phụ cấp lưu động',8900000),(14,'Phụ cấp thu hút',9400000);
/*!40000 ALTER TABLE `phucap` ENABLE KEYS */;
UNLOCK TABLES;

DROP TABLE IF EXISTS `danhsachphucap`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `danhsachphucap` (
  `MAPHUCAP` bigint NOT NULL,
  `MACONG` bigint NOT NULL,
  PRIMARY KEY (`MAPHUCAP`,`MACONG`),
  KEY `MACONG` (`MACONG`),
  CONSTRAINT `danhsachphucap_ibfk_1` FOREIGN KEY (`MAPHUCAP`) REFERENCES `phucap` (`MAPHUCAP`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `danhsachphucap_ibfk_2` FOREIGN KEY (`MACONG`) REFERENCES `chamcong` (`MACONG`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;


LOCK TABLES `danhsachphucap` WRITE;
/*!40000 ALTER TABLE `danhsachphucap` DISABLE KEYS */;
INSERT INTO `danhsachphucap` VALUES (5,1),(7,1),(5,2),(6,2),(5,3),(6,3),(4,4),(7,4),(1,5),(4,5),(2,6),(6,6),(5,7),(6,7),(1,8),(6,8),(2,9),(1,10),(5,11),(7,12),(2,13),(6,14),(5,15),(3,16),(6,17),(7,18),(4,19),(6,20),(2,21),(7,22),(5,23),(6,24),(2,25);
/*!40000 ALTER TABLE `danhsachphucap` ENABLE KEYS */;
UNLOCK TABLES;


DROP TABLE IF EXISTS `thuong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `thuong` (
  `MATHUONG` bigint NOT NULL AUTO_INCREMENT,
  `TENTHUONG` varchar(30) DEFAULT NULL,
  `TIENTHUONG` bigint DEFAULT NULL,
  PRIMARY KEY (`MATHUONG`),
  key(`TENTHUONG`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

LOCK TABLES `thuong` WRITE;
/*!40000 ALTER TABLE `thuong` DISABLE KEYS */;
INSERT INTO `thuong` VALUES (1,'Tiền thưởng năm',3700000),(2,'Tiền thưởng ký kết',2100000),(3,'Tiền thưởng giao ngay',3800000),(4,'Tiền thưởng thâm niên',5800000),(5,'Tiền thưởng giới thiệu',7600000),(6,'Tiền thưởng lễ, tết',5500000),(7,'Tiền thưởng chia sẻ lợi nhuận',700000),(8,'Tiền thưởng năm',600000),(9,'Tiền thưởng ký kết',2500000),(10,'Tiền thưởng giao ngay',1900000),(11,'Tiền thưởng thâm niên',5500000),(12,'Tiền thưởng giới thiệu',7100000),(13,'Tiền thưởng lễ, tết',3600000),(14,'Tiền thưởng chia sẻ lợi nhuận',2900000);
/*!40000 ALTER TABLE `thuong` ENABLE KEYS */;
UNLOCK TABLES;

DROP TABLE IF EXISTS `danhsachthuong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `danhsachthuong` (
  `MATHUONG` bigint NOT NULL,
  `MACONG` bigint NOT NULL,
  PRIMARY KEY (`MATHUONG`,`MACONG`),
  KEY `MACONG` (`MACONG`),
  CONSTRAINT `danhsachthuong_ibfk_1` FOREIGN KEY (`MATHUONG`) REFERENCES `thuong` (`MATHUONG`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `danhsachthuong_ibfk_2` FOREIGN KEY (`MACONG`) REFERENCES `chamcong` (`MACONG`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

LOCK TABLES `danhsachthuong` WRITE;
/*!40000 ALTER TABLE `danhsachthuong` DISABLE KEYS */;
INSERT INTO `danhsachthuong` VALUES (7,1),(6,2),(1,3),(3,4),(4,5),(7,6),(3,7),(6,8),(4,9),(4,10),(4,11),(6,12),(5,13),(6,14),(2,15),(4,16),(3,17),(3,18),(5,19),(6,20),(4,21),(6,22),(4,23),(5,24),(6,25);
/*!40000 ALTER TABLE `danhsachthuong` ENABLE KEYS */;
UNLOCK TABLES;
INSERT INTO `danhsachthuong` VALUES(12,4);

/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;


select * from phucap;
select * from taikhoan;
select * from nhanvien;
select * from phongban;
select * from chamcong;

delete from taikhoan;

update taikhoan set taikhoan = "dangky"
where mataikhoan = 11;


delete from nhanvien
where manhanvien = 19;
insert into NHANVIEN
values(19,"dk", 0, "1968-02-21 00:00:00", "", "", "", 1, 1, 15);

delete from nhanvien 
where manhanvien = 15;
select TENNHANVIEN, GIOITINH, NGAYSINH, DIACHI, CHUCVU, TRINHDO
from NHANVIEN inner join TAIKHOAN on NHANVIEN.MATAIKHOAN = TAIKHOAN.MATAIKHOAN
where TAIKHOAN.MATAIKHOAN = 1;

select count(*) 
from NHANVIEN inner join TAIKHOAN on NHANVIEN.MATAIKHOAN = TAIKHOAN.MATAIKHOAN 
where TAIKHOAN.MATAIKHOAN = 0;

select TENNHANVIEN, GIOITINH, NGAYSINH, DIACHI, CHUCVU, TRINHDO
from NHANVIEN inner join TAIKHOAN on NHANVIEN.MATAIKHOAN = TAIKHOAN.MATAIKHOAN
where TAIKHOAN.MATAIKHOAN = 12;

select count(*) from NHANVIEN 
where MANHANVIEN = 1

