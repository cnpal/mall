package com.pal.mail.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author pal
 * @Date Created in 2020/6/26 11:39
 * @Version: 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class CouponApplication {
    public static void main(String[] args) {
        SpringApplication.run(CouponApplication.class);
    }
}
