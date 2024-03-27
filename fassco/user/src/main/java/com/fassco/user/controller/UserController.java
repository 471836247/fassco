package com.fassco.user.controller;

import com.fassco.user.feign.OderFeignController;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import oder.OderDto;
import oder.OderQuery;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping("/user")
@Slf4j
@Api(
        value = "UserController",
        tags = "UserController接口")
public class UserController {

    @Resource
    private OderFeignController oderFeignController;


    @ApiOperation(
            value = "根据Id查询学生信息",
            notes = "根据ID查询学生信息，并返回响应结果信息"
    )
    @ApiImplicitParams({
            @ApiImplicitParam(name="id",value="id",required=true)
    })
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public Map demo(String id){

        return oderFeignController.demo(id);
    }



    @ApiOperation(
            value = "根据Id查询学生信息",
            notes = "根据ID查询学生信息，并返回响应结果信息"
    )
    @RequestMapping(value = "/test2",method = RequestMethod.POST)
    @ResponseBody
    public OderDto test2(@RequestBody OderQuery param){
        Map result =  oderFeignController.test2(param);
        return new OderDto();
    }
}
