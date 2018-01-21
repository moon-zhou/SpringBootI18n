package com.moonzhou.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.support.RequestContextUtils;

@Controller
public class LanguageController {

	private final static Logger LOGGER = LoggerFactory.getLogger(LanguageController.class);
	
	/**
	 * 
	 * 功能描述: 切换语言action<br>
	 * http://localhost:8080/changeSessionLanauage?lang=en
	 *
	 * @param request
	 * @param response
	 * @param lang
	 * @return
	 * @see [相关类/方法](可选)
	 * @since [产品/模块版本](可选)
	 */
    @RequestMapping("/changeSessionLanauage")
    public String changeSessionLanauage(HttpServletRequest request, HttpServletResponse response,
                                        String lang){
    	
    	LOGGER.info("change language, lang now is {}.", lang);
    	
        LocaleResolver localeResolver = RequestContextUtils.getLocaleResolver(request);
        if("zh".equals(lang)){
            localeResolver.setLocale(request, response, new Locale("zh", "CN"));
        }else if("en".equals(lang)){
            localeResolver.setLocale(request, response, new Locale("en", "US"));
        }
        
        return "redirect:i18n";
    }

}
