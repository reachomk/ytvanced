package defpackage;

import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: nmx */
public final class nmx implements Parcelable {
    public static final Creator CREATOR = new nna();
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final List f;
    public final boolean g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final float m;
    public final int n;
    public final byte[] o;
    public final nlj p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final String v;
    public final long w;
    public MediaFormat x;
    private int y;

    public static nmx a(String str, String str2, int i, long j, int i2, int i3) {
        return nmx.a(str, str2, i, -1, j, i2, i3, null, -1, -1.0f, null, -1, null);
    }

    public final int describeContents() {
        return 0;
    }

    public static nmx a(String str, long j, int i, int i2, List list, float f) {
        return new nmx(null, str, -1, -1, j, i, i2, -1, f, -1, -1, null, Long.MAX_VALUE, list, false, -1, -1, -1, -1, -1, null, -1, null);
    }

    public static nmx a(String str, String str2, int i, int i2, long j, int i3, int i4, List list, int i5, float f, byte[] bArr, int i6, nlj nlj) {
        return new nmx(str, str2, i, i2, j, i3, i4, i5, f, -1, -1, null, Long.MAX_VALUE, list, false, -1, -1, -1, -1, -1, bArr, i6, nlj);
    }

    public static nmx a(String str, String str2, int i, int i2, long j, int i3, int i4, List list, String str3) {
        return nmx.a(str, str2, i, i2, j, i3, i4, list, str3, -1);
    }

    public static nmx a(String str, String str2, int i, int i2, long j, int i3, int i4, List list, String str3, int i5) {
        return new nmx(str, str2, i, i2, j, -1, -1, -1, -1.0f, i3, i4, str3, Long.MAX_VALUE, list, false, -1, -1, i5, -1, -1, null, -1, null);
    }

    public static nmx a(String str, String str2, int i, long j, String str3) {
        return nmx.a(str, str2, i, j, str3, Long.MAX_VALUE);
    }

    public static nmx a(String str, String str2, int i, long j, String str3, long j2) {
        return new nmx(str, str2, i, -1, j, -1, -1, -1, -1.0f, -1, -1, str3, j2, null, false, -1, -1, -1, -1, -1, null, -1, null);
    }

    public static nmx a(String str, String str2, long j) {
        return new nmx(str, str2, -1, -1, j, -1, -1, -1, -1.0f, -1, -1, null, Long.MAX_VALUE, null, false, -1, -1, -1, -1, -1, null, -1, null);
    }

    public static nmx a() {
        return nmx.a(null, "application/id3", -1);
    }

    nmx(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readLong();
        this.h = parcel.readInt();
        this.i = parcel.readInt();
        this.l = parcel.readInt();
        this.m = parcel.readFloat();
        this.q = parcel.readInt();
        this.r = parcel.readInt();
        this.v = parcel.readString();
        this.w = parcel.readLong();
        this.f = new ArrayList();
        byte[] bArr = null;
        parcel.readList(this.f, null);
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        this.g = z;
        this.j = parcel.readInt();
        this.k = parcel.readInt();
        this.s = parcel.readInt();
        this.t = parcel.readInt();
        this.u = parcel.readInt();
        if (parcel.readInt() != 0) {
            bArr = parcel.createByteArray();
        }
        this.o = bArr;
        this.n = parcel.readInt();
        this.p = (nlj) parcel.readParcelable(nlj.class.getClassLoader());
    }

    public nmx(String str, String str2, int i, int i2, long j, int i3, int i4, int i5, float f, int i6, int i7, String str3, long j2, List list, boolean z, int i8, int i9, int i10, int i11, int i12, byte[] bArr, int i13, nlj nlj) {
        this.a = str;
        this.b = nwf.a(str2);
        this.c = i;
        this.d = i2;
        this.e = j;
        this.h = i3;
        this.i = i4;
        this.l = i5;
        this.m = f;
        this.q = i6;
        this.r = i7;
        this.v = str3;
        this.w = j2;
        this.f = list == null ? Collections.emptyList() : list;
        this.g = z;
        this.j = i8;
        this.k = i9;
        this.s = i10;
        this.t = i11;
        this.u = i12;
        this.o = bArr;
        this.n = i13;
        this.p = nlj;
    }

    public final nmx a(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        return new nmx(this.a, this.b, this.c, this.d, this.e, this.h, this.i, this.l, this.m, this.q, this.r, this.v, this.w, this.f, this.g, i3, i4, this.s, this.t, this.u, this.o, this.n, this.p);
    }

    public final nmx b(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        return new nmx(this.a, this.b, this.c, this.d, this.e, this.h, this.i, this.l, this.m, this.q, this.r, this.v, this.w, this.f, this.g, this.j, this.k, this.s, i3, i4, this.o, this.n, this.p);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        int i = this.c;
        int i2 = this.d;
        int i3 = this.h;
        int i4 = this.i;
        int i5 = this.l;
        float f = this.m;
        int i6 = this.q;
        int i7 = this.r;
        String str3 = this.v;
        long j = this.e;
        boolean z = this.g;
        int i8 = this.j;
        int i9 = this.k;
        int i10 = this.s;
        int i11 = this.t;
        int i12 = this.u;
        int length = String.valueOf(str).length();
        int i13 = i12;
        StringBuilder stringBuilder = new StringBuilder(((length + 219) + String.valueOf(str2).length()) + String.valueOf(str3).length());
        stringBuilder.append("MediaFormat(");
        stringBuilder.append(str);
        String str4 = ", ";
        stringBuilder.append(str4);
        stringBuilder.append(str2);
        stringBuilder.append(str4);
        stringBuilder.append(i);
        stringBuilder.append(str4);
        stringBuilder.append(i2);
        stringBuilder.append(str4);
        stringBuilder.append(i3);
        stringBuilder.append(str4);
        stringBuilder.append(i4);
        stringBuilder.append(str4);
        stringBuilder.append(i5);
        stringBuilder.append(str4);
        stringBuilder.append(f);
        stringBuilder.append(str4);
        stringBuilder.append(i6);
        stringBuilder.append(str4);
        stringBuilder.append(i7);
        stringBuilder.append(str4);
        stringBuilder.append(str3);
        stringBuilder.append(str4);
        stringBuilder.append(j);
        stringBuilder.append(str4);
        stringBuilder.append(z);
        stringBuilder.append(str4);
        stringBuilder.append(i8);
        stringBuilder.append(str4);
        stringBuilder.append(i9);
        stringBuilder.append(str4);
        stringBuilder.append(i10);
        stringBuilder.append(str4);
        stringBuilder.append(i11);
        stringBuilder.append(str4);
        stringBuilder.append(i13);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final int hashCode() {
        int i = this.y;
        if (i != 0) {
            return i;
        }
        String str = this.a;
        i = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.b;
        i = (((((((((((((((((((((((((((((((i + (str2 != null ? str2.hashCode() : 0)) * 31) + this.c) * 31) + this.d) * 31) + this.h) * 31) + this.i) * 31) + this.l) * 31) + Float.floatToRawIntBits(this.m)) * 31) + ((int) this.e)) * 31) + (!this.g ? 1237 : 1231)) * 31) + this.j) * 31) + this.k) * 31) + this.q) * 31) + this.r) * 31) + this.s) * 31) + this.t) * 31) + this.u) * 31;
        str2 = this.v;
        i = ((i + (str2 != null ? str2.hashCode() : 0)) * 31) + ((int) this.w);
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            i = (i * 31) + Arrays.hashCode((byte[]) this.f.get(i2));
        }
        i = (((i * 31) + Arrays.hashCode(this.o)) * 31) + this.n;
        this.y = i;
        return i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            nmx nmx = (nmx) obj;
            if (this.g == nmx.g && this.c == nmx.c && this.d == nmx.d && this.e == nmx.e && this.h == nmx.h && this.i == nmx.i && this.l == nmx.l && this.m == nmx.m && this.j == nmx.j && this.k == nmx.k && this.q == nmx.q && this.r == nmx.r && this.s == nmx.s && this.t == nmx.t && this.u == nmx.u && this.w == nmx.w && nxf.a(this.a, nmx.a) && nxf.a(this.v, nmx.v) && nxf.a(this.b, nmx.b) && this.f.size() == nmx.f.size() && nxf.a(this.p, nmx.p) && Arrays.equals(this.o, nmx.o) && this.n == nmx.n) {
                for (int i = 0; i < this.f.size(); i++) {
                    if (!Arrays.equals((byte[]) this.f.get(i), (byte[]) nmx.f.get(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static final void a(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeLong(this.e);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.l);
        parcel.writeFloat(this.m);
        parcel.writeInt(this.q);
        parcel.writeInt(this.r);
        parcel.writeString(this.v);
        parcel.writeLong(this.w);
        parcel.writeList(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.s);
        parcel.writeInt(this.t);
        parcel.writeInt(this.u);
        parcel.writeInt(this.o != null ? 1 : 0);
        byte[] bArr = this.o;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.n);
        parcel.writeParcelable(this.p, i);
    }
}
