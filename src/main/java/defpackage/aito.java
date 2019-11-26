package defpackage;

import android.content.Context;
import android.view.View;

/* renamed from: aito */
public abstract class aito implements aitq, aitw {
    private final Context a;
    private aits b;

    public aito(Context context) {
        this.a = (Context) amqw.a((Object) context);
    }

    /* Access modifiers changed, original: protected */
    public void a(int i) {
    }

    /* Access modifiers changed, original: protected */
    public aitx b(Context context) {
        aitx aitx = new aitx(context, this);
        aitx.h = new aitr(this);
        return aitx;
    }

    private final synchronized aits e() {
        if (this.b == null) {
            aitx b = b(this.a);
            this.b = new aits(b.i, b.j, b.h, b.b, b.a, b.d, b.c, b.e, b.f, b.g);
        }
        return this.b;
    }

    public final View a() {
        aits e = e();
        if (!e.c()) {
            String valueOf = String.valueOf(e.b);
            String valueOf2 = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 35) + valueOf2.length());
            stringBuilder.append("Forcefully created overlay:");
            stringBuilder.append(valueOf);
            stringBuilder.append(" helper:");
            stringBuilder.append(valueOf2);
            xtl.d(stringBuilder.toString());
            e.a();
        }
        return e.e;
    }

    public final boolean j() {
        return e().c();
    }

    public final void af_() {
        aits e = e();
        xqc xqc = e.g;
        if (xqc == null || !xqc.b()) {
            e.a(1, "show", new Object[0]);
            e.d(28);
            e.e();
            return;
        }
        e.f();
    }

    public final void k() {
        aits e = e();
        xqc xqc = e.g;
        if (xqc == null || !xqc.b()) {
            e.a(1, "showNoAnim", new Object[0]);
            e.d(12);
            e.e(16);
            e.e();
            return;
        }
        e.f();
    }

    public void ag_() {
        aits e = e();
        xqc xqc = e.g;
        if (xqc == null || xqc.c()) {
            e.f();
            return;
        }
        e.a(1, "hide", new Object[0]);
        e.d(20);
        e.e(8);
        e.e();
    }

    public final void l() {
        aits e = e();
        xqc xqc = e.g;
        if (xqc == null || xqc.c()) {
            e.f();
            return;
        }
        e.a(1, "hideNoAnim", new Object[0]);
        e.d(4);
        e.e(24);
        e.e();
    }

    public final void a(aitt aitt) {
        aits e = e();
        amqw.b(e.h == null);
        e.h = aitt;
    }

    public final void m() {
        e().a(0);
    }

    public final void b(int i) {
        e().a(i);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean c(int i) {
        return e().c(i);
    }
}
