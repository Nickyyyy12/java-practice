# java-practice

Java 学习练习代码，按课程节点分文件夹。

## 目录

所有代码在 `src/` 下，保持 IDEA 项目中的原始包结构。

| 文件夹 | 课程节点 | 练习内容 | 运行（入口类） |
|---|---|---|---|
| `base/basics/` | 基础语法 | 数据类型、运算符、if/switch、for/while、数组、Scanner 输入、猜数字等小程序 | `java -cp out base.basics.Hello`（每个文件各有 main，替换类名即可） |
| `base/arraytest/` | 数组 | 求最大值、成绩统计、两数之和、数组工具类 | `java -cp out base.arraytest.Main` |
| `se07/oop/student/` | 面向对象 · 类与对象 | 学生类、封装 | `java -cp out se07.oop.student.StudentTest` |
| `se07/oop/employee/` | 面向对象 · 继承 | 员工与经理 | `java -cp out se07.oop.employee.EmployeeTest` |
| `se07/oop/animal/` | 面向对象 · 继承与接口 | 动物继承、Flyable 接口 | `java -cp out se07.oop.animal.InheritDemotest` / `se07.oop.animal.InterfaceDemotest` |
| `se07/oop/shape/` | 面向对象 · 抽象类 | 抽象图形类 | `java -cp out se07.oop.shape.Abstracttest` |
| `se07/oop/pet/` | 面向对象 · 抽象类与接口 | 宠物抽象类、飞行接口 | `java -cp out se07.oop.pet.PetTest` |
| `se07/oop/device/` | 面向对象 · 多接口 | 设备、可充电/可联网接口 | `java -cp out se07.oop.device.DeviceTest` |
| `se07/oop/bank/` | 面向对象 · 多态 | 储蓄账户、信用账户 | `java -cp out se07.oop.bank.BankTest` |
| `se07/oop/Vehicle/` | 面向对象 · 多态 | 停车场计费（普通车/会员车） | `java -cp out se07.oop.Vehicle.ParkingTest` |
| `se07/oop/exception/` | 异常处理 | try/catch/finally | `java -cp out se07.oop.exception.ExceptionDemo` |
| `se07/oop/test/` | 集合 | Map 练习 | `java -cp out se07.oop.test.MapPracticeTest` |
| `se07/SmartHome/` | SE-07 综合项目 | 智能家居控制：设备父类、灯/电视/洗衣机子类、控制器 | `java -cp out se07.SmartHome.Main` |
| `se07/notification/` | 接口与多态 | 通知服务：邮件/短信发送器实现同一接口 | `java -cp out se07.notification.Main` |
| `se07/payment/` | 接口与多态 | 订单支付：支付宝/银行卡实现同一接口 | `java -cp out se07.payment.Main` |
| `se08/codeblock/` | SE-08 代码块 | 静态代码块、实例代码块、构造方法的执行顺序 | `java -cp out se08.codeblock.Main` |
| `se08/innerclass/` | SE-08 内部类 | 成员内部类、静态内部类（学生、图书馆） | `java -cp out se08.innerclass.Main` / `se08.innerclass.LibraryMain` |
| `se08/anonymous/` | SE-08 匿名内部类 | 计算器接口：用匿名内部类实现加法、乘法，并与 Lambda 写法对比 | `java -cp out se08.anonymous.Main` |
| `se08/anonymous2/` | SE-08 匿名内部类 | 问候接口：两个匿名内部类分别输出中文、英文问候语 | `java -cp out se08.anonymous2.Main` |
| `se08/lambda1/` | SE-08 Lambda | 成绩判断接口：用代码块和表达式两种 Lambda 写法判断及格、优秀 | `java -cp out se08.lambda1.Main` |
| `se08/methodref/` | SE-08 方法引用 | 成绩判断：静态方法引用 Main::isPass 与对象方法引用（PassLine 及格线对象） | `java -cp out se08.methodref.Main` |
| `se08/string1/` | SE-08 String 基础 | 以邮箱字符串练习 length、charAt、isEmpty、contains、endsWith | `java -cp out se08.string1.Main` |

## 如何运行

**方式一：** 用 IntelliJ IDEA 打开仓库，把 `src` 标记为 Sources Root，运行对应的入口类。

**方式二：** 在仓库根目录用命令行，先编译某个文件夹，再运行入口类（以 codeblock 为例）：

```bash
javac -encoding UTF-8 -d out src/se08/codeblock/*.java
java -cp out se08.codeblock.Main
```

其他文件夹把路径和包名换成上表中对应的即可，例如：

```bash
javac -encoding UTF-8 -d out src/se07/oop/bank/*.java
java -cp out se07.oop.bank.BankTest
```

> 源码为 UTF-8 编码，Windows 下编译需加 `-encoding UTF-8`，否则中文会乱码。

环境：JDK 17
