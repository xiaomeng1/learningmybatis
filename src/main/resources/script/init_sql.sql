create table student (
                         `id` int auto_increment,
                         `name` varchar(50) comment '名称',
                         `city` varchar(50) comment '城市',
                         `age` int comment '年龄',
                         `sex` varchar(10) comment '性别',
                         PRIMARY key(`id`)
) ENGINE=INNODB;

alter table student add COLUMN `student_id` int comment '学生编号';