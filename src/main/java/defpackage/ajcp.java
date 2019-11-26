package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: ajcp */
public final class ajcp implements Parcelable {
    public static final Creator CREATOR = new ajco();
    public final aiqq a;
    public final aiqg b;
    public final ajpz c;
    public final aizx d;
    public final ahgc e;

    public ajcp(aiqq aiqq, aiqg aiqg, aizx aizx, ajpz ajpz, ahgc ahgc) {
        this.a = aiqq;
        this.b = aiqg;
        this.c = ajpz;
        this.d = aizx;
        this.e = ahgc;
    }

    public final int describeContents() {
        return 0;
    }

    public ajcp(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        this.a = (aiqq) parcel.readParcelable(classLoader);
        this.b = (aiqg) parcel.readParcelable(classLoader);
        this.c = (ajpz) parcel.readParcelable(classLoader);
        this.d = (aizx) parcel.readParcelable(classLoader);
        this.e = (ahgc) parcel.readParcelable(classLoader);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 0);
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.c, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.e, 0);
    }
}
