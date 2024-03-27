package com.fassco.user.feign;

import oder.OderQuery;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Component
@FeignClient(value = "oder",fallbackFactory=FeignFallbackFac.class)
@RequestMapping("/oder")
public interface OderFeignController {

    @RequestMapping("/test")
    public Map demo(@RequestParam("id") String id);

    @RequestMapping(value = "/test2",method = RequestMethod.POST)
    public Map test2(@RequestBody OderQuery param);
}
