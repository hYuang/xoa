package com.xoa.model.response;

import com.xoa.model.Page;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class BaseResponse {
    private Page page;
}
