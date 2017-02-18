package tv.playlis.plugin;

import android.os.Parcel;
import android.os.Parcelable;

public class Resolver implements Parcelable {
	public String url;
	public String useragent;
	public String cookie;
	public String referrer;

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