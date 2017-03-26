package tv.playlis.plugin;

import me.targa.playlistvplugin.Options;
import me.targa.playlistvplugin.Plugin;
import me.targa.playlistvplugin.Resolver;

import android.app.Service;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.IBinder;
import android.os.RemoteException;

import java.util.ArrayList;
import java.util.List;


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

            @Override
            public Bitmap getLogo() throws RemoteException {
                return BitmapFactory.decodeResource(getResources(), R.drawable.ic_action_puzzle);
            }

            @Override
            public boolean hasPreferences() throws RemoteException {
                return true;
            }

            @Override
            public Resolver run(String url) throws RemoteException {
                Resolver data = new Resolver();

                data.addOption(new Options("480p", "http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4"));
                data.addOption(new Options("640p", "http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4"));
                data.addOption(new Options("720p", "http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4"));
                data.addOption(new Options("1080p", "http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4"));

                return data;
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
