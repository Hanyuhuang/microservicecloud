/*
MySQL Backup
Database: springcloud01
Backup Time: 2019-01-22 20:07:48
*/

SET FOREIGN_KEY_CHECKS=0;
DROP TABLE IF EXISTS `springcloud01`.`dept`;
CREATE TABLE `dept` (
  `deptno` int(11) NOT NULL AUTO_INCREMENT,
  `dname` varchar(255) NOT NULL,
  `db_source` varchar(255) NOT NULL,
  PRIMARY KEY (`deptno`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
BEGIN;
LOCK TABLES `springcloud01`.`dept` WRITE;
DELETE FROM `springcloud01`.`dept`;
INSERT INTO `springcloud01`.`dept` (`deptno`,`dname`,`db_source`) VALUES (1, '开发部', 'springcloud01'),(2, '人事部', 'springcloud01'),(3, '财务部', 'springcloud01'),(4, '市场部', 'springcloud01'),(5, '运维部', 'springcloud01'),(7, '测试部', 'springcloud01'),(8, '测试2', 'springcloud01'),(9, '测试3', 'springcloud01'),(10, '测试4', 'springcloud01'),(11, '测试5', 'springcloud01');
UNLOCK TABLES;
COMMIT;
