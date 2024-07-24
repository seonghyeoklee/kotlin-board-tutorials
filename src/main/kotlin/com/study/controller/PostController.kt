package com.study.controller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PostController {

    @PostMapping("/posts")
    fun createPost() {
        println("createPost")
    }
}
