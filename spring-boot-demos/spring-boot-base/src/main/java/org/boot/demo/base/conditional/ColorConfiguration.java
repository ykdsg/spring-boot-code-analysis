package org.boot.demo.base.conditional;

import org.boot.demo.base.conditional.bean.Black;
import org.boot.demo.base.conditional.bean.Blue;
import org.boot.demo.base.conditional.bean.Red;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ColorConfiguration {

	@Bean
	public Red red() {
		return new Red();
	}

	@Bean
	public Black black() {
		return new Black();
	}

	@Bean
	@ConditionalOnBean(Red.class)
	public Blue blue() {
		return new Blue();
	}

}
