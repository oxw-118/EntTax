# 企业增值税发票数据分析系统
>企业数据分析系统主要使用者是企业财务管理人员或者运营管理层，对企业的销项发票数据、进项发票数据进行管理，并根据进销项数据比对，分析企业的经营情况，出具分析报表。

## 项目目录说明
* JavaWeb 项目目录 ： [EntTax](/EntTax)
* 项目UML目录 : [UML](/UML)
* 项目文档目录 :[DOC](/DOC)
* 项目视频目录 :[Videos](/Videos)
* 项目可执行文件：[War](/War)

## 项目视频演示
* 公网服务器(无广告) : [演示视频地址](http://www.coolbhu.cn:8081/video/index.html)(服务器到期)
* YouKu服务器(播放密码:2017): [演示视频地址](http://v.youku.com/v_show/id_XMjg1NzAyNjcyNA==.html?spm=a2h3j.8428770.3416059.1#paction)
* youtube服务器：[演示视频地址](https://youtu.be/z4Zj2SHp54w)

## 项目公网演示
* 演示地址：[www.coolbhu.cn](http://www.coolbhu.cn)(服务器到期)

#### 管理员
* 管理员测试号：20171111
* 管理员密码 :dbroom1411

#### 操作员
* 操作员测试号：20172222
* 操作员密码：dbroom1411

#### 决策员
* 决策员测试号：20173333
* 决策员密码：dbroom1411

## 主要功能
* 导入数据 (操作员，管理员)： 通过Excel模板导入数据
* 数据管理 (管理员)： 对数据进行修改，删除操作
* 月度统计 (决策员，管理员)：查看月度柱状统计图
* 年度统计 (决策员，管理员)：查看年度柱状统计图
* 分类统计 (决策员，管理员)：根据年份查看看特定项目的进项销项数据折线图
* 比率统计 (决策员，管理员)：查看进项销项饼状图
* 线性预测 (决策员，管理员)：根据当前月和前五个月预测下一个月销项
* 查看员工 (决策员，管理员)：查看所有用户的信息
* 管理员工 (管理员)：对员工进行增加，删除，修改操作
* 个人资料 (当前用户)：查看自己的个人信息
* 修改信息 (当前用户)：修改自己的信息
* 安全中心 (当前用户)：修改自己的敏感信息
* 我的消息 (当前用户)：我的站内消息
* 发送消息 (当前用户)：站内简短消息发送
* 系统日志 (管理员)：查看敏感信息操作日志

## 主要技术
### 前端主要技术
* 前端主要： Html5, CSS3,JavaScript, BootStrap, JQuery
* 图表： Highcharts
* 图标： FontAwesome

### 后端主要技术
* 主要框架： Spring MVC, Spring , MyBatis
* 模板渲染引擎：Thymeleaf
* 安全控制：Shiro

### 项目相关
* 构建工具：Maven
* 版本控制：Git
* UML软件：StarUML
