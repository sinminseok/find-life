package com.chatting.controller;


import com.chatting.dto.DirectMessageDto;
import com.chatting.service.DirectMessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import java.sql.SQLOutput;

@Controller
@RequiredArgsConstructor
public class DirectMessageController {

    private final SimpMessagingTemplate template; //특정 broker로 매제지 전달
    private final DirectMessageService dmService;


    //Client가 SEND할 수 있는 경로
    //stompConfig에서 설정한 applicationDestinationPrefixes와 @MessageMapping 경로가 병합됨
    //"/pub/chat/enter"
    @MessageMapping(value = "/chat/enter")
    public void enter(DirectMessageDto message){
//        message.setMessage(message.getWriter() + "님이 채팅방에 참여하였습니다.");
//        template.convertAndSend("/sub
//
//        /chat/room/" + message.getRoomId(), message);
    }

    @MessageMapping(value = "/chat/message")
    public void message(DirectMessageDto dmDto){
        System.out.println(dmDto.getMessage());
        System.out.println(dmDto.getSenderId());
        System.out.println(dmDto.getReceiverId());
        System.out.println(dmDto.getRoomId());
        dmService.sendDM(dmDto);
        template.convertAndSend("/sub/chat/room/" + dmDto.getRoomId(), dmDto);
    }

    @MessageMapping(value = "/dm/message")
    public void directMessage(DirectMessageDto dmDto){
        template.convertAndSend("/sub/chat/room/" + dmDto.getRoomId(), dmDto.getMessage());
        dmService.sendDM(dmDto);
    }
}
