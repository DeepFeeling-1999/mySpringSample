#可以不指定路径，只指定文件名，则在当前项目目录下新建log
logging.file.name=F:/springboot.log

#在当前磁盘的根路径下创建spring文件夹和里面的log文件夹
#然后使用spring.log作为默认文件名
logging.file.path=/SpringLog/log

自己添加log配置文件的话，使用logback.xml会直接被日志框架识别
使用logback-spring.xml会由springboot解析，可以使用一些高级功能