package com.ccb.roo.addon.i18;

import java.io.InputStream;
import java.util.Locale;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;
import org.springframework.roo.addon.web.mvc.jsp.i18n.AbstractLanguage;
import org.springframework.roo.support.util.FileUtils;

/** 
 * Simple_chinese language support.
 *
 */
@Component(immediate = true)
@Service
public class Simple_chineseLanguage extends AbstractLanguage {

	public Locale getLocale() {
		return new Locale("zh");
	}
	
	public String getLanguage() {
		return "Simple_Chinese";
	}

	public InputStream getFlagGraphic() {
		return FileUtils.getInputStream(getClass(), "cn.png");
	}

	public InputStream getMessageBundle() {
		return FileUtils.getInputStream(getClass(), "messages_zh.properties");
	}
}
