package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: ovm */
public final class ovm {
    public final Uri a;
    public final int b;
    public final byte[] c;
    public final long d;
    public final long e;
    public final long f;
    public final String g;
    public final int h;

    public ovm(Uri uri) {
        this(uri, 0, 0, -1, null, 0);
    }

    public ovm(Uri uri, long j, long j2, String str) {
        this(uri, j, j, j2, str, 0);
    }

    public ovm(Uri uri, long j, long j2, String str, int i) {
        this(uri, j, j, j2, str, i);
    }

    public ovm(Uri uri, long j, long j2, long j3, String str, int i) {
        this(uri, null, j, j2, j3, str, i);
    }

    public ovm(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        this(uri, bArr != null ? 2 : 1, bArr, j, j2, j3, str, i);
    }

    public ovm(Uri uri, int i, byte[] bArr, long j, long j2, long j3, String str, int i2) {
        byte[] bArr2 = bArr;
        long j4 = j;
        long j5 = j2;
        long j6 = j3;
        boolean z = true;
        oxz.a(j4 >= 0);
        oxz.a(j5 >= 0);
        if (j6 <= 0 && j6 != -1) {
            z = false;
        }
        oxz.a(z);
        this.a = uri;
        this.b = i;
        byte[] bArr3 = null;
        if (!(bArr2 == null || bArr2.length == 0)) {
            bArr3 = bArr2;
        }
        this.c = bArr3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = str;
        this.h = i2;
    }

    public final boolean a(int i) {
        return (this.h & i) == i;
    }

    public final String toString() {
        String a = a();
        String valueOf = String.valueOf(this.a);
        String arrays = Arrays.toString(this.c);
        long j = this.d;
        long j2 = this.e;
        long j3 = this.f;
        String str = this.g;
        int i = this.h;
        int length = String.valueOf(a).length();
        int length2 = valueOf.length();
        StringBuilder stringBuilder = new StringBuilder((((length + 94) + length2) + String.valueOf(arrays).length()) + String.valueOf(str).length());
        stringBuilder.append("DataSpec[");
        stringBuilder.append(a);
        stringBuilder.append(" ");
        stringBuilder.append(valueOf);
        a = ", ";
        stringBuilder.append(a);
        stringBuilder.append(arrays);
        stringBuilder.append(a);
        stringBuilder.append(j);
        stringBuilder.append(a);
        stringBuilder.append(j2);
        stringBuilder.append(a);
        stringBuilder.append(j3);
        stringBuilder.append(a);
        stringBuilder.append(str);
        stringBuilder.append(a);
        stringBuilder.append(i);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final String a() {
        return ovm.b(this.b);
    }

    public static String b(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        if (i == 3) {
            return "HEAD";
        }
        throw new AssertionError(i);
    }

    public final ovm a(long j) {
        long j2 = this.f;
        long j3 = -1;
        if (j2 != -1) {
            j3 = j2 - j;
        }
        return a(j, j3);
    }

    public final ovm a(long j, long j2) {
        if (j == 0 && this.f == j2) {
            return this;
        }
        return new ovm(this.a, this.b, this.c, this.d + j, this.e + j, j2, this.g, this.h);
    }

    public final ovm a(Uri uri) {
        return new ovm(uri, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }
}
