package me.targa.playlistvplugin;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

public final class Resolver implements Parcelable {
    public String url;
    public String useragent;
    public String cookie;
    public String referrer;
    private List<Options> options;

    public Resolver(Parcel source) {
        url = source.readString();
        useragent = source.readString();
        cookie = source.readString();
        referrer = source.readString();

    }

    public Resolver() {}

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUseragent(String useragent) {
        this.useragent = useragent;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    public void setReferrer(String referrer) {
        this.referrer = referrer;
    }

    public List<Options> getOptions() {
        return options;
    }
    public void setOptions(List<Options> options) {
        this.options = options;
    }
    public String getOptionsAsString() {
        String aux = "";
        for(int i = 0, tam = options.size(); i < tam; i++){
            aux += options.get(i).getLabel()+" ("+options.get(i).getUrl()+"); ";
        }
        return aux;
    }

    @Override
    public int describeContents() {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        // TODO Auto-generated method stub
        dest.writeString(url);
        dest.writeString(useragent);
        dest.writeString(cookie);
        dest.writeString(referrer);
        dest.writeList(options);

    }
    public static final Parcelable.Creator<Resolver> CREATOR = new Parcelable.Creator<Resolver>() {
        @Override
        public Resolver createFromParcel(Parcel source) {
            // TODO Auto-generated method stub
            return new Resolver(source);
        }
        @Override
        public Resolver[] newArray(int size) {
            // TODO Auto-generated method stub
            return new Resolver[size];
        }
    };

}