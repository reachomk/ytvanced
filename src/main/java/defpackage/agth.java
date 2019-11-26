package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

/* renamed from: agth */
public final class agth implements Parcelable {
    public static final Creator CREATOR = new agtk();
    public final String a;

    public agth(String str) {
        this.a = str;
    }

    public final int describeContents() {
        return 0;
    }

    public agth(Parcel parcel) {
        this.a = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof agth)) {
            return false;
        }
        return TextUtils.equals(this.a, ((agth) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        return (str != null ? str.hashCode() : 0) + 527;
    }

    public final String toString() {
        String str = this.a;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 46);
        stringBuilder.append("OfflinePlaybackTrackingReporterState{videoId=");
        stringBuilder.append(str);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
