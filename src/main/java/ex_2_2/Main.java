package ex_2_2;

//  Переведіть конфігурацію XML із Завдання 2 у конфігурацію Java.

//  За аналогією з List з уроку створіть у конфігурації XML бін Map.


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MyClass myClass = context.getBean(MyClass.class);
        System.out.println(myClass.getField1());
        myClass.setField2("Field#2");
        System.out.println(myClass.getField2());
        System.out.println(myClass.isField3());
        context.close();

        ApplicationContext cont = new ClassPathXmlApplicationContext("config.xml");
        // Получение экземпляра Map из контекста
        Map<String, ex_2_2.MyClass> myMap = cont.getBean("myMap", Map.class);
        // Обращение к бину по ключу
        MyClass bean3 = myMap.get("key3");
        System.out.println(bean3.getField1());
        bean3.setField2("bean_3, field_2");
        System.out.println(bean3.getField2());
        System.out.println(bean3.isField3());

    }
}