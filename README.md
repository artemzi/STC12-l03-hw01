Домашнее задание к 3 занятию
Написать класс MathBox , реализующий следующий функционал:

1. Конструктор на вход получает массив Integer. Элементы не могут повторяться. Элементы массива внутри конструктора раскладываются в подходящую коллекцию (выбрать самостоятельно), являющуюся полем MathBox. Элементы должны отсортироваться

2. Существует метод summator, возвращающий сумму всех элементов коллекции

3. Существует метод splitter, выполняющий поочередное деление всех хранящихся в объекте элементов на делитель, являющийся аргументом метода. Метод возвращает коллекцию с результатами деления. Коллекция внутри mathbox при этом не меняется

4. Необходимо правильно переопределить методы toString , hashCode, equals, чтобы можно было использовать MathBox для вывода данных на экран и хранение объектов этого класса в коллекциях (например, hashMap ). Выполнение контракта обязательно!

5. Есть метод, который получает на вход Integer и если такое значение есть в коллекции, удаляет его.