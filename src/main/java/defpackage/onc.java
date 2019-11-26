package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: onc */
public final class onc extends ona {
    public static final Creator CREATOR = new onf();
    private final long a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final long f;
    private final long g;
    private final List h;
    private final boolean i;
    private final long j;
    private final int k;
    private final int l;
    private final int m;

    private onc(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List list, boolean z5, long j4, int i, int i2, int i3) {
        this.a = j;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = j2;
        this.g = j3;
        this.h = Collections.unmodifiableList(list);
        this.i = z5;
        this.j = j4;
        this.k = i;
        this.l = i2;
        this.m = i3;
    }

    static onc a(oza oza, long j, ozo ozo) {
        List list;
        boolean z;
        boolean z2;
        long j2;
        boolean z3;
        long j3;
        int i;
        int i2;
        int i3;
        boolean z4;
        ozo ozo2 = ozo;
        long i4 = oza.i();
        boolean z5 = (oza.d() & 128) != 0;
        List emptyList = Collections.emptyList();
        if (z5) {
            list = emptyList;
            z = false;
            z2 = false;
            j2 = -9223372036854775807L;
            z3 = false;
            j3 = -9223372036854775807L;
            i = 0;
            i2 = 0;
            i3 = 0;
            z4 = false;
        } else {
            ArrayList arrayList;
            int d;
            long a;
            boolean z6;
            int d2 = oza.d();
            boolean z7 = (d2 & 128) != 0;
            boolean z8 = (d2 & 64) != 0;
            int i5 = d2 & 32;
            boolean z9 = (d2 & 16) != 0;
            long a2 = (z8 && !z9) ? onn.a(oza, j) : -9223372036854775807L;
            if (z8) {
                arrayList = emptyList;
            } else {
                d = oza.d();
                arrayList = new ArrayList(d);
                for (int i6 = 0; i6 < d; i6++) {
                    i3 = oza.d();
                    a = !z9 ? onn.a(oza, j) : -9223372036854775807L;
                    arrayList.add(new one(i3, a, ozo2.b(a), (byte) 0));
                }
            }
            if (i5 != 0) {
                long d3 = (long) oza.d();
                z6 = (128 & d3) != 0;
                a = ((((d3 & 1) << 32) | oza.i()) * 1000) / 90;
            } else {
                a = -9223372036854775807L;
                z6 = false;
            }
            d = oza.e();
            i2 = oza.d();
            i3 = oza.d();
            z = z7;
            z4 = z8;
            list = arrayList;
            boolean z10 = z6;
            i = d;
            long j4 = a;
            z2 = z9;
            j2 = a2;
            z3 = z10;
            j3 = j4;
        }
        return new onc(i4, z5, z, z4, z2, j2, ozo2.b(j2), list, z3, j3, i, i2, i3);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeByte(this.b);
        parcel.writeByte(this.c);
        parcel.writeByte(this.d);
        parcel.writeByte(this.e);
        parcel.writeLong(this.f);
        parcel.writeLong(this.g);
        i = this.h.size();
        parcel.writeInt(i);
        for (int i2 = 0; i2 < i; i2++) {
            one one = (one) this.h.get(i2);
            parcel.writeInt(one.a);
            parcel.writeLong(one.b);
            parcel.writeLong(one.c);
        }
        parcel.writeByte(this.i);
        parcel.writeLong(this.j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
    }

    /* synthetic */ onc(Parcel parcel) {
        this.a = parcel.readLong();
        boolean z = false;
        this.b = parcel.readByte() == (byte) 1;
        this.c = parcel.readByte() == (byte) 1;
        this.d = parcel.readByte() == (byte) 1;
        this.e = parcel.readByte() == (byte) 1;
        this.f = parcel.readLong();
        this.g = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(new one(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.h = Collections.unmodifiableList(arrayList);
        if (parcel.readByte() == (byte) 1) {
            z = true;
        }
        this.i = z;
        this.j = parcel.readLong();
        this.k = parcel.readInt();
        this.l = parcel.readInt();
        this.m = parcel.readInt();
    }
}
