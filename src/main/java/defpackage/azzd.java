package defpackage;

import java.util.concurrent.Callable;

/* renamed from: azzd */
final class azzd implements Callable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ azza b;

    azzd(azza azza, boolean z) {
        this.b = azza;
        this.a = z;
    }

    public final /* synthetic */ Object call() {
        azzl azzl;
        try {
            azyp a;
            if (this.a) {
                a = this.b.a(true);
            } else {
                azza azza = this.b;
                a = azza.a != null ? azza.b(true) : azza.a(false);
            }
            azzl = new azzl(a);
        } catch (azzj e) {
            azzl = new azzl(e);
        } catch (Throwable th) {
            azzl = new azzl(new azzj(azzi.UNKNOWN, th));
        }
        synchronized (this.b) {
            if (this.b.b != null) {
                azza azza2;
                if (!azzl.b()) {
                    azza2 = this.b;
                    azza2.b.c(azza2);
                } else if (!this.a) {
                    azza2 = this.b;
                    azza2.b.b(azza2);
                }
            }
        }
        return azzl;
    }
}
