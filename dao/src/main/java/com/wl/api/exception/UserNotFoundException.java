package com.wl.api.exception;


import com.wl.api.result.ResultCode;

/**
 * Created by chenpan on 2017/5/24.
 */
public class UserNotFoundException extends ApiException {

    public UserNotFoundException() {
        super(ResultCode.USER_NOT_FOUND.getMsg(), ResultCode.USER_NOT_FOUND.getCode());
    }

}
