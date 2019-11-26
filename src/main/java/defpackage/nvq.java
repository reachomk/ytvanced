package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: nvq */
public final class nvq {
    public final Uri a;
    public final byte[] b;
    public final long c;
    public final long d;
    public final long e;
    public final String f;
    public final int g;

    public nvq(Uri uri) {
        this(uri, 0);
    }

    public nvq(Uri uri, int i) {
        this(uri, 0, 0, -1, null, i);
    }

    public nvq(Uri uri, long j, long j2, String str) {
        this(uri, j, j, j2, str, 0);
    }

    public nvq(Uri uri, long j, long j2, String str, int i) {
        this(uri, j, j, j2, str, i);
    }

    private nvq(Uri uri, long j, long j2, long j3, String str, int i) {
        this(uri, null, j, j2, j3, str, i);
    }

    public nvq(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        boolean z = true;
        nwf.a(j >= 0);
        nwf.a(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        nwf.a(z);
        this.a = uri;
        this.b = bArr;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = str;
        this.g = i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String arrays = Arrays.toString(this.b);
        long j = this.c;
        long j2 = this.d;
        long j3 = this.e;
        String str = this.f;
        int i = this.g;
        int length = valueOf.length();
        StringBuilder stringBuilder = new StringBuilder(((length + 93) + String.valueOf(arrays).length()) + String.valueOf(str).length());
        stringBuilder.append("DataSpec[");
        stringBuilder.append(valueOf);
        valueOf = ", ";
        stringBuilder.append(valueOf);
        stringBuilder.append(arrays);
        stringBuilder.append(valueOf);
        stringBuilder.append(j);
        stringBuilder.append(valueOf);
        stringBuilder.append(j2);
        stringBuilder.append(valueOf);
        stringBuilder.append(j3);
        stringBuilder.append(valueOf);
        stringBuilder.append(str);
        stringBuilder.append(valueOf);
        stringBuilder.append(i);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
