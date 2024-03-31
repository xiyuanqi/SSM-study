package com.pangding.client;

import com.pangding.annotation.Component;

import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ComponentScan {
    public static void main(String[] args) {
        Map<String,Object> beanmap = new HashMap<>();
        String packageName = "com.pangding.bean";
        String packagePath = packageName.replaceAll("\\.", "/");
//        System.out.println(packagePath);

        URL url = ClassLoader.getSystemClassLoader().getResource(packagePath);
        String path = url.getPath();
//        System.out.println(path);

        File file = new File(path);
        File[] files = file.listFiles();
        Arrays.stream(files).forEach(file1 -> {
            try {
                System.out.println(file1.getName().split("\\.")[0]);
                String className = packageName + "." + file1.getName().split("\\.")[0];
                System.out.println(className);
                Class<?> aClass = Class.forName(className);
                if(aClass.isAnnotationPresent(Component.class)) {
                    Component annotation = aClass.getAnnotation(Component.class);
                    String id = annotation.value();
                    Object obj = aClass.newInstance();
                    beanmap.put(id,obj);
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        });
        System.out.println(beanmap);
    }
}
