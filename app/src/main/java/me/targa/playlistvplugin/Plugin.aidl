package me.targa.playlistvplugin;

import me.targa.playlistvplugin.Resolver;

interface Plugin {
    String getName();
    String getVersion();
    String getAuthor();
    String getSite();
    Resolver resolveUrl(String url);
    void onActivation();
    void onDeactivation();
}

