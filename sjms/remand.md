创建类：工厂方法模式、建造者模式、抽象工厂模式、单例模式、原型模式（5种）
结构类：适配器模式、桥梁模式、组合模式、装饰模式、门面模式、享元模式、代理模式。（7种）
行为类：责任链模式、命令模式、解释器模式、迭代器模式、中介者模式、备忘录模式、观察者模式、状态模式、策略模式、模版方法模式、访问者模式（11种）

1.组合模式：组合对象，成员变量包含其他组合对象  常见场景：二叉树组装
2.模板模式：抽象类继承，调用未实现方法  常见场景：基本业务流程相同，差异节点提供未实现接口，销售服务，场景接口
3.策略模式：多种策略实现同一接口，根据传入策略注入对应的策略类  常见场景：if（）else if() else if()
4.单例模式：公共变量访问锁，避免并发相互干扰
5.抽象工厂：由专门工厂类提供对象实例化， 常见场景：spring bean依赖注入
6.装饰者模式： 注入原接口，在原接口方法中扩展逻辑    类似重写   [=================>++++]
7.代理模式: 注入原接口，提供新的方法在原接口方法外层扩展  类似    [++++++++][===================>][++++++]
8.外观模式：时间点切片，多个协同组件相同时间点执行动作再包装到一个方法中
9.观察者模式：发布者在发布内容发生变化时，通知订阅了该发布内容的服务更新发布内容。  配置中心
10.建造者模式：创建最终对象步骤分离 目标对象,组装类,获取类
11.桥接模式:  什么玩意
12：享元模式： 工具类
13.原型模式：深浅复制
14.迭代子模式：循环操作///
15.责任链模式：动态流程处理，if else 分离，过滤器-拦截器
16:状态模式：固定流程    电梯运转，订单流程
16.命令模式：
