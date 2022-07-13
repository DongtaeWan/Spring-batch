package com.example.batch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// EnableBatchProcessing 어노테이션을 통해 Batch를 활성화 할 수 있다.(내부적으로 배치 설정 클래스들이 실행되며 실행 구성이 이루어진다.)
// Bean으로 등록된 모든 Job들을 검색하고 초기화함과 동시에 수행시킨다.
@EnableBatchProcessing
@SpringBootApplication
public class BatchApplication {

    public static void main(String[] args) {
        SpringApplication.run(BatchApplication.class, args);
    }

    // Spring Batch 가 실행될 때 Flow 는 @EnableBatchProcessing 어노테이션에 의해 SimpleBatchConfiguration 이 동작하고 이 과정에서 JobBuilder, StepBuilder  Factory 가 생성된다.
    // Spring Batch 에 대한 주요 구성요소들이 Proxy 객체로 생성되며, 이후 BatchConfigurerConfiguration 에서 BasicBatchConfigurer 와 JpaBatchConfigurer 가 생성되는데 이들의 역할은
    // Proxy 객체의 실제 대상 객체를 생성하는 클래스이다.
}

