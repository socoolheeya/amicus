package com.amicus.util.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component
public class LoginInterceptor extends HandlerInterceptorAdapter {

	private Logger log = LoggerFactory.getLogger(getClass());

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		log.debug("====================================================================================");
		log.debug("[METHOD] : " + Thread.currentThread().getStackTrace()[1].getMethodName().toString() + "()");
		log.debug("====================================================================================");
		
		try {
			String email = (String) request.getSession().getAttribute("email");
			if (StringUtils.isEmpty(email)) {
				response.sendRedirect("/login");
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
		log.debug("====================================================================================");
		log.debug("[Method Excuted]");
		log.debug("====================================================================================");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
		log.debug("====================================================================================");
		log.debug("[Method Completed]");
		log.debug("====================================================================================");
	}

}
