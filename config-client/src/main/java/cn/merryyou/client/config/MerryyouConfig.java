package cn.merryyou.client.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * Created on 2018/4/10 0010.
 *
 * @author zlf
 * @email i@merryyou.cn
 * @since 1.0
 */
@Data
@Component
@RefreshScope
@ConfigurationProperties("merryyou")
public class MerryyouConfig {

    private String name;
    private String url;
}
