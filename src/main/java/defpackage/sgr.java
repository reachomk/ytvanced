package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutionException;

/* renamed from: sgr */
public final class sgr {
    public final sgz a;
    public sgu b;
    private final sdv c;
    private final anjv d;
    private anjv e;
    private final amqd f = new sgs(this);

    public sgr(sdv sdv, sgz sgz) {
        this.c = sdv;
        this.a = sgz;
        anjv f = anko.f();
        siv siv = sdv.d;
        sja sdy = new sdy(sdv, f);
        seo seo = sdv.c.k;
        siv.a(sdy, seo != null ? seo.d() : 0);
        this.d = anic.a(f, this.f, sfv.a());
        this.d.a(new sgq(this), sfv.a());
    }

    public final void a(sgu sgu) {
        this.b = sgu;
        if (sgu != null) {
            if (a() != null) {
                sgu.a(a());
            }
            if (b() != null) {
                sgu.a(b());
            }
        }
    }

    public final sge a() {
        try {
            return this.d.isDone() ? (sge) anjf.a(this.d) : null;
        } catch (ExecutionException e) {
            e.getCause();
            throw new RuntimeException(e);
        }
    }

    public final sfq b() {
        try {
            if (this.e == null || c()) {
                return null;
            }
            return (sfq) anjf.a(this.e);
        } catch (ExecutionException e) {
            e.getCause();
            throw new RuntimeException(e);
        }
    }

    public final boolean c() {
        anjv anjv = this.e;
        return (anjv == null || anjv.isDone()) ? false : true;
    }

    public final void d() {
        if (this.e == null) {
            sge a = a();
            if (a != null) {
                sdx sdx = new sdx(a.a, this.c.c);
                sdx.execute(new Context[]{r1.a});
                this.e = sdx.a;
                this.e.a(new sgt(this), sfv.a());
            }
        }
    }

    public final sfq e() {
        sdv sdv = this.c;
        new seg(sdv.c).execute(new Context[]{sdv.a});
        return new sfq(sdv.b.a(sgn.APP_AUTH));
    }

    static {
        sgr.class.getSimpleName();
    }
}
