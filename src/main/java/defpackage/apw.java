package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: apw */
public final class apw {
    public final ArrayList a = new ArrayList();
    public ArrayList b = null;
    public final ArrayList c = new ArrayList();
    public final List d = Collections.unmodifiableList(this.a);
    public int e = 2;
    public apu f;
    public final /* synthetic */ RecyclerView g;
    private int h = 2;

    public apw(RecyclerView recyclerView) {
        this.g = recyclerView;
    }

    public final void a() {
        this.a.clear();
        c();
    }

    public final void b() {
        apn apn = this.g.n;
        this.h = this.e + (apn != null ? apn.q : 0);
        int size = this.c.size();
        while (true) {
            size--;
            if (size >= 0 && this.c.size() > this.h) {
                b(size);
            } else {
                return;
            }
        }
    }

    public final int a(int i) {
        if (i < 0 || i >= this.g.L.b()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("invalid position ");
            stringBuilder.append(i);
            stringBuilder.append(". State item count is ");
            stringBuilder.append(this.g.L.b());
            stringBuilder.append(this.g.a());
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }
        RecyclerView recyclerView = this.g;
        return recyclerView.L.g ? recyclerView.f.b(i) : i;
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x04d6  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x04c8  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x03c5  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x04c8  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x04d6  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0417  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0437  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0456  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x04b4  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0477  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x04bd  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x04d6  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x04c8  */
    /* JADX WARNING: Missing block: B:92:0x01ca, code skipped:
            if (r0.g.L.g != false) goto L_0x01cc;
     */
    /* JADX WARNING: Missing block: B:105:0x0206, code skipped:
            if (r10.e == r8.b(r10.c)) goto L_0x01cc;
     */
    /* JADX WARNING: Missing block: B:203:0x0429, code skipped:
            if ((r11 + r7) < r20) goto L_0x042c;
     */
    public final defpackage.aqj a(int r19, long r20) {
        /*
        r18 = this;
        r0 = r18;
        r1 = r19;
        if (r1 < 0) goto L_0x04fa;
    L_0x0006:
        r2 = r0.g;
        r2 = r2.L;
        r2 = r2.b();
        if (r1 >= r2) goto L_0x04fa;
    L_0x0010:
        r2 = r0.g;
        r2 = r2.L;
        r2 = r2.g;
        r3 = 32;
        r4 = 0;
        r6 = 0;
        if (r2 != 0) goto L_0x0020;
    L_0x001c:
        r8 = r4;
    L_0x001d:
        r2 = 0;
        goto L_0x0090;
    L_0x0020:
        r2 = r0.b;
        if (r2 == 0) goto L_0x008c;
    L_0x0024:
        r2 = r2.size();
        if (r2 != 0) goto L_0x002b;
    L_0x002a:
        goto L_0x008c;
    L_0x002b:
        r7 = 0;
    L_0x002c:
        if (r7 < r2) goto L_0x0070;
    L_0x002e:
        r7 = r0.g;
        r8 = r7.m;
        r8 = r8.b;
        if (r8 == 0) goto L_0x008c;
    L_0x0036:
        r7 = r7.f;
        r7 = r7.b(r1);
        if (r7 <= 0) goto L_0x008c;
    L_0x003e:
        r8 = r0.g;
        r8 = r8.m;
        r8 = r8.a();
        if (r7 >= r8) goto L_0x008c;
    L_0x0048:
        r8 = r0.g;
        r8 = r8.m;
        r7 = r8.b(r7);
        r9 = 0;
    L_0x0051:
        if (r9 >= r2) goto L_0x008c;
    L_0x0053:
        r10 = r0.b;
        r10 = r10.get(r9);
        r10 = (defpackage.aqj) r10;
        r11 = r10.g();
        if (r11 == 0) goto L_0x0062;
    L_0x0061:
        goto L_0x006d;
    L_0x0062:
        r11 = r10.e;
        r13 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1));
        if (r13 != 0) goto L_0x006d;
    L_0x0068:
        r10.b(r3);
        r8 = r10;
        goto L_0x008d;
    L_0x006d:
        r9 = r9 + 1;
        goto L_0x0051;
    L_0x0070:
        r8 = r0.b;
        r8 = r8.get(r7);
        r8 = (defpackage.aqj) r8;
        r9 = r8.g();
        if (r9 == 0) goto L_0x007f;
    L_0x007e:
        goto L_0x0089;
    L_0x007f:
        r9 = r8.c();
        if (r9 != r1) goto L_0x0089;
    L_0x0085:
        r8.b(r3);
        goto L_0x008d;
    L_0x0089:
        r7 = r7 + 1;
        goto L_0x002c;
    L_0x008c:
        r8 = r4;
    L_0x008d:
        if (r8 == 0) goto L_0x001d;
    L_0x008f:
        r2 = 1;
    L_0x0090:
        r7 = -1;
        if (r8 != 0) goto L_0x024c;
    L_0x0093:
        r8 = r0.a;
        r8 = r8.size();
        r9 = 0;
    L_0x009a:
        if (r9 >= r8) goto L_0x00cd;
    L_0x009c:
        r10 = r0.a;
        r10 = r10.get(r9);
        r10 = (defpackage.aqj) r10;
        r11 = r10.g();
        if (r11 == 0) goto L_0x00ab;
    L_0x00aa:
        goto L_0x00ca;
    L_0x00ab:
        r11 = r10.c();
        if (r11 != r1) goto L_0x00ca;
    L_0x00b1:
        r11 = r10.j();
        if (r11 != 0) goto L_0x00ca;
    L_0x00b7:
        r11 = r0.g;
        r11 = r11.L;
        r11 = r11.g;
        if (r11 != 0) goto L_0x00c5;
    L_0x00bf:
        r11 = r10.m();
        if (r11 != 0) goto L_0x00ca;
    L_0x00c5:
        r10.b(r3);
        goto L_0x01ba;
    L_0x00ca:
        r9 = r9 + 1;
        goto L_0x009a;
    L_0x00cd:
        r8 = r0.g;
        r8 = r8.g;
        r9 = r8.c;
        r9 = r9.size();
        r10 = 0;
    L_0x00d8:
        if (r10 >= r9) goto L_0x00ff;
    L_0x00da:
        r11 = r8.c;
        r11 = r11.get(r10);
        r11 = (android.view.View) r11;
        r12 = r8.a;
        r12 = r12.b(r11);
        r13 = r12.c();
        if (r13 == r1) goto L_0x00ef;
    L_0x00ee:
        goto L_0x00fc;
    L_0x00ef:
        r13 = r12.j();
        if (r13 != 0) goto L_0x00fc;
    L_0x00f5:
        r12 = r12.m();
        if (r12 != 0) goto L_0x00fc;
    L_0x00fb:
        goto L_0x0100;
    L_0x00fc:
        r10 = r10 + 1;
        goto L_0x00d8;
    L_0x00ff:
        r11 = r4;
    L_0x0100:
        if (r11 == 0) goto L_0x018c;
    L_0x0102:
        r8 = android.support.v7.widget.RecyclerView.d(r11);
        r9 = r0.g;
        r9 = r9.g;
        r10 = r9.a;
        r10 = r10.a(r11);
        if (r10 < 0) goto L_0x0175;
    L_0x0112:
        r12 = r9.b;
        r12 = r12.c(r10);
        if (r12 == 0) goto L_0x015e;
    L_0x011a:
        r12 = r9.b;
        r12.b(r10);
        r9.b(r11);
        r9 = r0.g;
        r9 = r9.g;
        r9 = r9.c(r11);
        if (r9 == r7) goto L_0x013e;
    L_0x012c:
        r10 = r0.g;
        r10 = r10.g;
        r10.d(r9);
        r0.c(r11);
        r9 = 8224; // 0x2020 float:1.1524E-41 double:4.063E-320;
        r8.b(r9);
        r10 = r8;
        goto L_0x01ba;
    L_0x013e:
        r1 = new java.lang.IllegalStateException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "layout index should not be -1 after unhiding a view:";
        r2.append(r3);
        r2.append(r8);
        r3 = r0.g;
        r3 = r3.a();
        r2.append(r3);
        r2 = r2.toString();
        r1.<init>(r2);
        throw r1;
    L_0x015e:
        r1 = new java.lang.RuntimeException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "trying to unhide a view that was not hidden";
        r2.append(r3);
        r2.append(r11);
        r2 = r2.toString();
        r1.<init>(r2);
        throw r1;
    L_0x0175:
        r1 = new java.lang.IllegalArgumentException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "view is not a child, cannot hide ";
        r2.append(r3);
        r2.append(r11);
        r2 = r2.toString();
        r1.<init>(r2);
        throw r1;
    L_0x018c:
        r8 = r0.c;
        r8 = r8.size();
        r9 = 0;
    L_0x0193:
        if (r9 >= r8) goto L_0x01b9;
    L_0x0195:
        r10 = r0.c;
        r10 = r10.get(r9);
        r10 = (defpackage.aqj) r10;
        r11 = r10.j();
        if (r11 == 0) goto L_0x01a4;
    L_0x01a3:
        goto L_0x01b6;
    L_0x01a4:
        r11 = r10.c();
        if (r11 != r1) goto L_0x01b6;
    L_0x01aa:
        r11 = r10.o();
        if (r11 != 0) goto L_0x01b6;
    L_0x01b0:
        r8 = r0.c;
        r8.remove(r9);
        goto L_0x01ba;
    L_0x01b6:
        r9 = r9 + 1;
        goto L_0x0193;
    L_0x01b9:
        r10 = r4;
    L_0x01ba:
        if (r10 != 0) goto L_0x01be;
    L_0x01bc:
        goto L_0x024d;
    L_0x01be:
        r8 = r10.m();
        if (r8 == 0) goto L_0x01cf;
    L_0x01c4:
        r8 = r0.g;
        r8 = r8.L;
        r8 = r8.g;
        if (r8 == 0) goto L_0x0209;
    L_0x01cc:
        r2 = 1;
        goto L_0x024d;
    L_0x01cf:
        r8 = r10.c;
        if (r8 < 0) goto L_0x022c;
    L_0x01d3:
        r9 = r0.g;
        r9 = r9.m;
        r9 = r9.a();
        if (r8 >= r9) goto L_0x022c;
    L_0x01dd:
        r8 = r0.g;
        r9 = r8.L;
        r9 = r9.g;
        if (r9 == 0) goto L_0x01e6;
    L_0x01e5:
        goto L_0x01f3;
    L_0x01e6:
        r8 = r8.m;
        r9 = r10.c;
        r8 = r8.a(r9);
        r9 = r10.f;
        if (r8 == r9) goto L_0x01f3;
    L_0x01f2:
        goto L_0x0209;
    L_0x01f3:
        r8 = r0.g;
        r8 = r8.m;
        r9 = r8.b;
        if (r9 != 0) goto L_0x01fc;
    L_0x01fb:
        goto L_0x01cc;
    L_0x01fc:
        r11 = r10.e;
        r9 = r10.c;
        r8 = r8.b(r9);
        r13 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1));
        if (r13 != 0) goto L_0x0209;
    L_0x0208:
        goto L_0x01cc;
    L_0x0209:
        r8 = 4;
        r10.b(r8);
        r8 = r10.e();
        if (r8 == 0) goto L_0x021e;
    L_0x0213:
        r8 = r0.g;
        r9 = r10.a;
        r8.removeDetachedView(r9, r6);
        r10.f();
        goto L_0x0227;
    L_0x021e:
        r8 = r10.g();
        if (r8 == 0) goto L_0x0227;
    L_0x0224:
        r10.h();
    L_0x0227:
        r0.a(r10);
        r10 = r4;
        goto L_0x024d;
    L_0x022c:
        r1 = new java.lang.IndexOutOfBoundsException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "Inconsistency detected. Invalid view holder adapter position";
        r2.append(r3);
        r2.append(r10);
        r3 = r0.g;
        r3 = r3.a();
        r2.append(r3);
        r2 = r2.toString();
        r1.<init>(r2);
        throw r1;
    L_0x024c:
        r10 = r8;
    L_0x024d:
        r11 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        if (r10 != 0) goto L_0x03a7;
    L_0x0254:
        r13 = r0.g;
        r13 = r13.f;
        r13 = r13.b(r1);
        if (r13 < 0) goto L_0x036f;
    L_0x025e:
        r14 = r0.g;
        r14 = r14.m;
        r14 = r14.a();
        if (r13 >= r14) goto L_0x036f;
    L_0x0268:
        r14 = r0.g;
        r14 = r14.m;
        r14 = r14.a(r13);
        r15 = r0.g;
        r15 = r15.m;
        r5 = r15.b;
        if (r5 == 0) goto L_0x0301;
    L_0x0278:
        r16 = r15.b(r13);
        r5 = r0.a;
        r5 = r5.size();
        r5 = r5 + r7;
    L_0x0283:
        if (r5 < 0) goto L_0x02cb;
    L_0x0285:
        r10 = r0.a;
        r10 = r10.get(r5);
        r10 = (defpackage.aqj) r10;
        r8 = r10.e;
        r15 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1));
        if (r15 == 0) goto L_0x0294;
    L_0x0293:
        goto L_0x02c8;
    L_0x0294:
        r8 = r10.g();
        if (r8 != 0) goto L_0x02c8;
    L_0x029a:
        r8 = r10.f;
        if (r14 == r8) goto L_0x02b0;
    L_0x029e:
        r8 = r0.a;
        r8.remove(r5);
        r8 = r0.g;
        r9 = r10.a;
        r8.removeDetachedView(r9, r6);
        r8 = r10.a;
        r0.b(r8);
        goto L_0x02c8;
    L_0x02b0:
        r10.b(r3);
        r3 = r10.m();
        if (r3 == 0) goto L_0x02fc;
    L_0x02b9:
        r3 = r0.g;
        r3 = r3.L;
        r3 = r3.g;
        if (r3 != 0) goto L_0x02fc;
    L_0x02c1:
        r3 = 2;
        r5 = 14;
        r10.a(r3, r5);
        goto L_0x02fc;
    L_0x02c8:
        r5 = r5 + -1;
        goto L_0x0283;
    L_0x02cb:
        r3 = r0.c;
        r3 = r3.size();
        r3 = r3 + r7;
    L_0x02d2:
        if (r3 < 0) goto L_0x02fb;
    L_0x02d4:
        r5 = r0.c;
        r5 = r5.get(r3);
        r5 = (defpackage.aqj) r5;
        r7 = r5.e;
        r9 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1));
        if (r9 == 0) goto L_0x02e3;
    L_0x02e2:
        goto L_0x02f8;
    L_0x02e3:
        r7 = r5.o();
        if (r7 != 0) goto L_0x02f8;
    L_0x02e9:
        r7 = r5.f;
        if (r14 == r7) goto L_0x02f1;
    L_0x02ed:
        r0.b(r3);
        goto L_0x02fb;
    L_0x02f1:
        r7 = r0.c;
        r7.remove(r3);
        r10 = r5;
        goto L_0x02fc;
    L_0x02f8:
        r3 = r3 + -1;
        goto L_0x02d2;
    L_0x02fb:
        r10 = r4;
    L_0x02fc:
        if (r10 == 0) goto L_0x0301;
    L_0x02fe:
        r10.c = r13;
        r2 = 1;
    L_0x0301:
        if (r10 != 0) goto L_0x0320;
    L_0x0303:
        r3 = r18.d();
        r3 = r3.a(r14);
        if (r3 == 0) goto L_0x031f;
    L_0x030d:
        r3.r();
        r5 = android.support.v7.widget.RecyclerView.a;
        if (r5 == 0) goto L_0x031f;
    L_0x0314:
        r5 = r3.a;
        r7 = r5 instanceof android.view.ViewGroup;
        if (r7 == 0) goto L_0x031f;
    L_0x031a:
        r5 = (android.view.ViewGroup) r5;
        r0.a(r5, r6);
    L_0x031f:
        r10 = r3;
    L_0x0320:
        if (r10 != 0) goto L_0x03a7;
    L_0x0322:
        r7 = android.support.v7.widget.RecyclerView.r();
        r3 = (r20 > r11 ? 1 : (r20 == r11 ? 0 : -1));
        if (r3 == 0) goto L_0x033f;
    L_0x032a:
        r3 = r0.f;
        r3 = r3.b(r14);
        r9 = r3.c;
        r16 = 0;
        r3 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1));
        if (r3 != 0) goto L_0x0339;
    L_0x0338:
        goto L_0x033f;
    L_0x0339:
        r9 = r9 + r7;
        r3 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1));
        if (r3 < 0) goto L_0x033f;
    L_0x033e:
        return r4;
    L_0x033f:
        r3 = r0.g;
        r5 = r3.m;
        r10 = r5.b(r3, r14);
        r3 = android.support.v7.widget.RecyclerView.d;
        if (r3 == 0) goto L_0x035a;
    L_0x034b:
        r3 = r10.a;
        r3 = android.support.v7.widget.RecyclerView.h(r3);
        if (r3 == 0) goto L_0x035a;
    L_0x0353:
        r5 = new java.lang.ref.WeakReference;
        r5.<init>(r3);
        r10.b = r5;
    L_0x035a:
        r16 = android.support.v7.widget.RecyclerView.r();
        r3 = r0.f;
        r3 = r3.b(r14);
        r13 = r3.c;
        r7 = r16 - r7;
        r7 = defpackage.apu.a(r13, r7);
        r3.c = r7;
        goto L_0x03a7;
    L_0x036f:
        r2 = new java.lang.IndexOutOfBoundsException;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "Inconsistency detected. Invalid item position ";
        r3.append(r4);
        r3.append(r1);
        r1 = "(offset:";
        r3.append(r1);
        r3.append(r13);
        r1 = ").state:";
        r3.append(r1);
        r1 = r0.g;
        r1 = r1.L;
        r1 = r1.b();
        r3.append(r1);
        r1 = r0.g;
        r1 = r1.a();
        r3.append(r1);
        r1 = r3.toString();
        r2.<init>(r1);
        throw r2;
    L_0x03a7:
        if (r2 == 0) goto L_0x03da;
    L_0x03a9:
        r3 = r0.g;
        r3 = r3.L;
        r3 = r3.g;
        if (r3 == 0) goto L_0x03b2;
    L_0x03b1:
        goto L_0x03da;
    L_0x03b2:
        r3 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r5 = r10.a(r3);
        if (r5 == 0) goto L_0x03da;
    L_0x03ba:
        r10.a(r6, r3);
        r3 = r0.g;
        r3 = r3.L;
        r3 = r3.j;
        if (r3 == 0) goto L_0x03da;
    L_0x03c5:
        defpackage.aph.e(r10);
        r3 = r0.g;
        r5 = r3.D;
        r3 = r3.L;
        r10.q();
        r3 = defpackage.aph.d(r10);
        r5 = r0.g;
        r5.a(r10, r3);
    L_0x03da:
        r3 = r0.g;
        r3 = r3.L;
        r3 = r3.g;
        if (r3 != 0) goto L_0x03e3;
    L_0x03e2:
        goto L_0x03ef;
    L_0x03e3:
        r3 = r10.l();
        if (r3 == 0) goto L_0x03ef;
    L_0x03e9:
        r10.g = r1;
    L_0x03eb:
        r1 = 0;
        r11 = 1;
        goto L_0x04c0;
    L_0x03ef:
        r3 = r10.l();
        if (r3 == 0) goto L_0x0401;
    L_0x03f5:
        r3 = r10.k();
        if (r3 != 0) goto L_0x0401;
    L_0x03fb:
        r3 = r10.j();
        if (r3 == 0) goto L_0x03eb;
    L_0x0401:
        r3 = r0.g;
        r3 = r3.f;
        r3 = r3.b(r1);
        r5 = r0.g;
        r10.o = r5;
        r5 = r10.f;
        r7 = android.support.v7.widget.RecyclerView.r();
        r9 = (r20 > r11 ? 1 : (r20 == r11 ? 0 : -1));
        if (r9 == 0) goto L_0x042c;
    L_0x0417:
        r9 = r0.f;
        r5 = r9.b(r5);
        r11 = r5.d;
        r13 = 0;
        r5 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1));
        if (r5 != 0) goto L_0x0426;
    L_0x0425:
        goto L_0x042c;
    L_0x0426:
        r11 = r11 + r7;
        r5 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1));
        if (r5 < 0) goto L_0x042c;
    L_0x042b:
        goto L_0x03eb;
    L_0x042c:
        r5 = r0.g;
        r5 = r5.m;
        r10.c = r3;
        r9 = r5.b;
        if (r9 != 0) goto L_0x0437;
    L_0x0436:
        goto L_0x043d;
    L_0x0437:
        r11 = r5.b(r3);
        r10.e = r11;
    L_0x043d:
        r9 = 519; // 0x207 float:7.27E-43 double:2.564E-321;
        r11 = 1;
        r10.a(r11, r9);
        r10.q();
        r5.a(r10, r3);
        r10.p();
        r3 = r10.a;
        r3 = r3.getLayoutParams();
        r5 = r3 instanceof defpackage.apr;
        if (r5 == 0) goto L_0x045a;
    L_0x0456:
        r3 = (defpackage.apr) r3;
        r3.e = r11;
    L_0x045a:
        r11 = android.support.v7.widget.RecyclerView.r();
        r3 = r0.f;
        r5 = r10.f;
        r3 = r3.b(r5);
        r13 = r3.d;
        r11 = r11 - r7;
        r7 = defpackage.apu.a(r13, r11);
        r3.d = r7;
        r3 = r0.g;
        r3 = r3.m();
        if (r3 == 0) goto L_0x04b4;
    L_0x0477:
        r3 = r10.a;
        r5 = defpackage.abe.f(r3);
        r11 = 1;
        if (r5 != 0) goto L_0x0483;
    L_0x0480:
        defpackage.abe.b(r3, r11);
    L_0x0483:
        r5 = defpackage.abe.c(r3);
        if (r5 == 0) goto L_0x0497;
    L_0x0489:
        r4 = r5 instanceof defpackage.aai;
        if (r4 == 0) goto L_0x0492;
    L_0x048d:
        r5 = (defpackage.aai) r5;
        r4 = r5.a;
        goto L_0x0497;
    L_0x0492:
        r4 = new aaj;
        r4.<init>(r5);
    L_0x0497:
        if (r4 == 0) goto L_0x04a5;
    L_0x0499:
        r4 = r4.getClass();
        r5 = defpackage.aaj.class;
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x04b5;
    L_0x04a5:
        r4 = 16384; // 0x4000 float:2.2959E-41 double:8.0948E-320;
        r10.b(r4);
        r4 = r0.g;
        r4 = r4.Q;
        r4 = r4.c;
        defpackage.abe.a(r3, r4);
        goto L_0x04b5;
    L_0x04b4:
        r11 = 1;
    L_0x04b5:
        r3 = r0.g;
        r3 = r3.L;
        r3 = r3.g;
        if (r3 == 0) goto L_0x04bf;
    L_0x04bd:
        r10.g = r1;
    L_0x04bf:
        r1 = 1;
    L_0x04c0:
        r3 = r10.a;
        r3 = r3.getLayoutParams();
        if (r3 != 0) goto L_0x04d6;
    L_0x04c8:
        r3 = r0.g;
        r3 = r3.generateDefaultLayoutParams();
        r3 = (defpackage.apr) r3;
        r4 = r10.a;
        r4.setLayoutParams(r3);
        goto L_0x04ee;
    L_0x04d6:
        r4 = r0.g;
        r4 = r4.checkLayoutParams(r3);
        if (r4 != 0) goto L_0x04ec;
    L_0x04de:
        r4 = r0.g;
        r3 = r4.generateLayoutParams(r3);
        r3 = (defpackage.apr) r3;
        r4 = r10.a;
        r4.setLayoutParams(r3);
        goto L_0x04ee;
    L_0x04ec:
        r3 = (defpackage.apr) r3;
    L_0x04ee:
        r3.c = r10;
        if (r2 != 0) goto L_0x04f3;
    L_0x04f2:
        goto L_0x04f7;
    L_0x04f3:
        if (r1 != 0) goto L_0x04f6;
    L_0x04f5:
        goto L_0x04f7;
    L_0x04f6:
        r6 = 1;
    L_0x04f7:
        r3.f = r6;
        return r10;
    L_0x04fa:
        r2 = new java.lang.IndexOutOfBoundsException;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "Invalid item position ";
        r3.append(r4);
        r3.append(r1);
        r4 = "(";
        r3.append(r4);
        r3.append(r1);
        r1 = "). Item count:";
        r3.append(r1);
        r1 = r0.g;
        r1 = r1.L;
        r1 = r1.b();
        r3.append(r1);
        r1 = r0.g;
        r1 = r1.a();
        r3.append(r1);
        r1 = r3.toString();
        r2.<init>(r1);
        goto L_0x0533;
    L_0x0532:
        throw r2;
    L_0x0533:
        goto L_0x0532;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apw.a(int, long):aqj");
    }

    private final void a(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                a((ViewGroup) childAt, true);
            }
        }
        if (z) {
            if (viewGroup.getVisibility() == 4) {
                viewGroup.setVisibility(0);
                viewGroup.setVisibility(4);
                return;
            }
            int visibility = viewGroup.getVisibility();
            viewGroup.setVisibility(4);
            viewGroup.setVisibility(visibility);
        }
    }

    public final void a(View view) {
        aqj d = RecyclerView.d(view);
        if (d.n()) {
            this.g.removeDetachedView(view, false);
        }
        if (d.e()) {
            d.f();
        } else if (d.g()) {
            d.h();
        }
        a(d);
        if (this.g.D != null && !d.s()) {
            this.g.D.c(d);
        }
    }

    public final void c() {
        int size = this.c.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            b(size);
        }
        this.c.clear();
        if (RecyclerView.d) {
            this.g.K.a();
        }
    }

    public final void b(int i) {
        a((aqj) this.c.get(i), true);
        this.c.remove(i);
    }

    /* Access modifiers changed, original: final */
    public final void a(aqj aqj) {
        boolean z = true;
        int i = 0;
        if (aqj.e() || aqj.a.getParent() != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Scrapped or attached views may not be recycled. isScrap:");
            stringBuilder.append(aqj.e());
            stringBuilder.append(" isAttached:");
            if (aqj.a.getParent() == null) {
                z = false;
            }
            stringBuilder.append(z);
            stringBuilder.append(this.g.a());
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (aqj.n()) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            stringBuilder2.append(aqj);
            stringBuilder2.append(this.g.a());
            throw new IllegalArgumentException(stringBuilder2.toString());
        } else if (aqj.b()) {
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
            stringBuilder3.append(this.g.a());
            throw new IllegalArgumentException(stringBuilder3.toString());
        } else {
            Object obj;
            Object obj2 = ((aqj.j & 16) == 0 && abe.d(aqj.a)) ? 1 : null;
            apa apa = this.g.m;
            if (!(apa == null || obj2 == null || !apa.Y_()) || aqj.s()) {
                if (this.h <= 0 || aqj.a(526)) {
                    obj = null;
                } else {
                    int size = this.c.size();
                    if (size >= this.h && size > 0) {
                        b(0);
                        size--;
                    }
                    if (RecyclerView.d && r3 > 0 && !this.g.K.a(aqj.c)) {
                        while (true) {
                            size--;
                            if (size < 0) {
                                break;
                            }
                            if (!this.g.K.a(((aqj) this.c.get(size)).c)) {
                                break;
                            }
                        }
                        size++;
                    }
                    this.c.add(size, aqj);
                    obj = 1;
                }
                if (obj == null) {
                    a(aqj, true);
                    i = 1;
                }
            } else {
                obj = null;
            }
            this.g.h.d(aqj);
            if (obj == null && i == 0 && obj2 != null) {
                aqj.o = null;
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(aqj aqj, boolean z) {
        RecyclerView.b(aqj);
        if (aqj.a(16384)) {
            aqj.a(0, 16384);
            abe.a(aqj.a, null);
        }
        if (z) {
            apz apz = this.g.o;
            if (apz != null) {
                apz.a(aqj);
            }
            apa apa = this.g.m;
            if (apa != null) {
                apa.a(aqj);
            }
            RecyclerView recyclerView = this.g;
            if (recyclerView.L != null) {
                recyclerView.h.d(aqj);
            }
        }
        aqj.o = null;
        d().a(aqj);
    }

    /* Access modifiers changed, original: final */
    public final void b(View view) {
        aqj d = RecyclerView.d(view);
        d.k = null;
        d.l = false;
        d.h();
        a(d);
    }

    /* Access modifiers changed, original: final */
    public final void c(View view) {
        aqj d = RecyclerView.d(view);
        if (!d.a(12) && d.t()) {
            aph aph = this.g.D;
            if (!(aph == null || aph.a(d, d.q()))) {
                if (this.b == null) {
                    this.b = new ArrayList();
                }
                d.a(this, true);
                this.b.add(d);
                return;
            }
        }
        if (!d.j() || d.m() || this.g.m.b) {
            d.a(this, false);
            this.a.add(d);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
        stringBuilder.append(this.g.a());
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final void b(aqj aqj) {
        if (aqj.l) {
            this.b.remove(aqj);
        } else {
            this.a.remove(aqj);
        }
        aqj.k = null;
        aqj.l = false;
        aqj.h();
    }

    public final apu d() {
        if (this.f == null) {
            this.f = new apu();
        }
        return this.f;
    }
}
