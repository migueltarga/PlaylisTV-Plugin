package me.targa.playlistvplugin;

import android.os.Parcel;
import android.os.Parcelable;


public final class Options implements Parcelable {

    private String label;
    private String url;

    public Options(String label, String url){
        this.label = label;
        this.url = url;
    }

    public Options(Parcel parcel){
        this.label = parcel.readString();
        this.url = parcel.readString();
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
