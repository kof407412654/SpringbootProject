package com.lichengyu.springboot.util;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public interface Constant {
    Map<String,String> maps = Collections.unmodifiableMap(
            new HashMap<String, String>(){{
                put("s","sdf");
            }}
    );
}
