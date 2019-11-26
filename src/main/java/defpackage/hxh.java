package defpackage;

import android.app.Activity;
import com.google.android.youtube.R;

/* renamed from: hxh */
public final class hxh implements t, xcp {
    public final xoi a;
    private final Activity b;
    private final xhv c;
    private final afpu d;
    private final afqe e;
    private final ajko f;
    private final hwx g;
    private final hxo h;
    private final zyw i;
    private final xci j;
    private final ajam k;
    private hwr l;
    private bcuo m;
    private atoq n;

    public hxh(Activity activity, xhv xhv, afpu afpu, xoi xoi, afqe afqe, ajko ajko, hwx hwx, hxo hxo, xci xci, ajam ajam, zyw zyw) {
        this.b = activity;
        this.c = xhv;
        this.d = afpu;
        this.a = xoi;
        this.e = afqe;
        this.f = ajko;
        this.g = hwx;
        this.h = hxo;
        this.j = xci;
        this.k = ajam;
        this.i = zyw;
    }

    public final void a(af afVar) {
    }

    public final void aw_() {
    }

    public final void c() {
    }

    public final void d() {
    }

    public final void B_() {
        if (foh.x(this.i)) {
            this.m = this.k.t().f().a(emg.a(this.i, 140737488355328L, 1)).a(new hxk(this), hxj.a);
        } else {
            this.j.a((Object) this);
        }
    }

    public final void C_() {
        if (foh.x(this.i)) {
            this.m.b();
            this.m = null;
            return;
        }
        this.j.b(this);
    }

    public final void f() {
        if (this.n == null) {
            xtl.c("Reporting options have never been set.");
            xpr.a(this.b, (int) R.string.main_flagging_while_offline, 1);
            return;
        }
        this.f.c();
        if (this.d.a()) {
            g();
        } else {
            this.e.a(this.b, null, new hxl(this));
        }
    }

    public final void g() {
        if (this.c.c()) {
            atoq atoq = this.n;
            avum avum = null;
            if (atoq != null && atoq.a == 77875886) {
                avum = (avum) atoq.b;
            }
            if (avum == null) {
                if (atoq.a == 113762946) {
                    hxo hxo = this.h;
                    axav axav = (axav) atoq.b;
                    ajmq p = hxo.a.p();
                    if (p != null) {
                        hxo.c.a = amqp.b(Long.valueOf(p.d()));
                    }
                    hxo.b.a(axav, hxo.c);
                }
                return;
            }
            this.g.a(avum);
            return;
        }
        xpr.a(this.b, (int) R.string.main_flagging_while_offline, 1);
    }

    public final hwr h() {
        if (this.l == null) {
            this.l = new hwr(R.id.controls_overlay_menu_report_video, this.b.getString(R.string.overflow_report), new hxm(this));
            this.l.a(true);
            this.l.d = ra.a(this.b, (int) R.drawable.quantum_ic_flag_grey600_24);
        }
        return this.l;
    }

    public final void a(ahkf ahkf) {
        aafv aafv = ahkf.c;
        if (aafv == null) {
            this.n = null;
        } else {
            this.n = aafv.a.g;
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkf.class};
        } else if (i == 0) {
            a((ahkf) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
