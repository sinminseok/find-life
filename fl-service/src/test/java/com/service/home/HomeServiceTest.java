package com.service.home;

import com.core.home.model.Home;
import com.core.home.reposiotry.HomeRepository;
import com.service.home.dto.SimpleHomeDto;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class HomeServiceTest {

    @InjectMocks
    private HomeService homeService;

    @Mock
    private HomeRepository homeRepository;

    @Test
    void home_찜목록_조회_기능_테스트() {
        // Mock 데이터 설정
        List<Long> homeIds = Collections.singletonList(1L);
        when(homeRepository.findById(1L)).thenReturn(Optional.of(new Home())); // 예시에 따라서 Home 객체를 적절히 생성하여 반환하도록 수정해주세요.

        // 테스트 실행
        List<SimpleHomeDto> favoriteHomes = homeService.findFavoriteHomes(homeIds);

        // 테스트 검증
        // 적절한 검증 코드 추가
    }
}