package com.kf.notice.config;

import com.google.common.collect.Maps;
import io.netty.channel.Channel;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;

import java.util.Map;

/**
 * @author kenfo
 * @version V1.0
 * @Package com.kf.notice.config
 * @Description: 存储整个工程的全局配置
 * @date 2018/8/10 下午1:07
 */
public class NettyConfig {
    /**
     * 存储每个客户端接入进来的channel对象
     */
    public static ChannelGroup group = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);
    public static Map<String,Channel> userChannel = Maps.newHashMap();

}
