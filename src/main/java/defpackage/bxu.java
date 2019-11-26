package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: bxu */
public final class bxu implements ThreadFactory {
    public final bxw a;
    public final boolean b;
    private final String c;
    private int d;

    public bxu(String str, bxw bxw, boolean z) {
        this.c = str;
        this.a = bxw;
        this.b = z;
    }

    public final synchronized Thread newThread(Runnable runnable) {
        bxt bxt;
        String str = this.c;
        int i = this.d;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 25);
        stringBuilder.append("glide-");
        stringBuilder.append(str);
        stringBuilder.append("-thread-");
        stringBuilder.append(i);
        bxt = new bxt(this, runnable, stringBuilder.toString());
        this.d++;
        return bxt;
    }
}
