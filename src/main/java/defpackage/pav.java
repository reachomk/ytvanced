package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: pav */
public final class pav {
    public final pau a;
    private boolean[] b;

    public pav(pau pau) {
        this.a = pau;
    }

    public final List a(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            pat pat = (pat) this.a.a(i2).getLayoutParams();
            pax pax = new pax();
            pax.b = pat.c();
            pax.a = i2;
            arrayList.add(pax);
        }
        return arrayList;
    }

    public static int[] a(int i, List list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        int i2 = 0;
        for (pax pax : list) {
            int i3 = pax.a;
            iArr[i2] = i3;
            sparseIntArray.append(i3, pax.b);
            i2++;
        }
        return iArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:72:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x02f2  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0308 A:{SYNTHETIC, EDGE_INSN: B:89:0x0308->B:87:0x0308 ?: BREAK  } */
    /* JADX WARNING: Missing block: B:54:0x01c3, code skipped:
            if (r2 < (r5 + r10)) goto L_0x01cc;
     */
    public final void a(defpackage.pay r28, int r29, int r30) {
        /*
        r27 = this;
        r0 = r27;
        r1 = r28;
        r2 = r29;
        r3 = r30;
        r4 = r0.a;
        r4 = r4.f();
        r5 = android.view.View.MeasureSpec.getMode(r29);
        r6 = android.view.View.MeasureSpec.getSize(r29);
        r7 = new java.util.ArrayList;
        r7.<init>();
        r1.a = r7;
        if (r4 == 0) goto L_0x0026;
    L_0x001f:
        r8 = r0.a;
        r8 = r8.getPaddingStart();
        goto L_0x002c;
    L_0x0026:
        r8 = r0.a;
        r8 = r8.getPaddingTop();
    L_0x002c:
        if (r4 == 0) goto L_0x0035;
    L_0x002e:
        r9 = r0.a;
        r9 = r9.getPaddingEnd();
        goto L_0x003b;
    L_0x0035:
        r9 = r0.a;
        r9 = r9.getPaddingBottom();
    L_0x003b:
        if (r4 == 0) goto L_0x0044;
    L_0x003d:
        r10 = r0.a;
        r10 = r10.getPaddingTop();
        goto L_0x004a;
    L_0x0044:
        r10 = r0.a;
        r10 = r10.getPaddingStart();
    L_0x004a:
        if (r4 == 0) goto L_0x0053;
    L_0x004c:
        r11 = r0.a;
        r11 = r11.getPaddingBottom();
        goto L_0x0059;
    L_0x0053:
        r11 = r0.a;
        r11 = r11.getPaddingEnd();
    L_0x0059:
        r12 = new paw;
        r12.<init>();
        r13 = 0;
        r12.o = r13;
        r8 = r8 + r9;
        r12.e = r8;
        r9 = r0.a;
        r9 = r9.a();
        r14 = r12;
        r1 = 0;
        r12 = 0;
        r15 = 0;
        r16 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
    L_0x0070:
        if (r12 >= r9) goto L_0x0307;
    L_0x0072:
        r18 = r1;
        r1 = r0.a;
        r1 = r1.b(r12);
        if (r1 != 0) goto L_0x008a;
    L_0x007c:
        r1 = defpackage.pav.a(r12, r9, r14);
        if (r1 == 0) goto L_0x0085;
    L_0x0082:
        r0.a(r7, r14, r13);
    L_0x0085:
        r20 = r10;
        r19 = r15;
        goto L_0x00aa;
    L_0x008a:
        r19 = r15;
        r15 = r1.getVisibility();
        r3 = 8;
        r20 = r10;
        r10 = 1;
        if (r15 != r3) goto L_0x00b6;
    L_0x0097:
        r1 = r14.i;
        r1 = r1 + r10;
        r14.i = r1;
        r1 = r14.h;
        r1 = r1 + r10;
        r14.h = r1;
        r1 = defpackage.pav.a(r12, r9, r14);
        if (r1 == 0) goto L_0x00aa;
    L_0x00a7:
        r0.a(r7, r14, r13);
    L_0x00aa:
        r25 = r5;
        r2 = r6;
        r1 = r9;
        r17 = r11;
        r15 = r19;
        r6 = r30;
        goto L_0x02f6;
    L_0x00b6:
        r3 = r1.getLayoutParams();
        r3 = (defpackage.pat) r3;
        r15 = r3.f();
        r10 = 4;
        if (r15 != r10) goto L_0x00cc;
    L_0x00c3:
        r10 = r14.n;
        r15 = java.lang.Integer.valueOf(r12);
        r10.add(r15);
    L_0x00cc:
        if (r4 == 0) goto L_0x00d3;
    L_0x00ce:
        r10 = r3.a();
        goto L_0x00d7;
    L_0x00d3:
        r10 = r3.b();
    L_0x00d7:
        r15 = r3.l();
        r22 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r15 = (r15 > r22 ? 1 : (r15 == r22 ? 0 : -1));
        if (r15 == 0) goto L_0x00f0;
    L_0x00e1:
        r15 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r5 != r15) goto L_0x00f0;
    L_0x00e5:
        r10 = (float) r6;
        r15 = r3.l();
        r10 = r10 * r15;
        r10 = java.lang.Math.round(r10);
    L_0x00f0:
        if (r4 == 0) goto L_0x012e;
    L_0x00f2:
        r15 = r0.a;
        r22 = r9;
        r9 = 1;
        r21 = defpackage.pav.b(r3, r9);
        r21 = r8 + r21;
        r23 = defpackage.pav.c(r3, r9);
        r9 = r21 + r23;
        r9 = r15.a(r2, r9, r10);
        r10 = r0.a;
        r15 = r20 + r11;
        r23 = r6;
        r6 = 1;
        r21 = defpackage.pav.d(r3, r6);
        r15 = r15 + r21;
        r21 = defpackage.pav.e(r3, r6);
        r15 = r15 + r21;
        r15 = r15 + r13;
        r24 = r12;
        r12 = defpackage.pav.a(r3, r6);
        r6 = r30;
        r10 = r10.b(r6, r15, r12);
        r1.measure(r9, r10);
        r25 = r5;
        r12 = 0;
        goto L_0x0167;
    L_0x012e:
        r23 = r6;
        r22 = r9;
        r24 = r12;
        r6 = r30;
        r9 = r0.a;
        r12 = 0;
        r15 = defpackage.pav.d(r3, r12);
        r17 = defpackage.pav.e(r3, r12);
        r25 = r5;
        r5 = defpackage.pav.a(r3, r12);
        r26 = r20 + r11;
        r26 = r26 + r15;
        r26 = r26 + r17;
        r15 = r26 + r13;
        r5 = r9.a(r6, r15, r5);
        r9 = r0.a;
        r15 = defpackage.pav.b(r3, r12);
        r15 = r15 + r8;
        r17 = defpackage.pav.c(r3, r12);
        r15 = r15 + r17;
        r9 = r9.b(r2, r15, r10);
        r1.measure(r5, r9);
    L_0x0167:
        r5 = r0.a;
        r5.l();
        r0.a(r1);
        r5 = r1.getMeasuredState();
        r10 = r19;
        r15 = android.view.View.combineMeasuredStates(r10, r5);
        r5 = r14.e;
        r10 = defpackage.pav.a(r1, r4);
        r17 = defpackage.pav.b(r3, r4);
        r10 = r10 + r17;
        r17 = defpackage.pav.c(r3, r4);
        r10 = r10 + r17;
        r17 = r7.size();
        r12 = r0.a;
        r12 = r12.c();
        if (r12 == 0) goto L_0x0245;
    L_0x0197:
        r12 = r3.k();
        r2 = -1;
        if (r12 != 0) goto L_0x01c6;
    L_0x019e:
        if (r25 != 0) goto L_0x01a2;
    L_0x01a0:
        goto L_0x0245;
    L_0x01a2:
        r12 = r0.a;
        r12 = r12.j();
        if (r12 != r2) goto L_0x01ab;
    L_0x01aa:
        goto L_0x01b1;
    L_0x01ab:
        r21 = 1;
        r2 = r17 + 1;
        if (r12 <= r2) goto L_0x0245;
    L_0x01b1:
        r2 = r0.a;
        r17 = r11;
        r11 = r18;
        r12 = r24;
        r2 = r2.a(r12, r11);
        if (r2 <= 0) goto L_0x01c0;
    L_0x01bf:
        r10 = r10 + r2;
    L_0x01c0:
        r5 = r5 + r10;
        r2 = r23;
        if (r2 >= r5) goto L_0x024d;
    L_0x01c5:
        goto L_0x01cc;
    L_0x01c6:
        r17 = r11;
        r2 = r23;
        r12 = r24;
    L_0x01cc:
        r5 = r14.a();
        if (r5 <= 0) goto L_0x01d8;
    L_0x01d2:
        r0.a(r7, r14, r13);
        r5 = r14.g;
        r13 = r13 + r5;
    L_0x01d8:
        if (r4 == 0) goto L_0x0208;
    L_0x01da:
        r5 = r3.b();
        r10 = -1;
        if (r5 != r10) goto L_0x0235;
    L_0x01e1:
        r5 = r0.a;
        r10 = r5.getPaddingTop();
        r11 = r0.a;
        r11 = r11.getPaddingBottom();
        r10 = r10 + r11;
        r11 = r3.n();
        r10 = r10 + r11;
        r11 = r3.p();
        r10 = r10 + r11;
        r10 = r10 + r13;
        r11 = r3.b();
        r5 = r5.b(r6, r10, r11);
        r1.measure(r9, r5);
        r0.a(r1);
        goto L_0x0235;
    L_0x0208:
        r5 = r3.a();
        r10 = -1;
        if (r5 != r10) goto L_0x0235;
    L_0x020f:
        r5 = r0.a;
        r10 = r5.getPaddingLeft();
        r11 = r0.a;
        r11 = r11.getPaddingRight();
        r10 = r10 + r11;
        r11 = r3.m();
        r10 = r10 + r11;
        r11 = r3.o();
        r10 = r10 + r11;
        r10 = r10 + r13;
        r11 = r3.a();
        r5 = r5.a(r6, r10, r11);
        r1.measure(r5, r9);
        r0.a(r1);
    L_0x0235:
        r14 = new paw;
        r14.<init>();
        r5 = 1;
        r14.h = r5;
        r14.e = r8;
        r14.o = r12;
        r5 = 0;
        r9 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        goto L_0x0257;
    L_0x0245:
        r17 = r11;
        r11 = r18;
        r2 = r23;
        r12 = r24;
    L_0x024d:
        r5 = 1;
        r9 = r14.h;
        r9 = r9 + r5;
        r14.h = r9;
        r5 = r11 + 1;
        r9 = r16;
    L_0x0257:
        r10 = r14.e;
        r11 = defpackage.pav.a(r1, r4);
        r16 = defpackage.pav.b(r3, r4);
        r11 = r11 + r16;
        r16 = defpackage.pav.c(r3, r4);
        r11 = r11 + r16;
        r10 = r10 + r11;
        r14.e = r10;
        r10 = r14.j;
        r11 = r3.d();
        r10 = r10 + r11;
        r14.j = r10;
        r10 = r14.k;
        r11 = r3.e();
        r10 = r10 + r11;
        r14.k = r10;
        r10 = r0.a;
        r10.a(r12, r5, r14);
        if (r4 == 0) goto L_0x028a;
    L_0x0285:
        r10 = r1.getMeasuredHeight();
        goto L_0x028e;
    L_0x028a:
        r10 = r1.getMeasuredWidth();
    L_0x028e:
        r11 = defpackage.pav.d(r3, r4);
        r10 = r10 + r11;
        r11 = defpackage.pav.e(r3, r4);
        r10 = r10 + r11;
        r11 = r0.a;
        r11 = r11.g();
        r10 = r10 + r11;
        r9 = java.lang.Math.max(r9, r10);
        r10 = r14.g;
        r10 = java.lang.Math.max(r10, r9);
        r14.g = r10;
        if (r4 == 0) goto L_0x02de;
    L_0x02ad:
        r10 = r0.a;
        r10 = r10.c();
        r11 = 2;
        if (r10 == r11) goto L_0x02c8;
    L_0x02b6:
        r10 = r14.l;
        r1 = r1.getBaseline();
        r3 = r3.n();
        r1 = r1 + r3;
        r1 = java.lang.Math.max(r10, r1);
        r14.l = r1;
        goto L_0x02de;
    L_0x02c8:
        r10 = r14.l;
        r11 = r1.getMeasuredHeight();
        r1 = r1.getBaseline();
        r11 = r11 - r1;
        r1 = r3.p();
        r11 = r11 + r1;
        r1 = java.lang.Math.max(r10, r11);
        r14.l = r1;
    L_0x02de:
        r1 = r22;
        r3 = defpackage.pav.a(r12, r1, r14);
        if (r3 == 0) goto L_0x02ec;
    L_0x02e6:
        r0.a(r7, r14, r13);
        r3 = r14.g;
        r13 = r13 + r3;
    L_0x02ec:
        r3 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r13 <= r3) goto L_0x02f2;
    L_0x02f1:
        goto L_0x0308;
    L_0x02f2:
        r18 = r5;
        r16 = r9;
    L_0x02f6:
        r12 = r12 + 1;
        r9 = r1;
        r3 = r6;
        r11 = r17;
        r1 = r18;
        r10 = r20;
        r5 = r25;
        r6 = r2;
        r2 = r29;
        goto L_0x0070;
    L_0x0307:
        r10 = r15;
    L_0x0308:
        r1 = r28;
        r1.b = r15;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pav.a(pay, int, int):void");
    }

    private static int a(View view, boolean z) {
        if (z) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    private static int a(pat pat, boolean z) {
        if (z) {
            return pat.b();
        }
        return pat.a();
    }

    private static int b(pat pat, boolean z) {
        if (z) {
            return pat.m();
        }
        return pat.n();
    }

    private static int c(pat pat, boolean z) {
        if (z) {
            return pat.o();
        }
        return pat.p();
    }

    private static int d(pat pat, boolean z) {
        if (z) {
            return pat.n();
        }
        return pat.m();
    }

    private static int e(pat pat, boolean z) {
        if (z) {
            return pat.p();
        }
        return pat.o();
    }

    private static boolean a(int i, int i2, paw paw) {
        return i == i2 + -1 && paw.a() != 0;
    }

    private final void a(List list, paw paw, int i) {
        paw.m = i;
        this.a.a(paw);
        list.add(paw);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0041  */
    private final void a(android.view.View r7) {
        /*
        r6 = this;
        r0 = r7.getLayoutParams();
        r0 = (defpackage.pat) r0;
        r1 = r7.getMeasuredWidth();
        r2 = r7.getMeasuredHeight();
        r3 = r0.g();
        r4 = 1;
        if (r1 >= r3) goto L_0x001b;
    L_0x0015:
        r1 = r0.g();
    L_0x0019:
        r3 = 1;
        goto L_0x0028;
    L_0x001b:
        r3 = r0.i();
        if (r1 > r3) goto L_0x0023;
    L_0x0021:
        r3 = 0;
        goto L_0x0028;
    L_0x0023:
        r1 = r0.i();
        goto L_0x0019;
    L_0x0028:
        r5 = r0.h();
        if (r2 >= r5) goto L_0x0033;
    L_0x002e:
        r2 = r0.h();
        goto L_0x003f;
    L_0x0033:
        r5 = r0.j();
        if (r2 > r5) goto L_0x003b;
    L_0x0039:
        r4 = r3;
        goto L_0x003f;
    L_0x003b:
        r2 = r0.j();
    L_0x003f:
        if (r4 == 0) goto L_0x0053;
    L_0x0041:
        r0 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0);
        r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0);
        r7.measure(r1, r0);
        r7 = r6.a;
        r7.l();
    L_0x0053:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pav.a(android.view.View):void");
    }

    public final void a(int i, int i2) {
        int length;
        int i3;
        int a = this.a.a();
        boolean[] zArr = this.b;
        int i4 = 0;
        if (zArr != null) {
            length = zArr.length;
            if (length < a) {
                i3 = length + length;
                if (i3 >= a) {
                    a = i3;
                }
                this.b = new boolean[a];
            } else {
                Arrays.fill(zArr, false);
            }
        } else {
            if (a < 10) {
                a = 10;
            }
            this.b = new boolean[a];
        }
        if (this.a.a() > 0) {
            a = this.a.b();
            i3 = this.a.b();
            if (i3 == 0 || i3 == 1) {
                a = MeasureSpec.getMode(i);
                i3 = MeasureSpec.getSize(i);
                if (a != 1073741824) {
                    i3 = this.a.h();
                }
                a = this.a.getPaddingLeft();
                length = this.a.getPaddingRight();
            } else if (i3 == 2 || i3 == 3) {
                a = MeasureSpec.getMode(i2);
                i3 = MeasureSpec.getSize(i2);
                if (a != 1073741824) {
                    i3 = this.a.h();
                }
                a = this.a.getPaddingTop();
                length = this.a.getPaddingBottom();
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid flex direction: ");
                stringBuilder.append(a);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            a += length;
            List k = this.a.k();
            int size = k.size();
            while (i4 < size) {
                paw paw = (paw) k.get(i4);
                if (paw.e < i3) {
                    a(i, i2, paw, i3, a, false);
                } else {
                    b(i, i2, paw, i3, a, false);
                }
                i4++;
            }
        }
    }

    private final void a(int i, int i2, paw paw, int i3, int i4, boolean z) {
        paw paw2 = paw;
        int i5 = i3;
        float f = paw2.j;
        float f2 = 0.0f;
        if (f > 0.0f) {
            int i6 = paw2.e;
            if (i5 >= i6) {
                int i7;
                float f3 = ((float) (i5 - i6)) / f;
                paw2.e = i4 + paw2.f;
                int i8 = 0;
                if (!z) {
                    paw2.g = aocf.UNSET_ENUM_VALUE;
                }
                Object obj = null;
                int i9 = 0;
                float f4 = 0.0f;
                while (i8 < paw2.h) {
                    i7 = paw2.o + i8;
                    View b = this.a.b(i7);
                    if (b == null || b.getVisibility() == 8) {
                        i7 = i2;
                    } else {
                        int measuredWidth;
                        pat pat = (pat) b.getLayoutParams();
                        int b2 = this.a.b();
                        if (b2 == 0 || b2 == 1) {
                            measuredWidth = b.getMeasuredWidth();
                            b2 = b.getMeasuredHeight();
                            if (this.b[i7]) {
                                i7 = i2;
                            } else if (pat.d() > 0.0f) {
                                f2 = ((float) measuredWidth) + (pat.d() * f3);
                                if (i8 == paw2.h - 1) {
                                    f2 += f4;
                                    f4 = 0.0f;
                                }
                                b2 = Math.round(f2);
                                if (b2 > pat.i()) {
                                    b2 = pat.i();
                                    this.b[i7] = true;
                                    paw2.j -= pat.d();
                                    obj = 1;
                                } else {
                                    f4 += f2 - ((float) b2);
                                    double d = (double) f4;
                                    if (d > 1.0d) {
                                        b2++;
                                        Double.isNaN(d);
                                        d -= 4.0d;
                                    } else if (d < -1.0d) {
                                        b2--;
                                        Double.isNaN(d);
                                        d += 1.0d;
                                    }
                                    f4 = (float) d;
                                }
                                b.measure(MeasureSpec.makeMeasureSpec(b2, 1073741824), b(i2, pat, paw2.m));
                                measuredWidth = b.getMeasuredWidth();
                                b2 = b.getMeasuredHeight();
                                this.a.l();
                            } else {
                                i7 = i2;
                            }
                            i9 = Math.max(i9, ((b2 + pat.n()) + pat.p()) + this.a.g());
                            paw2.e += (measuredWidth + pat.m()) + pat.o();
                            measuredWidth = i9;
                        } else {
                            b2 = b.getMeasuredHeight();
                            int measuredWidth2 = b.getMeasuredWidth();
                            if (!this.b[i7] && pat.d() > f2) {
                                float d2 = ((float) b2) + (pat.d() * f3);
                                if (i8 == paw2.h - 1) {
                                    d2 += f4;
                                    f4 = 0.0f;
                                }
                                int round = Math.round(d2);
                                if (round > pat.j()) {
                                    round = pat.j();
                                    this.b[i7] = true;
                                    paw2.j -= pat.d();
                                    obj = 1;
                                } else {
                                    f4 += d2 - ((float) round);
                                    double d3 = (double) f4;
                                    if (d3 > 1.0d) {
                                        round++;
                                        Double.isNaN(d3);
                                        d3 -= 4.0d;
                                    } else if (d3 < -1.0d) {
                                        round--;
                                        Double.isNaN(d3);
                                        d3 += 1.0d;
                                    }
                                    f4 = (float) d3;
                                }
                                b.measure(a(i, pat, paw2.m), MeasureSpec.makeMeasureSpec(round, 1073741824));
                                measuredWidth2 = b.getMeasuredWidth();
                                b2 = b.getMeasuredHeight();
                                this.a.l();
                            } else {
                                i7 = i;
                            }
                            measuredWidth = Math.max(i9, ((measuredWidth2 + pat.m()) + pat.o()) + this.a.g());
                            paw2.e += (b2 + pat.n()) + pat.p();
                            i7 = i2;
                        }
                        paw2.g = Math.max(paw2.g, measuredWidth);
                        i9 = measuredWidth;
                    }
                    i8++;
                    f2 = 0.0f;
                }
                i7 = i2;
                if (obj != null && i6 != paw2.e) {
                    a(i, i2, paw, i3, i4, true);
                }
            }
        }
    }

    private final void b(int i, int i2, paw paw, int i3, int i4, boolean z) {
        paw paw2 = paw;
        int i5 = i3;
        int i6 = paw2.e;
        float f = paw2.k;
        float f2 = 0.0f;
        if (f > 0.0f && i5 <= i6) {
            int i7;
            int i8;
            float f3 = ((float) (i6 - i5)) / f;
            paw2.e = i4 + paw2.f;
            int i9 = 0;
            if (!z) {
                paw2.g = aocf.UNSET_ENUM_VALUE;
            }
            boolean z2 = false;
            float f4 = 0.0f;
            int i10 = 0;
            while (i9 < paw2.h) {
                int i11;
                i7 = paw2.o + i9;
                View b = this.a.b(i7);
                if (b == null || b.getVisibility() == 8) {
                    i7 = i2;
                    i8 = i6;
                    i11 = i9;
                } else {
                    pat pat = (pat) b.getLayoutParams();
                    int b2 = this.a.b();
                    int i12;
                    double d;
                    if (b2 == 0 || b2 == 1) {
                        i8 = i6;
                        i12 = i9;
                        i9 = i;
                        i6 = b.getMeasuredWidth();
                        b2 = b.getMeasuredHeight();
                        if (this.b[i7]) {
                            i7 = i2;
                            i11 = i12;
                        } else if (pat.e() > 0.0f) {
                            float e = ((float) i6) - (pat.e() * f3);
                            i11 = i12;
                            if (i11 == paw2.h - 1) {
                                e += f4;
                                f4 = 0.0f;
                            }
                            b2 = Math.round(e);
                            if (b2 < pat.g()) {
                                b2 = pat.g();
                                z2 = true;
                                this.b[i7] = true;
                                paw2.k -= pat.e();
                            } else {
                                f4 += e - ((float) b2);
                                d = (double) f4;
                                if (d > 1.0d) {
                                    b2++;
                                    f4 -= 4.0f;
                                } else if (d < -1.0d) {
                                    b2--;
                                    f4 += 1.0f;
                                }
                            }
                            b.measure(MeasureSpec.makeMeasureSpec(b2, 1073741824), b(i2, pat, paw2.m));
                            i6 = b.getMeasuredWidth();
                            b2 = b.getMeasuredHeight();
                            this.a.l();
                        } else {
                            i7 = i2;
                            i11 = i12;
                        }
                        i9 = Math.max(i10, ((b2 + pat.n()) + pat.p()) + this.a.g());
                        paw2.e += (i6 + pat.m()) + pat.o();
                        i6 = i9;
                    } else {
                        b2 = b.getMeasuredHeight();
                        int measuredWidth = b.getMeasuredWidth();
                        if (!this.b[i7] && pat.e() > f2) {
                            float e2 = ((float) b2) - (pat.e() * f3);
                            if (i9 == paw2.h - 1) {
                                e2 += f4;
                                f4 = 0.0f;
                            }
                            i11 = Math.round(e2);
                            if (i11 < pat.h()) {
                                i11 = pat.h();
                                this.b[i7] = true;
                                paw2.k -= pat.e();
                                i8 = i6;
                                i12 = i9;
                                z2 = true;
                            } else {
                                f4 += e2 - ((float) i11);
                                i8 = i6;
                                i12 = i9;
                                d = (double) f4;
                                if (d > 1.0d) {
                                    i11++;
                                    f4 -= 4.0f;
                                } else if (d < -1.0d) {
                                    i11--;
                                    f4 += 1.0f;
                                }
                            }
                            b.measure(a(i, pat, paw2.m), MeasureSpec.makeMeasureSpec(i11, 1073741824));
                            measuredWidth = b.getMeasuredWidth();
                            b2 = b.getMeasuredHeight();
                            this.a.l();
                        } else {
                            i8 = i6;
                            i12 = i9;
                            i9 = i;
                        }
                        i6 = Math.max(i10, ((measuredWidth + pat.m()) + pat.o()) + this.a.g());
                        paw2.e += (b2 + pat.n()) + pat.p();
                        i7 = i2;
                        i11 = i12;
                    }
                    paw2.g = Math.max(paw2.g, i6);
                    i10 = i6;
                }
                i9 = i11 + 1;
                i6 = i8;
                f2 = 0.0f;
            }
            i7 = i2;
            i8 = i6;
            if (z2 && i8 != paw2.e) {
                b(i, i2, paw, i3, i4, true);
            }
        }
    }

    private final int a(int i, pat pat, int i2) {
        pau pau = this.a;
        i = pau.a(i, (((pau.getPaddingLeft() + this.a.getPaddingRight()) + pat.m()) + pat.o()) + i2, pat.a());
        i2 = MeasureSpec.getSize(i);
        if (i2 > pat.i()) {
            i = MeasureSpec.makeMeasureSpec(pat.i(), MeasureSpec.getMode(i));
        } else if (i2 < pat.g()) {
            return MeasureSpec.makeMeasureSpec(pat.g(), MeasureSpec.getMode(i));
        }
        return i;
    }

    private final int b(int i, pat pat, int i2) {
        pau pau = this.a;
        i = pau.b(i, (((pau.getPaddingTop() + this.a.getPaddingBottom()) + pat.n()) + pat.p()) + i2, pat.b());
        i2 = MeasureSpec.getSize(i);
        if (i2 > pat.j()) {
            i = MeasureSpec.makeMeasureSpec(pat.j(), MeasureSpec.getMode(i));
        } else if (i2 < pat.h()) {
            return MeasureSpec.makeMeasureSpec(pat.h(), MeasureSpec.getMode(i));
        }
        return i;
    }

    public final void a(int i, int i2, int i3) {
        int b = this.a.b();
        if (b == 0 || b == 1) {
            i = MeasureSpec.getMode(i2);
            i2 = MeasureSpec.getSize(i2);
        } else if (b == 2 || b == 3) {
            int mode = MeasureSpec.getMode(i);
            i2 = MeasureSpec.getSize(i);
            i = mode;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid flex direction: ");
            stringBuilder.append(b);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        List<paw> k = this.a.k();
        if (i == 1073741824) {
            i = this.a.i() + i3;
            int i4 = 0;
            if (k.size() == 1) {
                ((paw) k.get(0)).g = i2 - i3;
            } else if (k.size() >= 2) {
                i3 = this.a.d();
                paw paw;
                float size;
                int round;
                if (i3 == 1) {
                    paw = new paw();
                    paw.g = i2 - i;
                    k.add(0, paw);
                } else if (i3 == 2) {
                    this.a.a(pav.a((List) k, i2, i));
                } else if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 == 5 && i < i2) {
                            size = ((float) (i2 - i)) / ((float) k.size());
                            i2 = k.size();
                            float f = 0.0f;
                            while (i4 < i2) {
                                paw paw2 = (paw) k.get(i4);
                                float f2 = ((float) paw2.g) + size;
                                if (i4 == k.size() - 1) {
                                    f2 += f;
                                    f = 0.0f;
                                }
                                round = Math.round(f2);
                                f += f2 - ((float) round);
                                if (f > 1.0f) {
                                    round++;
                                    f -= 4.0f;
                                } else if (f < -1.0f) {
                                    round--;
                                    f += 1.0f;
                                }
                                paw2.g = round;
                                i4++;
                            }
                        }
                    } else if (i < i2) {
                        i3 = k.size();
                        i2 = (i2 - i) / (i3 + i3);
                        List arrayList = new ArrayList();
                        paw = new paw();
                        paw.g = i2;
                        for (paw paw3 : k) {
                            arrayList.add(paw);
                            arrayList.add(paw3);
                            arrayList.add(paw);
                        }
                        this.a.a(arrayList);
                    } else {
                        this.a.a(pav.a((List) k, i2, i));
                    }
                } else if (i < i2) {
                    size = ((float) (i2 - i)) / ((float) (k.size() - 1));
                    List arrayList2 = new ArrayList();
                    i3 = k.size();
                    float f3 = 0.0f;
                    while (i4 < i3) {
                        arrayList2.add((paw) k.get(i4));
                        if (i4 != k.size() - 1) {
                            paw paw4 = new paw();
                            if (i4 == k.size() - 2) {
                                int round2 = Math.round(f3 + size);
                                paw4.g = round2;
                                round = round2;
                                f3 = 0.0f;
                            } else {
                                round = Math.round(size);
                                paw4.g = round;
                            }
                            f3 += size - ((float) round);
                            if (f3 > 1.0f) {
                                paw4.g = round + 1;
                                f3 -= 4.0f;
                            } else if (f3 < -1.0f) {
                                paw4.g = round - 1;
                                f3 += 1.0f;
                            }
                            arrayList2.add(paw4);
                        }
                        i4++;
                    }
                    this.a.a(arrayList2);
                }
            }
        }
    }

    private static List a(List list, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        paw paw = new paw();
        paw.g = (i - i2) / 2;
        i = list.size();
        for (i2 = 0; i2 < i; i2++) {
            if (i2 == 0) {
                arrayList.add(paw);
            }
            arrayList.add((paw) list.get(i2));
            if (i2 == list.size() - 1) {
                arrayList.add(paw);
            }
        }
        return arrayList;
    }

    public final void a() {
        if (this.a.a() > 0) {
            int b = this.a.b();
            String str = "Invalid flex direction: ";
            StringBuilder stringBuilder;
            if (this.a.e() == 4) {
                List k = this.a.k();
                int size = k.size();
                for (int i = 0; i < size; i++) {
                    paw paw = (paw) k.get(i);
                    int i2 = paw.h;
                    for (int i3 = 0; i3 < i2; i3++) {
                        int i4 = paw.o + i3;
                        if (i3 < this.a.a()) {
                            View b2 = this.a.b(i4);
                            if (!(b2 == null || b2.getVisibility() == 8)) {
                                pat pat = (pat) b2.getLayoutParams();
                                if (pat.f() == -1 || pat.f() == 4) {
                                    if (b == 0 || b == 1) {
                                        a(b2, paw.g);
                                    } else if (b == 2 || b == 3) {
                                        b(b2, paw.g);
                                    } else {
                                        stringBuilder = new StringBuilder();
                                        stringBuilder.append(str);
                                        stringBuilder.append(b);
                                        throw new IllegalArgumentException(stringBuilder.toString());
                                    }
                                }
                            }
                        }
                    }
                }
                return;
            }
            for (paw paw2 : this.a.k()) {
                for (Integer num : paw2.n) {
                    View b3 = this.a.b(num.intValue());
                    int i5;
                    if (b == 0 || b == 1) {
                        i5 = paw2.g;
                        num.intValue();
                        a(b3, i5);
                    } else if (b == 2 || b == 3) {
                        i5 = paw2.g;
                        num.intValue();
                        b(b3, i5);
                    } else {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(str);
                        stringBuilder.append(b);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                }
            }
        }
    }

    private final void a(View view, int i) {
        pat pat = (pat) view.getLayoutParams();
        int n = pat.n();
        int p = pat.p();
        this.a.g();
        view.measure(MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), 1073741824), MeasureSpec.makeMeasureSpec(Math.min(Math.max((i - n) - p, pat.h()), pat.j()), 1073741824));
        this.a.l();
    }

    private final void b(View view, int i) {
        pat pat = (pat) view.getLayoutParams();
        int m = pat.m();
        int o = pat.o();
        this.a.g();
        i = Math.min(Math.max((i - m) - o, pat.g()), pat.i());
        view.measure(MeasureSpec.makeMeasureSpec(i, 1073741824), MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824));
        this.a.l();
    }

    /* JADX WARNING: Missing block: B:11:0x0025, code skipped:
            if (r1 != 4) goto L_0x00d8;
     */
    public final void a(android.view.View r6, defpackage.paw r7, int r8, int r9, int r10, int r11) {
        /*
        r5 = this;
        r0 = r6.getLayoutParams();
        r0 = (defpackage.pat) r0;
        r1 = r5.a;
        r1 = r1.e();
        r2 = r0.f();
        r3 = -1;
        if (r2 == r3) goto L_0x0017;
    L_0x0013:
        r1 = r0.f();
    L_0x0017:
        r2 = r7.g;
        r3 = 2;
        if (r1 == 0) goto L_0x00c3;
    L_0x001c:
        r4 = 1;
        if (r1 == r4) goto L_0x008c;
    L_0x001f:
        if (r1 == r3) goto L_0x0060;
    L_0x0021:
        r2 = 3;
        if (r1 == r2) goto L_0x0029;
    L_0x0024:
        r7 = 4;
        if (r1 == r7) goto L_0x00c3;
    L_0x0027:
        goto L_0x00d8;
    L_0x0029:
        r1 = r5.a;
        r1 = r1.c();
        if (r1 == r3) goto L_0x0046;
    L_0x0031:
        r7 = r7.l;
        r1 = r6.getBaseline();
        r7 = r7 - r1;
        r0 = r0.n();
        r7 = java.lang.Math.max(r7, r0);
        r9 = r9 + r7;
        r11 = r11 + r7;
        r6.layout(r8, r9, r10, r11);
        return;
    L_0x0046:
        r7 = r7.l;
        r1 = r6.getMeasuredHeight();
        r7 = r7 - r1;
        r1 = r6.getBaseline();
        r7 = r7 + r1;
        r0 = r0.p();
        r7 = java.lang.Math.max(r7, r0);
        r9 = r9 - r7;
        r11 = r11 - r7;
        r6.layout(r8, r9, r10, r11);
        return;
    L_0x0060:
        r7 = r6.getMeasuredHeight();
        r2 = r2 - r7;
        r7 = r0.n();
        r2 = r2 + r7;
        r7 = r0.p();
        r2 = r2 - r7;
        r2 = r2 / r3;
        r7 = r5.a;
        r7 = r7.c();
        if (r7 == r3) goto L_0x0082;
    L_0x0078:
        r9 = r9 + r2;
        r7 = r6.getMeasuredHeight();
        r7 = r7 + r9;
        r6.layout(r8, r9, r10, r7);
        return;
    L_0x0082:
        r9 = r9 - r2;
        r7 = r6.getMeasuredHeight();
        r7 = r7 + r9;
        r6.layout(r8, r9, r10, r7);
        return;
    L_0x008c:
        r7 = r5.a;
        r7 = r7.c();
        if (r7 == r3) goto L_0x00a9;
    L_0x0094:
        r9 = r9 + r2;
        r7 = r6.getMeasuredHeight();
        r7 = r9 - r7;
        r11 = r0.p();
        r7 = r7 - r11;
        r11 = r0.p();
        r9 = r9 - r11;
        r6.layout(r8, r7, r10, r9);
        return;
    L_0x00a9:
        r9 = r9 - r2;
        r7 = r6.getMeasuredHeight();
        r9 = r9 + r7;
        r7 = r0.n();
        r9 = r9 + r7;
        r11 = r11 - r2;
        r7 = r6.getMeasuredHeight();
        r11 = r11 + r7;
        r7 = r0.n();
        r11 = r11 + r7;
        r6.layout(r8, r9, r10, r11);
        return;
    L_0x00c3:
        r7 = r5.a;
        r7 = r7.c();
        if (r7 == r3) goto L_0x00d9;
    L_0x00cb:
        r7 = r0.n();
        r9 = r9 + r7;
        r7 = r0.n();
        r11 = r11 + r7;
        r6.layout(r8, r9, r10, r11);
    L_0x00d8:
        return;
    L_0x00d9:
        r7 = r0.p();
        r9 = r9 - r7;
        r7 = r0.p();
        r11 = r11 - r7;
        r6.layout(r8, r9, r10, r11);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pav.a(android.view.View, paw, int, int, int, int):void");
    }

    /* JADX WARNING: Missing block: B:12:0x0025, code skipped:
            if (r1 != 4) goto L_0x0045;
     */
    public final void a(android.view.View r5, defpackage.paw r6, boolean r7, int r8, int r9, int r10, int r11) {
        /*
        r4 = this;
        r0 = r5.getLayoutParams();
        r0 = (defpackage.pat) r0;
        r1 = r4.a;
        r1 = r1.e();
        r2 = r0.f();
        r3 = -1;
        if (r2 == r3) goto L_0x0017;
    L_0x0013:
        r1 = r0.f();
    L_0x0017:
        r6 = r6.g;
        if (r1 == 0) goto L_0x0082;
    L_0x001b:
        r2 = 1;
        if (r1 == r2) goto L_0x004c;
    L_0x001e:
        r2 = 2;
        if (r1 == r2) goto L_0x0028;
    L_0x0021:
        r6 = 3;
        if (r1 == r6) goto L_0x0082;
    L_0x0024:
        r6 = 4;
        if (r1 == r6) goto L_0x0082;
    L_0x0027:
        goto L_0x0045;
    L_0x0028:
        r0 = r5.getLayoutParams();
        r0 = (android.view.ViewGroup.MarginLayoutParams) r0;
        r1 = r5.getMeasuredWidth();
        r6 = r6 - r1;
        r1 = r0.getMarginStart();
        r6 = r6 + r1;
        r0 = r0.getMarginEnd();
        r6 = r6 - r0;
        r6 = r6 / r2;
        if (r7 != 0) goto L_0x0046;
    L_0x0040:
        r8 = r8 + r6;
        r10 = r10 + r6;
        r5.layout(r8, r9, r10, r11);
    L_0x0045:
        return;
    L_0x0046:
        r8 = r8 - r6;
        r10 = r10 - r6;
        r5.layout(r8, r9, r10, r11);
        return;
    L_0x004c:
        if (r7 != 0) goto L_0x0068;
    L_0x004e:
        r8 = r8 + r6;
        r7 = r5.getMeasuredWidth();
        r8 = r8 - r7;
        r7 = r0.o();
        r8 = r8 - r7;
        r10 = r10 + r6;
        r6 = r5.getMeasuredWidth();
        r10 = r10 - r6;
        r6 = r0.o();
        r10 = r10 - r6;
        r5.layout(r8, r9, r10, r11);
        return;
    L_0x0068:
        r8 = r8 - r6;
        r7 = r5.getMeasuredWidth();
        r8 = r8 + r7;
        r7 = r0.m();
        r8 = r8 + r7;
        r10 = r10 - r6;
        r6 = r5.getMeasuredWidth();
        r10 = r10 + r6;
        r6 = r0.m();
        r10 = r10 + r6;
        r5.layout(r8, r9, r10, r11);
        return;
    L_0x0082:
        if (r7 == 0) goto L_0x0092;
    L_0x0084:
        r6 = r0.o();
        r8 = r8 - r6;
        r6 = r0.o();
        r10 = r10 - r6;
        r5.layout(r8, r9, r10, r11);
        return;
    L_0x0092:
        r6 = r0.m();
        r8 = r8 + r6;
        r6 = r0.m();
        r10 = r10 + r6;
        r5.layout(r8, r9, r10, r11);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pav.a(android.view.View, paw, boolean, int, int, int, int):void");
    }
}
