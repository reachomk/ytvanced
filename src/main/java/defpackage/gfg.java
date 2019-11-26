package defpackage;

import android.animation.AnimatorSet;
import android.os.Handler;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import java.io.File;

/* renamed from: gfg */
public final class gfg implements OnTouchListener, gfz, zlb {
    public final akvp a;
    public final gdz b;
    public final gih c;
    public final gju d;
    public View e;
    public ImageView f;
    public View g;
    public View h;
    public nf i;
    public AnimatorSet j;
    public gfn k;
    public zrp l;
    public ziq m;
    public gfm n;
    public boolean o = false;
    public acvx p;
    private final gkt q;
    private final Handler r;
    private final gim s;
    private boolean t = false;
    private Runnable u;

    public gfg(gkt gkt, akvp akvp, gdz gdz, Handler handler, gih gih, gju gju, gim gim) {
        this.q = gkt;
        this.a = akvp;
        this.b = gdz;
        this.r = handler;
        this.c = gih;
        this.d = gju;
        this.s = gim;
    }

    public final void b() {
    }

    public final void c() {
    }

    public final View a() {
        return this.e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d6  */
    public final boolean onTouch(android.view.View r18, android.view.MotionEvent r19) {
        /*
        r17 = this;
        r0 = r17;
        r1 = r18;
        r2 = r19;
        r3 = r0.q;
        r3 = r3.a;
        r3 = r3.b();
        r3 = r3.s;
        if (r3 != 0) goto L_0x0014;
    L_0x0012:
        r3 = defpackage.azaa.j;
    L_0x0014:
        r3 = r3.i;
        if (r3 != 0) goto L_0x0019;
    L_0x0018:
        goto L_0x001e;
    L_0x0019:
        r3 = r0.m;
        r3.onTouch(r1, r2);
    L_0x001e:
        r3 = r0.l;
        r3 = r3.a();
        if (r3 != 0) goto L_0x0028;
    L_0x0026:
        goto L_0x01ae;
    L_0x0028:
        r4 = r3.a;
        if (r4 == 0) goto L_0x01ae;
    L_0x002c:
        r4 = r0.k;
        r4 = r4.av();
        if (r4 == 0) goto L_0x01ae;
    L_0x0034:
        r3 = r3.a;
        r4 = r0.e;
        r5 = r19.getPointerCount();
        r6 = 2;
        r7 = 0;
        r8 = 1;
        if (r5 != r8) goto L_0x0069;
    L_0x0041:
        r5 = r3.b;
        r4.getGlobalVisibleRect(r5);
        r5 = new int[r6];
        r1.getLocationOnScreen(r5);
        r4 = r4.getVisibility();
        if (r4 != 0) goto L_0x0069;
    L_0x0051:
        r4 = r3.b;
        r9 = r2.getX(r7);
        r9 = (int) r9;
        r10 = r2.getY(r7);
        r10 = (int) r10;
        r5 = r5[r8];
        r10 = r10 + r5;
        r4 = r4.contains(r9, r10);
        if (r4 != 0) goto L_0x0067;
    L_0x0066:
        goto L_0x0069;
    L_0x0067:
        r4 = 1;
        goto L_0x006a;
    L_0x0069:
        r4 = 0;
    L_0x006a:
        r3 = r3.a;
        r5 = r18.getWidth();
        r1 = r18.getHeight();
        r9 = r19.getActionMasked();
        r10 = 6;
        r11 = 5;
        if (r9 == r10) goto L_0x00b0;
    L_0x007c:
        r9 = r19.getActionMasked();
        if (r9 == r11) goto L_0x00b0;
    L_0x0082:
        r9 = r19.getActionMasked();
        if (r9 == r6) goto L_0x00b0;
    L_0x0088:
        r9 = r19.getActionMasked();
        if (r9 == 0) goto L_0x00b0;
    L_0x008e:
        r9 = r19.getActionMasked();
        if (r9 == r8) goto L_0x00b0;
    L_0x0094:
        r1 = r19.getActionMasked();
        r2 = new java.lang.StringBuilder;
        r3 = 37;
        r2.<init>(r3);
        r3 = "Can't handle touch event: ";
        r2.append(r3);
        r2.append(r1);
        r1 = r2.toString();
        defpackage.xtl.d(r1);
        goto L_0x01ac;
    L_0x00b0:
        r9 = r19.getActionMasked();
        r12 = -1;
        if (r9 == r11) goto L_0x00cc;
    L_0x00b7:
        r9 = r19.getActionMasked();
        if (r9 == r10) goto L_0x00cc;
    L_0x00bd:
        r9 = r19.getActionMasked();
        if (r9 == r8) goto L_0x00cc;
    L_0x00c3:
        r9 = r19.getActionMasked();
        if (r9 != 0) goto L_0x00ca;
    L_0x00c9:
        goto L_0x00cc;
    L_0x00ca:
        r9 = -1;
        goto L_0x00d0;
    L_0x00cc:
        r9 = r19.getActionIndex();
    L_0x00d0:
        r10 = r19.getPointerCount();
        if (r7 >= r10) goto L_0x01ac;
    L_0x00d6:
        r10 = defpackage.badk.f;
        r10 = r10.createBuilder();
        r10 = (defpackage.badn) r10;
        r13 = r2.getPointerId(r7);
        r10.copyOnWrite();
        r14 = r10.instance;
        r14 = (defpackage.badk) r14;
        r15 = r14.a;
        r15 = r15 | r8;
        r14.a = r15;
        r14.b = r13;
        r13 = defpackage.aocx.d;
        r13 = r13.createBuilder();
        r13 = (defpackage.aoda) r13;
        r14 = r2.getX(r7);
        r13.copyOnWrite();
        r15 = r13.instance;
        r15 = (defpackage.aocx) r15;
        r11 = r15.a;
        r11 = r11 | r8;
        r15.a = r11;
        r11 = (float) r5;
        r14 = r14 / r11;
        r16 = r9;
        r8 = (double) r14;
        r15.b = r8;
        r8 = r2.getY(r7);
        r13.copyOnWrite();
        r9 = r13.instance;
        r9 = (defpackage.aocx) r9;
        r14 = r9.a;
        r14 = r14 | r6;
        r9.a = r14;
        r14 = (float) r1;
        r8 = r8 / r14;
        r14 = (double) r8;
        r9.c = r14;
        r8 = r13.build();
        r8 = (defpackage.anxl) r8;
        r8 = (defpackage.aocx) r8;
        r10.copyOnWrite();
        r9 = r10.instance;
        r9 = (defpackage.badk) r9;
        if (r8 == 0) goto L_0x01a6;
    L_0x0135:
        r9.c = r8;
        r8 = r9.a;
        r8 = r8 | r6;
        r9.a = r8;
        r8 = 3;
        r9 = r16;
        if (r9 == r12) goto L_0x015f;
    L_0x0141:
        if (r7 == r9) goto L_0x0148;
    L_0x0143:
        r10.a(r8);
        r13 = 5;
        goto L_0x0163;
    L_0x0148:
        r8 = r19.getActionMasked();
        r13 = 5;
        if (r8 == r13) goto L_0x015b;
    L_0x014f:
        r8 = r19.getActionMasked();
        if (r8 != 0) goto L_0x0156;
    L_0x0155:
        goto L_0x015b;
    L_0x0156:
        r8 = 4;
        r10.a(r8);
        goto L_0x0163;
    L_0x015b:
        r10.a(r6);
        goto L_0x0163;
    L_0x015f:
        r13 = 5;
        r10.a(r8);
    L_0x0163:
        r8 = r19.getPointerCount();
        r11 = 1;
        if (r8 != r11) goto L_0x0179;
    L_0x016a:
        r10.copyOnWrite();
        r8 = r10.instance;
        r8 = (defpackage.badk) r8;
        r14 = r8.a;
        r14 = r14 | 8;
        r8.a = r14;
        r8.e = r4;
    L_0x0179:
        r8 = defpackage.babm.c;
        r8 = r8.createBuilder();
        r8 = (defpackage.babp) r8;
        r8.copyOnWrite();
        r14 = r8.instance;
        r14 = (defpackage.babm) r14;
        r10 = r10.build();
        r10 = (defpackage.anxl) r10;
        r14.b = r10;
        r10 = 1;
        r14.a = r10;
        r8 = r8.build();
        r8 = (defpackage.anxl) r8;
        r8 = (defpackage.babm) r8;
        r10 = r3.a;
        r10.add(r8);
        r7 = r7 + 1;
        r8 = 1;
        r11 = 5;
        goto L_0x00d0;
    L_0x01a6:
        r1 = new java.lang.NullPointerException;
        r1.<init>();
        throw r1;
    L_0x01ac:
        r1 = 1;
        return r1;
    L_0x01ae:
        r1 = r18.onTouchEvent(r19);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gfg.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void a(boolean z, boolean z2) {
        if (z) {
            this.s.d();
            this.n.a = true;
        }
        this.f.post(new gfj(this, z, z2));
    }

    public final void a(boolean z) {
        if (this.t != z) {
            this.t = z;
            this.f.post(new gfi(this, z));
        }
    }

    public final void b(boolean z) {
        Runnable runnable = this.u;
        if (runnable != null) {
            this.r.removeCallbacks(runnable);
        }
        this.u = new gfl(this, z);
        this.r.postDelayed(this.u, 300);
    }

    public final void c(boolean z) {
        this.r.post(new gfk(this, z));
    }

    public final void a(bacz bacz) {
        gjs gjs;
        baao baao;
        this.s.d();
        gih gih = this.c;
        bacx bacx = bacz.d;
        if (bacx == null) {
            bacx = bacx.e;
        }
        int i = bacx.b;
        if (i != 1) {
            if (i == 3) {
                gjs = gih.c;
                baao = ((baca) bacx.c).b;
                if (baao == null) {
                    baao = baao.c;
                }
            } else if (i == 6) {
                gjs = gih.e;
                baao = ((baas) bacx.c).b;
                if (baao == null) {
                    baao = baao.c;
                }
            } else if (i == 7) {
                gjs = gih.d;
                baao = ((badp) bacx.c).b;
                if (baao == null) {
                    baao = baao.c;
                }
            } else if (i == 2) {
                gjs = gih.f;
                baao = null;
            } else if (i == 4) {
                gjs = gih.g;
                baao = ((babb) bacx.c).b;
                if (baao == null) {
                    baao = baao.c;
                }
            } else {
                return;
            }
        } else if (gih.h) {
            gjs = gih.b;
            baao = ((badg) bacx.c).f;
            if (baao == null) {
                baao = baao.c;
            }
        } else {
            return;
        }
        gih.a.post(new gij(gih, gjs, bacz));
        if (baao != null) {
            String str = "";
            if (!(baao.a == 1 ? (String) baao.b : str).isEmpty()) {
                if (baao.a == 1) {
                    str = (String) baao.b;
                }
                new gii(new File(new File(gih.i.p().getFilesDir(), zjz.a), str), str).execute(new Void[0]);
            }
        }
    }
}
