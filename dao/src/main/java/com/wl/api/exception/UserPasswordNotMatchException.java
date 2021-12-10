package com.wl.api.exception;


import com.wl.api.result.ResultCode;

public class UserPasswordNotMatchException extends ApiException{

    public UserPasswordNotMatchException() {
        super( ResultCode.USER_PASSWORD_NOT_MATCH.getMsg(), ResultCode.USER_PASSWORD_NOT_MATCH.getCode());
    }

}
