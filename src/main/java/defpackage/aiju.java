package defpackage;

import java.util.Collection;

/* renamed from: aiju */
public abstract class aiju implements aijx, aizi {
    private final aiku a;
    private boolean b;
    public final aikc m;

    public aiju(aikc aikc, aiku aiku) {
        this.m = (aikc) amqw.a((Object) aikc);
        this.a = (aiku) amqw.a((Object) aiku);
    }

    public final void b(boolean z) {
    }

    public final boolean b(aikr aikr) {
        throw null;
    }

    public final boolean b(aiqq aiqq) {
        return true;
    }

    public final void a(aafv aafv) {
        this.b = aafv != null;
    }

    /* Access modifiers changed, original: protected|final */
    public final aikr c(aizl aizl) {
        return aika.a(this, aizl, this.a, b());
    }

    public aiqq a(aizl aizl) {
        aikr c = c(aizl);
        return c != null ? c.e() : null;
    }

    public void a(aizl aizl, aiqq aiqq) {
        aikr c = c(aizl);
        if (c == null || !aiqx.a(c.e(), aiqq)) {
            throw new IllegalStateException("Navigation committed to a video that is not expected bythe navigable queue");
        }
        a(c);
    }

    public final int a(int i) {
        return this.m.a(i);
    }

    public final aikr a(int i, int i2) {
        return this.m.a(i, i2);
    }

    public void a(int i, int i2, Collection collection) {
        this.m.a(i, 0, collection);
    }

    public void a(int i, int i2, int i3) {
        this.m.a(i, i2, i3);
    }

    public int a(int i, aikr aikr) {
        return this.m.a(i, aikr);
    }

    public void c() {
        this.m.c();
    }

    public final int e() {
        return this.m.e();
    }

    public final void b(int i) {
        this.m.b(i);
    }

    public final int a(aikr aikr) {
        return this.m.a(aikr);
    }

    public void a(aike aike) {
        this.m.a(aike);
    }

    public void b(aike aike) {
        this.m.b(aike);
    }

    public void a(aikd aikd) {
        this.m.a(aikd);
    }

    public void b(aikd aikd) {
        this.m.b(aikd);
    }

    public void a(aikg aikg) {
        this.m.a(aikg);
    }

    public void b(aikg aikg) {
        this.m.b(aikg);
    }

    public boolean c(aiqq aiqq) {
        return this.m.c(aiqq);
    }

    public int b(aizl aizl) {
        aikr c = c(aizl);
        if (aizl.e == aizn.AUTOPLAY && c == null && !this.b) {
            return 3;
        }
        return aizl.a(c != null);
    }
}
