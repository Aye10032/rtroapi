package com.aye10032.rtroapi.handler;

import com.aye10032.rtroapi.data.APIException;
import com.aye10032.rtroapi.data.ResultCode;
import com.aye10032.rtroapi.data.ResultVO;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @program: rtroapi
 * @className: ExceptionControllerAdvice
 * @Description: 异常处理
 * @version: v1.0
 * @author: Aye10032
 * @date: 2021/7/14 下午 6:08
 */
@RestControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResultVO<String> MethodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e) {

        ObjectError objectError = e.getBindingResult().getAllErrors().get(0);

        return new ResultVO<>(ResultCode.VALIDATE_FAILED, objectError.getDefaultMessage());
    }

    @ExceptionHandler(APIException.class)
    public ResultVO<String> APIExceptionHandler(APIException e) {
        return new ResultVO<>(ResultCode.FAILED, e.getMsg());
    }

}
