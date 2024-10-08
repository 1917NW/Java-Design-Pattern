# 工厂方法模式
## 定义
在基于类的编程中，工厂方法模式是一种创建型设计模式。它使用工厂方法来处理对象创建的问题，而无需指定将要创建的对象的具体类。这通过在接口中定义工厂方法，并由子类实现，或者在基类中实现工厂方法，并由派生类选择性地重写来实现
## 特点
1. 解耦创建过程
2. 增强灵活性
3. 提高代码可维护性
## 实现方式
定义一个接口或者一个抽象类，其中包含一个工厂方法，该方法返回一个产品接口类型的对象。然后，将工厂方法实现为一个或多个具体类，这些类将实现接口并创建具体产品的实例。
## 适用场景
当一个类中有一些通用的处理逻辑，但具体的子类在运行时才能确定时，可以使用工厂方法模式。换句话说，当客户端不知道需要实例化哪个具体子类时，这种模式非常有用