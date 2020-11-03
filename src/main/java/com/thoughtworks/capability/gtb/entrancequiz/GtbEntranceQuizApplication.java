package com.thoughtworks.capability.gtb.entrancequiz;

import com.thoughtworks.capability.gtb.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication(scanBasePackages = "com.thoughtworks.capability.gtb")
public class GtbEntranceQuizApplication {

	public static void main(String[] args) {
		SpringApplication.run(GtbEntranceQuizApplication.class, args);
	}


}

// TODO GTB-综合: * 整体完成度较低，无法判断工程实践方面的能力
// TODO GTB-完成度: * 大部分功能没有完成，完成了查询学生列表和分组的接口，但是有bug
// TODO GTB-测试: * 没有包含任何测试
// TODO GTB-知识点: * 没有掌握和理解Spring MVC相关的知识点
// TODO GTB-知识点: * 没有掌握Spring IoC相关的知识点
// TODO GTB-知识点: * 没有掌握Restful API Design相关的知识点
// TODO GTB-工程实践: * 项目分包不合理，类的职责划分不明确，同时clean code还有很大提升空间
