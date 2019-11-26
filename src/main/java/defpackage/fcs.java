package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.youtube.R;

/* renamed from: fcs */
public final class fcs implements t {
    public final fcy a;
    public final fcx b;
    public final acvx c;
    public auuc d;
    public albg e;
    public final zyw f;
    private final Context g;
    private final albh h;
    private final fcp i;
    private final fcj j;
    private final xci k;
    private final ajam l;
    private final bdfu m;
    private final fct n = new fct(this);
    private final fcu o = new fcu(this);

    public fcs(Context context, acvx acvx, albh albh, fcp fcp, fcj fcj, xci xci, ajam ajam, zyw zyw) {
        this.g = context;
        this.c = (acvx) amqw.a((Object) acvx);
        this.h = (albh) amqw.a((Object) albh);
        this.i = fcp;
        this.j = (fcj) amqw.a((Object) fcj);
        this.k = xci;
        this.l = ajam;
        this.f = zyw;
        this.m = new bdfu();
        this.a = new fcy();
        this.b = new fcx();
    }

    public final void a(af afVar) {
    }

    public final void aw_() {
    }

    public final void c() {
    }

    public final void d() {
    }

    public final void a(auuc auuc, acvx acvx) {
        this.b.a(null);
        if (auuc == null) {
            if (this.e != null) {
                a(this.d);
            }
            return;
        }
        int a = auug.a(auuc.h);
        if (a != 0 && a == 2) {
            b(auuc, acvx);
        } else {
            this.b.a(auuc);
        }
    }

    public final void a(auuc auuc) {
        if (auuc != null && this.e != null && auuc.equals(this.d)) {
            this.h.a(this.e);
        }
    }

    public final void b(auuc auuc, acvx acvx) {
        if (auuc != null && !auuc.equals(this.d)) {
            fcr fcr = new fcr(this, auuc);
            fck a = this.j.a(auuc, null);
            if (a != null) {
                fcp fcp = this.i;
                a.a(new fcq((aaas) fcp.a((aaas) fcp.a.get(), 1), (xsc) fcp.a((xsc) fcp.b.get(), 2), (acwa) fcp.a((acwa) fcp.c.get(), 3), (auuc) fcp.a(auuc, 4), (acvx) fcp.a(acvx, 5), (albc) fcp.a(fcr, 6)));
                albh albh = this.h;
                if (a.a()) {
                    if (TextUtils.isEmpty(a.b())) {
                        a.d(this.g.getString(R.string.common_error_generic));
                    }
                    if (TextUtils.isEmpty(a.c())) {
                        a.a(this.g.getString(R.string.dismiss), null);
                    }
                }
                albh.b(a.d());
            }
        }
    }

    public final void B_() {
        if (foh.x(this.f)) {
            this.m.a();
            this.m.a(this.n.a(this.l));
        } else {
            this.k.a(this.n);
        }
        this.k.a(this.o);
    }

    public final void C_() {
        if (foh.x(this.f)) {
            this.m.a();
        } else {
            this.k.b(this.n);
        }
        this.k.b(this.o);
    }
}
