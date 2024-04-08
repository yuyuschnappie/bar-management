package com.bar.barsys.domain.common;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public enum ResultType {
    SUCCESS(1, "成功"),
    FAILURE(2, "失敗"),
    ERROR(3, "異常");

    private int code;
    private String desc;
    private static final Map<Integer, ResultType> MAP_STORE = new HashMap();

    private ResultType(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static ResultType getInstanceOf(int code) {
        return (ResultType)MAP_STORE.get(code);
    }

    public int getCode() {
        return this.code;
    }

    public String getDesc() {
        return this.desc;
    }

    static {
        Arrays.stream(values()).forEach((item) -> {
            MAP_STORE.put(item.getCode(), item);
        });
    }
}
