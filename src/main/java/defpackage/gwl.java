package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* renamed from: gwl */
public final class gwl extends fja implements fjd {
    public ebk ae;
    public eki af;
    public aaal ag;
    public boolean ah;
    private View ai;
    private final amro aj = new gwk(this);
    private final amro ak = new gwn(this);
    private Object al;
    private nl am;
    private Object an;
    private nl ao;
    private fiw ap;
    private boolean aq;
    private boolean ar;
    private boolean as = false;
    private fis at;

    public final int ad() {
        return 720;
    }

    public static boolean c(fiw fiw) {
        return gwl.class.isAssignableFrom(fiw.a);
    }

    public static fiw a(apxu apxu) {
        amqw.a((Object) apxu);
        return fiw.a(gwl.class, apxu, fiw.b());
    }

    public final ezz W() {
        if (!this.aq && this.ar) {
            return ap().W();
        }
        return this.ab;
    }

    public final void b(Bundle bundle) {
        ((gwp) xse.a(this.a)).a(this);
        super.b(bundle);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.ai = layoutInflater.inflate(R.layout.library_split_fragment, viewGroup, false);
        View findViewById = this.ai.findViewById(R.id.detail_layout);
        boolean z = findViewById != null && findViewById.getVisibility() == 0;
        this.aq = z;
        z = this.ar || z;
        this.ar = z;
        if (!this.as) {
            z = this.ae.a && this.af.b();
            this.ah = z;
        }
        if (!an()) {
            a(false);
        }
        if (this.ar) {
            a(ao(), true);
        }
        return this.ai;
    }

    private final void a(boolean z) {
        if (ak() == null) {
            fiw fiw = (fiw) this.aj.get();
            fja c = fiw.c();
            nl nlVar = this.am;
            if (nlVar != null) {
                c.a(nlVar);
            }
            or b = s().a().b(R.id.master_layout, c, "master_fragment_tag");
            if (z) {
                gwl.a(ap(), fiw, true);
                b.i = 8194;
            }
            b.a();
        }
    }

    private final void a(fiw fiw, boolean z) {
        boolean z2 = this.aq;
        int i = R.id.master_layout;
        if (z2) {
            i = R.id.detail_layout;
        } else if (!(ak() == null || z)) {
            this.al = ak().ai();
            this.am = s().a(ak());
        }
        fja c = fiw.c();
        if (c.j == null) {
            c.f(new Bundle());
        }
        if (this.aq) {
            c.j.putBoolean("needs_nested_header", true);
        }
        if (fiw == this.ap) {
            nl nlVar = this.ao;
            if (nlVar != null) {
                c.a(nlVar);
            }
        }
        or b = s().a().b(i, c, "detail_fragment_tag");
        b.i = 0;
        b.a();
    }

    public final Object ai() {
        gtw gtw = new gtw();
        gtw.a = null;
        if (an()) {
            gtw.b = this.al;
            gtw.e = this.am;
        } else {
            gtw.b = ak().ai();
            gtw.e = s().a(ak());
        }
        if (this.ar) {
            gtw.c = ap().ai();
            gtw.d = al();
            gtw.g = ao();
            gtw.f = s().a(ap());
        }
        gtw.h = Boolean.valueOf(this.ar);
        gtw.i = Boolean.valueOf(this.ah);
        String str = "";
        if (gtw.h == null) {
            str = str.concat(" showingDetail");
        }
        if (gtw.i == null) {
            str = String.valueOf(str).concat(" startedInOfflineMode");
        }
        if (str.isEmpty()) {
            return new gtx(null, gtw.b, gtw.c, gtw.d, gtw.e, gtw.f, gtw.g, gtw.h.booleanValue(), gtw.i.booleanValue());
        }
        String str2 = "Missing required properties:";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        throw new IllegalStateException(str);
    }

    public final amqp b(fiw fiw) {
        if (fiw.a(fiw, (fiw) this.aj.get(), this.ag)) {
            return amqp.c(this.al);
        }
        if (fiw.a(fiw, this.ap, this.ag)) {
            return amqp.c(this.an);
        }
        return ampo.a;
    }

    public final void a(Object obj) {
        if (obj instanceof gwo) {
            gwo gwo = (gwo) obj;
            gwo.a();
            this.al = gwo.b();
            this.am = gwo.e();
            this.an = gwo.c();
            this.ap = gwo.g();
            this.at = gwo.d();
            this.ao = gwo.f();
            this.ar = gwo.h();
            this.ah = gwo.i();
            this.as = true;
        }
    }

    public final boolean a(fiw fiw) {
        if (an() && !d(fiw)) {
            return false;
        }
        if (d(fiw)) {
            gwl.a(ap(), fiw, false);
            nf ap = ap();
            al().a(fiw.a((fja) ap), s().a(ap), ap.ai(), null);
        } else {
            gwl.a(ak(), fiw, false);
            al().c();
        }
        a(fiw, false);
        this.ar = true;
        return true;
    }

    private final boolean d(fiw fiw) {
        fja ap = ap();
        return ap != null && gub.f(fiw.a(ap)) && gub.h(fiw);
    }

    public final boolean d() {
        if (g()) {
            return false;
        }
        if (this.aq) {
            am();
            this.ar = true;
        } else if (al().d()) {
            a(true);
            this.ar = false;
        } else {
            am();
            this.ar = true;
        }
        return true;
    }

    public final boolean e() {
        if (!g()) {
            if (!this.aq) {
                a(true);
                this.ar = false;
            } else if (!fiw.a(ao(), (fiw) this.ak.get(), this.ag)) {
                a((fiw) this.ak.get(), false);
                this.ar = true;
            }
            return true;
        }
        return false;
    }

    private final fis al() {
        if (this.at == null) {
            this.at = new fis();
        }
        return this.at;
    }

    private final void am() {
        fiu b = al().b();
        this.ap = b.a;
        this.ao = b.b;
        this.an = b.c;
        gwl.a(ap(), this.ap, true);
        a(this.ap, false);
    }

    public final boolean f() {
        if (!this.aq) {
            return d();
        }
        if (fiw.a(ao(), (fiw) this.ak.get(), this.ag)) {
            return false;
        }
        if (!d()) {
            a((fiw) this.ak.get(), false);
        }
        return true;
    }

    public final boolean g() {
        return !an() && al().d();
    }

    public final boolean ac() {
        return this.aq;
    }

    private final boolean an() {
        return !this.aq && this.ar;
    }

    private final fiw ao() {
        if (ap() != null) {
            return fiw.a(ap());
        }
        fiw fiw = this.ap;
        if (fiw == null) {
            fiw = (fiw) this.ak.get();
        }
        return fiw;
    }

    private final fja ap() {
        return (fja) s().a("detail_fragment_tag");
    }

    public final fja ak() {
        return (fja) s().a("master_fragment_tag");
    }

    private static void a(fja fja, fiw fiw, boolean z) {
        avjh avjh = (avjh) avjf.h.createBuilder();
        Object obj = null;
        if (!(fja == null || fja.t() == null || fja.t().d() == null)) {
            avjh.a(fja.t().d());
            obj = 1;
        }
        if (z) {
            avjh.a(acwc.MOBILE_BACK_BUTTON.dU);
        } else if (obj == null) {
            return;
        }
        fiw.a((avjf) ((anxl) avjh.build()));
    }
}
