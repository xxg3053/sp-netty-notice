package com.kf.common.aop;

import com.kf.common.domain.vo.Result;
import com.kf.common.exception.BusinessException;
import com.kf.common.util.ResultUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author kenfo
 * @version V1.0
 * @Package com.kenfo.common.aop
 * @Description: 统一异常处理
 * @date 2018/8/10 下午12:43
 */
@ControllerAdvice
public class GlobalHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result<String> defaultErrorHandler(HttpServletRequest req, Exception e){
        return ResultUtil.fail(500, "系统异常");
    }

    @ExceptionHandler(value = BusinessException.class)
    @ResponseBody
    public Result<String> businessExcepitonHandler(HttpServletRequest req, Exception e){
        return ResultUtil.fail(e.getMessage());
    }
}
