package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: nb */
final class nb implements Parcelable {
    public static final Creator CREATOR = new na();
    public final int[] a;
    public final ArrayList b;
    public final int[] c;
    public final int[] d;
    public final int e;
    public final int f;
    public final String g;
    public final int h;
    public final int i;
    public final CharSequence j;
    public final int k;
    public final CharSequence l;
    public final ArrayList m;
    public final ArrayList n;
    public final boolean o;

    public nb(my myVar) {
        int size = myVar.d.size();
        this.a = new int[(size * 5)];
        if (myVar.k) {
            this.b = new ArrayList(size);
            this.c = new int[size];
            this.d = new int[size];
            int i = 0;
            int i2 = 0;
            while (i < size) {
                oq oqVar = (oq) myVar.d.get(i);
                int i3 = i2 + 1;
                this.a[i2] = oqVar.a;
                ArrayList arrayList = this.b;
                nf nfVar = oqVar.b;
                arrayList.add(nfVar != null ? nfVar.i : null);
                int[] iArr = this.a;
                int i4 = i3 + 1;
                iArr[i3] = oqVar.c;
                i3 = i4 + 1;
                iArr[i4] = oqVar.d;
                i4 = i3 + 1;
                iArr[i3] = oqVar.e;
                i3 = i4 + 1;
                iArr[i4] = oqVar.f;
                this.c[i] = oqVar.g.ordinal();
                this.d[i] = oqVar.h.ordinal();
                i++;
                i2 = i3;
            }
            this.e = myVar.i;
            this.f = myVar.j;
            this.g = myVar.l;
            this.h = myVar.c;
            this.i = myVar.m;
            this.j = myVar.n;
            this.k = myVar.o;
            this.l = myVar.p;
            this.m = myVar.q;
            this.n = myVar.r;
            this.o = myVar.s;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public final int describeContents() {
        return 0;
    }

    public nb(Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.createStringArrayList();
        this.c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readString();
        this.h = parcel.readInt();
        this.i = parcel.readInt();
        this.j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.k = parcel.readInt();
        this.l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.m = parcel.createStringArrayList();
        this.n = parcel.createStringArrayList();
        this.o = parcel.readInt() != 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.a);
        parcel.writeStringList(this.b);
        parcel.writeIntArray(this.c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeString(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        TextUtils.writeToParcel(this.j, parcel, 0);
        parcel.writeInt(this.k);
        TextUtils.writeToParcel(this.l, parcel, 0);
        parcel.writeStringList(this.m);
        parcel.writeStringList(this.n);
        parcel.writeInt(this.o);
    }
}
