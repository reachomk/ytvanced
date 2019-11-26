package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: nxi */
final class nxi implements ThreadFactory {
    private final /* synthetic */ String a;

    nxi(String str) {
        this.a = str;
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.a);
    }
}
