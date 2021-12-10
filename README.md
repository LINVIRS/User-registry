## User-registry-api项目目录结构
* api
    * aop文件夹：存放切面配置文件
    * annotation：自定义注解
    * job：订时任务
    * config文件夹：存放配置文件
    * controller文件夹：控制层代码；
    * service文件夹：逻辑层代码；
    * interceptor：拦截器文件
    
* dao
    * redis文件夹：redis相关配置；
    * entity文件夹：由数据库生成的底层实体；
    * enums：枚举类
    * repository文件夹：spring data jpa接口实现文件；
    
* utils
    * result文件夹：数据返回实体；
    * constant文件夹：常量池；
    * 其它默认为某某工具类，这里不做详细介绍；
    
## 底层自动生成
### 教程网址：https://blog.csdn.net/itguangit/article/details/78696797 或 参考 common-api-template
    注意：打开 Persistence窗口 不要勾选 “prefer primitive types(更喜欢原始类型)”；若勾选，生成的实体主键为基本类型，分页查询需要做多余的忽略处理；
    
## 文件描述
application-xxx.yml文件介绍：
- application.yml 基础配置文件
- application-dev.yml 本地测试环境
- application-test.yml 测试服环境
- application-pro.yml 正式服环境

# 运行
本地、正式服、测试服三种环境只需要修改application.yml文件
中的active即可。分别对应的值是dev、test、pro

# 打包
和运行一样，需要修改active的值，然后点开MavenProject，
api-template-Lifecycle-clean-package即可

# 构建热部署
当我们修改了java类后，IDEA默认是不自动编译的，而spring-boot-devtools又是监测classpath下的文件发生变化才会重启应用，所以需要设置IDEA的自动编译：

（1）File-Settings-Build-Compiler-Build Project automatically

（2）ctrl + shift + alt + /,选择Registry,勾上 Compiler autoMake allow when app running

