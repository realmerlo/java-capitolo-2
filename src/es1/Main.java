package es1;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Luca", "Salvini", 104);

        System.out.println("Name: " + student.getName());
        System.out.println("Surname: " + student.getSurname());
        System.out.println("Id: " + student.getId());
    }
}
/*Scrivere un programma che contenga una classe che definisce uno Studente
che abbia come proprietà nome, cognome ed identificativo.
Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
Nel main dichiarare un oggetto di tipo Studente.*/