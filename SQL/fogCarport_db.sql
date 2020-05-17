DROP DATABASE IF EXISTS `fogcarport_db`;
CREATE DATABASE  IF NOT EXISTS `fogcarport_db` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `fogcarport_db`;


DROP TABLE IF EXISTS `carport`;
CREATE TABLE `carport` (
  `carportId` int NOT NULL AUTO_INCREMENT,
  `orderId` int DEFAULT NULL,
  `length` int DEFAULT NULL,
  `width` int DEFAULT NULL,
  `shed_length` int DEFAULT NULL,
  `shed_width` int DEFAULT NULL,
  `slope` int DEFAULT NULL,
  PRIMARY KEY (`carportId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


LOCK TABLES `carport` WRITE;
UNLOCK TABLES;


DROP TABLE IF EXISTS `materials`;
CREATE TABLE `materials` (
  `materialId` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `length` int DEFAULT NULL,
  `count` int DEFAULT NULL,
  `unit` varchar(45) DEFAULT 'stk.',
  `description` varchar(200) DEFAULT NULL,
  `price` int DEFAULT NULL,
  PRIMARY KEY (`materialId`)
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


LOCK TABLES `materials` WRITE;
INSERT INTO `materials` VALUES (1,'25x200 mm. trykimp. Brædt',540,NULL,'stk.','Understernbrædder til for & bag ende',NULL),(2,'25x200 mm. trykimp. Brædt',360,NULL,'stk.','Understernbrædder til siderne',NULL),(3,'25x125mm. trykimp. Brædt',540,NULL,'stk.','Oversternbrædder til forenden',NULL),(4,'25x125mm. trykimp. Brædt',360,NULL,'stk.','Oversternbrædder til siderne',NULL),(5,'38x73 mm. Lægte ubh.',420,NULL,'stk.','Til z på bagside af dør',NULL),(6,'45x95 mm. Reglar ub.',270,NULL,'stk.','Løsholter til skur gavle',NULL),(7,'45x95 mm. Reglar ub.',240,NULL,'stk.','Løsholter til skur sider',NULL),(8,'45x195 mm. spærtræ ubh.',600,NULL,'stk.','Remme i sider, sadles ned i stolper',NULL),(9,'45x195 mm. spærtræ ubh.',480,NULL,'stk.','Remme i sider, sadles ned i stolper ( skur del, deles)',NULL),(10,'45x195 mm. spærtræ ubh.',600,NULL,'stk.','Spær, monteres på rem',NULL),(11,'97x97 mm. trykimp. Stolpe',300,NULL,'stk.','Stolper nedgraves 90 cm. i jord',NULL),(12,'19x100 mm. trykimp. Brædt',210,NULL,'stk','Til beklædning af skur 1 på 2',NULL),(13,'19x100 mm. trykimp. Brædt',540,NULL,'stk.','Vandbrædt på stern i sider',NULL),(14,'19x100 mm. trykimp. Brædt',360,NULL,'stk.','Vandbrædt på stern i forende',NULL),(15,'Plastmo Ecolite blåtonet',600,NULL,'stk.','Tagplader monteres på spær',NULL),(16,'Plastmo Ecolite blåtonet',360,NULL,'stk.','Tagplader monteres på spær',NULL),(17,'Plastmo bundskruer 200 stk.',NULL,NULL,'pakke','Skruer til tagplader',NULL),(18,'Hulbånd 1x20 mm. 10 mtr.',NULL,NULL,'rulle','Til vindkryds på spær',NULL),(19,'Universal 190 mm højre',NULL,NULL,'stk.','Til montering af spær på rem',NULL),(20,'Universal 190 mm venstre',NULL,NULL,'stk.','Til montering af spær på rem',NULL),(21,'4,5 x 60 mm. skruer 200 stk.',NULL,NULL,'pakke','Til montering af stern&vandbrædt',NULL),(22,'4,0 x 50 mm. beslagskruer 250 stk.',NULL,NULL,'pakke','Til montering af universalbeslag + hulbånd',NULL),(23,'Bræddebolt 10 x 120 mm.',NULL,NULL,'stk.','Til montering af rem på stolper',NULL),(24,'Firkantskiver 40x40x11mm',NULL,NULL,'stk.','Til montering af rem på stolper',NULL),(25,'4,5 x 70 mm. Skruer 400 stk.',NULL,NULL,'pakke','Til montering af yderste beklædning',NULL),(26,'4,5 x 50 mm. Skruer 300 stk.',NULL,NULL,'pakke','Til montering af inderste beklædning',NULL),(27,'Stalddørsgreb 50x75',NULL,NULL,'sæt','Til lås på dør i skur',NULL),(28,'T hængsel 390 mm',NULL,NULL,'stk.','Til skurdør',NULL),(29,'Vinkelbeslag 35',NULL,NULL,'stk.','Til montering af løsholter i skur',NULL);
UNLOCK TABLES;


DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `orderId` int NOT NULL AUTO_INCREMENT,
  `userId` int DEFAULT NULL,
  `date` date DEFAULT NULL,
  `status` varchar(45) NOT NULL,
  PRIMARY KEY (`orderId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


LOCK TABLES `orders` WRITE;
UNLOCK TABLES;


DROP TABLE IF EXISTS `roles`;
CREATE TABLE `roles` (
  `Roleid` int NOT NULL,
  `UserRole` varchar(15) NOT NULL,
  PRIMARY KEY (`Roleid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


LOCK TABLES `roles` WRITE;
INSERT INTO `roles` VALUES (10,'administrator'),(20,'employee'),(30,'customer');
UNLOCK TABLES;


DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `UserId` int NOT NULL AUTO_INCREMENT,
  `Email` varchar(50) NOT NULL,
  `UserPassword` varchar(30) NOT NULL,
  `RoleId` int DEFAULT '30',
  `FullName` varchar(100) DEFAULT NULL,
  `Phone` varchar(30) DEFAULT NULL,
  `Address` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`UserId`),
  UNIQUE KEY `Email` (`Email`),
  KEY `RoleId` (`RoleId`),
  CONSTRAINT `users_ibfk_1` FOREIGN KEY (`RoleId`) REFERENCES `roles` (`Roleid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


LOCK TABLES `users` WRITE;
INSERT INTO `users` VALUES (1,'Alice@Cooper.com','pass1234',30,'Alice Cooper','60607070','Nørgaardsvej 30, DK-2800 Kgs. Lyngby'),(2,'hans@mail.dk','1234',30,NULL,NULL,NULL);
UNLOCK TABLES;
