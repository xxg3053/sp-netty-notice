package com.kf.controller;

import com.kf.common.domain.vo.Result;
import com.kf.common.util.ResultUtil;
import com.kf.notice.config.NettyConfig;
import com.kf.notice.util.MsgUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kenfo
 * @version V1.0
 * @Package com.kf.controller
 * @Description: 发送消息测试类
 * @date 2018/8/10 下午2:02
 */
@RestController
@RequestMapping("/notice")
public class NoticeController {

    @GetMapping("/msg/{id}/{content}")
   public Result notice(@PathVariable("id") String userId, @PathVariable("content") String content){
        MsgUtil.send(userId,content);
       return ResultUtil.success();
   }

}
