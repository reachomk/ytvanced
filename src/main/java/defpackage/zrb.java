package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;
import java.util.Arrays;

/* renamed from: zrb */
public final class zrb implements Parcelable, Serializable {
    public static final Creator CREATOR = new zre();
    public final String a;
    public final String b;

    zrb() {
        this.a = null;
        this.b = null;
    }

    public final int describeContents() {
        return 0;
    }

    public zrb(String str, String str2) {
        this.a = (String) amqw.a((Object) str);
        this.b = (String) amqw.a((Object) str2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zrb zrb = (zrb) obj;
            return amqq.a(this.a, zrb.a) && amqq.a(this.b, zrb.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 31) + String.valueOf(str2).length());
        stringBuilder.append("Place{placeId='");
        stringBuilder.append(str);
        stringBuilder.append("', placeName='");
        stringBuilder.append(str2);
        stringBuilder.append("'}");
        return stringBuilder.toString();
    }

    /* synthetic */ zrb(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
    }
}
