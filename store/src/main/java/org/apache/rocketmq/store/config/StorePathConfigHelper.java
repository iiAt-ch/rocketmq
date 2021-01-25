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
package org.apache.rocketmq.store.config;

import java.io.File;

public class StorePathConfigHelper {

    /**
     * 消费队列存储路径，默认$HOME/store/consumequeue
     *
     * @param rootDir
     * @return
     */
    public static String getStorePathConsumeQueue(final String rootDir) {
        return rootDir + File.separator + "consumequeue";
    }

    public static String getStorePathConsumeQueueExt(final String rootDir) {
        return rootDir + File.separator + "consumequeue_ext";
    }

    /**
     * 消息索引存储队列，默认$HOME/store/index
     *
     * @param rootDir
     * @return
     */
    public static String getStorePathIndex(final String rootDir) {
        return rootDir + File.separator + "index";
    }

    public static String getStoreCheckpoint(final String rootDir) {
        return rootDir + File.separator + "checkpoint";
    }

    public static String getAbortFile(final String rootDir) {
        return rootDir + File.separator + "abort";
    }

    public static String getLockFile(final String rootDir) {
        return rootDir + File.separator + "lock";
    }

    /**
     * 延迟队列消息消费进度默认存储路径为${ROCKET_HOME}/store/config/delayOffset.json
     *
     * @param rootDir
     * @return
     */
    public static String getDelayOffsetStorePath(final String rootDir) {
        return rootDir + File.separator + "config" + File.separator + "delayOffset.json";
    }

    public static String getTranStateTableStorePath(final String rootDir) {
        return rootDir + File.separator + "transaction" + File.separator + "statetable";
    }

    public static String getTranRedoLogStorePath(final String rootDir) {
        return rootDir + File.separator + "transaction" + File.separator + "redolog";
    }

}
