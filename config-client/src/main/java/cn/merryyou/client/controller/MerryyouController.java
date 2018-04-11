package cn.merryyou.client.controller;

import cn.merryyou.client.config.MerryyouConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 2018/4/10 0010.
 *
 * @author zlf
 * @email i@merryyou.cn
 * @since 1.0
 */
@RestController
@RequestMapping("/merryyou")
public class MerryyouController {

    @Autowired
    private MerryyouConfig merryyouConfig;

    @GetMapping("/print")
    public String print() {
        return "name:" + merryyouConfig.getName() + ", url:" + merryyouConfig.getUrl();
    }

}
