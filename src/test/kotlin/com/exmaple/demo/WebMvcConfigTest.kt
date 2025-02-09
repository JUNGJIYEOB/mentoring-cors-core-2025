package com.example.demo

import com.example.web.CorsConfig
import com.exmaple.demo.TestApplication
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldNotBe
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext

@SpringBootTest(classes = [TestApplication::class])
class WebMvcCorsConfigTest @Autowired constructor(
    private val applicationContext: ApplicationContext
) : FreeSpec({

    "WebMvcCorsConfig 빈 로드 테스트" - {
        "컨텍스트에 WebMvcCorsConfig 빈이 존재해야 한다" {
            val corsConfig = applicationContext.getBean(CorsConfig::class.java)
            System.out.println("하하하 성공입니다 성곡ㅇ");
            corsConfig shouldNotBe null
        }
    }
})

//TODO
//숙제: Preflight 요청이 도착하는지 테스트하기 (테스트 코드에서)
