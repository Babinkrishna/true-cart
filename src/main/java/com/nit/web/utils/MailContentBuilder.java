package com.nit.web.utils;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@Service
public class MailContentBuilder {
    private TemplateEngine templateEngine;

    @Autowired
    public MailContentBuilder(TemplateEngine templateEngine) {
        this.templateEngine = templateEngine;
    }

    public String build(Map<String, Object> message, String template) {
        Context context = new Context();
        for(Map.Entry m:message.entrySet()){
            if(m.getValue() == null){
                m.setValue("unspecified");
            }
            context.setVariable(m.getKey().toString(), m.getValue().toString());

        }
        return templateEngine.process(template, context);
    }
}
