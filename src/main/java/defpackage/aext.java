package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: aext */
class aext extends aexq {
    public afaj d = null;
    private final AtomicBoolean e = new AtomicBoolean();
    private final AtomicBoolean f = new AtomicBoolean();
    private final /* synthetic */ aexj g;

    aext(aexj aexj) {
        this.g = aexj;
        super(aexj);
    }

    /* Access modifiers changed, original: protected */
    public void bw_() {
    }

    /* Access modifiers changed, original: protected */
    public void h() {
    }

    /* Access modifiers changed, original: protected */
    public void i() {
    }

    /* Access modifiers changed, original: protected|final */
    public final void e() {
        if (this.f.compareAndSet(false, true)) {
            bw_();
            this.g.a(0);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        afaj afaj = this.d;
        if (!(afaj == null || afaj.l)) {
            if (!afaj.j) {
                this.g.b.c();
            }
            this.d.l = true;
        }
        if (this.f.compareAndSet(false, true)) {
            bw_();
        }
        i();
        if (this.e.compareAndSet(false, true)) {
            h();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final afaj b() {
        return this.d;
    }
}
