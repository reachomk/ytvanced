package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* renamed from: baxa */
public abstract class baxa extends baxi implements bazo, bber {
    public static final Logger p = Logger.getLogger(baxa.class.getName());
    private final bbbw a;
    private final boolean b = false;
    private baum c;
    private volatile boolean d;

    protected baxa(bbhy bbhy, bbho bbho, bbht bbht, baum baum, barv barv, boolean z) {
        amqw.a((Object) baum, (Object) "headers");
        amqw.a((Object) bbht, (Object) "transportTracer");
        bbby.a(barv);
        this.a = new bbeq(this, bbhy, bbho);
        this.c = baum;
    }

    public abstract bawz a();

    public abstract baxc b();

    public /* bridge */ /* synthetic */ baxh c() {
        throw null;
    }

    public final void a(basy basy) {
        this.c.b(bbby.b);
        this.c.a(bbby.b, Long.valueOf(Math.max(0, basy.a(TimeUnit.NANOSECONDS))));
    }

    public final void a(int i) {
        this.a.a(i);
    }

    public final void b(int i) {
        b().s.b(i);
    }

    public final void a(boolean z) {
        b().l = z;
    }

    public final void a(batc batc) {
        baxc b = b();
        amqw.b(b.k == null, (Object) "Already called start");
        b.m = (batc) amqw.a((Object) batc, (Object) "decompressorRegistry");
    }

    public final void a(bazn bazn) {
        baxc b = b();
        amqw.b(b.k == null, (Object) "Already called setListener");
        b.k = (bazn) amqw.a((Object) bazn, (Object) "listener");
        if (!this.b) {
            a().a(null);
            this.c = null;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final bbbw d() {
        return this.a;
    }

    public final void c(int i) {
        a().a(i);
    }

    public final void a(bbhv bbhv, boolean z, boolean z2) {
        boolean z3 = true;
        if (bbhv == null && !z) {
            z3 = false;
        }
        amqw.a(z3, (Object) "null frame before EOS");
        a().a(bbhv, z, z2);
    }

    public final void e() {
        if (!b().p) {
            b().p = true;
            d().c();
        }
    }

    public final void b(bavx bavx) {
        amqw.a(bavx.a() ^ 1, (Object) "Should not cancel with OK status");
        this.d = true;
        a().a(bavx);
    }
}
