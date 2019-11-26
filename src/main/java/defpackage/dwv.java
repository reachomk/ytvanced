package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;

/* renamed from: dwv */
public final class dwv extends ekk implements xcp {
    public static final bcpu a = new bcpu(bcrr.a(30, 1000));
    public final Activity b;
    public final dwz c;
    public final fda d;
    public final ahas e;
    public final xsc f;
    public final zzl g;
    public final zyw h;
    public long i;
    public boolean j;
    public ayvi k;
    public aqwx l;
    public avls m;
    public acvx n;
    public AlertDialog o;
    public AlertDialog p;
    public aozy q;
    public int r = 1;
    private final xci u;

    public dwv(elm elm, Activity activity, xci xci, dwz dwz, fda fda, ahas ahas, acvx acvx, xsc xsc, zzl zzl, zyw zyw) {
        super(elm);
        this.b = activity;
        this.u = xci;
        this.c = dwz;
        this.d = fda;
        this.e = ahas;
        this.n = acvx;
        this.f = xsc;
        this.g = zzl;
        this.h = zyw;
    }

    public final void c() {
        this.r = 1;
        this.i = 0;
        e();
    }

    public final void A_() {
        this.u.a((Object) this);
    }

    public final void ar_() {
        this.u.b(this);
    }

    public final Intent d() {
        return ebl.c(this.b).putExtra(":android:no_headers", true);
    }

    public final void e() {
        this.k = null;
        this.l = null;
        this.m = null;
        this.j = false;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{afqh.class};
        } else if (i == 0) {
            AlertDialog alertDialog = this.o;
            if (alertDialog != null && alertDialog.isShowing()) {
                this.o.dismiss();
            }
            alertDialog = this.p;
            if (alertDialog != null && alertDialog.isShowing()) {
                this.p.dismiss();
                return null;
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }

    public final void a(int i, boolean z, acvx acvx) {
        this.r = i;
        this.i = this.f.a();
        this.n = acvx;
        if (z) {
            e();
        } else {
            this.j = true;
        }
    }
}
