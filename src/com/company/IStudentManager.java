package com.company;

public interface IStudentManager {
    void add();
    void edit(int id);
    void delete(int id);
    void sortStudentByName();
    void sortStudentByGPA();
    void show();
}
