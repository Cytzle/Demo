package com.forezp.sericefeign.feign;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric  implements SchedualServiceHi{
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
