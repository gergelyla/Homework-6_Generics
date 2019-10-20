# Homework-6_Generics

Starting from the following given interface:

public interface IRepository<T> {

    void save(T obj);

    void remove(T obj);

    int count();

    Set<T> listAll();
}
Implement one ordered repository and another one which is sorted. Write a client which uses both these repositories (you should call al the
methods and validate that they work).
