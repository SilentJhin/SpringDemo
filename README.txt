02版本使用spring,xml配置来改造01版本
需要spring创建的bean:
service
dao
QueryRunner
c3p0

在创建service时需要注入dao，使用set方法注入；
创建dao时需要注入QueryRunner,使用set方法注入；
创建QueryRunner工具对象时需要注入数据连接池c3p0,使用构造函数注入；
创建c3p0连接池对象时需要制定 数据库驱动，地址，用户，密码 这几个成员也是通过set方法注入；
