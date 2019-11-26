package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: bnr */
public abstract class bnr implements bkw, blm, bmh {
    public final Matrix a;
    public final bju b;
    public final bnv c;
    public bnr d;
    public bnr e;
    public final bma f;
    private final Path g = new Path();
    private final Matrix h = new Matrix();
    private final Paint i;
    private final Paint j;
    private final Paint k;
    private final Paint l;
    private final Paint m;
    private final RectF n;
    private final RectF o;
    private final RectF p;
    private final RectF q;
    private final String r;
    private bls s;
    private List t;
    private final List u;
    private boolean v;

    bnr(bju bju, bnv bnv) {
        boolean z = true;
        this.i = new bkq(1);
        this.j = new bkq(Mode.DST_IN, (byte) 0);
        this.k = new bkq(Mode.DST_OUT, (byte) 0);
        this.l = new bkq(1);
        this.m = new bkq(Mode.CLEAR);
        this.n = new RectF();
        this.o = new RectF();
        this.p = new RectF();
        this.q = new RectF();
        this.a = new Matrix();
        this.u = new ArrayList();
        this.v = true;
        this.b = bju;
        this.c = bnv;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(bnv.c);
        stringBuilder.append("#draw");
        this.r = stringBuilder.toString();
        if (bnv.v != 3) {
            this.l.setXfermode(new PorterDuffXfermode(Mode.DST_IN));
        } else {
            this.l.setXfermode(new PorterDuffXfermode(Mode.DST_OUT));
        }
        this.f = bnv.h.a();
        this.f.a((blm) this);
        List list = bnv.g;
        if (!(list == null || list.isEmpty())) {
            this.s = new bls(bnv.g);
            for (blj a : this.s.a) {
                a.a((blm) this);
            }
            for (blj a2 : this.s.b) {
                a(a2);
                a2.a((blm) this);
            }
        }
        if (this.c.s.isEmpty()) {
            a(true);
            return;
        }
        blj blo = new blo(this.c.s);
        blo.b = true;
        blo.a(new bnu(this, blo));
        if (((Float) blo.f()).floatValue() != 1.0f) {
            z = false;
        }
        a(z);
        a(blo);
    }

    public final void a(List list, List list2) {
    }

    public abstract void b(Canvas canvas, Matrix matrix, int i);

    /* Access modifiers changed, original: 0000 */
    public void b(bmi bmi, int i, List list, bmi bmi2) {
    }

    public final void a() {
        d();
    }

    private final boolean c() {
        return this.d != null;
    }

    private final void d() {
        this.b.invalidateSelf();
    }

    private static void a(Canvas canvas, RectF rectF, Paint paint, boolean z) {
        if (VERSION.SDK_INT < 23) {
            canvas.saveLayer(rectF, paint, !z ? 19 : 31);
        } else {
            canvas.saveLayer(rectF, paint);
        }
    }

    public final void a(blj blj) {
        if (blj != null) {
            this.u.add(blj);
        }
    }

    public final void b(blj blj) {
        this.u.remove(blj);
    }

    public void a(RectF rectF, Matrix matrix, boolean z) {
        this.n.set(0.0f, 0.0f, 0.0f, 0.0f);
        f();
        this.a.set(matrix);
        if (z) {
            List list = this.t;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    this.a.preConcat(((bnr) this.t.get(size)).f.a());
                }
            } else {
                bnr bnr = this.e;
                if (bnr != null) {
                    this.a.preConcat(bnr.f.a());
                }
            }
        }
        this.a.preConcat(this.f.a());
    }

    /* JADX WARNING: Missing block: B:33:0x0115, code skipped:
            if (r15 != r10) goto L_0x011d;
     */
    public final void a(android.graphics.Canvas r17, android.graphics.Matrix r18, int r19) {
        /*
        r16 = this;
        r0 = r16;
        r1 = r17;
        r2 = r18;
        r3 = r0.v;
        if (r3 == 0) goto L_0x036f;
    L_0x000a:
        r3 = r0.c;
        r3 = r3.t;
        if (r3 == 0) goto L_0x0012;
    L_0x0010:
        goto L_0x036f;
    L_0x0012:
        r16.f();
        r3 = r0.h;
        r3.reset();
        r3 = r0.h;
        r3.set(r2);
        r3 = r0.t;
        r3 = r3.size();
    L_0x0025:
        r3 = r3 + -1;
        if (r3 < 0) goto L_0x003d;
    L_0x0029:
        r4 = r0.h;
        r5 = r0.t;
        r5 = r5.get(r3);
        r5 = (defpackage.bnr) r5;
        r5 = r5.f;
        r5 = r5.a();
        r4.preConcat(r5);
        goto L_0x0025;
    L_0x003d:
        defpackage.bjd.a();
        r3 = r0.f;
        r3 = r3.e;
        if (r3 == 0) goto L_0x0054;
    L_0x0046:
        r3 = r3.f();
        r3 = (java.lang.Integer) r3;
        r3 = r3.intValue();
        r4 = r3;
        r3 = r19;
        goto L_0x005a;
    L_0x0054:
        r3 = 100;
        r3 = r19;
        r4 = 100;
    L_0x005a:
        r3 = (float) r3;
        r5 = 1132396544; // 0x437f0000 float:255.0 double:5.5947823E-315;
        r3 = r3 / r5;
        r4 = (float) r4;
        r3 = r3 * r4;
        r4 = 1120403456; // 0x42c80000 float:100.0 double:5.53552857E-315;
        r3 = r3 / r4;
        r3 = r3 * r5;
        r3 = (int) r3;
        r4 = r16.c();
        if (r4 != 0) goto L_0x008f;
    L_0x006d:
        r4 = r16.e();
        if (r4 == 0) goto L_0x0074;
    L_0x0073:
        goto L_0x008f;
    L_0x0074:
        r2 = r0.h;
        r4 = r0.f;
        r4 = r4.a();
        r2.preConcat(r4);
        r2 = r0.h;
        r0.b(r1, r2, r3);
        defpackage.bjd.a();
        r1 = defpackage.bjd.a();
        r0.b(r1);
        return;
    L_0x008f:
        r4 = r0.n;
        r5 = r0.h;
        r6 = 0;
        r0.a(r4, r5, r6);
        r4 = r0.n;
        r5 = r16.c();
        r7 = 1;
        r8 = 0;
        if (r5 == 0) goto L_0x00c0;
    L_0x00a1:
        r5 = r0.c;
        r5 = r5.v;
        r9 = 3;
        if (r5 != r9) goto L_0x00a9;
    L_0x00a8:
        goto L_0x00c0;
    L_0x00a9:
        r5 = r0.p;
        r5.set(r8, r8, r8, r8);
        r5 = r0.d;
        r9 = r0.p;
        r5.a(r9, r2, r7);
        r5 = r0.p;
        r5 = r4.intersect(r5);
        if (r5 != 0) goto L_0x00c0;
    L_0x00bd:
        r4.set(r8, r8, r8, r8);
    L_0x00c0:
        r4 = r0.h;
        r5 = r0.f;
        r5 = r5.a();
        r4.preConcat(r5);
        r4 = r0.n;
        r5 = r0.h;
        r9 = r0.o;
        r9.set(r8, r8, r8, r8);
        r9 = r16.e();
        r10 = 2;
        r11 = 0;
        if (r9 == 0) goto L_0x0174;
    L_0x00dc:
        r9 = r0.s;
        r9 = r9.c;
        r9 = r9.size();
        r12 = 0;
    L_0x00e5:
        if (r12 >= r9) goto L_0x0169;
    L_0x00e7:
        r13 = r0.s;
        r13 = r13.c;
        r13 = r13.get(r12);
        r13 = (defpackage.bng) r13;
        r14 = r0.s;
        r14 = r14.a;
        r14 = r14.get(r12);
        r14 = (defpackage.blj) r14;
        r14 = r14.f();
        r14 = (android.graphics.Path) r14;
        r15 = r0.g;
        r15.set(r14);
        r14 = r0.g;
        r14.transform(r5);
        r14 = r13.d;
        r15 = r14 + -1;
        if (r14 == 0) goto L_0x0168;
    L_0x0111:
        if (r15 == 0) goto L_0x0118;
    L_0x0113:
        if (r15 == r7) goto L_0x0174;
    L_0x0115:
        if (r15 == r10) goto L_0x0118;
    L_0x0117:
        goto L_0x011d;
    L_0x0118:
        r13 = r13.c;
        if (r13 == 0) goto L_0x011d;
    L_0x011c:
        goto L_0x0174;
    L_0x011d:
        r13 = r0.g;
        r14 = r0.q;
        r13.computeBounds(r14, r6);
        if (r12 != 0) goto L_0x012e;
    L_0x0126:
        r13 = r0.o;
        r14 = r0.q;
        r13.set(r14);
        goto L_0x0161;
    L_0x012e:
        r13 = r0.o;
        r14 = r13.left;
        r15 = r0.q;
        r15 = r15.left;
        r14 = java.lang.Math.min(r14, r15);
        r15 = r0.o;
        r15 = r15.top;
        r10 = r0.q;
        r10 = r10.top;
        r10 = java.lang.Math.min(r15, r10);
        r15 = r0.o;
        r15 = r15.right;
        r6 = r0.q;
        r6 = r6.right;
        r6 = java.lang.Math.max(r15, r6);
        r15 = r0.o;
        r15 = r15.bottom;
        r7 = r0.q;
        r7 = r7.bottom;
        r7 = java.lang.Math.max(r15, r7);
        r13.set(r14, r10, r6, r7);
    L_0x0161:
        r12 = r12 + 1;
        r6 = 0;
        r7 = 1;
        r10 = 2;
        goto L_0x00e5;
    L_0x0168:
        throw r11;
    L_0x0169:
        r5 = r0.o;
        r5 = r4.intersect(r5);
        if (r5 != 0) goto L_0x0174;
    L_0x0171:
        r4.set(r8, r8, r8, r8);
    L_0x0174:
        defpackage.bjd.a();
        r4 = r0.n;
        r4 = r4.isEmpty();
        if (r4 != 0) goto L_0x0367;
    L_0x017f:
        r4 = r0.n;
        r5 = r0.i;
        r6 = 1;
        defpackage.bnr.a(r1, r4, r5, r6);
        defpackage.bjd.a();
        r16.a(r17);
        r4 = r0.h;
        r0.b(r1, r4, r3);
        defpackage.bjd.a();
        r4 = r16.e();
        if (r4 == 0) goto L_0x033f;
    L_0x019b:
        r4 = r0.h;
        r5 = r0.n;
        r6 = r0.j;
        r7 = 0;
        defpackage.bnr.a(r1, r5, r6, r7);
        defpackage.bjd.a();
        r5 = 0;
    L_0x01a9:
        r6 = r0.s;
        r6 = r6.c;
        r6 = r6.size();
        if (r5 >= r6) goto L_0x0339;
    L_0x01b3:
        r6 = r0.s;
        r6 = r6.c;
        r6 = r6.get(r5);
        r6 = (defpackage.bng) r6;
        r7 = r0.s;
        r7 = r7.a;
        r7 = r7.get(r5);
        r7 = (defpackage.blj) r7;
        r8 = r0.s;
        r8 = r8.b;
        r8 = r8.get(r5);
        r8 = (defpackage.blj) r8;
        r9 = r6.d;
        r10 = r9 + -1;
        if (r9 == 0) goto L_0x0338;
    L_0x01d7:
        r9 = 1076048691; // 0x40233333 float:2.55 double:5.316386915E-315;
        if (r10 == 0) goto L_0x02c7;
    L_0x01dc:
        r12 = 1;
        if (r10 == r12) goto L_0x025c;
    L_0x01df:
        r13 = 2;
        if (r10 == r13) goto L_0x01e4;
    L_0x01e2:
        goto L_0x0334;
    L_0x01e4:
        r6 = r6.c;
        if (r6 != 0) goto L_0x021e;
    L_0x01e8:
        r6 = r0.n;
        r10 = r0.j;
        defpackage.bnr.a(r1, r6, r10, r12);
        r6 = r7.f();
        r6 = (android.graphics.Path) r6;
        r7 = r0.g;
        r7.set(r6);
        r6 = r0.g;
        r6.transform(r4);
        r6 = r0.i;
        r7 = r8.f();
        r7 = (java.lang.Integer) r7;
        r7 = r7.intValue();
        r7 = (float) r7;
        r7 = r7 * r9;
        r7 = (int) r7;
        r6.setAlpha(r7);
        r6 = r0.g;
        r7 = r0.i;
        r1.drawPath(r6, r7);
        r17.restore();
        goto L_0x02f6;
    L_0x021e:
        r6 = r0.n;
        r10 = r0.j;
        r12 = 1;
        defpackage.bnr.a(r1, r6, r10, r12);
        r6 = r0.n;
        r10 = r0.i;
        r1.drawRect(r6, r10);
        r6 = r0.k;
        r8 = r8.f();
        r8 = (java.lang.Integer) r8;
        r8 = r8.intValue();
        r8 = (float) r8;
        r8 = r8 * r9;
        r8 = (int) r8;
        r6.setAlpha(r8);
        r6 = r7.f();
        r6 = (android.graphics.Path) r6;
        r7 = r0.g;
        r7.set(r6);
        r6 = r0.g;
        r6.transform(r4);
        r6 = r0.g;
        r7 = r0.k;
        r1.drawPath(r6, r7);
        r17.restore();
        goto L_0x02f6;
    L_0x025c:
        r13 = 2;
        if (r5 != 0) goto L_0x026e;
    L_0x025f:
        r10 = new android.graphics.Paint;
        r10.<init>();
        r12 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r10.setColor(r12);
        r12 = r0.n;
        r1.drawRect(r12, r10);
    L_0x026e:
        r6 = r6.c;
        if (r6 != 0) goto L_0x028a;
    L_0x0272:
        r6 = r7.f();
        r6 = (android.graphics.Path) r6;
        r7 = r0.g;
        r7.set(r6);
        r6 = r0.g;
        r6.transform(r4);
        r6 = r0.g;
        r7 = r0.k;
        r1.drawPath(r6, r7);
        goto L_0x02f6;
    L_0x028a:
        r6 = r0.n;
        r10 = r0.k;
        r12 = 1;
        defpackage.bnr.a(r1, r6, r10, r12);
        r6 = r0.n;
        r10 = r0.i;
        r1.drawRect(r6, r10);
        r6 = r0.k;
        r8 = r8.f();
        r8 = (java.lang.Integer) r8;
        r8 = r8.intValue();
        r8 = (float) r8;
        r8 = r8 * r9;
        r8 = (int) r8;
        r6.setAlpha(r8);
        r6 = r7.f();
        r6 = (android.graphics.Path) r6;
        r7 = r0.g;
        r7.set(r6);
        r6 = r0.g;
        r6.transform(r4);
        r6 = r0.g;
        r7 = r0.k;
        r1.drawPath(r6, r7);
        r17.restore();
        goto L_0x02f6;
    L_0x02c7:
        r13 = 2;
        r6 = r6.c;
        if (r6 != 0) goto L_0x02f8;
    L_0x02cc:
        r6 = r7.f();
        r6 = (android.graphics.Path) r6;
        r7 = r0.g;
        r7.set(r6);
        r6 = r0.g;
        r6.transform(r4);
        r6 = r0.i;
        r7 = r8.f();
        r7 = (java.lang.Integer) r7;
        r7 = r7.intValue();
        r7 = (float) r7;
        r7 = r7 * r9;
        r7 = (int) r7;
        r6.setAlpha(r7);
        r6 = r0.g;
        r7 = r0.i;
        r1.drawPath(r6, r7);
    L_0x02f6:
        r12 = 1;
        goto L_0x0334;
    L_0x02f8:
        r6 = r0.n;
        r10 = r0.i;
        r12 = 1;
        defpackage.bnr.a(r1, r6, r10, r12);
        r6 = r0.n;
        r10 = r0.i;
        r1.drawRect(r6, r10);
        r6 = r7.f();
        r6 = (android.graphics.Path) r6;
        r7 = r0.g;
        r7.set(r6);
        r6 = r0.g;
        r6.transform(r4);
        r6 = r0.i;
        r7 = r8.f();
        r7 = (java.lang.Integer) r7;
        r7 = r7.intValue();
        r7 = (float) r7;
        r7 = r7 * r9;
        r7 = (int) r7;
        r6.setAlpha(r7);
        r6 = r0.g;
        r7 = r0.k;
        r1.drawPath(r6, r7);
        r17.restore();
    L_0x0334:
        r5 = r5 + 1;
        goto L_0x01a9;
    L_0x0338:
        throw r11;
    L_0x0339:
        r17.restore();
        defpackage.bjd.a();
    L_0x033f:
        r4 = r16.c();
        if (r4 == 0) goto L_0x0361;
    L_0x0345:
        r4 = r0.n;
        r5 = r0.l;
        r6 = 0;
        defpackage.bnr.a(r1, r4, r5, r6);
        defpackage.bjd.a();
        r16.a(r17);
        r4 = r0.d;
        r4.a(r1, r2, r3);
        r17.restore();
        defpackage.bjd.a();
        defpackage.bjd.a();
    L_0x0361:
        r17.restore();
        defpackage.bjd.a();
    L_0x0367:
        r1 = defpackage.bjd.a();
        r0.b(r1);
        return;
    L_0x036f:
        defpackage.bjd.a();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bnr.a(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    private final void b(float f) {
        bjj bjj = this.b.a;
    }

    private final void a(Canvas canvas) {
        canvas.drawRect(this.n.left - 4.0f, this.n.top - 4.0f, this.n.right + 1.0f, this.n.bottom + 1.0f, this.m);
        bjd.a();
    }

    private final boolean e() {
        bls bls = this.s;
        return (bls == null || bls.a.isEmpty()) ? false : true;
    }

    public final void a(boolean z) {
        if (z != this.v) {
            this.v = z;
            d();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void a(float f) {
        bma bma = this.f;
        blj blj = bma.e;
        if (blj != null) {
            blj.a(f);
        }
        blj = bma.h;
        if (blj != null) {
            blj.a(f);
        }
        blj = bma.i;
        if (blj != null) {
            blj.a(f);
        }
        blj = bma.a;
        if (blj != null) {
            blj.a(f);
        }
        blj = bma.b;
        if (blj != null) {
            blj.a(f);
        }
        blj = bma.c;
        if (blj != null) {
            blj.a(f);
        }
        blj = bma.d;
        if (blj != null) {
            blj.a(f);
        }
        blo blo = bma.f;
        if (blo != null) {
            blo.a(f);
        }
        blo blo2 = bma.g;
        if (blo2 != null) {
            blo2.a(f);
        }
        int i = 0;
        if (this.s != null) {
            for (int i2 = 0; i2 < this.s.a.size(); i2++) {
                ((blj) this.s.a.get(i2)).a(f);
            }
        }
        float f2 = this.c.l;
        if (f2 != 0.0f) {
            f /= f2;
        }
        bnr bnr = this.d;
        if (bnr != null) {
            bnr.a(bnr.c.l * f);
        }
        while (i < this.u.size()) {
            ((blj) this.u.get(i)).a(f);
            i++;
        }
    }

    private final void f() {
        if (this.t == null) {
            if (this.e == null) {
                this.t = Collections.emptyList();
                return;
            }
            this.t = new ArrayList();
            for (Object obj = this.e; obj != null; obj = obj.e) {
                this.t.add(obj);
            }
        }
    }

    public final String b() {
        return this.c.c;
    }

    public final void a(bmi bmi, int i, List list, bmi bmi2) {
        if (bmi.a(b(), i)) {
            if (!"__container".equals(b())) {
                bmi2 = bmi2.a(b());
                if (bmi.c(b(), i)) {
                    list.add(bmi2.a((bmh) this));
                }
            }
            if (bmi.d(b(), i)) {
                b(bmi, i + bmi.b(b(), i), list, bmi2);
            }
        }
    }

    public void a(Object obj, bph bph) {
        this.f.a(obj, bph);
    }
}
