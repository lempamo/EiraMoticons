// Copyright (c) 2015, Christopher "blay09" Baker
// Some rights reserved.

package net.blay09.mods.eiramoticons;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class EmoticonConfig {

	public static boolean defaultEmotes;
	public static boolean twitchGlobalEmotes;
	public static boolean twitchSubscriberEmotes;
	public static String twitchSubscriberRegex;
	public static boolean bttvEmotes;
	public static boolean twitchSmileys;
	public static int twitchSmileySet;

	public static void load(File configFile) {
		Configuration config = new Configuration(configFile);

		final String CATEGORY = "emotes";
		defaultEmotes = config.getBoolean("defaultEmotes", CATEGORY, true, "Should the default EiraMoticons emoticons be registered?");
		twitchGlobalEmotes = config.getBoolean("twitchGlobalEmotes", CATEGORY, true, "Should the global Twitch emoticons be registered?");
		twitchSubscriberEmotes = config.getBoolean("twitchSubscriberEmotes", CATEGORY, true, "Should Twitch subscriber emoticons be registered?");
		twitchSubscriberRegex = config.getString("twitchSubscriberRegex", CATEGORY, "[a-z0-9][a-z0-9]+[A-Z].*", "A regex pattern to limit the Twitch subscriber emotes that are registered.");
		twitchSmileys = config.getBoolean("twitchSmileys", CATEGORY, false, "Should Twitch :) smileys be registered?");
		twitchSmileySet = config.getInt("twitchSmileySet", CATEGORY, 0, 0, 2, "The Twitch smiley style to use in chat: 0 for robot, 1 for Turbo, 2 for monkeys (NYI)");
	}

}
