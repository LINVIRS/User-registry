package com.wl.api.exception;


import com.wl.api.result.ResultCode;

public class UserAccountExistException extends ApiException {

    public UserAccountExistException() {
        super(ResultCode.ACCOUNT_EXIST.getMsg(), ResultCode.ACCOUNT_EXIST.getCode());
    }

    public UserAccountExistException(String msg, Integer code) {
        super(msg, code);
    }

}
