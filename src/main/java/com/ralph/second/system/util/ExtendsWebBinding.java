package com.ralph.second.system.util;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebBindingInitializer;
import org.springframework.web.context.request.WebRequest;

/**
 * Created by Ralph on 2016/6/24.
 */
public class ExtendsWebBinding implements WebBindingInitializer
{
    @Override
    public void initBinder(WebDataBinder binder, WebRequest webRequest)
    {
        // 1. 使用spring自带的CustomDateEditor
        // SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        // binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));

        // 2. 自定义的PropertyEditorSupport
        binder.registerCustomEditor(java.util.Date.class, new DateConvertEditor());
        binder.registerCustomEditor(java.sql.Date.class, new SqlDateConvertEditor());
        binder.registerCustomEditor(java.sql.Timestamp.class, new TimeStampConvertEditor());
    }
}
