package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class Login {

    // نقطة نهاية (Endpoint) لاستقبال طلبات تسجيل الدخول عن طريق POST
    @PostMapping("/login")
    public String loginUser(@RequestBody User user) {
        
        // هنا نقارن البيانات المدخلة ببيانات تجريبية (كمثال مبدئي)
        // لاحقاً سنقوم بربطها بقاعدة بيانات حقيقية
        if ("admin".equals(user.getUsername()) && "12345".equals(user.getPass())) {
            return "Login Successful! Welcome, " + user.getUsername();
        } else {
            return "Invalid username or password, please try again.";
        }
    }
}