package com.app.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.app.service.INotificationService;

@Component
@Profile("dml")
public class DmlNotificationServiceImpl implements INotificationService {

	public void notificate() {
		System.out.println("Only for DML Profile");
	}

}
