/* 
 * Copyright (c) 2017 Baidu, Inc. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.baidu.dueros.data.response.directive;

/**
 * AudioItem
 * 
 * @author tianlonglong(tianlong02@baidu.com)
 * @version V1.0
 * @since 2017年10月5日
 */
public class AudioItem {

    // 多媒体信息
    private Stream stream;

    /**
     * 默认构造函数
     */
    public AudioItem() {
        Stream stream = new Stream();
        this.stream = stream;
    }

    /**
     * 构造方法
     * 
     * @param url
     *            链接地址
     */
    public AudioItem(final String url) {
        Stream stream = new Stream(url);
        this.stream = stream;
    }

    /**
     * 构造方法
     * 
     * @param url
     *            链接地址
     * @param offsetInMilliSeconds
     *            当前播放进度
     */
    public AudioItem(final String url, final int offsetInMilliSeconds) {
        Stream stream = new Stream(url, offsetInMilliSeconds);
        this.stream = stream;
    }

    /**
     * 构造方法
     * 
     * @param stream
     *            多媒体信息
     */
    public AudioItem(final Stream stream) {
        this.stream = stream;
    }

    /**
     * 获取多媒体信息的getter方法
     * 
     * @return Stream 多媒体流信息
     */
    public Stream getStream() {
        return stream;
    }

    /**
     * 设置多媒体信息的setter方法
     * 
     * @param stream
     *            多媒体流信息
     * @return 当前AudioItem
     */
    public AudioItem setStream(final Stream stream) {
        this.stream = stream;
        return this;
    }

    /**
     * 设置链接地址的setter方法
     * 
     * @param url
     *            链接地址
     * @return 当前AudioItem
     */
    public AudioItem setUrl(final String url) {
        stream.setUrl(url);
        return this;
    }

    /**
     * 设置播放进度的setter方法
     * 
     * @param offsetInMilliSeconds
     *            播放进度
     * @return 当前AudioItem
     */
    public AudioItem setOffsetInMilliSeconds(final int offsetInMilliSeconds) {
        stream.setOffsetInMilliSeconds(offsetInMilliSeconds);
        return this;
    }

    /**
     * 设置token的setter方法
     * 
     * @param token
     *            token
     * @return 当前AudioItem
     */
    public AudioItem setToken(final String token) {
        stream.setToken(token);
        return this;
    }

}
