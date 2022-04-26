package com.example.mobile.exception;


import com.example.mobile.protocol.RetCodeEnum;

/**
 * 业务异常
 *
 * @author zhangyubing
 */
public class BizException extends RuntimeException {

    /**
     * 返回码
     */
    private final RetCodeEnum retCode;

    public BizException(RetCodeEnum retCode) {
        super(retCode.name());
        this.retCode = retCode;
    }

    public RetCodeEnum getRetCode() {
        return this.retCode;
    }

}
