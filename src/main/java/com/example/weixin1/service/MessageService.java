package com.example.weixin1.service;

import com.example.weixin1.domain.InMessage;
import com.example.weixin1.domain.OUtMessage;

public interface MessageService {

	OUtMessage onMessage(InMessage msg);
}
