package com.kf.common.exception;

/**
 * @author kenfo
 * @version V1.0
 * @Package com.kf.exception
 * @Description: TODO
 * @date 2018/6/5 下午1:01
 */
public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public BusinessException(String msg) {
        super(msg);
    }

    public BusinessException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
