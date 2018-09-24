package org.itstep.qa;

class Circle {
    // Создать программу для работы с объектом круг. Создать в отдельном файле класс Circle (круг).
    // Описать его свойства (атрибуты) и реализовать методы. В главном классе присвоить
    // значения свойству круга и узнать площадь круга.
    // Например:
    // свойство – радиус, методы – задать радиус, узнать радиус, узнать площадь.
    //
    // Идею как реализовать метод «задать радиус» можно подсмотреть в задании 2 в презентации.

        private double radius;

        public Circle(){
            this(0.0);
        }
        public Circle(double radius){
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public double getSquare() {
            return Math.PI * Math.pow(radius, 2);
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public String toString() {
            return "Radius = " + radius;
        }
    }


