/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.rocketmq.client.producer;

/**
 * 消息发送状态
 * 后三种状态，如果业务系统是可靠性消息投递，那么需要考虑补偿进行可靠性的重试投递
 */
public enum SendStatus {
    /**
     * 消息发送成功
     */
    SEND_OK,
    /**
     * 消息发送成功，但服务在进行刷盘的时候超时了
     * 消息已经进入服务器队列，刷盘超时会等待下一次的刷盘时机再次刷盘，如果此时服务器down机消息会丢失，如果业务系统是可靠性消息投递，那么需要重发消息
     */
    FLUSH_DISK_TIMEOUT,
    /**
     * 在主从同步的时候，同步到Slave超时了
     * 如果此时Master节点down机，消息也会丢失
     */
    FLUSH_SLAVE_TIMEOUT,
    /**
     * 消息发送成功，但Slave不可用，只有Master节点down机，消息才会丢失
     */
    SLAVE_NOT_AVAILABLE,
}
