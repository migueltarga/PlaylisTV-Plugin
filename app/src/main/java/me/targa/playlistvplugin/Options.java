package me.targa.playlistvplugin;

import android.os.Parcel;
import android.os.Parcelable;


public final class Options implements Parcelable {

    private String label;
    private String url;
    public String useragent;
    public String cookie;
    public String referrer;
    public String subtitleUrl;
    public String iconUrl;

    public Options(String label, String url){
        this.label = label;
        this.url = url;
    }

    public Options(String label, String url, String useragent, String cookie, String referrer, String subtitleUrl, String iconUrl) {
        this.label = label;
        this.url = url;
        this.useragent = useragent;
        this.cookie = cookie;
        this.referrer = referrer;
        this.subtitleUrl = subtitleUrl;
        this.iconUrl = iconUrl;
    }

    public Options(Parcel parcel){
        this.label = parcel.readString();
        this.url = parcel.readString();
        this.useragent = parcel.readString();
        this.cookie = parcel.readString();
        this.referrer = parcel.readString();
        this.subtitleUrl = parcel.readString();
        this.iconUrl = parcel.readString();
    }

    public String getUseragent() {
        return useragent;
    }

    public void setUseragent(String useragent) {
        this.useragent = useragent;
    }

    public String getCookie() {
        return cookie;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    public String getReferrer() {
        return referrer;
    }

    public void setReferrer(String referrer) {
        this.referrer = referrer;
    }

    public String getSubtitleUrl() {
        return subtitleUrl;
    }

    public void setSubtitleUrl(String subtitleUrl) {
        this.subtitleUrl = subtitleUrl;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public static Creator<Options> getCREATOR() {
        return CREATOR;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }


    @Override
    public int describeContents() {
        // TODO Auto-generated method stub
        return 0;
    }


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(label);
        dest.writeString(url);
        dest.writeString(useragent);
        dest.writeString(cookie);
        dest.writeString(referrer);
        dest.writeString(subtitleUrl);
        dest.writeString(iconUrl);
    }


    public static final Parcelable.Creator<Options> CREATOR = new Parcelable.Creator<Options>(){

        @Override
        public Options createFromParcel(Parcel source) {
            // TODO Auto-generated method stub
            return new Options(source);
        }

        @Override
        public Options[] newArray(int size) {
            // TODO Auto-generated method stub
            return new Options[size];
        }
    };
}
