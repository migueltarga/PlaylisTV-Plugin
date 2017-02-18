package tv.playlis.plugin;

import tv.playlis.plugin.IPluginService;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;


public class PluginService extends Service {
    @Override
    public IBinder onBind(Intent arg0) {

        return new IPluginService.Stub() {
            @Override
            public String getName() throws RemoteException {
                return "GDrive Resolver";
            }

            @Override
            public String getVersion() throws RemoteException {
                return "1.0";
            }

            @Override
            public String getAuthor() throws RemoteException {
                return "Miguel Targa";
            }

            @Override
            public String getSite() throws RemoteException {
                return "http://targa.me";
            }

            public Resolver resolveUrl(String url) throws RemoteException {

                // TEST
                Resolver test = new Resolver();
                test.setUrl(url);

                return test;
            }
        };
    }
}
