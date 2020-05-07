DROP TABLE IF EXISTS `materials`;

CREATE TABLE `materials` (
  `materialId` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `length` int DEFAULT NULL,
  `count` int DEFAULT NULL,
  `unit` varchar(45) DEFAULT 'stk.',
  `description` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`materialId`)
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

LOCK TABLES `materials` WRITE;

INSERT INTO `materials` VALUES (1,'25x200 mm. trykimp. Brædt',540,NULL,'stk.','Understernbrædder til for & bag ende'),(2,'25x200 mm. trykimp. Brædt',360,NULL,'stk.','Understernbrædder til siderne'),(3,'25x125mm. trykimp. Brædt',540,NULL,'stk.','Oversternbrædder til forenden'),(4,'25x125mm. trykimp. Brædt',360,NULL,'stk.','Oversternbrædder til siderne'),(5,'38x73 mm. Lægte ubh.',420,NULL,'stk.','Til z på bagside af dør'),(6,'45x95 mm. Reglar ub.',270,NULL,'stk.','Løsholter til skur gavle'),(7,'45x95 mm. Reglar ub.',240,NULL,'stk.','Løsholter til skur sider'),(8,'45x195 mm. spærtræ ubh.',600,NULL,'stk.','Remme i sider, sadles ned i stolper'),(9,'45x195 mm. spærtræ ubh.',480,NULL,'stk.','Remme i sider, sadles ned i stolper ( skur del, deles)'),(10,'45x195 mm. spærtræ ubh.',600,NULL,'stk.','Spær, monteres på rem'),(11,'97x97 mm. trykimp. Stolpe',300,NULL,'stk.','Stolper nedgraves 90 cm. i jord'),(12,'19x100 mm. trykimp. Brædt',210,NULL,'stk','Til beklædning af skur 1 på 2'),(13,'19x100 mm. trykimp. Brædt',540,NULL,'stk.','Vandbrædt på stern i sider'),(14,'19x100 mm. trykimp. Brædt',360,NULL,'stk.','Vandbrædt på stern i forende'),(15,'Plastmo Ecolite blåtonet',600,NULL,'stk.','Tagplader monteres på spær'),(16,'Plastmo Ecolite blåtonet',360,NULL,'stk.','Tagplader monteres på spær'),(17,'Plastmo bundskruer 200 stk.',NULL,NULL,'pakke','Skruer til tagplader'),(18,'Hulbånd 1x20 mm. 10 mtr.',NULL,NULL,'rulle','Til vindkryds på spær'),(19,'Universal 190 mm højre',NULL,NULL,'stk.','Til montering af spær på rem'),(20,'Universal 190 mm venstre',NULL,NULL,'stk.','Til montering af spær på rem'),(21,'4,5 x 60 mm. skruer 200 stk.',NULL,NULL,'pakke','Til montering af stern&vandbrædt'),(22,'4,0 x 50 mm. beslagskruer 250 stk.',NULL,NULL,'pakke','Til montering af universalbeslag + hulbånd'),(23,'Bræddebolt 10 x 120 mm.',NULL,NULL,'stk.','Til montering af rem på stolper'),(24,'Firkantskiver 40x40x11mm',NULL,NULL,'stk.','Til montering af rem på stolper'),(25,'4,5 x 70 mm. Skruer 400 stk.',NULL,NULL,'pakke','Til montering af yderste beklædning'),(26,'4,5 x 50 mm. Skruer 300 stk.',NULL,NULL,'pakke','Til montering af inderste beklædning'),(27,'Stalddørsgreb 50x75',NULL,NULL,'sæt','Til lås på dør i skur'),(28,'T hængsel 390 mm',NULL,NULL,'stk.','Til skurdør'),(29,'Vinkelbeslag 35',NULL,NULL,'stk.','Til montering af løsholter i skur');

UNLOCK TABLES;
