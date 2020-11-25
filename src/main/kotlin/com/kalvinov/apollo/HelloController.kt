package com.kalvinov.apollo

import org.slf4j.LoggerFactory.getLogger
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HelloController {
    companion object {
        @Suppress("JAVA_CLASS_ON_COMPANION")
        @JvmStatic
        private val logger = getLogger(javaClass.enclosingClass)
    }
    @GetMapping("/")
    fun blog(model: Model): String {
        model["title"] = "Blog"
        logger.info("Sample of log message")
        logger.error("Error messages go here")
        return "blog"
    }
}