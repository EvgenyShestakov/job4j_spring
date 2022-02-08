package ru.job4j.di;

public class StartUI {
    private Store store;

    private ConsoleInput input;

    public StartUI(Store store, ConsoleInput consoleInput) {
        this.store = store;
        this.input = consoleInput;
    }

    public void add(String value) {
        store.add(value);
    }

    public void print() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }

    public String askStr(String question) {
        return input.askStr(question);
    }
}
