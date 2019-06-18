package com.atherys.script;

import com.atherys.core.utils.PluginConfig;
import ninja.leaping.configurate.objectmapping.Setting;

import java.io.IOException;

public class ScriptConfig extends PluginConfig {

    public static final String JAVASCRIPT_TYPE = "javascript";
    public static final String GROOVY_TYPE = "groovy";

    @Setting("script-type")
    public String SCRIPT_TYPE = JAVASCRIPT_TYPE;

    @Setting("script-directory")
    public String SCRIPT_DIRECTORY = "scripts";

    protected ScriptConfig(String directory, String filename) throws IOException {
        super(directory, filename);
    }
}
