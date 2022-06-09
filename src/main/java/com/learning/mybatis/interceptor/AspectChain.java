package com.learning.mybatis.interceptor;

import org.apache.commons.compress.utils.Lists;
import org.apache.ibatis.io.Resources;
import org.springframework.util.ClassUtils;

import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Created by mengxiangli on 2022-06-08.
 */
public class AspectChain {

    private static String ASPECT_KEY = "pre.function.aspect";
    private static List<Aspect> aspects = Lists.newArrayList();

    static {
        try {
            ResourceBundle bundle = ResourceBundle.getBundle("aspect-config");
            String string = bundle.getString(ASPECT_KEY);
            String[] classAspects = string.split(",");
            for(String className: classAspects) {
                Class<Aspect> aClass =(Class<Aspect>) ClassUtils.forName(className, AspectChain.class.getClassLoader());
                aspects.add(aClass.newInstance());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void preAll() {
        aspects.stream().forEach(ele->ele.preAction());
    }
}
