# 重学 Java 设计模式

> fork from 小傅哥，[:pencil2: 虫洞 · 科技栈，作者](https://bugstack.cn)，[:trophy: CSDN 博客专家](https://bugstack.blog.csdn.net)

> fork 的目的是因为在日常的开发过程中，完成需求的同时很少使用设计模式，导致抽象的能力越来越低，所欲决定好好学一把

> readme的目的是为了记录个设计模式可以用到地方，以后方便回忆和使用
## 创建型模式

- [`1. 重学 Java 设计模式：实战工厂方法模式「多种类型商品不同接口，统一发奖服务搭建场景」`](https://bugstack.cn/itstack-demo-design/2020/05/20/%E9%87%8D%E5%AD%A6Java%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F-%E5%AE%9E%E6%88%98%E5%B7%A5%E5%8E%82%E6%96%B9%E6%B3%95%E6%A8%A1%E5%BC%8F.html)
org.itstack.demo.design.test.ApiTest
实际使用时，工厂返回的会是实例；
工厂的作用是是承载了之前的业务代码的if-else，让业务代码更清晰

- [`2. 重学 Java 设计模式：实战抽象工厂模式「替换Redis双集群升级，代理类抽象场景」`](https://bugstack.cn/itstack-demo-design/2020/05/24/%E9%87%8D%E5%AD%A6Java%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F-%E6%8A%BD%E8%B1%A1%E5%B7%A5%E5%8E%82%E6%A8%A1%E5%BC%8F.html)
用动态代理的方式获取想要的redis操作类；
在现有业务中，一般用模版方式实现，模版方式需要有一个init的地方。
动态代理里使用的反射技术，注意消耗

- [`3. 重学 Java 设计模式：实战建造者模式「各项装修物料组合套餐选配场景」`](https://bugstack.cn/itstack-demo-design/2020/05/26/%E9%87%8D%E5%AD%A6Java%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F-%E5%AE%9E%E6%88%98%E5%BB%BA%E9%80%A0%E8%80%85%E6%A8%A1%E5%BC%8F.html)
当一个类的构造函数参数超过4个，而且这些参数有些是可选时，可以使用建造者模式
一般开发过程中 通过lombok的@builder就可以使用建造者方式
新增一个Computer的建造者案例
步骤：
1.在目标类中创建一个静态内部类 Builder，然后将 目标 中的参数都复制到Builder类中。
2.在目标中创建一个private的构造函数，参数为Builder类型
3.在Builder中创建一个public的构造函数，参数为目标中必填的那些参数，cpu 和ram。
4.在Builder中创建设置函数，对目标中那些可选参数进行赋值，返回值为Builder类型的实例
5.在Builder中创建一个build()方法，在其中构建目标的实例并返回

- [`4. 重学 Java 设计模式：实战原型模式「上机考试多套试，每人题目和答案乱序排列场景」`](https://bugstack.cn/itstack-demo-design/2020/05/28/%E9%87%8D%E5%AD%A6-Java-%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F-%E5%AE%9E%E6%88%98%E5%8E%9F%E5%9E%8B%E6%A8%A1%E5%BC%8F.html)
这个案例很失败，完全感觉不到任何可在业务中使用的场景
原型模式的解释：
原型模式将克隆过程委派给被克隆的实际对象。模式为所有支持克隆的对象声明了一个通用接口，
该接口让你能够克隆对象， 同时又无需将代码和对象所属类耦合。 通常情况下， 这样的接口中仅包含一个 克隆方法。
说白了，原型模式就是使用clone来进行那些可clone的类的设置

- [`5. 重学 Java 设计模式：实战单例模式「7种单例模式案例，Effective Java 作者推荐枚举单例模式」`](https://bugstack.cn/itstack-demo-design/2020/05/31/%E9%87%8D%E5%AD%A6-Java-%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F-%E5%AE%9E%E6%88%98%E5%8D%95%E4%BE%8B%E6%A8%A1%E5%BC%8F.html)
这个案例的单例模式讲的不好，少了一个双重检查，且第7种模式不对，枚举需要在需要单例的类例。
单例模式的使用场景：
1.如果程序中的某个类对于所有客户端只有一个可用的实例， 可以使用单例模式
2.如果你需要更加严格地控制全局变量， 可以使用单例模式

说白了，其实单例模式和static没有本质区别，加了个没有就创建的功能

## 结构型模式

- [`1. 重学 Java 设计模式：实战适配器模式「从多个MQ消息体中，抽取指定字段值场景」)`](https://bugstack.cn/itstack-demo-design/2020/06/02/%E9%87%8D%E5%AD%A6-Java-%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F-%E9%80%82%E9%85%8D%E5%99%A8%E6%A8%A1%E5%BC%8F.html)
使用场景：
1.当你希望使用某个类， 但是其接口与其他代码不兼容时， 可以使用适配器类。
适配器模式允许你创建一个中间层类， 其可作为代码与遗留类、 第三方类或提供怪异接口的类之间的转换器。

说白了，就是做一个中间类，解决上下两种接口或者类不兼容的问题

- [`2. 重学 Java 设计模式：实战桥接模式「多支付渠道(微信、支付宝)与多支付模式(刷脸、指纹)场景」`](https://bugstack.cn/itstack-demo-design/2020/06/04/%E9%87%8D%E5%AD%A6-Java-%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F-%E5%AE%9E%E6%88%98%E6%A1%A5%E6%8E%A5%E6%A8%A1%E5%BC%8F.html)
详细的可以看https://refactoringguru.cn/design-patterns/bridge
或者https://zhuanlan.zhihu.com/p/58903776
桥接模式可将一个大类或
一系列紧密相关的类拆分为抽象和实现两个独立的层次结构， 从而能在开发时分别使用。

就是将一个多继承的类变成一个多组合的类，
比如有一个Shape形状类，可以扩展成圆形和三角形，然后将红蓝色彩加进来，就是4个类，红圆，红三，蓝圆，蓝三。
如果这个时候要增加一个矩形，又要增加两个类，因为需要有两种色彩,
这个时候可以将形状和颜色单独抽成两个独立类，那么就只会有4个类，分别是红、蓝、圆、三。
这个时候新增一个矩形，也只需要在形状里增加一个子类，不需要动颜色的分类。

在这个案例中，支付有两种方式，3中检测模式，加起来就有六种可能，如果继承同一个pay接口就会有6个实现类。
将校验抽成独立类，通过构造器的方式将校验的类传入pay的实现类，
即使以后增加其他的货币，也只需要增加一个类就好。

- [`3. 重学 Java 设计模式：实战组合模式「营销差异化人群发券，决策树引擎搭建场景」`](https://bugstack.cn/itstack-demo-design/2020/06/08/%E9%87%8D%E5%AD%A6-Java-%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F-%E5%AE%9E%E6%88%98%E7%BB%84%E5%90%88%E6%A8%A1%E5%BC%8F.html)
场景：如果你需要实现树状对象结构， 可以使用组合模式。https://zhuanlan.zhihu.com/p/369731677
这个案例是组合模式的一个应用场景
组合模式分成:
1. 组件，叶子节点和普通节点都是组件的实现
2. 组合, 有一个字段，表示组件的list
3. 叶子节点
在这个案例中，treeRich就是组合，TreeNode是组件节点也是叶子节点，
场景里还有TreeNodeLink存储这个规则树里的规则

- [`4. 重学 Java 设计模式：实战装饰器模式「SSO单点登录功能扩展，增加拦截用户访问方法范围场景」`](https://bugstack.cn/itstack-demo-design/2020/06/09/%E9%87%8D%E5%AD%A6-Java-%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F-%E5%AE%9E%E6%88%98%E8%A3%85%E9%A5%B0%E5%99%A8%E6%A8%A1%E5%BC%8F.html)
https://blog.csdn.net/ShuSheng0007/article/details/88780036
使用场景：
1. 如果用继承来扩展对象行为的方案难以实现或者根本不可行， 你可以使用该模式。
2. 在无需修改代码的情况下即可使用对象， 且希望在运行时为对象新增额外的行为， 可以使用装饰模式。(很多类是final, 禁止修改)
比如：要装饰一个SsoInterceptor，并且按照顺序先装饰单点登陆，再装饰用户状态校验
先有一个校验的接口 HandlerInterceptor，里面有一个preHandler
初始的抽象类 AbstractDecorator, 被装饰类是 SsoInterceptor
AbstractDecorator里持有SsoInterceptor的引用
在LoginAbstractDecorator 和 UserStatusDecorator中分别实现 SsoInterceptor的preHandler，且增加了单点功能和用户状态校验功能

- [`5. 重学 Java 设计模式：实战外观模式「基于SpringBoot开发门面模式中间件，统一控制接口白名单场景」`](https://bugstack.cn/itstack-demo-design/2020/06/11/%E9%87%8D%E5%AD%A6-Java-%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F-%E5%AE%9E%E6%88%98%E5%A4%96%E8%A7%82%E6%A8%A1%E5%BC%8F.html)


- [`6. 重学 Java 设计模式：实战享元模式「基于Redis秒杀，提供活动与库存信息查询场景」`](https://bugstack.cn/itstack-demo-design/2020/06/14/%E9%87%8D%E5%AD%A6-Java-%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F-%E5%AE%9E%E6%88%98%E4%BA%AB%E5%85%83%E6%A8%A1%E5%BC%8F.html)
- [`7. 重学 Java 设计模式：实战代理模式「模拟mybatis-spring中定义DAO接口，使用代理类方式操作数据库原理实现场景」`](https://bugstack.cn/itstack-demo-design/2020/06/16/%E9%87%8D%E5%AD%A6-Java-%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F-%E5%AE%9E%E6%88%98%E4%BB%A3%E7%90%86%E6%A8%A1%E5%BC%8F.html)

## 行为模式

- [`1. 重学 Java 设计模式：实战责任链模式「模拟618电商大促期间，项目上线流程多级负责人审批场景」`](https://bugstack.cn/itstack-demo-design/2020/06/18/%E9%87%8D%E5%AD%A6-Java-%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F-%E5%AE%9E%E6%88%98%E8%B4%A3%E4%BB%BB%E9%93%BE%E6%A8%A1%E5%BC%8F.html)
- [`2. 重学 Java 设计模式：实战命令模式「模拟高档餐厅八大菜系，小二点单厨师烹饪场景」`](https://bugstack.cn/itstack-demo-design/2020/06/21/%E9%87%8D%E5%AD%A6-Java-%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F-%E5%AE%9E%E6%88%98%E5%91%BD%E4%BB%A4%E6%A8%A1%E5%BC%8F.html)
- [`3. 重学 Java 设计模式：实战迭代器模式「模拟公司组织架构树结构关系，深度迭代遍历人员信息输出场景」`](https://bugstack.cn/itstack-demo-design/2020/06/23/%E9%87%8D%E5%AD%A6-Java-%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F-%E5%AE%9E%E6%88%98%E8%BF%AD%E4%BB%A3%E5%99%A8%E6%A8%A1%E5%BC%8F.html)
- [`4. 重学 Java 设计模式：实战中介者模式「按照Mybaits原理手写ORM框架，给JDBC方式操作数据库增加中介者场景」`](https://bugstack.cn/itstack-demo-design/2020/06/27/%E9%87%8D%E5%AD%A6-Java-%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F-%E5%AE%9E%E6%88%98%E4%B8%AD%E4%BB%8B%E8%80%85%E6%A8%A1%E5%BC%8F.html)
- [`5. 重学 Java 设计模式：实战备忘录模式「模拟互联网系统上线过程中，配置文件回滚场景」`](https://bugstack.cn/itstack-demo-design/2020/06/28/%E9%87%8D%E5%AD%A6-Java-%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F-%E5%AE%9E%E6%88%98%E5%A4%87%E5%BF%98%E5%BD%95%E6%A8%A1%E5%BC%8F.html)
- [`6. 重学 Java 设计模式：实战观察者模式「模拟类似小客车指标摇号过程，监听消息通知用户中签场景」`](https://bugstack.cn/itstack-demo-design/2020/06/30/%E9%87%8D%E5%AD%A6-Java-%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F-%E5%AE%9E%E6%88%98%E8%A7%82%E5%AF%9F%E8%80%85%E6%A8%A1%E5%BC%8F.html)
- [`7. 重学 Java 设计模式：实战状态模式「模拟系统营销活动，状态流程审核发布上线场景」`](https://bugstack.cn/itstack-demo-design/2020/07/02/%E9%87%8D%E5%AD%A6-Java-%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F-%E5%AE%9E%E6%88%98%E7%8A%B6%E6%80%81%E6%A8%A1%E5%BC%8F.html)
- [`8. 重学 Java 设计模式：实战策略模式「模拟多种营销类型优惠券，折扣金额计算策略场景」`](https://bugstack.cn/itstack-demo-design/2020/07/05/%E9%87%8D%E5%AD%A6-Java-%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F-%E5%AE%9E%E6%88%98%E7%AD%96%E7%95%A5%E6%A8%A1%E5%BC%8F.html)
- [`9. 重学 Java 设计模式：实战模版模式「模拟爬虫各类电商商品，生成营销推广海报场景」`](https://bugstack.cn/itstack-demo-design/2020/07/07/%E9%87%8D%E5%AD%A6-Java-%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F-%E5%AE%9E%E6%88%98%E6%A8%A1%E6%9D%BF%E6%A8%A1%E5%BC%8F.html)
- [`10. 重学 Java 设计模式：实战访问者模式「模拟家长与校长，对学生和老师的不同视角信息的访问场景」`](https://bugstack.cn/itstack-demo-design/2020/07/09/%E9%87%8D%E5%AD%A6-Java-%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F-%E5%AE%9E%E6%88%98%E8%AE%BF%E9%97%AE%E8%80%85%E6%A8%A1%E5%BC%8F.html)

---

*截止到此设计模式内容就全部讲完了，可能书中会因作者水平有限，有一些描述不准确或者错字内容。欢迎提交给我，也欢迎和我讨论相关的技术内容，作者小傅哥，非常愿意与同好进行交流，互相提升技术。*
