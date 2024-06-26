package com.service.home.utils;

import com.core.home.model.Home;
import com.service.home.dto.response.HomeOverviewResponse;
import com.service.home.mapper.HomeMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import java.util.List;
import java.util.stream.Collectors;

public class HomeUtil {

//    static public Page<HomeOverviewResponse> toPageOverview(Page<Home> homes, HomeMapper homeMapper) {
//        List<HomeOverviewResponse> pageResponse = homes.getContent().stream()
//                .map(homeMapper::toSimpleHomeDto)
//                .collect(Collectors.toList());
//        return new PageImpl<>(pageResponse, homes.getPageable(), homes.getTotalElements());
//    }



    static public PageRequest toPageRequest(int pageNumber, int pageSize) {
        return PageRequest.of(pageNumber, pageSize);
    }
}
