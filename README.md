# 启动说明

## 安装与启动mongo db 
(参考 https://spring.io/guides/gs/accessing-mongodb-data-rest/)

  1.在terminal里面安装mongodb，如果mac上有homebrew的话：
  
  ``` 
  $brew install mongodb
  ```
  
  *其他安装方式在参考网页有记载

  2.安装完成后 在terminal启动mongodb
  ```
  $sudo mongod
  $sudo mongo
  ```

## 安装与启动后台服务  
(参考 https://spring.io/guides/gs/rest-service/)

  1.在terminal 进入文件夹back-end
    例如： 
    
    
    cd  test/back-end
    

  2.在terminal启动后台服务
  
    
    java -Dserver.port=8888 -jar build/libs/gs-rest-service-0.1.0.jar
    

## 安装与启动前台服务 

（参考 
https://spring.io/guides/gs/consuming-rest-angularjs/
https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started-installing-spring-boot.html）

  1. 在terminal安装springboot
  
    
    $ brew tap pivotal/tap
    $ brew install springboot
    
  2. 在terminal 进入文件夹back-end
    例如： 
    
    
    cd  test/back-end
    
  3. 启动前台
  
    
    spring run app.groovy
    


# 访问方法
在浏览器中访问 localhost:8080 即可到达前台页面

在浏览器中访问 localhost:8888/bookmanage/..即可访问后台微服务
