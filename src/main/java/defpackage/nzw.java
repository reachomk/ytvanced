package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: nzw */
public final class nzw implements Parcelable {
    public static final Creator CREATOR = new nzv();
    public final String A;
    public final int B;
    private int C;
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final String f;
    public final olj g;
    public final String h;
    public final String i;
    public final int j;
    public final List k;
    public final odq l;
    public final long m;
    public final int n;
    public final int o;
    public final float p;
    public final int q;
    public final float r;
    public final int s;
    public final byte[] t;
    public final ozt u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    public static nzw a(String str, String str2, String str3, int i, int i2, List list, float f) {
        return nzw.a(str, str2, str3, -1, i, i2, list, -1, f, null, -1, null, null);
    }

    public final int describeContents() {
        return 0;
    }

    public static nzw a(String str, String str2, String str3, int i, int i2, int i3, List list, int i4, float f, byte[] bArr, int i5, ozt ozt, odq odq) {
        return new nzw(str, null, 0, 0, -1, str3, null, null, str2, i, list, odq, Long.MAX_VALUE, i2, i3, -1.0f, i4, f, bArr, i5, ozt, -1, -1, -1, -1, -1, null, -1);
    }

    public static nzw a(String str, String str2, int i, int i2, int i3, int i4, List list, odq odq, String str3) {
        return nzw.a(str, str2, i, i2, i3, i4, -1, list, odq, 0, str3);
    }

    public static nzw a(String str, String str2, int i, int i2, int i3, int i4, int i5, List list, odq odq, int i6, String str3) {
        return nzw.a(str, str2, i, i2, i3, i4, i5, -1, -1, list, odq, i6, str3, null);
    }

    public static nzw a(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7, List list, odq odq, int i8, String str3, olj olj) {
        return new nzw(str, null, i8, 0, i, null, olj, null, str2, i2, list, odq, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i3, i4, i5, i6, i7, str3, -1);
    }

    public static nzw a(String str, String str2, int i, String str3, odq odq) {
        return nzw.a(str, str2, i, str3, -1, odq, Long.MAX_VALUE, Collections.emptyList());
    }

    public static nzw a(String str, String str2, int i, String str3, int i2, odq odq, long j, List list) {
        return new nzw(str, null, i, 0, -1, null, null, null, str2, -1, list, odq, j, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, str3, i2);
    }

    public static nzw a(String str, String str2, int i, List list, String str3, odq odq) {
        return new nzw(str, null, i, 0, -1, null, null, null, str2, -1, list, odq, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, str3, -1);
    }

    public static nzw a(String str, String str2, long j) {
        return new nzw(str, null, 0, 0, -1, null, null, null, str2, -1, null, null, j, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, null, -1);
    }

    public static nzw a(String str, String str2) {
        return new nzw(str, null, 0, 0, -1, null, null, null, str2, -1, null, null, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, null, -1);
    }

    public nzw(String str, String str2, int i, int i2, int i3, String str3, olj olj, String str4, String str5, int i4, List list, odq odq, long j, int i5, int i6, float f, int i7, float f2, byte[] bArr, int i8, ozt ozt, int i9, int i10, int i11, int i12, int i13, String str6, int i14) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = str3;
        this.g = olj;
        this.h = str4;
        this.i = str5;
        this.j = i4;
        this.k = list == null ? Collections.emptyList() : list;
        this.l = odq;
        this.m = j;
        this.n = i5;
        this.o = i6;
        this.p = f;
        int i15 = i7;
        if (i15 == -1) {
            i15 = 0;
        }
        this.q = i15;
        this.r = f2 == -1.0f ? 1.0f : f2;
        this.t = bArr;
        this.s = i8;
        this.u = ozt;
        this.v = i9;
        this.w = i10;
        this.x = i11;
        i15 = i12;
        if (i15 == -1) {
            i15 = 0;
        }
        this.y = i15;
        i15 = i13;
        if (i15 == -1) {
            i15 = 0;
        }
        this.z = i15;
        this.A = ozp.b(str6);
        this.B = i14;
    }

    nzw(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = (olj) parcel.readParcelable(olj.class.getClassLoader());
        this.h = parcel.readString();
        this.i = parcel.readString();
        this.j = parcel.readInt();
        int readInt = parcel.readInt();
        this.k = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.k.add(parcel.createByteArray());
        }
        this.l = (odq) parcel.readParcelable(odq.class.getClassLoader());
        this.m = parcel.readLong();
        this.n = parcel.readInt();
        this.o = parcel.readInt();
        this.p = parcel.readFloat();
        this.q = parcel.readInt();
        this.r = parcel.readFloat();
        this.t = ozp.a(parcel) ? parcel.createByteArray() : null;
        this.s = parcel.readInt();
        this.u = (ozt) parcel.readParcelable(ozt.class.getClassLoader());
        this.v = parcel.readInt();
        this.w = parcel.readInt();
        this.x = parcel.readInt();
        this.y = parcel.readInt();
        this.z = parcel.readInt();
        this.A = parcel.readString();
        this.B = parcel.readInt();
    }

    public final nzw a(long j) {
        return new nzw(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, j, this.n, this.o, this.p, this.q, this.r, this.t, this.s, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B);
    }

    public final nzw a(int i, int i2) {
        return new nzw(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.t, this.s, this.u, this.v, this.w, this.x, i, i2, this.A, this.B);
    }

    public final nzw a(float f) {
        return new nzw(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, f, this.q, this.r, this.t, this.s, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B);
    }

    public final nzw a(olj olj) {
        return new nzw(this.a, this.b, this.c, this.d, this.e, this.f, olj, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.t, this.s, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B);
    }

    public final int a() {
        int i = this.n;
        if (i != -1) {
            int i2 = this.o;
            if (i2 != -1) {
                return i * i2;
            }
        }
        return -1;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.h;
        String str4 = this.i;
        String str5 = this.f;
        int i = this.e;
        String str6 = this.A;
        int i2 = this.n;
        int i3 = this.o;
        float f = this.p;
        int i4 = this.v;
        int i5 = this.w;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        int length4 = String.valueOf(str4).length();
        StringBuilder stringBuilder = new StringBuilder((((((length + 104) + length2) + length3) + length4) + String.valueOf(str5).length()) + String.valueOf(str6).length());
        stringBuilder.append("Format(");
        stringBuilder.append(str);
        str = ", ";
        stringBuilder.append(str);
        stringBuilder.append(str2);
        stringBuilder.append(str);
        stringBuilder.append(str3);
        stringBuilder.append(str);
        stringBuilder.append(str4);
        stringBuilder.append(str);
        stringBuilder.append(str5);
        stringBuilder.append(str);
        stringBuilder.append(i);
        stringBuilder.append(str);
        stringBuilder.append(str6);
        stringBuilder.append(", [");
        stringBuilder.append(i2);
        stringBuilder.append(str);
        stringBuilder.append(i3);
        stringBuilder.append(str);
        stringBuilder.append(f);
        stringBuilder.append("], [");
        stringBuilder.append(i4);
        stringBuilder.append(str);
        stringBuilder.append(i5);
        stringBuilder.append("])");
        return stringBuilder.toString();
    }

    public final int hashCode() {
        int i = this.C;
        if (i != 0) {
            return i;
        }
        String str = this.a;
        int i2 = 0;
        i = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.b;
        i = (((((((i + (str2 != null ? str2.hashCode() : 0)) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31;
        str2 = this.f;
        i = (i + (str2 != null ? str2.hashCode() : 0)) * 31;
        olj olj = this.g;
        i = (i + (olj != null ? olj.hashCode() : 0)) * 31;
        str2 = this.h;
        i = (i + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.i;
        i = (((((((((((((((((((((((((((i + (str2 != null ? str2.hashCode() : 0)) * 31) + this.j) * 31) + ((int) this.m)) * 31) + this.n) * 31) + this.o) * 31) + Float.floatToIntBits(this.p)) * 31) + this.q) * 31) + Float.floatToIntBits(this.r)) * 31) + this.s) * 31) + this.v) * 31) + this.w) * 31) + this.x) * 31) + this.y) * 31) + this.z) * 31;
        str2 = this.A;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        i = ((i + i2) * 31) + this.B;
        this.C = i;
        return i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            nzw nzw = (nzw) obj;
            int i = this.C;
            if (i != 0) {
                int i2 = nzw.C;
                if (!(i2 == 0 || i == i2)) {
                    return false;
                }
            }
            return this.c == nzw.c && this.d == nzw.d && this.e == nzw.e && this.j == nzw.j && this.m == nzw.m && this.n == nzw.n && this.o == nzw.o && this.q == nzw.q && this.s == nzw.s && this.v == nzw.v && this.w == nzw.w && this.x == nzw.x && this.y == nzw.y && this.z == nzw.z && this.B == nzw.B && Float.compare(this.p, nzw.p) == 0 && Float.compare(this.r, nzw.r) == 0 && ozp.a(this.a, nzw.a) && ozp.a(this.b, nzw.b) && ozp.a(this.f, nzw.f) && ozp.a(this.h, nzw.h) && ozp.a(this.i, nzw.i) && ozp.a(this.A, nzw.A) && Arrays.equals(this.t, nzw.t) && ozp.a(this.g, nzw.g) && ozp.a(this.u, nzw.u) && ozp.a(this.l, nzw.l) && a(nzw);
        }
    }

    public final boolean a(nzw nzw) {
        if (this.k.size() != nzw.k.size()) {
            return false;
        }
        for (int i = 0; i < this.k.size(); i++) {
            if (!Arrays.equals((byte[]) this.k.get(i), (byte[]) nzw.k.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        boolean z = false;
        parcel.writeParcelable(this.g, 0);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeInt(this.j);
        int size = this.k.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray((byte[]) this.k.get(i2));
        }
        parcel.writeParcelable(this.l, 0);
        parcel.writeLong(this.m);
        parcel.writeInt(this.n);
        parcel.writeInt(this.o);
        parcel.writeFloat(this.p);
        parcel.writeInt(this.q);
        parcel.writeFloat(this.r);
        if (this.t != null) {
            z = true;
        }
        ozp.a(parcel, z);
        byte[] bArr = this.t;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.s);
        parcel.writeParcelable(this.u, i);
        parcel.writeInt(this.v);
        parcel.writeInt(this.w);
        parcel.writeInt(this.x);
        parcel.writeInt(this.y);
        parcel.writeInt(this.z);
        parcel.writeString(this.A);
        parcel.writeInt(this.B);
    }
}
