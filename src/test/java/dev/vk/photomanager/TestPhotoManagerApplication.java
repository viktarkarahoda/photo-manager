package dev.vk.photomanager;

import org.springframework.boot.SpringApplication;

public class TestPhotoManagerApplication {

    public static void main(String[] args) {
        SpringApplication.from(PhotoManagerApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
