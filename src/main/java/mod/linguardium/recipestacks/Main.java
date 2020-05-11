package mod.linguardium.recipestacks;

import net.fabricmc.api.ModInitializer;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main implements ModInitializer {

    public static Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "recipestacks";
    public static final String MOD_NAME = "Recipe Stacks";

    @Override
    public void onInitialize() {
        log(Level.INFO, "Recipe Stacks Enabled");
    }

    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }

}