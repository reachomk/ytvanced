package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: aizs */
public final class aizs implements aizx {
    public static final Creator CREATOR = new aizv();
    public final aakj a;
    public final aafv b;
    public final aizu c;
    public final aiqq d;
    public final aiqq e;
    public final boolean f;

    public aizs(aakj aakj, aafv aafv, aiqq aiqq, aiqq aiqq2, boolean z, aizu aizu) {
        this.a = aakj;
        this.b = aafv;
        this.d = aiqq;
        this.e = aiqq2;
        this.f = z;
        this.c = aizu;
    }

    public final int describeContents() {
        return 0;
    }

    public aizs(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        this.a = (aakj) parcel.readParcelable(classLoader);
        this.b = (aafv) parcel.readParcelable(classLoader);
        this.d = (aiqq) parcel.readParcelable(classLoader);
        this.e = (aiqq) parcel.readParcelable(classLoader);
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        this.f = z;
        this.c = (aizu) parcel.readParcelable(classLoader);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 0);
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.e, 0);
        parcel.writeInt(this.f);
        parcel.writeParcelable(this.c, 0);
    }
}
