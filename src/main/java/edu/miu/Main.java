package edu.miu;

import edu.miu.model.Publisher;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var welcomeMessage = "Welcome to edu";
        System.out.println("Hello and welcome!");

        var publishers = List.of(
                new Publisher(101, "McGraw-Hill", "sales@mcgraw.com", null),
                new Publisher(102, "Apress", "sales@mcgraw.com", "(123) 456-7890"),
                new Publisher(103, "Penguin-RandomHouse", null, null)
        );

        publishers.forEach(System.out::println);
    }
}
