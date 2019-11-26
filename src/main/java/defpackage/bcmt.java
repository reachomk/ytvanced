package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: bcmt */
final class bcmt implements ThreadFactory {
    public final /* synthetic */ int a;

    bcmt(int i) {
        this.a = i;
    }

    public final Thread newThread(Runnable runnable) {
        return Executors.defaultThreadFactory().newThread(new bcms(this, runnable));
    }
}
