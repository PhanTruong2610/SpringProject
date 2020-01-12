CREATE SCHEMA `new_schema` ;
CREATE TABLE `learning`.`ROLE` 
(
  `RoleId` INT NOT NULL AUTO_INCREMENT,
  `RoleName` NVARCHAR(45) NOT NULL,
  PRIMARY KEY (`RoleId`)
);
INSERT INTO `learning`.`ROLE` (`RoleId`, `RoleName`) VALUES ('1', 'ADMIN');
INSERT INTO `learning`.`ROLE` (`RoleId`, `RoleName`) VALUES ('2', 'USER');
    
CREATE TABLE `learning`.`ACCOUNT` 
(
  `UserId` INT NOT NULL AUTO_INCREMENT,
  `Username` NVARCHAR(45) NOT NULL,
  `Password` NVARCHAR(45) NOT NULL,
  `TimeCreate` DATETIME DEFAULT CURRENT_TIMESTAMP,
  `FullName` NVARCHAR(45) NOT NULL,
  `DateOfBirth` DATETIME NOT NULL,
  `Email` NVARCHAR(45) NOT NULL,
  `Phone` NVARCHAR(45) NOT NULL,
  `RoleId` INT NOT NULL,
  PRIMARY KEY (`UserId`),
  FOREIGN KEY (UserId) REFERENCES ROLE(RoleId)
);

INSERT INTO `learning`.`account` (`UserId`, `Username`, `Password`, `TimeCreate`, `FullName`, `DateOfBirth`, `Email`, `Phone`, `RoleId`) VALUES ('1', 'ADMIN', 'ADMIN', '2020/01/08', 'Nguyễn Văn Nam', '1998/11/29', 'bautroikhongkhi@gmail.com', '0989933887', '1');

    
CREATE TABLE `learning`.`CATEGORY` 
(
  `CategoryId` INT NOT NULL AUTO_INCREMENT,
  `CategoryName` NVARCHAR(45) NOT NULL,
	PRIMARY KEY (`CategotyId`)
);

INSERT INTO `learning`.`category` (`CategoryName`) VALUES ('Môn học');
INSERT INTO `learning`.`category` (`CategotyId`, `CategoryName`) VALUES ('2', 'Database');
INSERT INTO `learning`.`category` (`CategotyId`, `CategoryName`) VALUES ('3', 'IDE');
INSERT INTO `learning`.`category` (`CategotyId`, `CategoryName`) VALUES ('4', 'Framework');
INSERT INTO `learning`.`category` (`CategotyId`, `CategoryName`) VALUES ('5', 'Book');


CREATE TABLE `learning`.`SUBJECT` 
(
  `SubjectId` INT NOT NULL AUTO_INCREMENT,
  `SubjectName` NVARCHAR(45) NOT NULL,
  `UserId` INT NOT NULL,
  `CategoryId` INT NOT NULL,
	PRIMARY KEY (`SubjectId`),
    FOREIGN KEY (CategoryId) REFERENCES CATEGORY(CategotyId),
    FOREIGN KEY (UserId) REFERENCES ACCOUNT(UserId)
);

INSERT INTO `learning`.`subject` (`SubjectName`, `UserId`, `CategoryId`) VALUES ('C/C++', '1', '1');

CREATE TABLE `learning`.`LESSON` 
(
  `LessonId` INT NOT NULL AUTO_INCREMENT,
  `Title` NVARCHAR(100) NOT NULL,
  `Image` VARCHAR(100) NOT NULL,
  `Content` LONGTEXT NOT NULL,
  `ShortContent` NVARCHAR(500) NOT NULL,
  `TimeCreate` DATETIME DEFAULT CURRENT_TIMESTAMP,
  `TimeUpdate` DATETIME DEFAULT CURRENT_TIMESTAMP,
  `SubjectId` INT NOT NULL,
  `UserId` INT NOT NULL,
  `View` INT,
  `Url` VARCHAR(100) NOT NULL,
	PRIMARY KEY (`LessonId`),
    FOREIGN KEY (SubjectId) REFERENCES SUBJECT(SubjectId),
    FOREIGN KEY (UserId) REFERENCES ACCOUNT(UserId)
);

INSERT INTO `learning`.`lesson` (`Title`, `Image`, `Content`, `SubjectId`,`UserId`) VALUES ('Giới thiệu', 'img/Anh1.jpg', 'Nội dung bài giới thiệu', '1','1');

--------------------------------------------------------------------------------------------------------------------------------------------------
select * from lesson;
