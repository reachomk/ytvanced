package defpackage;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup.LayoutParams;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ChipCloudRendererOuterClass;

/* renamed from: jqr */
public final class jqr implements jqn {
    public final RecyclerView a;
    public amqp b = ampo.a;
    public acvx c = acvx.g;
    public bdfi d;
    public akxv e;
    private final ans f;
    private final akpd g;
    private final akpk h;
    private final aaas i;
    private final eyq j;
    private final arjh k;
    private arjh l;
    private boolean m;
    private arjh n;
    private aafn o;
    private boolean p;

    public jqr(Activity activity, RecyclerView recyclerView, epf epf, aaas aaas, akpe akpe) {
        this.i = aaas;
        this.a = recyclerView;
        this.f = new ans();
        this.f.b(0);
        this.a.a(this.f);
        recyclerView = this.a;
        recyclerView.a(new xpi(recyclerView, true));
        this.g = akpe.a((akpb) epf.get(), new LayoutParams(-2, -2));
        this.h = new akpk();
        this.g.a(this.h);
        this.j = new eyq(activity.getResources().getDimensionPixelSize(R.dimen.filter_bar_chip_padding));
        this.m = false;
        this.k = (arjh) arje.e.createBuilder();
        for (int i = 0; i < 10; i++) {
            aptk aptk = (aptk) aptl.i.createBuilder();
            aptm aptm = (aptm) aptn.c.createBuilder();
            aptm.a(7);
            aptk.a(aptm);
            aptk.a(false);
            aptl aptl = (aptl) ((anxl) aptk.build());
            arjh arjh = this.k;
            axaj axaj = (axaj) axak.a.createBuilder();
            axaj.a(ChipCloudRendererOuterClass.chipCloudChipRenderer, aptl);
            arjh.copyOnWrite();
            arje arje = (arje) arjh.instance;
            arje.a();
            arje.b.add((axak) ((anxl) axaj.build()));
        }
    }

    public final boolean a(aafn aafn, akxv akxv, acvx acvx) {
        this.c = (acvx) amqw.a((Object) acvx);
        this.d = bdfi.h();
        this.e = akxv;
        return b(aafn);
    }

    private final boolean b(aafn aafn) {
        this.o = aafn;
        anxl anxl = null;
        if (aafn != null) {
            akab akab = aafn.a;
            if (akab != null) {
                axex axex = akab.f;
                if (axex != null && axex.a == 213380311) {
                    anxl = (arje) axex.b;
                }
            }
        }
        return anxl != null ? a((arjh) ((anxo) anxl.toBuilder())) : false;
    }

    public final boolean a(akyd akyd, akxv akxv, acvx acvx) {
        this.c = (acvx) amqw.a((Object) acvx);
        this.e = akxv;
        if (!(akyd instanceof jra)) {
            return false;
        }
        boolean z;
        jra jra = (jra) akyd;
        this.o = jra.c;
        this.b = jra.b;
        this.d = bdfi.h();
        if (jra.e) {
            c();
            this.n = jra.a;
            this.f.a(jra.d);
            z = true;
        } else {
            arjh arjh = jra.a;
            if (arjh == null) {
                return false;
            }
            z = a(arjh);
            this.f.a(jra.d);
        }
        return z;
    }

    public final boolean a(aafn aafn) {
        if (!this.m) {
            return false;
        }
        this.m = false;
        l();
        this.d.e_(jqq.a(ampo.a, ampo.a));
        return b(aafn);
    }

    public final boolean d() {
        return this.m;
    }

    public final void f() {
        bdfi bdfi = this.d;
        if (bdfi != null) {
            bdfi.bM_();
        }
        l();
        this.m = false;
    }

    private final void l() {
        this.n = null;
        this.o = null;
        this.b = ampo.a;
        this.a.b(this.j);
        this.a.a(null);
        this.h.clear();
    }

    public final void c() {
        this.m = true;
        b(this.k);
    }

    public final void g() {
        if (this.m) {
            this.m = false;
            b(this.n);
        }
    }

    public final boolean h() {
        return this.b.a();
    }

    public final bctz b() {
        return this.d.b(jqu.a);
    }

    public final akyd e() {
        return new jra(this.n, this.b, this.o, this.f, this.m);
    }

    private final boolean a(arjh arjh) {
        if (arjh == null) {
            return false;
        }
        this.n = arjh;
        b(this.n);
        k();
        return this.h.isEmpty() ^ 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARNING: Missing block: B:24:0x006f, code skipped:
            if (r2.equals(defpackage.apxu.d) == false) goto L_0x0071;
     */
    private final void b(defpackage.arjh r7) {
        /*
        r6 = this;
        if (r7 == 0) goto L_0x0131;
    L_0x0002:
        r0 = r6.a;
        r1 = r0.m;
        r2 = r6.g;
        if (r1 == r2) goto L_0x001e;
    L_0x000a:
        r0.a(r2);
        r0 = r6.a;
        r1 = r6.j;
        r0.a(r1);
        r0 = r6.g;
        r1 = new jqt;
        r1.<init>(r6);
        r0.a(r1);
    L_0x001e:
        r6.l = r7;
        r0 = r6.h;
        r0.clear();
        r0 = r7.a();
        if (r0 == 0) goto L_0x00b1;
    L_0x002b:
        r0 = r7.a();
        if (r0 <= 0) goto L_0x00b1;
    L_0x0031:
        r0 = 0;
        r1 = r7.a(r0);
        r2 = com.google.protos.youtube.api.innertube.ChipCloudRendererOuterClass.chipCloudChipRenderer;
        r2 = defpackage.anxl.checkIsLite(r2);
        r1.a(r2);
        r1 = r1.h;
        r3 = r2.d;
        r1 = r1.b(r3);
        if (r1 != 0) goto L_0x004c;
    L_0x0049:
        r1 = r2.b;
        goto L_0x0050;
    L_0x004c:
        r1 = r2.a(r1);
    L_0x0050:
        r1 = (defpackage.aptl) r1;
        r2 = r1.a;
        r3 = r2 & 2;
        r4 = 1;
        if (r3 == 0) goto L_0x005b;
    L_0x0059:
        r3 = 1;
        goto L_0x005c;
    L_0x005b:
        r3 = 0;
    L_0x005c:
        r3 = r3 ^ r4;
        if (r3 != 0) goto L_0x0071;
    L_0x005f:
        r2 = r2 & 16;
        if (r2 == 0) goto L_0x0072;
    L_0x0063:
        r2 = r1.f;
        if (r2 != 0) goto L_0x0069;
    L_0x0067:
        r2 = defpackage.apxu.d;
    L_0x0069:
        r3 = defpackage.apxu.d;
        r2 = r2.equals(r3);
        if (r2 != 0) goto L_0x0072;
    L_0x0071:
        r4 = 0;
    L_0x0072:
        r6.p = r4;
        if (r4 != 0) goto L_0x0077;
    L_0x0076:
        goto L_0x00b1;
    L_0x0077:
        r2 = defpackage.axak.a;
        r2 = r2.createBuilder();
        r2 = (defpackage.axaj) r2;
        r3 = com.google.protos.youtube.api.innertube.ChipCloudRendererOuterClass.chipCloudChipRenderer;
        r1 = r1.toBuilder();
        r1 = (defpackage.anxo) r1;
        r1 = (defpackage.aptk) r1;
        r4 = defpackage.apxu.d;
        r1.copyOnWrite();
        r5 = r1.instance;
        r5 = (defpackage.aptl) r5;
        if (r4 == 0) goto L_0x00ab;
    L_0x0094:
        r5.f = r4;
        r4 = r5.a;
        r4 = r4 | 16;
        r5.a = r4;
        r1 = r1.build();
        r1 = (defpackage.anxl) r1;
        r1 = (defpackage.aptl) r1;
        r2.a(r3, r1);
        r7.a(r0, r2);
        goto L_0x00b1;
    L_0x00ab:
        r7 = new java.lang.NullPointerException;
        r7.<init>();
        throw r7;
    L_0x00b1:
        r7 = r7.instance;
        r7 = (defpackage.arje) r7;
        r7 = r7.b;
        r7 = java.util.Collections.unmodifiableList(r7);
        r7 = r7.iterator();
    L_0x00bf:
        r0 = r7.hasNext();
        if (r0 == 0) goto L_0x0131;
    L_0x00c5:
        r0 = r7.next();
        r0 = (defpackage.axak) r0;
        r1 = com.google.protos.youtube.api.innertube.ChipCloudRendererOuterClass.chipCloudChipRenderer;
        r1 = defpackage.anxl.checkIsLite(r1);
        r0.a(r1);
        r2 = r0.h;
        r1 = r1.d;
        r1 = r2.a(r1);
        if (r1 != 0) goto L_0x0111;
    L_0x00de:
        r1 = com.google.protos.youtube.api.innertube.ButtonRendererOuterClass.buttonRenderer;
        r1 = defpackage.anxl.checkIsLite(r1);
        r0.a(r1);
        r2 = r0.h;
        r1 = r1.d;
        r1 = r2.a(r1);
        if (r1 == 0) goto L_0x00bf;
    L_0x00f1:
        r1 = r6.h;
        r2 = com.google.protos.youtube.api.innertube.ButtonRendererOuterClass.buttonRenderer;
        r2 = defpackage.anxl.checkIsLite(r2);
        r0.a(r2);
        r0 = r0.h;
        r3 = r2.d;
        r0 = r0.b(r3);
        if (r0 != 0) goto L_0x0109;
    L_0x0106:
        r0 = r2.b;
        goto L_0x010d;
    L_0x0109:
        r0 = r2.a(r0);
    L_0x010d:
        r1.add(r0);
        goto L_0x00bf;
    L_0x0111:
        r1 = r6.h;
        r2 = com.google.protos.youtube.api.innertube.ChipCloudRendererOuterClass.chipCloudChipRenderer;
        r2 = defpackage.anxl.checkIsLite(r2);
        r0.a(r2);
        r0 = r0.h;
        r3 = r2.d;
        r0 = r0.b(r3);
        if (r0 != 0) goto L_0x0129;
    L_0x0126:
        r0 = r2.b;
        goto L_0x012d;
    L_0x0129:
        r0 = r2.a(r0);
    L_0x012d:
        r1.add(r0);
        goto L_0x00bf;
    L_0x0131:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jqr.b(arjh):void");
    }

    public final void a() {
        arjh arjh = this.n;
        if (arjh != null) {
            this.c.a(((arje) arjh.instance).d.d(), null);
        }
    }

    public final void j() {
        aafn aafn = this.o;
        if (aafn != null) {
            this.e.b(aafn);
            return;
        }
        arje arje = (arje) this.n.instance;
        if ((arje.a & 1) != 0) {
            aaas aaas = this.i;
            apxu apxu = arje.c;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, amur.a("sectionListController", this.e));
        }
    }

    public final void a(int i, boolean z) {
        akpk akpk = this.h;
        if (akpk != null && i >= 0 && i < akpk.size()) {
            aptk aptk = (aptk) ((anxo) ((aptl) this.h.get(i)).toBuilder());
            aptk.a(z);
            Object obj = (aptl) ((anxl) aptk.build());
            this.h.a(i, obj);
            arjh arjh = this.l;
            if (arjh != null) {
                axaj axaj = (axaj) axak.a.createBuilder();
                axaj.a(ChipCloudRendererOuterClass.chipCloudChipRenderer, obj);
                arjh.a(i, axaj);
            }
        }
    }

    public final boolean a(int i) {
        return this.p && i == 0;
    }

    public final void k() {
        if (this.p && this.h.size() > 0) {
            a(0, this.b.a() ^ 1);
            if (!this.b.a()) {
                this.a.e(0);
            }
        }
    }

    public final boolean i() {
        if (!h() || this.m) {
            return false;
        }
        amqp amqp = this.b;
        this.b = ampo.a;
        this.d.e_(jqq.a(amqp, this.b));
        a(((Integer) amqp.b()).intValue(), false);
        k();
        j();
        return true;
    }
}
