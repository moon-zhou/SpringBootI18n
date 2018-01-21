package com.moonzhou.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.moonzhou.config.properties.CustomedConfig;
import com.moonzhou.utils.LocaleMessageSourceUtil;

/**
 * i18n test controller
 * 
 * @author 17080118
 *
 */
@Controller
public class I18nTestController {

	private final static Logger LOGGER = LoggerFactory.getLogger(I18nTestController.class);

	@Autowired
	private LocaleMessageSourceUtil messageSourceUtil;

	@Autowired
	private CustomedConfig customedConfig;
	
	/**
	 * 
	 * 功能描述: 国际化访问页面<br>
	 * http://localhost:8080/i18n
	 *
	 * @param model
	 * @return
	 * @see [相关类/方法](可选)
	 * @since [产品/模块版本](可选)
	 */
	@RequestMapping("i18n")
	public String i18nPage(Model model) {
		String hello = messageSourceUtil.getMessage("i18n.common.hello");
		LOGGER.debug("i18n test, hello content is {}", hello);

		LOGGER.debug("ems name is {}, epw name is {}.", customedConfig.getEms(), customedConfig.getEpw());
		
		return "i18n";
	}
}
