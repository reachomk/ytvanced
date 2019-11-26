package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: zix */
public abstract class zix implements Parcelable {
    public static final Creator CREATOR = new zja();

    public abstract long a();

    public abstract Uri b();

    public abstract String c();

    public abstract String d();

    public final int describeContents() {
        return 0;
    }

    public abstract long e();

    public abstract long f();

    public abstract long g();

    public abstract int h();

    public static ziz i() {
        ziv ziv = new ziv();
        ziv.a(Long.MIN_VALUE);
        return ziv;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(a());
        parcel.writeParcelable(b(), 0);
        parcel.writeString(c());
        parcel.writeString(d());
        parcel.writeLong(e());
        parcel.writeLong(f());
        parcel.writeLong(g());
        parcel.writeInt(h());
    }
}
