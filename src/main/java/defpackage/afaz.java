package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: afaz */
public class afaz extends ono {
    private final afas b;
    public final afaj c;
    public final Handler d;
    public final afjj e;
    public volatile afaw f;
    private owt g;

    public afaz(Executor executor, afas afas, Handler handler, afaj afaj, afjj afjj) {
        this.b = afas;
        this.d = handler;
        this.c = afaj;
        this.e = afjj;
        executor.execute(new afay(afaj));
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
    }

    public final void b() {
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(owt owt) {
        this.g = owt;
        a(new afbd(this.c), null);
    }

    public final ooj a(ook ook, ouw ouw, long j) {
        this.e.a.a(new aejt());
        synchronized (this.c) {
            this.f = new afaw(ouw, this.c.b, this.b, a(ook), this.c.d().X(), this.c.e(), this.e, nyr.b((long) this.c.d().L()), this.g);
        }
        this.e.a.a(new aeju());
        return this.f;
    }

    public final void a(ooj ooj) {
        this.e.a.a(new aejv());
        afaw afaw = (afaw) ooj;
        for (oqk c : afaw.b) {
            c.c();
        }
        afaw.a.b();
        this.e.a.a(new aejv());
    }

    public final void c() {
        if (this.f != null) {
            this.d.post(new afbb(this));
        }
    }
}
