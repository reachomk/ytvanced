package defpackage;

import android.text.TextUtils;
import com.google.android.youtube.R;

/* renamed from: fuz */
final class fuz implements wpk {
    public final ahca a;
    public final /* synthetic */ fux b;
    private final apxu c;
    private final wpk d;
    private final aaas e;

    fuz(fux fux, apxu apxu, ahca ahca, wpk wpk, aaas aaas) {
        this.b = fux;
        this.c = apxu;
        this.a = ahca;
        this.d = wpk;
        this.e = aaas;
    }

    public final void a() {
        this.b.b.d(new ect());
        wpk wpk = this.d;
        if (wpk != null) {
            wpk.a();
        }
    }

    public final void d() {
        this.b.f.f();
        wpk wpk = this.d;
        if (wpk != null) {
            wpk.d();
        }
    }

    public final void a(abma abma) {
        wpk wpk = this.d;
        if (wpk != null) {
            wpk.a(abma);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01dc  */
    public final void a(defpackage.akcf r19) {
        /*
        r18 = this;
        r0 = r18;
        r1 = r19;
        r2 = r0.b;
        r2 = r2.q;
        r2 = r2.t();
        r3 = r1.c;
        r2.a(r3);
        r2 = r1.d;
        r3 = 0;
        if (r2 == 0) goto L_0x001e;
    L_0x0016:
        r4 = r2.length;
        if (r4 <= 0) goto L_0x001e;
    L_0x0019:
        r4 = r0.e;
        r4.a(r2, r3);
    L_0x001e:
        r2 = r1.a;
        r4 = 2;
        if (r2 == 0) goto L_0x002f;
    L_0x0023:
        r2 = r2.a;
        if (r2 == 0) goto L_0x002f;
    L_0x0027:
        r5 = r2.a;
        r5 = r5 & r4;
        if (r5 == 0) goto L_0x002f;
    L_0x002c:
        r2 = r2.c;
        goto L_0x0030;
    L_0x002f:
        r2 = r3;
    L_0x0030:
        r5 = android.text.TextUtils.isEmpty(r2);
        r6 = 1;
        if (r5 != 0) goto L_0x005b;
    L_0x0037:
        r2 = defpackage.grw.b(r2);
        r5 = 0;
        r5 = java.lang.Boolean.valueOf(r5);
        r2 = r2.a(r5);
        r2 = r2.b(r6);
        r2 = r2.a(r6);
        r2 = r2.c();
        r5 = r0.b;
        r5 = r5.r;
        r7 = r2.a();
        r5.b(r7, r2);
    L_0x005b:
        r2 = r0.b;
        r2 = r2.g;
        r2.a(r1);
        r2 = r0.b;
        r2 = r2.e;
        r2.f();
        r2 = r0.b;
        r2 = r2.f;
        r2.f();
        r2 = r0.b;
        r2 = r2.s;
        if (r2 == 0) goto L_0x0079;
    L_0x0076:
        r2.a();
    L_0x0079:
        r2 = r0.a;
        if (r2 != 0) goto L_0x007e;
    L_0x007d:
        goto L_0x00b2;
    L_0x007e:
        r5 = r2.a;
        r5 = android.text.TextUtils.isEmpty(r5);
        if (r5 != 0) goto L_0x00b2;
    L_0x0086:
        r2 = r2.b;
        r5 = defpackage.avsi.UNKNOWN_FORMAT_TYPE;
        if (r2 == r5) goto L_0x00b2;
    L_0x008c:
        r2 = r0.b;
        r2 = r2.i;
        r2 = r2.a();
        if (r2 != 0) goto L_0x00a5;
    L_0x0096:
        r2 = r0.b;
        r5 = r2.j;
        r2 = r2.a;
        r7 = new fve;
        r7.<init>(r0);
        r5.a(r2, r3, r7);
        goto L_0x00b2;
    L_0x00a5:
        r2 = r0.a;
        r2 = r2.a();
        r3 = r0.a;
        r3 = r3.b;
        r0.a(r2, r3);
    L_0x00b2:
        r2 = r1.a;
        if (r2 != 0) goto L_0x00b8;
    L_0x00b6:
        goto L_0x01d8;
    L_0x00b8:
        r3 = r2.f;
        r2 = r2.i;
        if (r3 == 0) goto L_0x00bf;
    L_0x00be:
        goto L_0x00c3;
    L_0x00bf:
        if (r2 != 0) goto L_0x00c3;
    L_0x00c1:
        goto L_0x01d8;
    L_0x00c3:
        r5 = r0.b;
        r5 = r5.q;
        r5 = r5.t();
        r15 = new android.widget.FrameLayout;
        r7 = r0.b;
        r7 = r7.a;
        r15.<init>(r7);
        r7 = new android.app.AlertDialog$Builder;
        r8 = r0.b;
        r8 = r8.a;
        r7.<init>(r8);
        r7 = r7.setView(r15);
        r14 = r7.create();
        r13 = new akor;
        r13.<init>();
        r13.a(r5);
        r5 = 4;
        r12 = 3;
        if (r3 == 0) goto L_0x0168;
    L_0x00f1:
        r7 = r0.b;
        r7 = r7.o;
        r14.getClass();
        r8 = new fvc;
        r8.<init>(r14);
        r11 = new wnp;
        r9 = r7.a;
        r9 = r9.get();
        r9 = (android.content.Context) r9;
        r9 = defpackage.wnt.a(r9, r6);
        r9 = (android.content.Context) r9;
        r10 = r7.b;
        r10 = r10.get();
        r10 = (defpackage.aaas) r10;
        r10 = defpackage.wnt.a(r10, r4);
        r10 = (defpackage.aaas) r10;
        r4 = r7.c;
        r4 = r4.get();
        r4 = (defpackage.wop) r4;
        r4 = defpackage.wnt.a(r4, r12);
        r4 = (defpackage.wop) r4;
        r12 = r7.d;
        r12 = r12.get();
        r12 = (defpackage.wny) r12;
        r12 = defpackage.wnt.a(r12, r5);
        r12 = (defpackage.wny) r12;
        r7 = r7.e;
        r7 = r7.get();
        r7 = (defpackage.wnb) r7;
        r5 = 5;
        r5 = defpackage.wnt.a(r7, r5);
        r5 = (defpackage.wnb) r5;
        r7 = 7;
        r7 = defpackage.wnt.a(r8, r7);
        r17 = r7;
        r17 = (defpackage.wnk) r17;
        r7 = r11;
        r8 = r9;
        r9 = r10;
        r10 = r4;
        r4 = r11;
        r11 = r12;
        r12 = r5;
        r5 = r13;
        r13 = r15;
        r16 = r14;
        r14 = r17;
        r7.<init>(r8, r9, r10, r11, r12, r13, r14);
        r4.a_(r5, r3);
        r3 = r4.b;
        r15.addView(r3);
        goto L_0x016b;
    L_0x0168:
        r5 = r13;
        r16 = r14;
    L_0x016b:
        if (r2 == 0) goto L_0x01d3;
    L_0x016d:
        r3 = r0.b;
        r3 = r3.p;
        r16.getClass();
        r4 = new fvb;
        r14 = r16;
        r4.<init>(r14);
        r13 = new eqs;
        r7 = r3.a;
        r7 = r7.get();
        r7 = (android.content.Context) r7;
        r6 = defpackage.eqw.a(r7, r6);
        r8 = r6;
        r8 = (android.content.Context) r8;
        r6 = r3.b;
        r6 = r6.get();
        r6 = (defpackage.akyz) r6;
        r7 = 2;
        r6 = defpackage.eqw.a(r6, r7);
        r9 = r6;
        r9 = (defpackage.akyz) r9;
        r6 = r3.c;
        r6 = r6.get();
        r6 = (defpackage.akkq) r6;
        r7 = 3;
        r6 = defpackage.eqw.a(r6, r7);
        r10 = r6;
        r10 = (defpackage.akkq) r10;
        r3 = r3.d;
        r3 = r3.get();
        r3 = (defpackage.lud) r3;
        r6 = 4;
        r3 = defpackage.eqw.a(r3, r6);
        r11 = r3;
        r11 = (defpackage.lud) r11;
        r3 = 6;
        r3 = defpackage.eqw.a(r4, r3);
        r3 = (defpackage.eqt) r3;
        r7 = r13;
        r12 = r15;
        r4 = r13;
        r13 = r3;
        r7.<init>(r8, r9, r10, r11, r12, r13);
        r4.a_(r5, r2);
        r2 = r4.b;
        r15.addView(r2);
        goto L_0x01d5;
    L_0x01d3:
        r14 = r16;
    L_0x01d5:
        r14.show();
    L_0x01d8:
        r2 = r0.d;
        if (r2 == 0) goto L_0x01df;
    L_0x01dc:
        r2.a(r1);
    L_0x01df:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fuz.a(akcf):void");
    }

    public final void a(CharSequence charSequence) {
        CharSequence string;
        this.b.b.d(new ecp());
        this.b.g.a();
        this.b.f.f();
        this.b.e.c();
        if (TextUtils.isEmpty(charSequence)) {
            string = this.b.h.getString(R.string.error_generic);
        } else {
            string = charSequence.toString();
        }
        fux fux = this.b;
        wre wre = fux.s;
        if (wre == null) {
            fux.c.a((String) string);
        } else {
            wre.a(string);
        }
        wpk wpk = this.d;
        if (wpk != null) {
            wpk.a(charSequence);
        }
    }

    public final void b() {
        this.b.b.d(new ecq());
        this.b.f.f();
        this.b.e.f();
        fux fux = this.b;
        wre wre = fux.s;
        if (wre == null) {
            fux.c.a((int) R.string.payment_purchase_cancelled);
        } else {
            wre.b();
        }
        wpk wpk = this.d;
        if (wpk != null) {
            wpk.b();
        }
    }

    public final void c() {
        this.b.g.a();
        this.b.f.f();
        this.b.e.c();
        CharSequence string = this.b.h.getString(R.string.payment_wallet_processing_error);
        fux fux = this.b;
        wre wre = fux.s;
        if (wre == null) {
            fux.c.a((String) string);
        } else {
            wre.a(string);
        }
        wpk wpk = this.d;
        if (wpk != null) {
            wpk.c();
        }
    }

    public final void a(String str, avsi avsi) {
        a(this.b.k.b().k().a(str, avsi, agqq.OFFLINE_IMMEDIATELY, this.c.b.d(), 0), agqq.OFFLINE_IMMEDIATELY);
    }

    public final void a(int i, agqq agqq) {
        fux fux = this.b;
        i = ahbk.a(i, agqq, fux.m, fux.l);
        if (i != 0) {
            this.b.n.a(i);
        }
    }
}
