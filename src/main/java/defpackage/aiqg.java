package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: aiqg */
public final class aiqg implements Parcelable {
    public static final Creator CREATOR = new aiqj();
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final aiqy i;
    public final int j;
    @Deprecated
    private final boolean k;

    public aiqg(Parcel parcel) {
        int i;
        boolean z = false;
        this.a = parcel.readInt() == 1;
        this.b = parcel.readInt() == 1;
        this.c = parcel.readInt() == 1;
        this.d = parcel.readInt() == 1;
        this.k = parcel.readInt() == 1;
        this.f = parcel.readInt() == 1;
        this.g = parcel.readInt() == 1;
        this.h = parcel.readInt() == 1;
        int readInt = parcel.readInt();
        aiqy a = (readInt < 0 || (readInt >> 3) > 0) ? aiqy.a() : new aiqy(readInt);
        this.i = a;
        readInt = parcel.readInt();
        int[] iArr = new int[]{1, 2};
        for (int i2 = 0; i2 < 2; i2++) {
            i = iArr[i2];
            if (airj.a(i) == readInt) {
                break;
            }
        }
        i = 1;
        this.j = i;
        if (parcel.readInt() == 1) {
            z = true;
        }
        this.e = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.k);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i.a);
        parcel.writeInt(airj.a(this.j));
        parcel.writeInt(this.e);
    }

    public aiqg(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, aiqy aiqy, int i) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.k = z5;
        this.e = z6;
        this.f = z7;
        this.g = z8;
        this.h = z9;
        this.i = aiqy;
        this.j = i;
    }
}
