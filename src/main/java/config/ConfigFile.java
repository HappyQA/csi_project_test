package config;

@org.aeonbits.owner.Config.Sources("classpath:config.properties")
public interface ConfigFile extends org.aeonbits.owner.Config {

    @Key("LOGIN")
    String LOGIN();

    @Key("PASSWORD")
    String PASSWORD();
}