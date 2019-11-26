package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: wyp */
public final class wyp {
    public final String a;
    public final long[] b;
    public boolean c;
    public wyn d;
    public long e;
    public final /* synthetic */ wyl f;

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
        File file = this.f.a;
        String str = this.a;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 12);
        stringBuilder.append(str);
        stringBuilder.append(".");
        stringBuilder.append(i);
        return new File(file, stringBuilder.toString());
    }

    public final File b(int i) {
        File file = this.f.a;
        String str = this.a;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 16);
        stringBuilder.append(str);
        stringBuilder.append(".");
        stringBuilder.append(i);
        stringBuilder.append(".tmp");
        return new File(file, stringBuilder.toString());
    }

    /* synthetic */ wyp(wyl wyl, String str) {
        this.f = wyl;
        this.a = str;
        this.b = new long[wyl.b];
    }
}
