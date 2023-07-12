package creational.prototype.simple;

import java.util.List;

public class PrototypePatternTest {

    /*
    * Шаблон проектирования «Прототип» используется, когда создание
    * объекта является дорогостоящим делом и требует много времени
    * и ресурсов, а у вас уже есть аналогичный объект. Шаблон
    * прототипа предоставляет механизм для копирования исходного
    * объекта в новый объект и последующего изменения его в соответствии
    * с нашими потребностями. Шаблон проектирования прототипа использует
    * клонирование Java для копирования объекта.*/
    public static void main(String[] args) throws CloneNotSupportedException {
        Employees emps = new Employees();
        emps.loadData();

        //Use the clone method to get the Employee object
        Employees empsNew = (Employees) emps.clone();
        Employees empsNew1 = (Employees) emps.clone();
        List<String> list = empsNew.getEmpList();
        list.add("John");
        List<String> list1 = empsNew1.getEmpList();
        list1.remove("Pankaj");

        System.out.println("emps List: "+emps.getEmpList());
        System.out.println("empsNew List: "+list);
        System.out.println("empsNew1 List: "+list1);
    }

}