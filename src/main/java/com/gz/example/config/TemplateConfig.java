package com.gz.example.config;

import com.blade.Blade;
import com.blade.event.BeanProcessor;
import com.blade.ioc.annotation.Bean;
import com.blade.mvc.view.template.JetbrickTemplateEngine;

/**
 * @author xiaozefeng
 */
@Bean
public class TemplateConfig implements BeanProcessor {

    @Override
    public void processor(Blade blade) {
        System.out.println("初始化模板引擎");
        blade.templateEngine(new JetbrickTemplateEngine());
    }
}
