c1:spring的IOC，由spring创建对象

1:创建maven项目
2:加入maven的依赖
spring的依赖，版本5.2.5版本
Junit 依赖
3:创建类（接口和他的实现类）
    和没有使用框架一样，就是普通的类
4:创建spring需要使用的配置文件
声明的信息，这些类由spring创建和管理
通过spring的语法，完成属性赋值

5:测试spring创建的对象



ch2:
spring 的配置文件中，给java对象的属性赋值
di：依赖注入，表示创建对象，给属性赋值
di有两种：
1：配置文件中，使用标签和属性完成，叫做基于xml的di实现
2：使用spring 中的注解，完成属性赋值，叫做基于注解的di实现

di的语法分类
1：set注入（设值注入）：spring调用类的set方法，实现属性的赋值
2：构造器注入