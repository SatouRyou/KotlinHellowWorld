package com.kotlinhelloworld.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

/**
 * Created by teradashoutarou on 2016/10/05.
 */
@RestController
@RequestMapping("/api")
open class KotlinController {

    @ResponseBody
    @RequestMapping
    fun get(): String {
        return  "Hello World";
    }
}