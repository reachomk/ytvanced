package defpackage;

import java.util.concurrent.Executor;

/* renamed from: aapl */
public final class aapl {
    public final bqa a;
    public final Executor b;
    private boolean c;

    public aapl(bqa bqa, Executor executor) {
        this.a = bqa;
        this.b = executor;
    }

    public final synchronized boolean a() {
        if (this.c) {
            return true;
        }
        try {
            this.a.a();
            this.c = true;
            return true;
        } catch (RuntimeException e) {
            afpc.a(2, afpf.innertube, "Couldn't initialize disk cache", e);
            xtl.a("Couldn't initialize disk cache", e);
            return false;
        }
    }
}
