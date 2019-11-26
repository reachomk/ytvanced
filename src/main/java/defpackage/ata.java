package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ata */
public final class ata extends apk implements apq {
    private int A = 0;
    private List B;
    private List C;
    private apf D = null;
    public final List a = new ArrayList();
    public aqj b = null;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public int k = -1;
    public final atg l;
    public int m;
    public final List n = new ArrayList();
    public int o;
    public RecyclerView p;
    public final Runnable q = new asz(this);
    public VelocityTracker r;
    public View s = null;
    public int t = -1;
    public aan u;
    public ath v;
    public final aps w = new atc(this);
    public Rect x;
    public long y;
    private final float[] z = new float[2];

    public ata(atg atg) {
        this.l = atg;
    }

    public final void a() {
    }

    private static boolean a(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    private final void a(float[] fArr) {
        if ((this.m & 12) != 0) {
            fArr[0] = (this.i + this.g) - ((float) this.b.a.getLeft());
        } else {
            fArr[0] = this.b.a.getTranslationX();
        }
        if ((this.m & 3) != 0) {
            fArr[1] = (this.j + this.h) - ((float) this.b.a.getTop());
        } else {
            fArr[1] = this.b.a.getTranslationY();
        }
    }

    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i;
        if (this.b != null) {
            a(this.z);
        }
        aqj aqj = this.b;
        List list = this.n;
        int size = list.size();
        Object obj = null;
        for (i = 0; i < size; i++) {
            atk atk = (atk) list.get(i);
            int save = canvas.save();
            View view = atk.e.a;
            canvas.restoreToCount(save);
        }
        if (aqj != null) {
            i = canvas.save();
            View view2 = aqj.a;
            canvas.restoreToCount(i);
        }
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            atk atk2 = (atk) list.get(size);
            if (!atk2.l) {
                obj = 1;
            } else if (!atk2.h) {
                list.remove(size);
            }
        }
        if (obj != null) {
            recyclerView.invalidate();
        }
    }

    public final void a(Canvas canvas, RecyclerView recyclerView) {
        float f;
        this.t = -1;
        float f2 = 0.0f;
        if (this.b != null) {
            a(this.z);
            float[] fArr = this.z;
            f2 = fArr[0];
            f = fArr[1];
        } else {
            f = 0.0f;
        }
        aqj aqj = this.b;
        List list = this.n;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            atk atk = (atk) list.get(i);
            float f3 = atk.a;
            float f4 = atk.c;
            if (f3 == f4) {
                atk.i = atk.e.a.getTranslationX();
            } else {
                atk.i = f3 + (atk.m * (f4 - f3));
            }
            f3 = atk.b;
            f4 = atk.d;
            if (f3 == f4) {
                atk.j = atk.e.a.getTranslationY();
            } else {
                atk.j = f3 + (atk.m * (f4 - f3));
            }
            int save = canvas.save();
            atg.a(recyclerView, atk.e, atk.i, atk.j, false);
            canvas.restoreToCount(save);
        }
        if (aqj != null) {
            int save2 = canvas.save();
            atg.a(recyclerView, aqj, f2, f, true);
            canvas.restoreToCount(save2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d2 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d2 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d2 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x013d  */
    /* JADX WARNING: Missing block: B:30:0x009c, code skipped:
            if (r0 > 0) goto L_0x00ac;
     */
    public final void a(defpackage.aqj r20, int r21) {
        /*
        r19 = this;
        r10 = r19;
        r11 = r20;
        r12 = r21;
        r0 = r10.b;
        if (r11 != r0) goto L_0x0010;
    L_0x000a:
        r0 = r10.A;
        if (r12 == r0) goto L_0x000f;
    L_0x000e:
        goto L_0x0010;
    L_0x000f:
        return;
    L_0x0010:
        r0 = -9223372036854775808;
        r10.y = r0;
        r3 = r10.A;
        r13 = 1;
        r10.a(r11, r13);
        r10.A = r12;
        r14 = 2;
        if (r12 == r14) goto L_0x0020;
    L_0x001f:
        goto L_0x003e;
    L_0x0020:
        if (r11 == 0) goto L_0x01b7;
    L_0x0022:
        r0 = r11.a;
        r10.s = r0;
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 21;
        if (r0 >= r1) goto L_0x003e;
    L_0x002c:
        r0 = r10.D;
        if (r0 != 0) goto L_0x0037;
    L_0x0030:
        r0 = new atd;
        r0.<init>(r10);
        r10.D = r0;
    L_0x0037:
        r0 = r10.p;
        r1 = r10.D;
        r0.a(r1);
    L_0x003e:
        r0 = r12 << 3;
        r15 = 8;
        r0 = r0 + r15;
        r0 = r13 << r0;
        r16 = r0 + -1;
        r9 = r10.b;
        r8 = 0;
        if (r9 == 0) goto L_0x015e;
    L_0x004c:
        r0 = r9.a;
        r0 = r0.getParent();
        if (r0 != 0) goto L_0x005f;
    L_0x0054:
        r0 = r9.a;
        r10.b(r0);
        defpackage.atg.b(r9);
        r1 = 0;
        goto L_0x015a;
    L_0x005f:
        if (r3 != r14) goto L_0x0064;
    L_0x0061:
        r7 = 0;
        goto L_0x00cb;
    L_0x0064:
        r0 = r10.A;
        if (r0 == r14) goto L_0x0061;
    L_0x0068:
        r0 = r10.l;
        r1 = r10.p;
        r0 = r0.a(r1, r9);
        r1 = r10.p;
        r1 = defpackage.abe.g(r1);
        r1 = defpackage.atg.c(r0, r1);
        r1 = r1 >> r15;
        r1 = r1 & 255;
        if (r1 == 0) goto L_0x0061;
    L_0x007f:
        r0 = r0 >> r15;
        r0 = r0 & 255;
        r2 = r10.g;
        r2 = java.lang.Math.abs(r2);
        r4 = r10.h;
        r4 = java.lang.Math.abs(r4);
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 <= 0) goto L_0x00ae;
    L_0x0092:
        r2 = r10.b(r1);
        if (r2 > 0) goto L_0x009f;
    L_0x0098:
        r0 = r10.c(r1);
        if (r0 <= 0) goto L_0x0061;
    L_0x009e:
        goto L_0x00ac;
    L_0x009f:
        r0 = r0 & r2;
        if (r0 != 0) goto L_0x00ca;
    L_0x00a2:
        r0 = r10.p;
        r0 = defpackage.abe.g(r0);
        r0 = defpackage.atg.a(r2, r0);
    L_0x00ac:
        r7 = r0;
        goto L_0x00cb;
    L_0x00ae:
        r2 = r10.c(r1);
        if (r2 > 0) goto L_0x00ca;
    L_0x00b4:
        r1 = r10.b(r1);
        if (r1 <= 0) goto L_0x0061;
    L_0x00ba:
        r0 = r0 & r1;
        if (r0 != 0) goto L_0x00c8;
    L_0x00bd:
        r0 = r10.p;
        r0 = defpackage.abe.g(r0);
        r0 = defpackage.atg.a(r1, r0);
        goto L_0x00ac;
    L_0x00c8:
        r7 = r1;
        goto L_0x00cb;
    L_0x00ca:
        r7 = r2;
    L_0x00cb:
        r19.c();
        r0 = 4;
        r1 = 0;
        if (r7 == r13) goto L_0x00f5;
    L_0x00d2:
        if (r7 == r14) goto L_0x00f5;
    L_0x00d4:
        if (r7 == r0) goto L_0x00e4;
    L_0x00d6:
        if (r7 == r15) goto L_0x00e4;
    L_0x00d8:
        r2 = 16;
        if (r7 == r2) goto L_0x00e4;
    L_0x00dc:
        r2 = 32;
        if (r7 == r2) goto L_0x00e4;
    L_0x00e0:
        r6 = 0;
    L_0x00e1:
        r17 = 0;
        goto L_0x0107;
    L_0x00e4:
        r2 = r10.g;
        r2 = java.lang.Math.signum(r2);
        r4 = r10.p;
        r4 = r4.getWidth();
        r4 = (float) r4;
        r2 = r2 * r4;
        r6 = r2;
        goto L_0x00e1;
    L_0x00f5:
        r2 = r10.h;
        r2 = java.lang.Math.signum(r2);
        r4 = r10.p;
        r4 = r4.getHeight();
        r4 = (float) r4;
        r2 = r2 * r4;
        r17 = r2;
        r6 = 0;
    L_0x0107:
        if (r3 != r14) goto L_0x010c;
    L_0x0109:
        r5 = 8;
        goto L_0x0111;
    L_0x010c:
        if (r7 > 0) goto L_0x0110;
    L_0x010e:
        r5 = 4;
        goto L_0x0111;
    L_0x0110:
        r5 = 2;
    L_0x0111:
        r0 = r10.z;
        r10.a(r0);
        r0 = r10.z;
        r4 = r0[r8];
        r18 = r0[r13];
        r2 = new atb;
        r0 = r2;
        r1 = r19;
        r13 = r2;
        r2 = r9;
        r14 = r5;
        r5 = r18;
        r18 = r7;
        r7 = r17;
        r8 = r18;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9);
        r0 = r10.p;
        r0 = r0.D;
        if (r0 != 0) goto L_0x013d;
    L_0x0135:
        if (r14 != r15) goto L_0x013a;
    L_0x0137:
        r0 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        goto L_0x0144;
    L_0x013a:
        r0 = 250; // 0xfa float:3.5E-43 double:1.235E-321;
        goto L_0x0144;
    L_0x013d:
        if (r14 != r15) goto L_0x0142;
    L_0x013f:
        r0 = r0.k;
        goto L_0x0144;
    L_0x0142:
        r0 = r0.j;
    L_0x0144:
        r2 = r13.g;
        r2.setDuration(r0);
        r0 = r10.n;
        r0.add(r13);
        r0 = r13.e;
        r1 = 0;
        r0.a(r1);
        r0 = r13.g;
        r0.start();
        r8 = 1;
    L_0x015a:
        r0 = 0;
        r10.b = r0;
        goto L_0x0160;
    L_0x015e:
        r1 = 0;
        r8 = 0;
    L_0x0160:
        if (r11 == 0) goto L_0x0191;
    L_0x0162:
        r0 = r10.l;
        r2 = r10.p;
        r0 = r0.b(r2, r11);
        r0 = r0 & r16;
        r2 = r10.A;
        r2 = r2 << 3;
        r0 = r0 >> r2;
        r10.m = r0;
        r0 = r11.a;
        r0 = r0.getLeft();
        r0 = (float) r0;
        r10.i = r0;
        r0 = r11.a;
        r0 = r0.getTop();
        r0 = (float) r0;
        r10.j = r0;
        r10.b = r11;
        r0 = 2;
        if (r12 != r0) goto L_0x0191;
    L_0x018a:
        r0 = r10.b;
        r0 = r0.a;
        r0.performHapticFeedback(r1);
    L_0x0191:
        r0 = r10.p;
        r0 = r0.getParent();
        if (r0 == 0) goto L_0x01a1;
    L_0x0199:
        r2 = r10.b;
        if (r2 == 0) goto L_0x019e;
    L_0x019d:
        r1 = 1;
    L_0x019e:
        r0.requestDisallowInterceptTouchEvent(r1);
    L_0x01a1:
        if (r8 != 0) goto L_0x01aa;
    L_0x01a3:
        r0 = r10.p;
        r0 = r0.n;
        r1 = 1;
        r0.n = r1;
    L_0x01aa:
        r0 = r10.l;
        r1 = r10.b;
        r0.a(r1);
        r0 = r10.p;
        r0.invalidate();
        return;
    L_0x01b7:
        r0 = new java.lang.IllegalArgumentException;
        r1 = "Must pass a ViewHolder when dragging";
        r0.<init>(r1);
        goto L_0x01c0;
    L_0x01bf:
        throw r0;
    L_0x01c0:
        goto L_0x01bf;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ata.a(aqj, int):void");
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01e2  */
    public final void a(defpackage.aqj r21) {
        /*
        r20 = this;
        r0 = r20;
        r1 = r21;
        r2 = r0.p;
        r2 = r2.isLayoutRequested();
        if (r2 != 0) goto L_0x028c;
    L_0x000c:
        r2 = r0.A;
        r3 = 2;
        if (r2 != r3) goto L_0x028c;
    L_0x0011:
        r2 = r0.i;
        r4 = r0.g;
        r2 = r2 + r4;
        r2 = (int) r2;
        r4 = r0.j;
        r5 = r0.h;
        r4 = r4 + r5;
        r4 = (int) r4;
        r5 = r1.a;
        r5 = r5.getTop();
        r5 = r4 - r5;
        r5 = java.lang.Math.abs(r5);
        r5 = (float) r5;
        r6 = r1.a;
        r6 = r6.getHeight();
        r6 = (float) r6;
        r7 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r6 = r6 * r7;
        r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1));
        if (r5 >= 0) goto L_0x0055;
    L_0x0039:
        r5 = r1.a;
        r5 = r5.getLeft();
        r5 = r2 - r5;
        r5 = java.lang.Math.abs(r5);
        r5 = (float) r5;
        r6 = r1.a;
        r6 = r6.getWidth();
        r6 = (float) r6;
        r6 = r6 * r7;
        r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1));
        if (r5 < 0) goto L_0x0054;
    L_0x0053:
        goto L_0x0055;
    L_0x0054:
        return;
    L_0x0055:
        r5 = r0.B;
        if (r5 != 0) goto L_0x0068;
    L_0x0059:
        r5 = new java.util.ArrayList;
        r5.<init>();
        r0.B = r5;
        r5 = new java.util.ArrayList;
        r5.<init>();
        r0.C = r5;
        goto L_0x0070;
    L_0x0068:
        r5.clear();
        r5 = r0.C;
        r5.clear();
    L_0x0070:
        r5 = r0.i;
        r6 = r0.g;
        r5 = r5 + r6;
        r5 = java.lang.Math.round(r5);
        r6 = r0.j;
        r7 = r0.h;
        r6 = r6 + r7;
        r6 = java.lang.Math.round(r6);
        r7 = r1.a;
        r7 = r7.getWidth();
        r7 = r7 + r5;
        r8 = r1.a;
        r8 = r8.getHeight();
        r8 = r8 + r6;
        r9 = r5 + r7;
        r9 = r9 / r3;
        r10 = r6 + r8;
        r10 = r10 / r3;
        r11 = r0.p;
        r11 = r11.n;
        r12 = r11.w();
        r14 = 0;
    L_0x009f:
        if (r14 >= r12) goto L_0x013b;
    L_0x00a1:
        r15 = r11.i(r14);
        r13 = r1.a;
        if (r15 != r13) goto L_0x00af;
    L_0x00a9:
        r17 = r5;
        r18 = r6;
        goto L_0x0132;
    L_0x00af:
        r13 = r15.getBottom();
        if (r13 < r6) goto L_0x00a9;
    L_0x00b5:
        r13 = r15.getTop();
        if (r13 > r8) goto L_0x00a9;
    L_0x00bb:
        r13 = r15.getRight();
        if (r13 < r5) goto L_0x00a9;
    L_0x00c1:
        r13 = r15.getLeft();
        if (r13 > r7) goto L_0x00a9;
    L_0x00c7:
        r13 = r0.p;
        r13 = r13.a(r15);
        r3 = r0.l;
        r17 = r5;
        r5 = r0.p;
        r18 = r6;
        r6 = r0.b;
        r3 = r3.a(r5, r6, r13);
        if (r3 == 0) goto L_0x0132;
    L_0x00dd:
        r3 = r15.getLeft();
        r5 = r15.getRight();
        r3 = r3 + r5;
        r5 = 2;
        r3 = r3 / r5;
        r3 = r9 - r3;
        r3 = java.lang.Math.abs(r3);
        r6 = r15.getTop();
        r15 = r15.getBottom();
        r6 = r6 + r15;
        r6 = r6 / r5;
        r6 = r10 - r6;
        r6 = java.lang.Math.abs(r6);
        r3 = r3 * r3;
        r6 = r6 * r6;
        r3 = r3 + r6;
        r6 = r0.B;
        r6 = r6.size();
        r5 = 0;
        r15 = 0;
    L_0x010b:
        if (r15 >= r6) goto L_0x0124;
    L_0x010d:
        r19 = r6;
        r6 = r0.C;
        r6 = r6.get(r15);
        r6 = (java.lang.Integer) r6;
        r6 = r6.intValue();
        if (r3 <= r6) goto L_0x0124;
    L_0x011d:
        r5 = r5 + 1;
        r15 = r15 + 1;
        r6 = r19;
        goto L_0x010b;
    L_0x0124:
        r6 = r0.B;
        r6.add(r5, r13);
        r6 = r0.C;
        r3 = java.lang.Integer.valueOf(r3);
        r6.add(r5, r3);
    L_0x0132:
        r14 = r14 + 1;
        r5 = r17;
        r6 = r18;
        r3 = 2;
        goto L_0x009f;
    L_0x013b:
        r3 = r0.B;
        r5 = r3.size();
        if (r5 == 0) goto L_0x028c;
    L_0x0143:
        r5 = r1.a;
        r5 = r5.getWidth();
        r5 = r5 + r2;
        r6 = r1.a;
        r6 = r6.getHeight();
        r6 = r6 + r4;
        r7 = r1.a;
        r7 = r7.getLeft();
        r7 = r2 - r7;
        r8 = r1.a;
        r8 = r8.getTop();
        r8 = r4 - r8;
        r9 = r3.size();
        r10 = 0;
        r11 = -1;
        r11 = r10;
        r10 = 0;
        r12 = -1;
    L_0x016a:
        if (r10 >= r9) goto L_0x020a;
    L_0x016c:
        r13 = r3.get(r10);
        r13 = (defpackage.aqj) r13;
        if (r7 <= 0) goto L_0x0197;
    L_0x0174:
        r14 = r13.a;
        r14 = r14.getRight();
        r14 = r14 - r5;
        if (r14 >= 0) goto L_0x0197;
    L_0x017d:
        r15 = r13.a;
        r15 = r15.getRight();
        r16 = r3;
        r3 = r1.a;
        r3 = r3.getRight();
        if (r15 > r3) goto L_0x018e;
    L_0x018d:
        goto L_0x0199;
    L_0x018e:
        r3 = java.lang.Math.abs(r14);
        if (r3 > r12) goto L_0x0195;
    L_0x0194:
        goto L_0x0199;
    L_0x0195:
        r11 = r13;
        goto L_0x019a;
    L_0x0197:
        r16 = r3;
    L_0x0199:
        r3 = r12;
    L_0x019a:
        if (r7 >= 0) goto L_0x01bd;
    L_0x019c:
        r12 = r13.a;
        r12 = r12.getLeft();
        r12 = r12 - r2;
        if (r12 <= 0) goto L_0x01bd;
    L_0x01a5:
        r14 = r13.a;
        r14 = r14.getLeft();
        r15 = r1.a;
        r15 = r15.getLeft();
        if (r14 < r15) goto L_0x01b4;
    L_0x01b3:
        goto L_0x01bd;
    L_0x01b4:
        r12 = java.lang.Math.abs(r12);
        if (r12 > r3) goto L_0x01bb;
    L_0x01ba:
        goto L_0x01bd;
    L_0x01bb:
        r3 = r12;
        r11 = r13;
    L_0x01bd:
        if (r8 >= 0) goto L_0x01e0;
    L_0x01bf:
        r12 = r13.a;
        r12 = r12.getTop();
        r12 = r12 - r4;
        if (r12 <= 0) goto L_0x01e0;
    L_0x01c8:
        r14 = r13.a;
        r14 = r14.getTop();
        r15 = r1.a;
        r15 = r15.getTop();
        if (r14 < r15) goto L_0x01d7;
    L_0x01d6:
        goto L_0x01e0;
    L_0x01d7:
        r12 = java.lang.Math.abs(r12);
        if (r12 > r3) goto L_0x01de;
    L_0x01dd:
        goto L_0x01e0;
    L_0x01de:
        r3 = r12;
        r11 = r13;
    L_0x01e0:
        if (r8 <= 0) goto L_0x0203;
    L_0x01e2:
        r12 = r13.a;
        r12 = r12.getBottom();
        r12 = r12 - r6;
        if (r12 >= 0) goto L_0x0203;
    L_0x01eb:
        r14 = r13.a;
        r14 = r14.getBottom();
        r15 = r1.a;
        r15 = r15.getBottom();
        if (r14 > r15) goto L_0x01fa;
    L_0x01f9:
        goto L_0x0203;
    L_0x01fa:
        r12 = java.lang.Math.abs(r12);
        if (r12 > r3) goto L_0x0201;
    L_0x0200:
        goto L_0x0203;
    L_0x0201:
        r11 = r13;
        goto L_0x0204;
    L_0x0203:
        r12 = r3;
    L_0x0204:
        r10 = r10 + 1;
        r3 = r16;
        goto L_0x016a;
    L_0x020a:
        if (r11 == 0) goto L_0x0282;
    L_0x020c:
        r2 = r11.d();
        r21.d();
        r3 = r0.l;
        r4 = r0.p;
        r3 = r3.b(r4, r1, r11);
        if (r3 == 0) goto L_0x0281;
    L_0x021d:
        r3 = r0.p;
        r4 = r3.n;
        r5 = r4 instanceof defpackage.atm;
        if (r5 == 0) goto L_0x022f;
    L_0x0225:
        r4 = (defpackage.atm) r4;
        r1 = r1.a;
        r2 = r11.a;
        r4.a(r1, r2);
        goto L_0x0281;
    L_0x022f:
        r1 = r4.k();
        if (r1 == 0) goto L_0x0258;
    L_0x0235:
        r1 = r11.a;
        r1 = defpackage.apn.h(r1);
        r5 = r3.getPaddingLeft();
        if (r1 > r5) goto L_0x0244;
    L_0x0241:
        r3.c(r2);
    L_0x0244:
        r1 = r11.a;
        r1 = defpackage.apn.j(r1);
        r5 = r3.getWidth();
        r6 = r3.getPaddingRight();
        r5 = r5 - r6;
        if (r1 < r5) goto L_0x0258;
    L_0x0255:
        r3.c(r2);
    L_0x0258:
        r1 = r4.l();
        if (r1 == 0) goto L_0x0281;
    L_0x025e:
        r1 = r11.a;
        r1 = defpackage.apn.i(r1);
        r4 = r3.getPaddingTop();
        if (r1 > r4) goto L_0x026d;
    L_0x026a:
        r3.c(r2);
    L_0x026d:
        r1 = r11.a;
        r1 = defpackage.apn.k(r1);
        r4 = r3.getHeight();
        r5 = r3.getPaddingBottom();
        r4 = r4 - r5;
        if (r1 < r4) goto L_0x0281;
    L_0x027e:
        r3.c(r2);
    L_0x0281:
        return;
    L_0x0282:
        r1 = r0.B;
        r1.clear();
        r1 = r0.C;
        r1.clear();
    L_0x028c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ata.a(aqj):void");
    }

    public final void a(View view) {
        b(view);
        aqj a = this.p.a(view);
        if (a != null) {
            aqj aqj = this.b;
            if (aqj != null && a == aqj) {
                a(null, 0);
                return;
            }
            a(a, false);
            if (this.a.remove(a.a)) {
                atg.b(a);
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(aqj aqj, boolean z) {
        atk atk;
        int size = this.n.size();
        do {
            size--;
            if (size >= 0) {
                atk = (atk) this.n.get(size);
            } else {
                return;
            }
        } while (atk.e != aqj);
        atk.k |= z;
        if (!atk.l) {
            atk.g.cancel();
        }
        this.n.remove(size);
    }

    public final void a(Rect rect, View view, RecyclerView recyclerView, aqh aqh) {
        rect.setEmpty();
    }

    public final void b() {
        VelocityTracker velocityTracker = this.r;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.r = VelocityTracker.obtain();
    }

    public final void c() {
        VelocityTracker velocityTracker = this.r;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.r = null;
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(int i) {
        if (this.b == null && i == 2 && this.A != 2) {
            this.l.b();
        }
    }

    /* Access modifiers changed, original: final */
    public final View a(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        aqj aqj = this.b;
        if (aqj != null) {
            View view = aqj.a;
            if (ata.a(view, x, y, this.i + this.g, this.j + this.h)) {
                return view;
            }
        }
        int size = this.n.size();
        while (true) {
            size--;
            if (size < 0) {
                return this.p.a(x, y);
            }
            atk atk = (atk) this.n.get(size);
            View view2 = atk.e.a;
            if (ata.a(view2, x, y, atk.i, atk.j)) {
                return view2;
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        x -= this.c;
        this.g = x;
        this.h = y - this.d;
        if ((i & 4) == 0) {
            x = Math.max(0.0f, x);
            this.g = x;
        }
        if ((i & 8) == 0) {
            this.g = Math.min(0.0f, x);
        }
        if ((i & 1) == 0) {
            this.h = Math.max(0.0f, this.h);
        }
        if ((i & 2) == 0) {
            this.h = Math.min(0.0f, this.h);
        }
    }

    private final int b(int i) {
        if ((i & 12) != 0) {
            int i2 = 8;
            int i3 = this.g > 0.0f ? 8 : 4;
            VelocityTracker velocityTracker = this.r;
            if (velocityTracker != null && this.k >= 0) {
                velocityTracker.computeCurrentVelocity(1000, this.f);
                float xVelocity = this.r.getXVelocity(this.k);
                float yVelocity = this.r.getYVelocity(this.k);
                if (xVelocity <= 0.0f) {
                    i2 = 4;
                }
                float abs = Math.abs(xVelocity);
                if ((i2 & i) != 0 && i3 == i2 && abs >= this.e && abs > Math.abs(yVelocity)) {
                    return i2;
                }
            }
            float width = ((float) this.p.getWidth()) * 0.5f;
            if ((i & i3) != 0 && Math.abs(this.g) > width) {
                return i3;
            }
        }
        return 0;
    }

    private final int c(int i) {
        if ((i & 3) != 0) {
            int i2 = 2;
            int i3 = this.h > 0.0f ? 2 : 1;
            VelocityTracker velocityTracker = this.r;
            if (velocityTracker != null && this.k >= 0) {
                velocityTracker.computeCurrentVelocity(1000, this.f);
                float xVelocity = this.r.getXVelocity(this.k);
                float yVelocity = this.r.getYVelocity(this.k);
                if (yVelocity <= 0.0f) {
                    i2 = 1;
                }
                float abs = Math.abs(yVelocity);
                if ((i2 & i) != 0 && i2 == i3 && abs >= this.e && abs > Math.abs(xVelocity)) {
                    return i2;
                }
            }
            float height = ((float) this.p.getHeight()) * 0.5f;
            if ((i & i3) != 0 && Math.abs(this.h) > height) {
                return i3;
            }
        }
        return 0;
    }

    /* Access modifiers changed, original: final */
    public final void b(View view) {
        if (view == this.s) {
            this.s = null;
            if (this.D != null) {
                this.p.a(null);
            }
        }
    }
}
