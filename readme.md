服务端

   环境搭建
     1.引入依赖
     
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-jdbc</artifactId>
        </dependency>
        <dependency>
            <groupId>org.mybatis.spring.boot</groupId>
            <artifactId>mybatis-spring-boot-starter</artifactId>
            <version>1.3.2</version>
        </dependency>

        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <scope>runtime</scope>
        </dependency>
   2.坑
     
   
    //https://blog.csdn.net/pange1991/article/details/81238940 坑
    @ComponentScan(basePackages = "com.springboot")
    @MapperScan(basePackages = "com.springboot")
    
    Curator版本问题
    https://my.oschina.net/u/237688/blog/808415
    
    
    
    
      