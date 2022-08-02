package com.example.code.services.UserService;

import com.example.code.model.dto.RequestUserInfoDTO;
import com.example.code.model.dto.ResponseUserInfoDTO;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
public interface UserInfoService {
    void register(RequestUserInfoDTO requestUserInfoDTO);

    Optional<ResponseUserInfoDTO> login(RequestUserInfoDTO requestUserInfoDTO);
}
