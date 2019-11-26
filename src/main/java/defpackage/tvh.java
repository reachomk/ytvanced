package defpackage;

import android.app.Application;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: tvh */
final class tvh implements tzu {
    private final /* synthetic */ txw a;
    private final /* synthetic */ Application b;
    private final /* synthetic */ tzu c;
    private final /* synthetic */ amqp d;
    private final /* synthetic */ tvg e;

    tvh(tvg tvg, txw txw, Application application, tzu tzu, amqp amqp) {
        this.e = tvg;
        this.a = txw;
        this.b = application;
        this.c = tzu;
        this.d = amqp;
    }

    public final /* synthetic */ Object a() {
        if (!this.a.d().a() || !((tzq) this.a.d().b()).a) {
            return ampo.a;
        }
        tvg tvg = this.e;
        if (tvg.l.i().a()) {
            tvg.l.i().b();
        }
        tzq tzq = (tzq) this.a.d().b();
        return amqp.b((tzw) tvg.a(new tzw(this.e.a(), this.b, this.e.j, this.c, new udb(tzq.b), tzq.c, tzq.d, (ConcurrentHashMap) this.d.a(new ConcurrentHashMap()))));
    }
}
