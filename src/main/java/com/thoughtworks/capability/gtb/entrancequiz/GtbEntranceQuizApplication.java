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
