package com.amicus.config;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomHttpSessionListener implements HttpSessionListener {

	private Logger log = LoggerFactory.getLogger(getClass());
	
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		se.getSession().setMaxInactiveInterval(60*30);
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		log.debug("session destroyed");
	}

}
