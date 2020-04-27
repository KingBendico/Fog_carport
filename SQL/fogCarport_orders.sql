DROP TABLE IF EXISTS `orders`;

CREATE TABLE `orders` (
  `orderId` int NOT NULL AUTO_INCREMENT,
  `length` int NOT NULL,
  `height` int NOT NULL,
  `depth` int NOT NULL,
  PRIMARY KEY (`orderId`)
  );