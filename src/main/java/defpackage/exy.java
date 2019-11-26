package defpackage;

import android.view.View;
import android.view.ViewStub;

/* renamed from: exy */
public abstract class exy implements eym {
    public eyp a;
    public Object b;
    public boolean c;
    public ViewStub d;
    private int e;
    private xqc f;

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final void a(ViewStub viewStub, int i) {
        this.d = (ViewStub) amqw.a((Object) viewStub);
        this.e = i;
        d();
    }

    public final void a(eyp eyp) {
        this.a = eyp;
    }

    public void a(boolean z, boolean z2) {
        if (z) {
            if (this.f == null) {
                ViewStub viewStub = this.d;
                if (viewStub != null) {
                    View inflate = viewStub.inflate();
                    this.d = null;
                    this.f = new xnz(inflate, (byte) 0);
                    this.f.b((long) this.e);
                    this.f.a((long) this.e);
                    f();
                }
            }
            h();
        }
        xqc xqc = this.f;
        if (xqc != null) {
            xqc.a(z, z2);
        }
    }

    public final boolean c() {
        xqc xqc = this.f;
        return xqc != null && xqc.b();
    }

    /* Access modifiers changed, original: protected|final */
    public final View g() {
        xqc xqc = this.f;
        return xqc != null ? xqc.d() : null;
    }

    public final void h() {
        if (this.f != null && !this.c) {
            e();
            this.c = true;
        }
    }
}
