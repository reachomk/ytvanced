package defpackage;

import java.util.concurrent.Callable;

/* renamed from: abzg */
final class abzg implements Runnable {
    private final /* synthetic */ Callable a;
    private final /* synthetic */ abza b;

    abzg(abza abza, Callable callable) {
        this.b = abza;
        this.a = callable;
    }

    public final void run() {
        abzi abzi = this.b.b;
        Callable callable = this.a;
        try {
            synchronized (abzi) {
                abzi.f.add((abzk) callable.call());
            }
        } catch (Exception e) {
            abzi.a(e);
        }
    }
}
