package com.wilmar.web.enums;

import com.wilmar.web.enums.base.BaseEnum;

public enum ActiveEnum implements BaseEnum {
    ACTIVATED (0, "activated"),
    DEACTIVATED (1, "deactivated");


    private final Integer code;
    private final String description;

    ActiveEnum(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    @Override
    public Integer getCode() {
        return code;
    }
    @Override
    public String getDescription() {
        return description;
    }
}
