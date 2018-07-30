# Simple micro service to test Ribbon client side load balancing

* Part of [micro services demo](https://github.com/maurofokker/microservices-demo)
* Will be consumed by [spring-microservices-ribbon project](https://github.com/maurofokker/spring-microservices-ribbon)
* Run 3 instances of this service using (intellij -> VM Options)
  * `-Dserver.port=7777`
  * `-Dserver.port=8888`
  * `-Dserver.port=9999`
* root context path `@RequestMapping("/")` is used by ribbon client side load balance to check wether or not the particular
  service is up and running. It is need it so ribbon is able to contact the micro service and register it
  as a functional then it has that instance for load balancing