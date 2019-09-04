package com.szhua.api;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @author d7
 */
@Data
@Builder
@AllArgsConstructor
public class ApiResponse<T> implements Serializable {

    public ApiResponse() {
        this.success = true;
    }

    private boolean success;

    private String msg;

    private T result;


    /**
     * 默认的成功操作
     * @param result
     * @return
     */
    public static ApiResponse  success( Object result  ){
        return  ApiResponse.builder().success(true)
                .result(result).msg("success").build();
    }

    /**
     * 默认的失败操作；
     * @param msg
     * @return
     */
    public static ApiResponse  failed( String  msg  ){
        return  ApiResponse.builder().success(false)
                .result(null).msg(msg).build();
    }


}
