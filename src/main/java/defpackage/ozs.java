package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: ozs */
final /* synthetic */ class ozs implements ThreadFactory {
    private final String a;

    ozs(String str) {
        this.a = str;
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.a);
    }
}
