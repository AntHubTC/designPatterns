package com.tc.designPattern._18MementoPattern.case4;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * BeanUtils工具类
 *      类似的很多工具已经提供，比如Spring， Apache工具集commons等。
 */
public class BeanUtils {
    // 把bean的所有属性及数值放入到HashMap中
    public static HashMap<String, Object> backupProp(Object bean) {
        HashMap<String, Object> result = new HashMap<>();
        try {
            // 获得bean描述
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
            // 获得属性描述
            PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
            // 遍历所有属性
            for (PropertyDescriptor descriptor : descriptors) {
                // 属性名称
                String fieldName = descriptor.getName();
                // 读取属性的方法
                Method getter = descriptor.getReadMethod();
                // 读取属性值
                Object fieldValue = getter.invoke(bean, new Object[]{});
                if (!fieldName.equalsIgnoreCase("class")) {
                    result.put(fieldName, fieldValue);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            // 异常处理
        }

        return result;
    }

    // 把Hashmap的值返回到bean中
    public static void restoreProp(Object bean, Map<String, Object> propMap) {
        try {
            // 获得bean描述
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
            // 获得属性描述
            PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
            // 遍历所有属性
            for (PropertyDescriptor descriptor : descriptors) {
                // 属性名称
                String fieldName = descriptor.getName();
                if (propMap.containsKey(fieldName)) {
                    // 获取属性
                    Object fieldValue = propMap.get(fieldName);
                    // 写属性的方法
                    Method setter = descriptor.getWriteMethod();
                    // 设置值
                    setter.invoke(bean, new Object[]{ fieldValue });
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            // 异常处理
        }
    }
}
