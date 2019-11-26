package defpackage;

import android.app.Application;
import java.util.concurrent.Executors;

/* renamed from: ttk */
final class ttk implements tti {
    public final /* synthetic */ Application a;
    private final /* synthetic */ tzm b;
    private final /* synthetic */ tya c;
    private final /* synthetic */ tzu d;
    private final /* synthetic */ tzu e;
    private final /* synthetic */ tzu f;
    private final /* synthetic */ tty g;

    ttk(Application application, tzm tzm, tya tya, tzu tzu, tzu tzu2, tzu tzu3, tty tty) {
        this.a = application;
        this.b = tzm;
        this.c = tya;
        this.d = tzu;
        this.e = tzu2;
        this.f = tzu3;
        this.g = tty;
    }

    public final txg a() {
        txf txf = new txf(this.a, new tzt(new tyc(null, 0, this.b.d)), false);
        Runnable a = txf.a(Executors.newSingleThreadExecutor(new tyd("Primes-init", 0)), txf.a(txf, this.c, this.d, this.e, this.f), true);
        ttn ttn = new ttn(this);
        tyv.d("PrimesInit", "Primes instant initialization", new Object[0]);
        a.run();
        return txf;
    }
}
