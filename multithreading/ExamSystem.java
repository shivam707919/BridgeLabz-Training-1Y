package com.gla.multithreading;

class Entry extends Thread {
    public void run() {
        System.out.println("Entry Started | State: " + getState());
    }
}

class QuestionPaper extends Thread {
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (Exception e) {}
        System.out.println("Question Paper Distributed");
    }
}

class Attendance extends Thread {
    public void run() {
        try {
            Thread.sleep(10000);
        } catch (Exception e) {}
        System.out.println("Attendance Marked");
    }
}

class Collection extends Thread {
    public void run() {
        try {
            Thread.sleep(15000);
        } catch (Exception e) {}
        System.out.println("Answer Sheets Collected");
    }
}

public class ExamSystem {
    public static void main(String[] args) {

        Entry e = new Entry();
        QuestionPaper q = new QuestionPaper();
        Attendance a = new Attendance();
        Collection c = new Collection();

        q.setPriority(10);
        a.setPriority(8);
        e.setPriority(5);
        c.setPriority(7);

        e.start();
        q.start();
        a.start();
        c.start();
    }
}
