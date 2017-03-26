package me.targa.playlistvplugin;

import  me.targa.playlistvplugin.Resolver;
import  me.targa.playlistvplugin.Options;

interface Plugin {
    String getName();
    String getVersion();
    String getAuthor();
    String getSite();
    Bitmap getLogo();
    boolean hasPreferences();
    Resolver run(String url);
    void onActivation();
    void onDeactivation();
}
