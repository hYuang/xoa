package com.xoa.model.request;

import com.xoa.model.Page;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class BaseRequest {


    private Page page;
}
