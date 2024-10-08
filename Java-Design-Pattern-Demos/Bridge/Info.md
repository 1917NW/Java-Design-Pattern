# 桥接模式
## 定义
某个系统能够从多个角度进行分类，每一种分类都可能会变化，且多个分类可以独立地支持该系统的行为逻辑，那么我们可以将抽象部分和实现部分隔离开来，使得它们能够独立变化。
## 特点
1. 多个角度分类
2. 多个角度分类可以独立变化支持该系统的行为逻辑
3. 将继承关系通过组合当方式转换为关联关系，封装了变化，完成了解耦，减少了系统中的类的数量
## 实现方式
将多个角度分类抽象为接口，桥接类采用组合的方式引用多个角度分类的接口，实现类实现多个角度分类的接口，桥接类通过调用实现类的接口方法来实现多个角度分类的行为逻辑。
## 适用场景
当某个系统可以从多个角度分类，每一种分类都可能会变化，且多个分类可以独立地支持该系统的行为逻辑时，可以使用桥接模式。
