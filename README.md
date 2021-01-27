## Apache RocketMQ [![Build Status](https://travis-ci.org/apache/rocketmq.svg?branch=master)](https://travis-ci.org/apache/rocketmq) [![Coverage Status](https://coveralls.io/repos/github/apache/rocketmq/badge.svg?branch=master)](https://coveralls.io/github/apache/rocketmq?branch=master)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.apache.rocketmq/rocketmq-all/badge.svg)](http://search.maven.org/#search%7Cga%7C1%7Corg.apache.rocketmq)
[![GitHub release](https://img.shields.io/badge/release-download-orange.svg)](https://rocketmq.apache.org/dowloading/releases)
[![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg)](https://www.apache.org/licenses/LICENSE-2.0.html)

**[Apache RocketMQ](https://rocketmq.apache.org) is a distributed messaging and streaming platform with low latency, high performance and reliability, trillion-level capacity and flexible scalability.**

RocketMQ核心目录说明如下：
1. broker:broker模块（broker启动进程）。
2. client：消息客户端，包含消息生产者、消息消费者相关类。
3. common：公共包。
4. dev：开发者信息（非源代码）。
5. distribution：部署实例文件夹（非源代码）。
6. example:RocketMQ示例代码。
7. filter：消息过滤相关基础类。
8. filtersrv：消息过滤服务器实现相关类（Filter启动进程）。
9. logappender：日志实现相关类。
10. namesrv:NameServer实现相关类（NameServer启动进程）。
11. openmessaging：消息开放标准，正在制定中。
12. remoting：远程通信模块，基于Netty。
13. srvutil：服务器工具类。
14. store：消息存储实现相关类。
15. style:checkstyle相关实现。
16. test：测试相关类。
17. tools：工具类，监控命令相关实现类。

It offers a variety of features:

* Pub/Sub messaging model
* Scheduled message delivery
* Message retroactivity by time or offset
* Log hub for streaming
* Big data integration
* Reliable FIFO and strict ordered messaging in the same queue
* Efficient pull&push consumption model
* Million-level message accumulation capacity in a single queue
* Multiple messaging protocols like JMS and OpenMessaging
* Flexible distributed scale-out deployment architecture
* Lightning-fast batch message exchange system
* Various message filter mechanics such as SQL and Tag
* Docker images for isolated testing and cloud isolated clusters
* Feature-rich administrative dashboard for configuration, metrics and monitoring


----------

## Learn it & Contact us
* Mailing Lists: <https://rocketmq.apache.org/about/contact/>
* Home: <https://rocketmq.apache.org>
* Docs: <https://rocketmq.apache.org/docs/quick-start/>
* Issues: <https://github.com/apache/rocketmq/issues>
* Ask: <https://stackoverflow.com/questions/tagged/rocketmq>
* Slack: <https://rocketmq-invite-automation.herokuapp.com/>
 

----------

## Apache RocketMQ Community
* [RocketMQ Community Projects](https://github.com/apache/rocketmq-externals)
----------

## Contributing
We always welcome new contributions, whether for trivial cleanups, big new features or other material rewards, more details see [here](http://rocketmq.apache.org/docs/how-to-contribute/).
 
----------
## License
[Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html) Copyright (C) Apache Software Foundation