package baseClass;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "file:${user.dir}/src/test/java/properties/${environment}.properties",
        "file:${user.dir}/src/test/java/properties/qa.properties"
})
public interface Configuration extends Config {

    @DefaultValue("qa")
    String environment();

    @Key("${environment}.url")
    String url();

    @Key("${environment}.browserName")
    String browserName();

    @Key("${environment}.userName")
    String userName();

    @Key("${environment}.password")
    String password();

}