package com.fassco.user.feign;

import lombok.extern.slf4j.Slf4j;
import oder.OderQuery;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Slf4j
public class FeignFallbackFac  implements FallbackFactory<OderFeignController>{
    @Override
    public OderFeignController create(Throwable cause) {
        log.error(cause.getMessage(), cause);
        return new OderFeignController() {
            @Override
            public Map demo(String id) {
                Map result = new HashMap();
                result.put("error","");
                return result;
            }

            @Override
            public Map test2(OderQuery param) {
                Map result = new HashMap();
                result.put("error","");
                return result;
            }
        };
    }
}
