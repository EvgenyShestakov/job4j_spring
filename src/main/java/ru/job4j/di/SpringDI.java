package ru.job4j.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDI {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("ru.job4j.di");
        context.refresh();
        StartUI ui = context.getBean(StartUI.class);
        String name1 = ui.askStr("Enter name: ");
        String name2 = ui.askStr("Enter name: ");
        ui.add(name1);
        ui.add(name2);
        ui.print();
    }
}
