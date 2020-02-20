# Concurrency Concepts
A simple definition of concurrency is  
> Number of things that the system (OS) can do at a time.  

The definition on my laptop is as follows  

> Processor	Intel(R) Core(TM) i7-8650U CPU @ 1.90GHz, 2112 Mhz, 4 Core(s), 8 Logical Processor(s)t  

As per the information my system can run 8 tasks at a time(ie. 8 threads in java parlance)

# Controlling Concurrency for Spring Boot Application
If we run Spring boot with embedded tomcat container (using the maven dependency spring-boot-starter-web ) the default thread count is **200**  
We can override the behavior using the property in application.properties file
`server.tomcat.max-threads=1`  
