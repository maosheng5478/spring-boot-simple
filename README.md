# spring-boot-simple

:tw-1f525: 基于java 的 Spring Boot 项目的初始模板，整合了常用的框架和实例代码，可以在此基础上进行快速的开发自己的项目。

##  :pencil: 框架集合
- Spring Boot 2.7.1
- mybatis-plus
- Lombok
- knife4j Api文档
- Apache common 工具包
- hutool
- jackson json处理
- mapstruct 数据转化
- pagehelper 分页插件

##  :zap: 基础功能
- 全局请求响应拦截器（记录日志）
- 全局异常处理器
- 自定义错误码
- 封装通用响应类
- 示例接口
## 📚目录结构

```
# spring-boot-simple
├─ pom.xml            # maven
├─ simple-api         # 接口模块
│  ├─ config          # 模块配置
│  ├─ controller      # 控制层
│  ├─ converter       # bean类转化
│  ├─ dto             
│  ├─ service         # 核心业务层
│  ├─ vo
├─ simple-common      # 工具模块
├─ simple-core        # 核心模块
│  ├─ base            # 基础封装
│  ├─ config          # 框架配置
│  ├─ context         # 常量
│  ├─ entity          # 数据库对应实体类
│  ├─ mapper          # mapper 层
│  ├─ result          # 返回类型封装
│  ├─ service         # service 层
│  ├─ utils           # 工具
```
##  :pencil: License
[MIT © MS-2022](./LICENSE)

> by zhenghonghao
