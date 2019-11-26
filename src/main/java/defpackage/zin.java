package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: zin */
public final class zin implements Parcelable {
    public static final Creator CREATOR = new zim();
    public final int a;
    public final int b;
    public final String c;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final ayza i;
    public final boolean j;

    public zin(String str, boolean z, int i, int i2, long j, boolean z2, boolean z3, String str2, ayza ayza, boolean z4) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = j;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = str2;
        if (ayza == null) {
            ayza = ayza.EFFECT_SUBPACKAGE_ID_UNSPECIFIED;
        }
        this.i = ayza;
        this.j = z4;
    }

    public final int describeContents() {
        return 0;
    }

    protected zin(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readString();
        this.d = parcel.readLong();
        boolean z = true;
        this.e = parcel.readInt() != 0;
        this.f = parcel.readInt() != 0;
        this.g = parcel.readInt() != 0;
        this.h = parcel.readString();
        this.i = ayza.a(parcel.readInt());
        if (parcel.readInt() == 0) {
            z = false;
        }
        this.j = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeLong(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeString(this.h);
        parcel.writeInt(this.i.d);
        parcel.writeInt(this.j);
    }
}
