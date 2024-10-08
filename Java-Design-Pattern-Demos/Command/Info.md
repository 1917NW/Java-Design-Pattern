# 命令模式
## 定义
命令模式是一种行为设计模式，通过将执行某一动作或触发某一事件所需的所有信息封装在一个对象中，使其可以再稍后时间执行。这些信息包括方法名、拥有该方法的对象和方法的参数等。命令模式允许将操作封装成对象，使客户端与接收者解耦。
## 特点
1. 将操作封装为对象，即一个操作对应一个类
2. 客户端与接收者解耦
## 实现方式
1. 定义一个Command接口类
2. 实现具体的命令类并实现Command接口
3. 定义一个Invoker类，用于调用命令
## 适用场景
命令模式非常适合用于实现命令的调度、记录、撤销和重做等功能。当你需要将操作封装为对象，通过操作的排列组合调控具体行为时，命令模式就显得非常有用。