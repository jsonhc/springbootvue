package com.clothes.utils;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author Author
 * @Date: 2024/5/8 21:59
 * @Version 1.0
 * @Description: 响应封装类：前后端统一消息格式
 */
@Getter
@Setter
public class R<T> extends BaseResponse {
    private T data;

    private R(ResponseEnum code) {
        super(code);
    }

    private R(ResponseEnum code, T data) {
        super(code);
        this.data = data;
    }


    public static <T> R<T> out(ResponseEnum code, T data) {
        return new R<>(code, data);
    }

    public static <T> R<T> out(ResponseEnum code) {
        return new R<>(code);
    }
}
