package de.neuefische;

import de.neuefische.javaInterfaces.model.ComputerScienceStudent;
import de.neuefische.javaInterfaces.model.HistoryStudent;

public class Main {
    public static void main(String[] args) {
        ComputerScienceStudent[] csStudentList = new ComputerScienceStudent[3];
        csStudentList[0] = new ComputerScienceStudent("Tom", 25, 123456);
        csStudentList[1] = new ComputerScienceStudent("Katja", 23, 234567);
        csStudentList[2] = new ComputerScienceStudent("Robbi", 26, 345678);

        HistoryStudent[] hisStudentList = new HistoryStudent[4];
        hisStudentList[0] = new HistoryStudent("Michelle", 25, 123456);
        hisStudentList[1] = new HistoryStudent("Robert", 23, 234567);
        hisStudentList[2] = new HistoryStudent("Cristina", 26, 345678);
        hisStudentList[3] = new HistoryStudent("Pablo", 24, 456789);
    }
}
