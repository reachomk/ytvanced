package defpackage;

import android.widget.ImageView;
import java.util.concurrent.Executor;

/* renamed from: gof */
public final class gof {
    public final akkq a;
    public final Executor b;
    public ImageView c;
    public gon d;
    public akle e;
    public final wxg f = new goo();

    public gof(akkq akkq, Executor executor) {
        this.a = akkq;
        this.b = executor;
    }

    public final void a() {
        xpr.a(this.c, true);
    }

    public final void b() {
        xpr.a(this.c, false);
    }

    public final void a(aygk aygk) {
        amqw.a(this.c);
        akkj akkj = new akkj(this.a);
        new akle(akkj, new goj(this.c.getContext()), new goh(this, aygk, akkj), this.c, false).a(aygk);
        xpr.a(this.c, true);
    }
}
