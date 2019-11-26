package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: rvw */
public final class rvw extends qou {
    public static final Creator CREATOR = new rxk();
    private static final byte[][] a = new byte[0][];
    private final String b;
    private final byte[] c;
    private final byte[][] d;
    private final byte[][] e;
    private final byte[][] f;
    private final byte[][] g;
    private final int[] h;
    private final byte[][] i;
    private final int[] j;

    public rvw(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6, int[] iArr2) {
        this.b = str;
        this.c = bArr;
        this.d = bArr2;
        this.e = bArr3;
        this.f = bArr4;
        this.g = bArr5;
        this.h = iArr;
        this.i = bArr6;
        this.j = iArr2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ExperimentTokens");
        stringBuilder.append("(");
        String str = this.b;
        String str2 = "null";
        String str3 = "'";
        if (str != null) {
            StringBuilder stringBuilder2 = new StringBuilder(str.length() + 2);
            stringBuilder2.append(str3);
            stringBuilder2.append(str);
            stringBuilder2.append(str3);
            str = stringBuilder2.toString();
        } else {
            str = str2;
        }
        stringBuilder.append(str);
        str = ", ";
        stringBuilder.append(str);
        byte[] bArr = this.c;
        stringBuilder.append("direct==");
        if (bArr == null) {
            stringBuilder.append(str2);
        } else {
            stringBuilder.append(str3);
            stringBuilder.append(Base64.encodeToString(bArr, 3));
            stringBuilder.append(str3);
        }
        stringBuilder.append(str);
        rvw.a(stringBuilder, "GAIA=", this.d);
        stringBuilder.append(str);
        rvw.a(stringBuilder, "PSEUDO=", this.e);
        stringBuilder.append(str);
        rvw.a(stringBuilder, "ALWAYS=", this.f);
        stringBuilder.append(str);
        rvw.a(stringBuilder, "OTHER=", this.g);
        stringBuilder.append(", weak=");
        stringBuilder.append(Arrays.toString(this.h));
        stringBuilder.append(str);
        rvw.a(stringBuilder, "directs=", this.i);
        stringBuilder.append(", genDims=");
        stringBuilder.append(Arrays.toString(rvw.b(this.j).toArray()));
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    private static void a(StringBuilder stringBuilder, String str, byte[][] bArr) {
        stringBuilder.append(str);
        stringBuilder.append("=");
        if (bArr == null) {
            stringBuilder.append("null");
            return;
        }
        stringBuilder.append("(");
        int length = bArr.length;
        int i = 0;
        Object obj = 1;
        while (i < length) {
            byte[] bArr2 = bArr[i];
            if (obj == null) {
                stringBuilder.append(", ");
            }
            String str2 = "'";
            stringBuilder.append(str2);
            stringBuilder.append(Base64.encodeToString(bArr2, 3));
            stringBuilder.append(str2);
            i++;
            obj = null;
        }
        stringBuilder.append(")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rvw) {
            rvw rvw = (rvw) obj;
            if (rwh.a(this.b, rvw.b) && Arrays.equals(this.c, rvw.c) && rwh.a(rvw.a(this.d), rvw.a(rvw.d)) && rwh.a(rvw.a(this.e), rvw.a(rvw.e)) && rwh.a(rvw.a(this.f), rvw.a(rvw.f)) && rwh.a(rvw.a(this.g), rvw.a(rvw.g)) && rwh.a(rvw.a(this.h), rvw.a(rvw.h)) && rwh.a(rvw.a(this.i), rvw.a(rvw.i)) && rwh.a(rvw.b(this.j), rvw.b(rvw.j))) {
                return true;
            }
        }
        return false;
    }

    private static List a(byte[][] bArr) {
        if (bArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(r0);
        for (byte[] encodeToString : bArr) {
            arrayList.add(Base64.encodeToString(encodeToString, 3));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static List a(int[] iArr) {
        if (iArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(r0);
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static List b(int[] iArr) {
        if (iArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(iArr.length >> 1);
        for (int i = 0; i < iArr.length; i += 2) {
            arrayList.add(new rwa(iArr[i], iArr[i + 1]));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.a(parcel, 2, this.b);
        qov.a(parcel, 3, this.c);
        qov.a(parcel, 4, this.d);
        qov.a(parcel, 5, this.e);
        qov.a(parcel, 6, this.f);
        qov.a(parcel, 7, this.g);
        qov.a(parcel, 8, this.h);
        qov.a(parcel, 9, this.i);
        qov.a(parcel, 10, this.j);
        qov.a(parcel, i);
    }

    static {
        byte[][] bArr = a;
        rvw rvw = new rvw("", null, bArr, bArr, bArr, bArr, null, null, null);
        rxg rxg = new rxg();
        rxj rxj = new rxj();
        rxi rxi = new rxi();
        rxl rxl = new rxl();
    }
}
