## 项目技术

Spring 

SpringMVC 

MyBatis

mysql

swagger



## 项目配置

### MySQL

- 配置MySQL,并创建数据库demo_java_db_1

```
jdbc.host=127.0.0.1
jdbc.database=demo_java_db_1
jdbc.port=3306
jdbc.username=root
jdbc.password=mysqltao
```

- 在数据库demo_java_db_1中执行如下初始化SQL语句

```
DROP TABLE IF EXISTS `tb_u_user`;
CREATE TABLE `tb_u_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(300) DEFAULT NULL,
  `sex` varchar(4) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `credits` int(11) DEFAULT NULL,
  `password` varchar(32) DEFAULT NULL,
  `last_visit` datetime DEFAULT NULL,
  `last_ip` varchar(23) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;
```

## 项目启动

### swagger interface

	通过jetty插件启动web项目(jetty:run)，并通过http://localhost:{jetty插件端口号}/swagger/index.html访问swagger首页
	
	