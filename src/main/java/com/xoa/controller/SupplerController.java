package com.xoa.controller;

import com.xoa.constant.UrlConstant;
import com.xoa.model.request.SupplerInfoRequest;
import com.xoa.model.response.Response;
import com.xoa.model.response.SupplerInfoResponse;
import com.xoa.service.SupplerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping(value = UrlConstant.SUPPLER_NAMESPACE)
public class SupplerController {

    @Autowired
    private SupplerService supplerService;

    @GetMapping(value = "/get/supperInfo")
    @ResponseBody
    public Response<List<SupplerInfoResponse>> getSupplerInfor(@RequestBody SupplerInfoRequest supplerInfoRequest){


        return null;
    }

    @GetMapping(value = "/add/supperInfo")
    @ResponseBody
    public Response<SupplerInfoResponse> addSupplerInfor(@RequestBody SupplerInfoRequest supplerInfoRequest){


        return null;
    }


    @GetMapping(value = "/update/supperInfo")
    @ResponseBody
    public Response<SupplerInfoResponse> updateSupplerInfor(@RequestBody SupplerInfoRequest supplerInfoRequest){


        return null;
    }

    @GetMapping(value = "/delete/supperInfo")
    @ResponseBody
    public Response<SupplerInfoResponse> deleteSupplerInfor(@NotNull  Integer id){


        return null;
    }





}
