package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

/* renamed from: anm */
public class anm extends ans {
    private final SparseIntArray A = new SparseIntArray();
    private final Rect B = new Rect();
    public int a = -1;
    public ann b = new anl();
    private boolean w = false;
    private int[] x;
    private View[] y;
    private final SparseIntArray z = new SparseIntArray();

    public anm(Context context, int i) {
        a(i);
    }

    public anm(int i) {
        super(0, false);
        a(i);
    }

    public final void aB_() {
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public final int a(apw apw, aqh aqh) {
        if (this.c == 0) {
            return this.a;
        }
        return aqh.b() > 0 ? a(apw, aqh, aqh.b() - 1) + 1 : 0;
    }

    public final int b(apw apw, aqh aqh) {
        if (this.c == 1) {
            return this.a;
        }
        return aqh.b() > 0 ? a(apw, aqh, aqh.b() - 1) + 1 : 0;
    }

    public final void a(apw apw, aqh aqh, View view, aca aca) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ano) {
            ano ano = (ano) layoutParams;
            int a = a(apw, aqh, ano.c());
            boolean z = false;
            int i;
            int i2;
            int i3;
            if (this.c != 0) {
                i = ano.a;
                i2 = ano.b;
                i3 = this.a;
                if (i3 > 1 && i2 == i3) {
                    z = true;
                }
                aca.a(acf.a(a, 1, i, i2, z));
                return;
            }
            i = ano.a;
            i2 = ano.b;
            i3 = this.a;
            if (i3 > 1 && i2 == i3) {
                z = true;
            }
            aca.a(acf.a(i, i2, a, 1, z));
            return;
        }
        super.a(view, aca);
    }

    public final void c(apw apw, aqh aqh) {
        if (aqh.g) {
            int w = w();
            for (int i = 0; i < w; i++) {
                ano ano = (ano) i(i).getLayoutParams();
                int c = ano.c();
                this.z.put(c, ano.b);
                this.A.put(c, ano.a);
            }
        }
        super.c(apw, aqh);
        this.z.clear();
        this.A.clear();
    }

    public final void a(aqh aqh) {
        super.a(aqh);
        this.w = false;
    }

    public final void b() {
        this.b.a();
        this.b.b();
    }

    public final void c() {
        this.b.a();
        this.b.b();
    }

    public final void d() {
        this.b.a();
        this.b.b();
    }

    public final void e() {
        this.b.a();
        this.b.b();
    }

    public final void f() {
        this.b.a();
        this.b.b();
    }

    public final apr g() {
        if (this.c == 0) {
            return new ano(-2, -1);
        }
        return new ano(-1, -2);
    }

    public final apr a(Context context, AttributeSet attributeSet) {
        return new ano(context, attributeSet);
    }

    public final apr a(LayoutParams layoutParams) {
        if (layoutParams instanceof MarginLayoutParams) {
            return new ano((MarginLayoutParams) layoutParams);
        }
        return new ano(layoutParams);
    }

    public final boolean a(apr apr) {
        return apr instanceof ano;
    }

    private final void F() {
        int z;
        int x;
        if (this.c == 1) {
            z = this.u - z();
            x = x();
        } else {
            z = this.v - A();
            x = y();
        }
        m(z - x);
    }

    public final void a(Rect rect, int i, int i2) {
        int a;
        if (this.x == null) {
            super.a(rect, i, i2);
        }
        int x = x() + z();
        int y = y() + A();
        if (this.c == 1) {
            a = apn.a(i2, rect.height() + y, E());
            int[] iArr = this.x;
            i = apn.a(i, iArr[iArr.length - 1] + x, D());
        } else {
            i = apn.a(i, rect.width() + x, D());
            int[] iArr2 = this.x;
            a = apn.a(i2, iArr2[iArr2.length - 1] + y, E());
        }
        d(i, a);
    }

    /* JADX WARNING: Missing block: B:5:0x0010, code skipped:
            if (r0[r2 - 1] == r8) goto L_0x0017;
     */
    private final void m(int r8) {
        /*
        r7 = this;
        r0 = r7.x;
        r1 = r7.a;
        if (r0 != 0) goto L_0x0007;
    L_0x0006:
        goto L_0x0013;
    L_0x0007:
        r2 = r0.length;
        r3 = r1 + 1;
        if (r2 != r3) goto L_0x0013;
    L_0x000c:
        r2 = r2 + -1;
        r2 = r0[r2];
        if (r2 != r8) goto L_0x0013;
    L_0x0012:
        goto L_0x0017;
    L_0x0013:
        r0 = r1 + 1;
        r0 = new int[r0];
    L_0x0017:
        r2 = 0;
        r0[r2] = r2;
        r3 = r8 / r1;
        r8 = r8 % r1;
        r4 = 1;
        r5 = 0;
    L_0x001f:
        if (r4 > r1) goto L_0x0034;
    L_0x0021:
        r2 = r2 + r8;
        if (r2 > 0) goto L_0x0025;
    L_0x0024:
        goto L_0x002d;
    L_0x0025:
        r6 = r1 - r2;
        if (r6 >= r8) goto L_0x002d;
    L_0x0029:
        r6 = r3 + 1;
        r2 = r2 - r1;
        goto L_0x002e;
    L_0x002d:
        r6 = r3;
    L_0x002e:
        r5 = r5 + r6;
        r0[r4] = r5;
        r4 = r4 + 1;
        goto L_0x001f;
    L_0x0034:
        r7.x = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anm.m(int):void");
    }

    private final int e(int i, int i2) {
        int[] iArr;
        if (this.c == 1 && m()) {
            iArr = this.x;
            int i3 = this.a - i;
            return iArr[i3] - iArr[i3 - i2];
        }
        iArr = this.x;
        return iArr[i2 + i] - iArr[i];
    }

    /* Access modifiers changed, original: final */
    public final void a(apw apw, aqh aqh, anr anr, int i) {
        F();
        if (aqh.b() > 0 && !aqh.g) {
            int b = b(apw, aqh, anr.b);
            if (i == 1) {
                while (b > 0) {
                    i = anr.b;
                    if (i <= 0) {
                        break;
                    }
                    i--;
                    anr.b = i;
                    b = b(apw, aqh, i);
                }
            } else {
                i = aqh.b() - 1;
                int i2 = anr.b;
                while (i2 < i) {
                    int i3 = i2 + 1;
                    int b2 = b(apw, aqh, i3);
                    if (b2 <= b) {
                        break;
                    }
                    i2 = i3;
                    b = b2;
                }
                anr.b = i2;
            }
        }
        G();
    }

    private final void G() {
        View[] viewArr = this.y;
        if (viewArr == null || viewArr.length != this.a) {
            this.y = new View[this.a];
        }
    }

    public final int a(int i, apw apw, aqh aqh) {
        F();
        G();
        return super.a(i, apw, aqh);
    }

    public final int b(int i, apw apw, aqh aqh) {
        F();
        G();
        return super.b(i, apw, aqh);
    }

    /* Access modifiers changed, original: final */
    public final View a(apw apw, aqh aqh, int i, int i2, int i3) {
        n();
        int b = this.d.b();
        int c = this.d.c();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View i5 = i(i);
            int c2 = apn.c(i5);
            if (c2 >= 0 && c2 < i3 && b(apw, aqh, c2) == 0) {
                if (((apr) i5.getLayoutParams()).l_()) {
                    if (view2 == null) {
                        view2 = i5;
                    }
                } else if (this.d.a(i5) < c && this.d.b(i5) >= b) {
                    return i5;
                } else {
                    if (view == null) {
                        view = i5;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    private final int a(apw apw, aqh aqh, int i) {
        if (!aqh.g) {
            return this.b.b(i, this.a);
        }
        int a = apw.a(i);
        if (a != -1) {
            return this.b.b(a, this.a);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot find span size for pre layout position. ");
        stringBuilder.append(i);
        Log.w("GridLayoutManager", stringBuilder.toString());
        return 0;
    }

    private final int b(apw apw, aqh aqh, int i) {
        if (!aqh.g) {
            return this.b.a(i, this.a);
        }
        int i2 = this.A.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int a = apw.a(i);
        if (a != -1) {
            return this.b.a(a, this.a);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
        stringBuilder.append(i);
        Log.w("GridLayoutManager", stringBuilder.toString());
        return 0;
    }

    private final int c(apw apw, aqh aqh, int i) {
        if (!aqh.g) {
            return this.b.a(i);
        }
        int i2 = this.z.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int a = apw.a(i);
        if (a != -1) {
            return this.b.a(a);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
        stringBuilder.append(i);
        Log.w("GridLayoutManager", stringBuilder.toString());
        return 1;
    }

    /* Access modifiers changed, original: final */
    public final void a(aqh aqh, ant ant, apo apo) {
        int i = this.a;
        for (int i2 = 0; i2 < this.a && ant.a(aqh) && i > 0; i2++) {
            int i3 = ant.d;
            apo.a(i3, Math.max(0, ant.g));
            i -= this.b.a(i3);
            ant.d += ant.e;
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(apw apw, aqh aqh, ant ant, anu anu) {
        int i;
        int c;
        apw apw2 = apw;
        aqh aqh2 = aqh;
        ant ant2 = ant;
        anu anu2 = anu;
        int h = this.d.h();
        int i2 = w() > 0 ? this.x[this.a] : 0;
        if (h != 1073741824) {
            F();
        }
        int i3 = ant2.e;
        int i4 = this.a;
        if (i3 != 1) {
            i4 = b(apw2, aqh2, ant2.d) + c(apw2, aqh2, ant2.d);
        }
        int i5 = i4;
        i4 = 0;
        while (i4 < this.a && ant2.a(aqh2) && i5 > 0) {
            i = ant2.d;
            c = c(apw2, aqh2, i);
            if (c <= this.a) {
                i5 -= c;
                if (i5 < 0) {
                    break;
                }
                View a = ant2.a(apw2);
                if (a == null) {
                    break;
                }
                this.y[i4] = a;
                i4++;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Item at position ");
                stringBuilder.append(i);
                stringBuilder.append(" requires ");
                stringBuilder.append(c);
                stringBuilder.append(" spans but GridLayoutManager has only ");
                stringBuilder.append(this.a);
                stringBuilder.append(" spans.");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        if (i4 != 0) {
            int i6;
            int c2;
            int i7;
            View view;
            int e;
            int i8;
            if (i3 != 1) {
                i = i4 - 1;
                c = -1;
                i6 = -1;
            } else {
                c = i4;
                i = 0;
                i6 = 1;
            }
            i5 = 0;
            for (i = 
/*
Method generation error in method: anm.a(apw, aqh, ant, anu):void, dex: classes.dex
jadx.core.utils.exceptions.CodegenException: Error generate insn: PHI: (r13_6 'i' int) = (r13_4 'i' int), (r13_5 'i' int) binds: {(r13_4 'i' int)=B:27:0x0093, (r13_5 'i' int)=B:28:0x0098} in method: anm.a(apw, aqh, ant, anu):void, dex: classes.dex
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:228)
	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:185)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:89)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:95)
	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:120)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:89)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:89)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:183)
	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:321)
	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:259)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:221)
	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
	at jadx.core.codegen.CodeGen.visit(CodeGen.java:10)
	at jadx.core.ProcessClass.process(ProcessClass.java:38)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
Caused by: jadx.core.utils.exceptions.CodegenException: PHI can be used only in fallback mode
	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:539)
	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:511)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:222)
	... 22 more

*/

    private final void a(View view, int i, boolean z) {
        int a;
        ano ano = (ano) view.getLayoutParams();
        Rect rect = ano.d;
        int i2 = ((rect.top + rect.bottom) + ano.topMargin) + ano.bottomMargin;
        int i3 = ((rect.left + rect.right) + ano.leftMargin) + ano.rightMargin;
        int e = e(ano.a, ano.b);
        if (this.c == 1) {
            i = apn.a(e, i, i3, ano.width, false);
            a = apn.a(this.d.e(), this.t, i2, ano.height, true);
        } else {
            i = apn.a(e, i, i2, ano.height, false);
            int a2 = apn.a(this.d.e(), this.s, i3, ano.width, true);
            a = i;
            i = a2;
        }
        a(view, i, a, z);
    }

    private final void a(View view, int i, int i2, boolean z) {
        apr apr = (apr) view.getLayoutParams();
        if (z) {
            if (this.o && apn.b(view.getMeasuredWidth(), i, apr.width) && apn.b(view.getMeasuredHeight(), i2, apr.height)) {
                return;
            }
        } else if (!a(view, i, i2, apr)) {
            return;
        }
        view.measure(i, i2);
    }

    public final void a(int i) {
        if (i != this.a) {
            this.w = true;
            if (i > 0) {
                this.a = i;
                this.b.a();
                t();
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Span count should be at least 1. Provided ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ee  */
    /* JADX WARNING: Missing block: B:47:0x00c1, code skipped:
            if (r13 != (r2 <= r11 ? null : 1)) goto L_0x0073;
     */
    /* JADX WARNING: Missing block: B:57:0x00db, code skipped:
            if (r13 != (r2 <= r8 ? null : 1)) goto L_0x00dd;
     */
    public final android.view.View a(android.view.View r23, int r24, defpackage.apw r25, defpackage.aqh r26) {
        /*
        r22 = this;
        r0 = r22;
        r1 = r25;
        r2 = r26;
        r3 = r22.d(r23);
        r4 = 0;
        if (r3 == 0) goto L_0x011e;
    L_0x000d:
        r5 = r3.getLayoutParams();
        r5 = (defpackage.ano) r5;
        r6 = r5.a;
        r5 = r5.b;
        r5 = r5 + r6;
        r7 = super.a(r23, r24, r25, r26);
        if (r7 == 0) goto L_0x011e;
    L_0x001e:
        r7 = r24;
        r7 = r0.f(r7);
        r8 = 1;
        if (r7 == r8) goto L_0x0029;
    L_0x0027:
        r7 = 0;
        goto L_0x002a;
    L_0x0029:
        r7 = 1;
    L_0x002a:
        r10 = r0.f;
        r11 = -1;
        if (r7 == r10) goto L_0x0037;
    L_0x002f:
        r7 = r22.w();
        r7 = r7 + r11;
        r10 = -1;
        r12 = -1;
        goto L_0x003e;
    L_0x0037:
        r7 = r22.w();
        r10 = r7;
        r7 = 0;
        r12 = 1;
    L_0x003e:
        r13 = r0.c;
        if (r13 != r8) goto L_0x004b;
    L_0x0042:
        r13 = r22.m();
        if (r13 != 0) goto L_0x0049;
    L_0x0048:
        goto L_0x004b;
    L_0x0049:
        r13 = 1;
        goto L_0x004c;
    L_0x004b:
        r13 = 0;
    L_0x004c:
        r14 = r0.a(r1, r2, r7);
        r16 = r4;
        r8 = -1;
        r15 = 0;
        r17 = 0;
    L_0x0056:
        if (r7 == r10) goto L_0x011a;
    L_0x0058:
        r9 = r0.a(r1, r2, r7);
        r1 = r0.i(r7);
        if (r1 == r3) goto L_0x011a;
    L_0x0062:
        r18 = r1.hasFocusable();
        if (r18 != 0) goto L_0x0069;
    L_0x0068:
        goto L_0x0079;
    L_0x0069:
        if (r9 == r14) goto L_0x0079;
    L_0x006b:
        if (r4 == 0) goto L_0x006f;
    L_0x006d:
        goto L_0x011a;
    L_0x006f:
        r18 = r3;
        r21 = r10;
    L_0x0073:
        r19 = r11;
    L_0x0075:
        r11 = r17;
        goto L_0x00dd;
    L_0x0079:
        r9 = r1.getLayoutParams();
        r9 = (defpackage.ano) r9;
        r2 = r9.a;
        r18 = r3;
        r3 = r9.b;
        r3 = r3 + r2;
        r19 = r1.hasFocusable();
        if (r19 != 0) goto L_0x008d;
    L_0x008c:
        goto L_0x0092;
    L_0x008d:
        if (r2 != r6) goto L_0x0092;
    L_0x008f:
        if (r3 != r5) goto L_0x0092;
    L_0x0091:
        return r1;
    L_0x0092:
        r19 = r1.hasFocusable();
        if (r19 != 0) goto L_0x0099;
    L_0x0098:
        goto L_0x009b;
    L_0x0099:
        if (r4 == 0) goto L_0x00e2;
    L_0x009b:
        r19 = r1.hasFocusable();
        if (r19 == 0) goto L_0x00a2;
    L_0x00a1:
        goto L_0x00a5;
    L_0x00a2:
        if (r16 != 0) goto L_0x00a5;
    L_0x00a4:
        goto L_0x00e2;
    L_0x00a5:
        r19 = java.lang.Math.max(r2, r6);
        r20 = java.lang.Math.min(r3, r5);
        r21 = r10;
        r10 = r20 - r19;
        r19 = r1.hasFocusable();
        if (r19 == 0) goto L_0x00c4;
    L_0x00b7:
        if (r10 <= r15) goto L_0x00ba;
    L_0x00b9:
        goto L_0x00e4;
    L_0x00ba:
        if (r10 != r15) goto L_0x0073;
    L_0x00bc:
        if (r2 > r11) goto L_0x00c0;
    L_0x00be:
        r10 = 0;
        goto L_0x00c1;
    L_0x00c0:
        r10 = 1;
    L_0x00c1:
        if (r13 == r10) goto L_0x00e4;
    L_0x00c3:
        goto L_0x00c6;
    L_0x00c4:
        if (r4 == 0) goto L_0x00c7;
    L_0x00c6:
        goto L_0x0073;
    L_0x00c7:
        r19 = r11;
        r11 = 0;
        r20 = r0.a(r1, r11);
        if (r20 == 0) goto L_0x0075;
    L_0x00d0:
        r11 = r17;
        if (r10 > r11) goto L_0x00e8;
    L_0x00d4:
        if (r10 != r11) goto L_0x00dd;
    L_0x00d6:
        if (r2 > r8) goto L_0x00da;
    L_0x00d8:
        r10 = 0;
        goto L_0x00db;
    L_0x00da:
        r10 = 1;
    L_0x00db:
        if (r13 == r10) goto L_0x00e8;
    L_0x00dd:
        r17 = r11;
    L_0x00df:
        r11 = r19;
        goto L_0x010f;
    L_0x00e2:
        r21 = r10;
    L_0x00e4:
        r19 = r11;
        r11 = r17;
    L_0x00e8:
        r10 = r1.hasFocusable();
        if (r10 == 0) goto L_0x00ff;
    L_0x00ee:
        r4 = r9.a;
        r3 = java.lang.Math.min(r3, r5);
        r2 = java.lang.Math.max(r2, r6);
        r3 = r3 - r2;
        r15 = r3;
        r17 = r11;
        r11 = r4;
        r4 = r1;
        goto L_0x010f;
    L_0x00ff:
        r8 = r9.a;
        r3 = java.lang.Math.min(r3, r5);
        r2 = java.lang.Math.max(r2, r6);
        r3 = r3 - r2;
        r16 = r1;
        r17 = r3;
        goto L_0x00df;
    L_0x010f:
        r7 = r7 + r12;
        r1 = r25;
        r2 = r26;
        r3 = r18;
        r10 = r21;
        goto L_0x0056;
    L_0x011a:
        if (r4 == 0) goto L_0x011d;
    L_0x011c:
        return r4;
    L_0x011d:
        return r16;
    L_0x011e:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anm.a(android.view.View, int, apw, aqh):android.view.View");
    }

    public final boolean h() {
        return this.h == null && !this.w;
    }

    public final int b(aqh aqh) {
        return j(aqh);
    }

    public final int c(aqh aqh) {
        return j(aqh);
    }

    public final int d(aqh aqh) {
        return i(aqh);
    }

    public final int e(aqh aqh) {
        return i(aqh);
    }
}
