package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: brw */
public final class brw {
    public final String a;
    public final long[] b;
    public File[] c;
    public boolean d;
    public brt e;
    public long f;
    public final /* synthetic */ brs g;
    private File[] h;

    public final String a() {
        StringBuilder stringBuilder = new StringBuilder();
        for (long j : this.b) {
            stringBuilder.append(' ');
            stringBuilder.append(j);
        }
        return stringBuilder.toString();
    }

    public static IOException a(String[] strArr) {
        String valueOf = String.valueOf(Arrays.toString(strArr));
        String str = "unexpected journal line: ";
        throw new IOException(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
    }

    public final File a(int i) {
        return this.c[i];
    }

    public final File b(int i) {
        return this.h[i];
    }

    /* synthetic */ brw(brs brs, String str) {
        this.g = brs;
        this.a = str;
        int i = brs.d;
        this.b = new long[i];
        this.c = new File[i];
        this.h = new File[i];
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.append('.');
        int length = stringBuilder.length();
        for (int i2 = 0; i2 < brs.d; i2++) {
            stringBuilder.append(i2);
            this.c[i2] = new File(brs.a, stringBuilder.toString());
            stringBuilder.append(".tmp");
            this.h[i2] = new File(brs.a, stringBuilder.toString());
            stringBuilder.setLength(length);
        }
    }
}
