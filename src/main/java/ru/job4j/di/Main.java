package ru.job4j.di;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.reg(Store.class);
        context.reg(ConsoleInput.class);
        context.reg(StartUI.class);
        StartUI ui = context.get(StartUI.class);
        String name1 = ui.askStr("Enter name: ");
        String name2 = ui.askStr("Enter name: ");
        ui.add(name1);
        ui.add(name2);
        ui.print();
    }
}
