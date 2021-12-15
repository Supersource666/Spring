package com.supersource.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConverter implements Converter<String, Date> {
    /**
     *String s
     * @param s
     * @return
     */
    @Override
    public Date convert(String s) {
        //判断
        if(s==null){
            throw new RuntimeException("请输入数据:");
        }
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        try{
            return df.parse(s);
        }catch (Exception e){
            throw new RuntimeException("数据转换出错");
        }

    }
}
