package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: adyr */
public class adyr implements adxz {
    private final adxz a;
    private final adxz b;
    public volatile adxy c;
    private final AtomicInteger d = new AtomicInteger(0);
    private final adxy e = new adyq(this);
    private final adyc f;
    private final adzc g = new adyt(this);

    public adyr(adxz adxz, adxz adxz2, adzb adzb, acum acum) {
        this.a = adxz;
        this.b = adxz2;
        this.f = new adyc(this.e, acum);
        this.a.a(b(this.f));
        this.b.a(this.f);
        adzb.a(this.f);
        adzb.a(this.g);
    }

    /* Access modifiers changed, original: protected */
    public adxy b(adxy adxy) {
        return adxy;
    }

    public final void d() {
    }

    /* Access modifiers changed, original: protected */
    public void b() {
        a(adiv.MDX_REMOTE_STATUS, adja.b);
    }

    public final void a(adxy adxy) {
        this.c = adxy;
    }

    public final void a() {
        this.a.a();
        this.b.a();
    }

    public final void a(adiv adiv, adja adja) {
        adja adja2 = new adja(adja);
        adja2.a("senderMsn", Integer.toString(this.d.getAndIncrement()));
        if (a(adiv) && this.b.e() == 2) {
            this.b.a(adiv, adja2);
        } else if (!adiv.E.contains(adiv)) {
            this.a.a(adiv, adja2);
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean a(adiv adiv) {
        return adiv.a();
    }

    public final void a(boolean z) {
        this.d.set(0);
        this.a.a(z);
        this.b.a(z);
        this.f.a();
    }

    public final int e() {
        return this.a.e();
    }

    public final void a(adya adya) {
        this.a.a(adya);
    }

    public final void c() {
        this.a.c();
    }
}
