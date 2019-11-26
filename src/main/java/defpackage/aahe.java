package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: aahe */
public final class aahe implements afnt, Parcelable {
    public static final Creator CREATOR = new aahh();
    public static final aahj i = new aahj();
    public final String a;
    public final Uri b;
    public final String c;
    public final boolean d;
    public final float e;
    public final int f;
    public final Uri g;
    public final String h;

    public aahe(String str, String str2, Uri uri, String str3, boolean z, float f, Uri uri2, int i) {
        this.a = str;
        this.h = str2;
        this.b = uri;
        this.c = str3;
        this.d = z;
        this.e = f;
        this.g = uri2;
        this.f = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj != null && getClass().equals(obj.getClass())) {
            aahe aahe = (aahe) obj;
            if (amqq.a(this.a, aahe.a) && amqq.a(this.h, aahe.h) && amqq.a(this.b, aahe.b) && amqq.a(this.c, aahe.c) && amqq.a(Float.valueOf(this.e), Float.valueOf(aahe.e)) && amqq.a(this.g, aahe.g) && amqq.a(Integer.valueOf(this.f), Integer.valueOf(aahe.f))) {
                return true;
            }
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.h);
        parcel.writeParcelable(this.b, 0);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeFloat(this.e);
        parcel.writeParcelable(this.g, 0);
        parcel.writeInt(this.f);
    }

    public final /* synthetic */ afns c() {
        return new aahj(this);
    }
}
