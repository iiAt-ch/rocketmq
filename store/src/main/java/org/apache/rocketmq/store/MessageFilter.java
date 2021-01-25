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
package org.apache.rocketmq.store;

import java.nio.ByteBuffer;
import java.util.Map;

/**
 * 消息过滤API
 * RocketMQ消息过滤方式不同于其他消息中间件，是在订阅时做过滤
 */
public interface MessageFilter {
    /**
     * match by tags code or filter bit map which is calculated when message received
     * and stored in consume queue ext.
     *
     * 根据ConsumeQueue判断消息是否匹配
     *
     * @param tagsCode tagsCode 消息tag的hashcode
     * @param cqExtUnit extend unit of consume queue consumequeue条目扩展属性
     */
    boolean isMatchedByConsumeQueue(final Long tagsCode,
        final ConsumeQueueExt.CqExtUnit cqExtUnit);

    /**
     * match by message content which are stored in commit log.
     * <br>{@code msgBuffer} and {@code properties} are not all null.If invoked in store,
     * {@code properties} is null;If invoked in {@code PullRequestHoldService}, {@code msgBuffer} is null.
     *
     * 根据存储在commitlog文件中的内容判断消息是否匹配
     * 该方法主要是为表达式模式SQL92服务的，根据消息属性实现类似于数据库SQL where条件过滤方式
     *
     * @param msgBuffer message buffer in commit log, may be null if not invoked in store.
     *                  消息内容，如果为空，该方法返回true
     * @param properties message properties, should decode from buffer if null by yourself.
     *                   消息属性，主要用于表达式SQL92过滤模式
     */
    boolean isMatchedByCommitLog(final ByteBuffer msgBuffer,
        final Map<String, String> properties);
}
