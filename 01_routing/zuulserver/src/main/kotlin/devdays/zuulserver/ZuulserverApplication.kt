package devdays.zuulserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.zuul.EnableZuulProxy

@SpringBootApplication
@EnableZuulProxy
class ZuulserverApplication

fun main(args: Array<String>) {
    runApplication<ZuulserverApplication>(*args)
}
