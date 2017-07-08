package jtonic.tmp.springbootkt;

import com.google.common.base.MoreObjects;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by Antonel Ernest Pazargic on 13/05/2017.
 *
 * @author Antonel Ernest Pazargic
 */
@ConfigurationProperties(prefix = "server")
public class ServerPropertiesJava {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("name", name)
                          .toString();
    }
}
