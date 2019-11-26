package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: xaf */
public final class xaf implements ThreadFactory {
    public final int a;
    public final String b;
    private final ThreadFactory c;

    public xaf(String str) {
        this(10, (String) amqw.a((Object) str));
    }

    public xaf(int i, String str) {
        this.a = i;
        this.b = str;
        this.c = Executors.defaultThreadFactory();
    }

    public final Thread newThread(Runnable runnable) {
        return this.c.newThread(new xae(this, runnable));
    }
}
