package com.learning.mybatis.test.tools;

import com.learning.mybatis.entity.Student;
import lombok.SneakyThrows;
import org.apache.ibatis.reflection.DefaultReflectorFactory;
import org.apache.ibatis.reflection.Reflector;
import org.apache.ibatis.reflection.ReflectorFactory;
import org.apache.ibatis.reflection.invoker.Invoker;
import org.junit.Test;

import java.util.Arrays;

/**
 * @Author xiangli.meng
 * @create 2022/5/30 8:53
 */
public class ReflectorTest {

    @SneakyThrows
    @Test
    public void testReflector() {
        ReflectorFactory factory = new DefaultReflectorFactory();
        Reflector reflector = factory.findForClass(Student.class);

        System.out.println(reflector.hasDefaultConstructor());

        System.out.println(Arrays.toString(reflector.getGetablePropertyNames()));
        System.out.println(Arrays.toString(reflector.getGetablePropertyNames()));

        Student student = new Student();
        student.setCity("xian");
        Invoker getInvoker = reflector.getGetInvoker("city");
        System.out.println(getInvoker.invoke(student,new Object[]{}));

    }
}
