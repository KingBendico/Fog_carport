DROP TABLE IF EXISTS `orders`;

CREATE TABLE `orders` (
  `orderId` int NOT NULL AUTO_INCREMENT,
  `length` int NOT NULL,
  `height` int NOT NULL,
  `depth` int NOT NULL,
  PRIMARY KEY (`orderId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

LOCK TABLES `orders` WRITE;

UNLOCK TABLES;