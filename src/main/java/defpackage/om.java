package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: om */
final class om implements Parcelable {
    public static final Creator CREATOR = new op();
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final int e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final Bundle j;
    public final boolean k;
    public final int l;
    public Bundle m;
    public nf n;

    om(nf nfVar) {
        this.a = nfVar.getClass().getName();
        this.b = nfVar.i;
        this.c = nfVar.q;
        this.d = nfVar.z;
        this.e = nfVar.A;
        this.f = nfVar.B;
        this.g = nfVar.E;
        this.h = nfVar.p;
        this.i = nfVar.D;
        this.j = nfVar.j;
        this.k = nfVar.C;
        this.l = nfVar.U.ordinal();
    }

    public final int describeContents() {
        return 0;
    }

    om(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        boolean z = true;
        this.c = parcel.readInt() != 0;
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readInt() != 0;
        this.h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.j = parcel.readBundle();
        if (parcel.readInt() == 0) {
            z = false;
        }
        this.k = z;
        this.m = parcel.readBundle();
        this.l = parcel.readInt();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("FragmentState{");
        stringBuilder.append(this.a);
        stringBuilder.append(" (");
        stringBuilder.append(this.b);
        stringBuilder.append(")}:");
        if (this.c) {
            stringBuilder.append(" fromLayout");
        }
        if (this.e != 0) {
            stringBuilder.append(" id=0x");
            stringBuilder.append(Integer.toHexString(this.e));
        }
        String str = this.f;
        if (!(str == null || str.isEmpty())) {
            stringBuilder.append(" tag=");
            stringBuilder.append(this.f);
        }
        if (this.g) {
            stringBuilder.append(" retainInstance");
        }
        if (this.h) {
            stringBuilder.append(" removing");
        }
        if (this.i) {
            stringBuilder.append(" detached");
        }
        if (this.k) {
            stringBuilder.append(" hidden");
        }
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        parcel.writeBundle(this.j);
        parcel.writeInt(this.k);
        parcel.writeBundle(this.m);
        parcel.writeInt(this.l);
    }
}
