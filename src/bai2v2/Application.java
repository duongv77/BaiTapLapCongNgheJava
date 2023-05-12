package bai2v2;

import bai2v2.model.Student;
import bai2v2.model.Teacher;

import java.util.ArrayList;
import java.util.List;

import static Utils.Helper.*;

public class Application {
    public static void main(String[] args) {
        int quantityStudent = IMPORT_INT("Nhập số lượng sinh viên:", null, 0);
        int quantityTeacher = IMPORT_INT("Nhập số lượng giảng viên:", null, 0);
        List<Student> listStudent = new ArrayList<>();
        List<Teacher> listTeacher = new ArrayList<>();
        for (int i = 0; i<quantityStudent; i++){
            printLog(String.format("Nhập thông tin sinh viên thứ %d:", i+1));
            Student student = new Student();
            student.importValue();
            listStudent.add(student);
        }

        for (int i = 0; i<quantityTeacher; i++){
            printLog(String.format("Nhập thông tin giảng viên thứ %d:", i+1));
            Teacher teacher = new Teacher();
            teacher.importValue();
            listTeacher.add(teacher);
        }

        printLog("-----In thông tin danh sách sinh viên-----");
        listStudent.forEach(elm->{
            printLog(String.format("Thông tin sinh viên %s", elm.getHoTen()));
            elm.print();
        });
        printLog("-----Hết sinh viên-----\n");
        printLog("-----In thông tin danh sách giảng viên-----");
        listTeacher.forEach(elm->{
            printLog(String.format("Thông tin giảng viên %s", elm.getHoTen()));
            elm.print();
        });
        printLog("-----Hết sinh viên-----");
    }
}
