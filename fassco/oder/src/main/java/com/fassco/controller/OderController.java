package com.fassco.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import oder.OderDto;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import oder.OderQuery;

@RestController
@RequestMapping("/oder")
@Api(
        value = "OderController",
        tags = "OderController接口")
public class OderController {


    @ApiOperation(
            value = "根据Id查询学生信息",
            notes = "根据ID查询学生信息，并返回响应结果信息"
    )
    @ApiImplicitParams({
            @ApiImplicitParam(name="id",value="id",required=true)
    })
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    @ResponseBody
    public Map demo(String id){
        int d = 1/0;
        Map result = new HashMap();
        result.put("dffsdfs",id);
        return result;
    }


    @ApiOperation(
            value = "根据Id查询学生信息",
            notes = "根据ID查询学生信息，并返回响应结果信息"
    )
    @RequestMapping(value = "/test2",method = RequestMethod.POST)
    @ResponseBody
    public Map test2(@RequestBody OderQuery param){
        int d = 1/0;
        Map result = new HashMap();
        result.put("dffsdfs",param);
        return result;
    }
}
