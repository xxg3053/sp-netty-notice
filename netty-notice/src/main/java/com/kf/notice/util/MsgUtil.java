package com.kf.notice.util;

import com.kf.notice.config.NettyConfig;
import io.netty.channel.group.ChannelMatchers;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;

/**
 * @author kenfo
 * @version V1.0
 * @Package com.kf.notice.util
 * @Description: TODO
 * @date 2018/8/10 下午2:19
 */
public class MsgUtil {

    public static void send(String userId, String content){
        TextWebSocketFrame msg = new TextWebSocketFrame(content);
        NettyConfig.group.writeAndFlush(msg, ChannelMatchers.is(NettyConfig.userChannel.get(userId)));
    }
}
