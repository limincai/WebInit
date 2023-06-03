# WebInit
# 快速开启一个Springboot web项目，整合Knief4j接口文档生成器，自定义异常处理器
# 简单配置
在pom.xml中引入下列配置
~~~ yml
knife4j:
  config:
    name: your name
    email: your email
    version: your version
    title: your title
    description: your descrpition
    #你的controller类包路径，用于接口文档的生成
    scan-path: com.*.*.controller 
spring:
  profiles:
    active: dev
  mvc:
    path match:
      matching-strategy: ant_path_matcher
~~~
[这是一个简单的引入WebInit的示例项目，你可以通过这个项目快速了解如何使用WebInit](https://github.com/limincai/SampleWebInit)
