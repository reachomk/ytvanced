package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: bdao */
final class bdao extends bcue {
    private final bdco a = new bdco();
    private final bdfu b = new bdfu();
    private final bdco c = new bdco(this.a, this.b);
    private final bdas d;

    bdao(bdas bdas) {
        this.d = bdas;
    }

    public final void b() {
        this.c.b();
    }

    public final boolean c() {
        return this.c.b;
    }

    public final bcuo a(bcvl bcvl) {
        if (c()) {
            return bdfz.a;
        }
        bdas bdas = this.d;
        bcvl bdar = new bdar(this, bcvl);
        bdco bdco = this.a;
        bdbe bdbe = new bdbe(bdeh.a(bdar), bdco);
        bdco.a(bdbe);
        bdbe.a(bdas.b.submit(bdbe));
        return bdbe;
    }

    public final bcuo a(bcvl bcvl, long j, TimeUnit timeUnit) {
        if (c()) {
            return bdfz.a;
        }
        Future submit;
        bdas bdas = this.d;
        bcvl bdaq = new bdaq(this, bcvl);
        bdfu bdfu = this.b;
        bcuo bdbe = new bdbe(bdeh.a(bdaq), bdfu);
        bdfu.a(bdbe);
        if (j <= 0) {
            submit = bdas.b.submit(bdbe);
        } else {
            submit = bdas.b.schedule(bdbe, j, timeUnit);
        }
        bdbe.a(submit);
        return bdbe;
    }
}
