package defpackage;

import android.app.ProgressDialog;
import android.text.TextUtils;
import com.google.android.youtube.R;

/* renamed from: mkj */
public final class mkj implements exv, uyo, xcp {
    public final lyl a;
    public final mjw b;
    public final afqe c;
    public final afqe d;
    public final afpu e;
    public final uty f;
    public final uyp g;
    public final exu h;
    public final zzl i;
    public int j;
    public String k;
    public ProgressDialog l;
    private final mjk m;
    private final aaas n;
    private final ehz o;
    private final bcaa p;
    private final fda q;
    private final uud r;
    private final euh s;

    public mkj(lyl lyl, mjw mjw, mjk mjk, afqe afqe, afqe afqe2, afpu afpu, uty uty, aaas aaas, ehz ehz, fda fda, bcaa bcaa, uyp uyp, uud uud, exu exu, zzl zzl, euh euh) {
        this.a = lyl;
        this.b = mjw;
        this.m = mjk;
        this.c = afqe;
        this.d = afqe2;
        this.e = afpu;
        this.f = uty;
        this.n = aaas;
        this.o = ehz;
        this.p = bcaa;
        this.q = fda;
        this.g = uyp;
        this.r = uud;
        this.h = exu;
        this.i = zzl;
        this.s = euh;
    }

    public final void i() {
    }

    public final void h() {
        if (this.e.a()) {
            uue d = this.r.d();
            this.q.a((albf) (fde) ((fdd) fde.h().b(this.a.getString(R.string.sign_in_as, new Object[]{d.d, d.b}))).d());
        }
    }

    public final void g() {
        new alpp(this.a.getString(R.string.incognito_auto_terminated), this.a.getString(R.string.rename_dialog_ok)).a(this.a);
    }

    public final void b() {
        if (this.e.g()) {
            this.g.b();
        }
    }

    public final void a() {
        if (this.e.g()) {
            this.g.c();
        }
    }

    public final boolean a(boolean z, apxu apxu) {
        Runnable mki = new mki(this, z, apxu);
        jle jle = (jle) this.p.get();
        if (!z) {
            return b(false, apxu);
        }
        jle.a(mki);
        this.a.V = true;
        return true;
    }

    public final boolean b(boolean z, apxu apxu) {
        boolean z2 = false;
        if (this.e.a()) {
            if (!this.a.U) {
                ProgressDialog progressDialog = this.l;
                if (progressDialog != null && progressDialog.isShowing()) {
                    this.a.dismissDialog(1032);
                }
                int i = this.j;
                this.j = 1;
                this.a.J.b();
                if (apxu != null) {
                    if (this.o.c()) {
                        this.o.d();
                    }
                    if (!elq.b(apxu)) {
                        this.n.a(apxu, null);
                    }
                } else if (!this.o.c()) {
                    mjw mjw = this.b;
                    if (z || i != 1) {
                        z2 = true;
                    }
                    mjw.b(z2);
                }
                this.m.a();
                this.s.b();
            }
            return true;
        } else if (!z) {
            return false;
        } else {
            if (!this.a.U) {
                if (this.j == 1) {
                    z2 = true;
                }
                ProgressDialog progressDialog2 = this.l;
                if (progressDialog2 != null && progressDialog2.isShowing()) {
                    this.a.dismissDialog(1032);
                }
                this.j = 2;
                this.a.J.b();
                if (!this.o.c()) {
                    this.b.b(z2);
                }
                this.b.e = null;
                this.m.a();
                this.s.b();
            }
            return true;
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{uyw.class};
        } else if (i == 0) {
            uyw uyw = (uyw) obj;
            if (uyw.a == uyz.FINISHED && uyw.b) {
                String a = this.e.c().a();
                if (!TextUtils.equals(a, this.k)) {
                    this.k = a;
                    this.b.a(8);
                    a(true, uyw.c);
                    return null;
                }
            }
            b(uyw.b, uyw.c);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
