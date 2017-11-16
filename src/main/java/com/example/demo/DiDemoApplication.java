package com.example.demo;

import com.example.demo.controllers.MyController;
import com.example.demo.examplebeans.FakeDataSource;
import com.example.demo.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class DiDemoApplication {


    public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		MyController controller = (MyController) ctx.getBean("myController");

		FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);
		FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);
		System.out.println(fakeDataSource.getUser());
		System.out.println(fakeJmsBroker.getJmsUser());
	}
}
