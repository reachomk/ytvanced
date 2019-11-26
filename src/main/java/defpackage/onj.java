package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: onj */
public final class onj extends ona {
    public static final Creator CREATOR = new oni();
    private final List a;

    private onj(List list) {
        this.a = Collections.unmodifiableList(list);
    }

    static onj a(oza oza) {
        int d = oza.d();
        List arrayList = new ArrayList(d);
        int i = 0;
        while (i < d) {
            int i2;
            List list;
            boolean z;
            long j;
            boolean z2;
            long j2;
            int i3;
            int i4;
            int i5;
            boolean z3;
            long i6 = oza.i();
            boolean z4 = (oza.d() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (z4) {
                i2 = d;
                list = arrayList2;
                z = false;
                j = -9223372036854775807L;
                z2 = false;
                j2 = -9223372036854775807L;
                i3 = 0;
                i4 = 0;
                i5 = 0;
                z3 = false;
            } else {
                boolean z5;
                boolean z6;
                long i7;
                int d2 = oza.d();
                boolean z7 = (d2 & 128) != 0;
                z2 = (d2 & 64) != 0;
                d2 &= 32;
                j2 = z2 ? oza.i() : -9223372036854775807L;
                if (z2) {
                    i2 = d;
                    z3 = z7;
                    z5 = z2;
                } else {
                    int d3 = oza.d();
                    ArrayList arrayList3 = new ArrayList(d3);
                    int i8 = 0;
                    while (i8 < d3) {
                        z3 = z7;
                        z5 = z2;
                        i2 = d;
                        arrayList3.add(new onl(oza.d(), oza.i(), (byte) 0));
                        i8++;
                        z7 = z3;
                        z2 = z5;
                        d = i2;
                    }
                    i2 = d;
                    z3 = z7;
                    z5 = z2;
                    arrayList2 = arrayList3;
                }
                if (d2 != 0) {
                    long d4 = (long) oza.d();
                    z6 = (128 & d4) != 0;
                    i7 = ((((d4 & 1) << 32) | oza.i()) * 1000) / 90;
                } else {
                    z6 = false;
                    i7 = -9223372036854775807L;
                }
                list = arrayList2;
                j = j2;
                z2 = z6;
                j2 = i7;
                i3 = oza.e();
                i4 = oza.d();
                i5 = oza.d();
                z = z5;
            }
            arrayList.add(new onk(i6, z4, z3, z, list, j, z2, j2, i3, i4, i5));
            i++;
            d = i2;
        }
        return new onj(arrayList);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = this.a.size();
        parcel.writeInt(i);
        for (int i2 = 0; i2 < i; i2++) {
            onk onk = (onk) this.a.get(i2);
            parcel.writeLong(onk.a);
            parcel.writeByte(onk.b);
            parcel.writeByte(onk.c);
            parcel.writeByte(onk.d);
            int size = onk.f.size();
            parcel.writeInt(size);
            for (int i3 = 0; i3 < size; i3++) {
                onl onl = (onl) onk.f.get(i3);
                parcel.writeInt(onl.a);
                parcel.writeLong(onl.b);
            }
            parcel.writeLong(onk.e);
            parcel.writeByte(onk.g);
            parcel.writeLong(onk.h);
            parcel.writeInt(onk.i);
            parcel.writeInt(onk.j);
            parcel.writeInt(onk.k);
        }
    }
}
