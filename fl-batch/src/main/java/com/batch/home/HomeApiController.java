package com.batch.home;

import com.service.home.dto.response.HomeInformationResponse;
import com.service.home.dto.response.HomeOverviewResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class HomeApiController {

    private final HomeApiService homeApiService;

    @GetMapping("/homes")
    public List<HomeOverviewResponse> homes() {
        List<HomeOverviewResponse> homeDtos = homeApiService.findRooms();

        return homeDtos;
    }

    @GetMapping("/homes/{city}")
    public List<HomeOverviewResponse> findRoomsByCity(@PathVariable String city) {
        List<HomeOverviewResponse> homeDtos = homeApiService.findRoomByCity(city);

        return homeDtos;
    }

    @GetMapping("/home/{homeId}")
    public HomeInformationResponse roomDetail(@PathVariable Long homeId) {
        HomeInformationResponse homeDto = homeApiService.findRoomByRoomId(homeId);

        return homeDto;
    }

}
