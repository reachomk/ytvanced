package defpackage;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.util.ArrayList;

/* renamed from: bhe */
final class bhe implements OnAttachStateChangeListener, OnPreDrawListener {
    public final ViewGroup a;
    private final bgx b;

    bhe(bgx bgx, ViewGroup viewGroup) {
        this.b = bgx;
        this.a = viewGroup;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    private final void a() {
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        this.a.removeOnAttachStateChangeListener(this);
    }

    public final void onViewDetachedFromWindow(View view) {
        a();
        bhf.a.remove(this.a);
        ArrayList arrayList = (ArrayList) bhf.a().get(this.a);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((bgx) arrayList.get(i)).f(this.a);
            }
        }
        this.b.a(true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01da A:{SYNTHETIC, EDGE_INSN: B:132:0x01da->B:86:0x01da ?: BREAK  , EDGE_INSN: B:132:0x01da->B:86:0x01da ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x026a A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x020e  */
    public final boolean onPreDraw() {
        /*
        r19 = this;
        r0 = r19;
        r19.a();
        r1 = defpackage.bhf.a;
        r2 = r0.a;
        r1 = r1.remove(r2);
        r2 = 1;
        if (r1 == 0) goto L_0x029a;
    L_0x0010:
        r1 = defpackage.bhf.a();
        r3 = r0.a;
        r3 = r1.get(r3);
        r3 = (java.util.ArrayList) r3;
        if (r3 != 0) goto L_0x002a;
    L_0x001e:
        r3 = new java.util.ArrayList;
        r3.<init>();
        r5 = r0.a;
        r1.put(r5, r3);
    L_0x0028:
        r5 = 0;
        goto L_0x0035;
    L_0x002a:
        r5 = r3.size();
        if (r5 <= 0) goto L_0x0028;
    L_0x0030:
        r5 = new java.util.ArrayList;
        r5.<init>(r3);
    L_0x0035:
        r6 = r0.b;
        r3.add(r6);
        r3 = r0.b;
        r6 = new bhh;
        r6.<init>(r0, r1);
        r3.a(r6);
        r1 = r0.b;
        r3 = r0.a;
        r6 = 0;
        r1.a(r3, r6);
        if (r5 != 0) goto L_0x004f;
    L_0x004e:
        goto L_0x0064;
    L_0x004f:
        r1 = r5.size();
        r3 = 0;
    L_0x0054:
        if (r3 >= r1) goto L_0x0064;
    L_0x0056:
        r7 = r5.get(r3);
        r7 = (defpackage.bgx) r7;
        r8 = r0.a;
        r7.f(r8);
        r3 = r3 + 1;
        goto L_0x0054;
    L_0x0064:
        r1 = r0.b;
        r8 = r0.a;
        r3 = new java.util.ArrayList;
        r3.<init>();
        r1.m = r3;
        r3 = new java.util.ArrayList;
        r3.<init>();
        r1.n = r3;
        r3 = r1.i;
        r5 = r1.j;
        r7 = new zj;
        r9 = r3.a;
        r7.<init>(r9);
        r9 = new zj;
        r10 = r5.a;
        r9.<init>(r10);
        r10 = 0;
    L_0x0089:
        r11 = r1.l;
        r12 = r11.length;
        if (r10 >= r12) goto L_0x01da;
    L_0x008e:
        r11 = r11[r10];
        if (r11 == r2) goto L_0x019a;
    L_0x0092:
        r12 = 2;
        if (r11 == r12) goto L_0x014c;
    L_0x0095:
        r12 = 3;
        if (r11 == r12) goto L_0x00f7;
    L_0x0098:
        r12 = 4;
        if (r11 == r12) goto L_0x009e;
    L_0x009b:
        r4 = r5;
        goto L_0x01d1;
    L_0x009e:
        r11 = r3.c;
        r12 = r5.c;
        r13 = r11.b();
        r14 = 0;
    L_0x00a7:
        if (r14 >= r13) goto L_0x009b;
    L_0x00a9:
        r15 = r11.c(r14);
        r15 = (android.view.View) r15;
        if (r15 != 0) goto L_0x00b4;
    L_0x00b1:
        r17 = r5;
        goto L_0x00f0;
    L_0x00b4:
        r16 = r1.b(r15);
        if (r16 == 0) goto L_0x00b1;
    L_0x00ba:
        r17 = r5;
        r4 = r11.b(r14);
        r4 = r12.a(r4);
        r4 = (android.view.View) r4;
        if (r4 == 0) goto L_0x00f0;
    L_0x00c8:
        r5 = r1.b(r4);
        if (r5 == 0) goto L_0x00f0;
    L_0x00ce:
        r5 = r7.get(r15);
        r5 = (defpackage.bhn) r5;
        r18 = r9.get(r4);
        r6 = r18;
        r6 = (defpackage.bhn) r6;
        if (r5 == 0) goto L_0x00f0;
    L_0x00de:
        if (r6 == 0) goto L_0x00f0;
    L_0x00e0:
        r2 = r1.m;
        r2.add(r5);
        r2 = r1.n;
        r2.add(r6);
        r7.remove(r15);
        r9.remove(r4);
    L_0x00f0:
        r14 = r14 + 1;
        r5 = r17;
        r2 = 1;
        r6 = 0;
        goto L_0x00a7;
    L_0x00f7:
        r17 = r5;
        r2 = r3.b;
        r4 = r17;
        r5 = r4.b;
        r6 = r2.size();
        r11 = 0;
    L_0x0104:
        if (r11 >= r6) goto L_0x01d1;
    L_0x0106:
        r12 = r2.valueAt(r11);
        r12 = (android.view.View) r12;
        if (r12 != 0) goto L_0x010f;
    L_0x010e:
        goto L_0x0147;
    L_0x010f:
        r13 = r1.b(r12);
        if (r13 == 0) goto L_0x0147;
    L_0x0115:
        r13 = r2.keyAt(r11);
        r13 = r5.get(r13);
        r13 = (android.view.View) r13;
        if (r13 == 0) goto L_0x0147;
    L_0x0121:
        r14 = r1.b(r13);
        if (r14 == 0) goto L_0x0147;
    L_0x0127:
        r14 = r7.get(r12);
        r14 = (defpackage.bhn) r14;
        r15 = r9.get(r13);
        r15 = (defpackage.bhn) r15;
        if (r14 == 0) goto L_0x0147;
    L_0x0135:
        if (r15 == 0) goto L_0x0147;
    L_0x0137:
        r0 = r1.m;
        r0.add(r14);
        r0 = r1.n;
        r0.add(r15);
        r7.remove(r12);
        r9.remove(r13);
    L_0x0147:
        r11 = r11 + 1;
        r0 = r19;
        goto L_0x0104;
    L_0x014c:
        r4 = r5;
        r0 = r3.d;
        r2 = r4.d;
        r5 = r0.b;
        r6 = 0;
    L_0x0154:
        if (r6 >= r5) goto L_0x01d1;
    L_0x0156:
        r11 = r0.c(r6);
        r11 = (android.view.View) r11;
        if (r11 != 0) goto L_0x015f;
    L_0x015e:
        goto L_0x0197;
    L_0x015f:
        r12 = r1.b(r11);
        if (r12 == 0) goto L_0x0197;
    L_0x0165:
        r12 = r0.b(r6);
        r12 = r2.get(r12);
        r12 = (android.view.View) r12;
        if (r12 == 0) goto L_0x0197;
    L_0x0171:
        r13 = r1.b(r12);
        if (r13 == 0) goto L_0x0197;
    L_0x0177:
        r13 = r7.get(r11);
        r13 = (defpackage.bhn) r13;
        r14 = r9.get(r12);
        r14 = (defpackage.bhn) r14;
        if (r13 == 0) goto L_0x0197;
    L_0x0185:
        if (r14 == 0) goto L_0x0197;
    L_0x0187:
        r15 = r1.m;
        r15.add(r13);
        r13 = r1.n;
        r13.add(r14);
        r7.remove(r11);
        r9.remove(r12);
    L_0x0197:
        r6 = r6 + 1;
        goto L_0x0154;
    L_0x019a:
        r4 = r5;
        r0 = r7.b;
    L_0x019d:
        r0 = r0 + -1;
        if (r0 < 0) goto L_0x01d1;
    L_0x01a1:
        r2 = r7.b(r0);
        r2 = (android.view.View) r2;
        if (r2 != 0) goto L_0x01aa;
    L_0x01a9:
        goto L_0x01d0;
    L_0x01aa:
        r5 = r1.b(r2);
        if (r5 == 0) goto L_0x01d0;
    L_0x01b0:
        r2 = r9.remove(r2);
        r2 = (defpackage.bhn) r2;
        if (r2 == 0) goto L_0x01d0;
    L_0x01b8:
        r5 = r2.b;
        r5 = r1.b(r5);
        if (r5 == 0) goto L_0x01d0;
    L_0x01c0:
        r5 = r7.d(r0);
        r5 = (defpackage.bhn) r5;
        r6 = r1.m;
        r6.add(r5);
        r5 = r1.n;
        r5.add(r2);
    L_0x01d0:
        goto L_0x019d;
    L_0x01d1:
        r10 = r10 + 1;
        r2 = 1;
        r6 = 0;
        r0 = r19;
        r5 = r4;
        goto L_0x0089;
    L_0x01da:
        r0 = 0;
    L_0x01db:
        r2 = r7.b;
        if (r0 < r2) goto L_0x027b;
    L_0x01df:
        r0 = 0;
    L_0x01e0:
        r2 = r9.b;
        if (r0 >= r2) goto L_0x0200;
    L_0x01e4:
        r2 = r9.c(r0);
        r2 = (defpackage.bhn) r2;
        r3 = r2.b;
        r3 = r1.b(r3);
        if (r3 == 0) goto L_0x01fd;
    L_0x01f2:
        r3 = r1.n;
        r3.add(r2);
        r2 = r1.m;
        r3 = 0;
        r2.add(r3);
    L_0x01fd:
        r0 = r0 + 1;
        goto L_0x01e0;
    L_0x0200:
        r0 = defpackage.bgx.b();
        r2 = r0.b;
        r3 = defpackage.bht.a(r8);
    L_0x020a:
        r2 = r2 + -1;
        if (r2 < 0) goto L_0x026a;
    L_0x020e:
        r4 = r0.b(r2);
        r4 = (android.animation.Animator) r4;
        if (r4 == 0) goto L_0x0269;
    L_0x0216:
        r5 = r0.get(r4);
        r5 = (defpackage.bhb) r5;
        if (r5 != 0) goto L_0x021f;
    L_0x021e:
        goto L_0x0269;
    L_0x021f:
        r6 = r5.a;
        if (r6 == 0) goto L_0x0269;
    L_0x0223:
        r6 = r5.d;
        r6 = r3.equals(r6);
        if (r6 == 0) goto L_0x0269;
    L_0x022b:
        r6 = r5.c;
        r7 = r5.a;
        r9 = 1;
        r10 = r1.a(r7, r9);
        r11 = r1.b(r7, r9);
        if (r10 == 0) goto L_0x023b;
    L_0x023a:
        goto L_0x0248;
    L_0x023b:
        if (r11 != 0) goto L_0x0248;
    L_0x023d:
        r9 = r1.j;
        r9 = r9.a;
        r7 = r9.get(r7);
        r11 = r7;
        r11 = (defpackage.bhn) r11;
    L_0x0248:
        if (r10 == 0) goto L_0x024b;
    L_0x024a:
        goto L_0x024d;
    L_0x024b:
        if (r11 == 0) goto L_0x0269;
    L_0x024d:
        r5 = r5.e;
        r5 = r5.a(r6, r11);
        if (r5 == 0) goto L_0x0269;
    L_0x0255:
        r5 = r4.isRunning();
        if (r5 != 0) goto L_0x0266;
    L_0x025b:
        r5 = r4.isStarted();
        if (r5 == 0) goto L_0x0262;
    L_0x0261:
        goto L_0x0266;
    L_0x0262:
        r0.remove(r4);
        goto L_0x0269;
    L_0x0266:
        r4.cancel();
    L_0x0269:
        goto L_0x020a;
    L_0x026a:
        r9 = r1.i;
        r10 = r1.j;
        r11 = r1.m;
        r12 = r1.n;
        r7 = r1;
        r7.a(r8, r9, r10, r11, r12);
        r1.c();
        r0 = 1;
        return r0;
    L_0x027b:
        r2 = r7.c(r0);
        r2 = (defpackage.bhn) r2;
        r3 = r2.b;
        r3 = r1.b(r3);
        if (r3 == 0) goto L_0x0295;
    L_0x0289:
        r3 = r1.m;
        r3.add(r2);
        r2 = r1.n;
        r3 = 0;
        r2.add(r3);
        goto L_0x0296;
    L_0x0295:
        r3 = 0;
    L_0x0296:
        r0 = r0 + 1;
        goto L_0x01db;
    L_0x029a:
        r0 = 1;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bhe.onPreDraw():boolean");
    }
}
