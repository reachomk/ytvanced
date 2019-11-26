package defpackage;

import java.util.concurrent.Callable;

/* renamed from: abzh */
public final class abzh implements Runnable {
    private final /* synthetic */ Callable a;
    private final /* synthetic */ abza b;

    public abzh(abza abza, Callable callable) {
        this.b = abza;
        this.a = callable;
    }

    public final void run() {
        abzi abzi = this.b.b;
        Callable callable = this.a;
        try {
            synchronized (abzi) {
                abzi.e = (abzm) callable.call();
            }
        } catch (Exception e) {
            abzi.a(e);
        }
    }
}
