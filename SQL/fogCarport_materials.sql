DROP TABLE IF EXISTS `materials`;

CREATE TABLE `materials` (
  `materialId` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `length` int DEFAULT NULL,
  `count` int DEFAULT NULL,
  `unit` varchar(45) DEFAULT 'stk.',
  `description` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`materialId`)
  );

INSERT INTO `` (`materialId`,`name`,`length`,`count`,`unit`,`description`) VALUES (1,'Stolpe: 100 x 100 mm. ru trykimprægneret.',300,1,'stk.',NULL);
INSERT INTO `` (`materialId`,`name`,`length`,`count`,`unit`,`description`) VALUES (2,'Stolpe: 125 x 125 mm. ru trykimprægneret.',300,1,'stk.',NULL);
INSERT INTO `` (`materialId`,`name`,`length`,`count`,`unit`,`description`) VALUES (3,'Rem: 45 x 145 mm spærtræ.',480,1,'stk.',NULL);
INSERT INTO `` (`materialId`,`name`,`length`,`count`,`unit`,`description`) VALUES (4,'Spær: 45 x 95 mm. reglar.',480,1,'stk.',NULL);
INSERT INTO `` (`materialId`,`name`,`length`,`count`,`unit`,`description`) VALUES (5,'Spær: 45 x 120 mm. 200 tilskåret.',480,1,'stk.',NULL);
INSERT INTO `` (`materialId`,`name`,`length`,`count`,`unit`,`description`) VALUES (6,'Spær: 45 x 195 mm. spærtræ.',480,1,'stk.',NULL);
INSERT INTO `` (`materialId`,`name`,`length`,`count`,`unit`,`description`) VALUES (7,'Stern: 25 x 150 mm. ru trykimprægneret.',480,1,'stk.',NULL);
INSERT INTO `` (`materialId`,`name`,`length`,`count`,`unit`,`description`) VALUES (8,'Lægte: T1 38 x 73 mm.',540,1,'stk.',NULL);
INSERT INTO `` (`materialId`,`name`,`length`,`count`,`unit`,`description`) VALUES (9,'Beslag og skruesæt',0,1,'pakke',NULL);
