package com.mincai.webinit.common;

/**
 * 错误码
 *
 * @author yupi
 */
public enum ErrorCode {

    SUCCESS(200, "ok"),
    PARAMS_ERROR(400, "请求参数错误"),
    NO_AUTH_ERROR(401, "无权限"),
    NOT_FOUND_ERROR(404, "请求数据不存在"),
    FORBIDDEN_ERROR(403, "禁止访问"),
    SYSTEM_ERROR(500, "系统内部异常"),
    OPERATION_ERROR(501, "操作失败");

    /**
     * 状态码
     */
    private final int code;

    /**
     * 信息
     */
    private final String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
