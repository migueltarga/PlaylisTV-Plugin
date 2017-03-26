package me.targa.playlistvplugin;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class Resolver implements Parcelable {
    private List<Options> options;

    public Resolver(Parcel source) {
        this.options = new ArrayList<Options>();
        source.readList(this.options, Options.class.getClassLoader());
    }

    public Resolver() {}

    public void addOption(Options option){
        if(options == null){
            options = new ArrayList<>();
        }
        options.add(option);
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