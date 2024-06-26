package com.example.openschool1;

import com.example.openschool1.model.Info;
import com.example.openschool1.model.Plant;
import com.example.openschool1.service.PlantService;
import com.example.openschool1.utils.ThreadUtils;
import com.example.openschool1.utils.UserContext;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.util.List;

@RequiredArgsConstructor
@SpringBootApplication
public class OpenSchool1Application {

    private final Info info;
    private final PlantService plantService;

    public static void main(String[] args) {
        SpringApplication.run(OpenSchool1Application.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void onReady() {
        info.method1();

//        UserContext.setUsername("admin");
//        plantService.addPlant(new Plant("Роза", "Цветок"));
//
//        ThreadUtils.waitTime(200);
//
//        System.out.println(plantService.getPlantByType("Цветок"));
//        System.out.println(plantService.getPlantByName("Роза"));
//
//        plantService.addPlants(List.of(new Plant("Кукуруза", "Трава"), new Plant("Дуб", "Дерево")));
//
//        ThreadUtils.waitTime(200);


    }
}
