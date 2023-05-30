//Створіть новий клас із будь-якої предметної області з кількома полями.
//                Деякі поля мають бути задані за допомогою конструктора, деякі
//                – за допомогою setter-методу,
//        а деякі – за допомогою методу init, який ви маєте вказати під час оголошення біну в конфігурації.

package ex_2_1;

import ex_2_2.AppConfig;
import ex_2_2.MyClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ex_2_2.MyClass myClass = context.getBean(MyClass.class);
        System.out.println(myClass.getField1());
        myClass.setField2("Field#2");
        System.out.println(myClass.getField2());
        System.out.println(myClass.isField3());


        context.close();
    }
}
