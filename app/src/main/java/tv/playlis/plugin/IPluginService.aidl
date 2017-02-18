package tv.playlis.plugin;

import tv.playlis.plugin.Resolver; // needed here

/* User data remote service, provides all available info about an individual given its id number */
interface IPluginService{
    String getName();
    String getVersion();
    String getAuthor();
    String getSite();
    Resolver resolveUrl(String url);
}
