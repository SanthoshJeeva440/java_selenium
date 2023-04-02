package baseClass;

import org.aeonbits.owner.Config;

@Config.Sources({"file:${user.dir}/src/test/java/properties/${env}.properties"})
public interface Configuration extends Config {

    String url();

    String browserName();

    String userName();

    String password();

}
