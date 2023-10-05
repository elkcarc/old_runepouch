package com.OldRunepouch;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class OldRunepouchTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(OldRunepouchPlugin.class);
		RuneLite.main(args);
	}
}