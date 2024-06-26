package com.service.user;

import com.core.user.model.User;
import com.core.user.repository.UserRepository;
import com.service.file.FileService;
import com.service.user.dto.*;
import com.service.user.mapper.UserMapper;
import com.service.user.validation.UserServiceValidation;
import com.service.utils.OptionalUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {

    private final UserMapper userMapper;
    private final FileService fileService;
    private final UserRepository userRepository;
    private final UserServiceValidation validation;
    private final PasswordEncoder passwordEncoder;


    //회원가입 메서드
    public Long signUp(UserSignupRequest dto, MultipartFile image) throws Exception {
        //검증
        validation.validateSignUp(dto.getEmail(), dto.getNickname());

        User user = userMapper.toEntity(dto);

        //파일 업로드
        if (image != null) {
            String url = fileService.toUrls(image);
            fileService.fileUpload(image, url);
            user.setProfileUrl(url);
        }
        //비밀번호 인코딩
        String encode = passwordEncoder.encode(dto.getPassword());
        user.passwordEncode(encode);
        return userRepository.save(user).getId();
    }


    //회원 id 로 회원 조회
    public UserInformationDto findById(Long id) {
        Optional<User> user = userRepository.findById(id);
        return userMapper.toDto(user.get());
    }

    //회원 email로 회원 조회
    public UserInformationDto findByEmail(String email) {
        Optional<User> user = userRepository.findByEmail(email);
        return userMapper.toDto(user.get());
    }

    // 다른 사용자 프로필 조회 기능
    public UserProfileResponse getUserProfile(Long id) {
        User user = OptionalUtil.getOrElseThrow(userRepository.findById(id), "존재하지 않는 user ID 입니다.");
        return userMapper.toProfile(user);
    }


    //delete
    public void delete(Long id) {
        Optional<User> user = userRepository.findById(id);
        userRepository.delete(user.get());
    }


}
