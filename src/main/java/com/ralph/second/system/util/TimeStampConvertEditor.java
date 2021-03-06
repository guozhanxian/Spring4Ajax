package com.ralph.second.system.util;

import java.beans.PropertyEditorSupport;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.springframework.util.StringUtils;

/**
 * 
 * <P>
 * FileName: DateConvertEditor.java
 * 
 * @author Administrator
 *         <P>
 *         CreateTime: Nov 8, 2011 10:00:35 AM
 *         <P>
 *         Description:
 *         <P>
 *         Version:v1.0
 *         <P>
 *         History:
 * @param
 */
public class TimeStampConvertEditor extends PropertyEditorSupport {
    /**
     * 
     */
    private SimpleDateFormat datetimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    /**
     * 
     */
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    /**
     * 
     * <P>
     * Function: setAsText
     * <P>
     * Description:
     * <P>
     * Others:
     * 
     * @author: Administrator
     * @CreateTime: Nov 8, 2011 10:00:54 AM
     * @param text
     * @throws IllegalArgumentException
     */
    public void setAsText(String text) {
        if (StringUtils.hasText(text)) {
            try {
                if (text.indexOf(":") == -1
                        && text.length() == 10) {
                    setValue(new Timestamp(this.dateFormat.parse(text).getTime()));
                } else if (text.indexOf(":") > 0
                        && text.length() == 19) {
                	setValue(new Timestamp(this.datetimeFormat.parse(text).getTime()));
                } else {
                    throw new IllegalArgumentException(
                            "Could not parse date, date format is error ");
                }
            } catch (ParseException ex) {
            	ex.printStackTrace();
                IllegalArgumentException iae = new IllegalArgumentException(
                        "Could not parse date: " + ex.getMessage());
                iae.initCause(ex);
                throw iae;
            }
        } else {
            setValue(null);
        }
    }
}
