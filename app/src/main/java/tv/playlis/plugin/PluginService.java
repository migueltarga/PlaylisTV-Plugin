package tv.playlis.plugin;

import me.targa.playlistvplugin.Plugin;
import me.targa.playlistvplugin.Resolver;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;


public class PluginService extends Service {
    @Override
    public IBinder onBind(Intent arg0) {

        return new Plugin.Stub() {
            @Override
            public String getName() throws RemoteException {
                return getString(R.string.plugin_name);
            }

            @Override
            public String getVersion() throws RemoteException {
                return getString(R.string.plugin_version);
            }

            @Override
            public String getAuthor() throws RemoteException {
                return getString(R.string.plugin_author);
            }

            @Override
            public String getSite() throws RemoteException {
                return getString(R.string.plugin_site);
            }

            public Resolver resolveUrl(String url) throws RemoteException {

                // TEST
                Resolver test = new Resolver();
                test.setUrl(url);

                return test;
            }

            @Override
            public void onActivation() throws RemoteException {

            }

            @Override
            public void onDeactivation() throws RemoteException {

            }
        };
    }
}
