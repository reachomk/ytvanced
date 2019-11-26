package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;

/* renamed from: jur */
public final class jur implements fgt {
    public ffu a = ffu.a;
    private final bcaa b;
    private final Handler c = new juq(this, Looper.getMainLooper());

    public jur(bcaa bcaa) {
        this.b = bcaa;
    }

    /* JADX WARNING: Missing block: B:6:0x000a, code skipped:
            if (r5 != 4) goto L_0x0063;
     */
    public final void a(defpackage.ffu r3, int r4, int r5) {
        /*
        r2 = this;
        r4 = 0;
        r0 = 1;
        if (r5 == 0) goto L_0x003a;
    L_0x0004:
        if (r5 == r0) goto L_0x0034;
    L_0x0006:
        r1 = 2;
        if (r5 == r1) goto L_0x000d;
    L_0x0009:
        r1 = 4;
        if (r5 == r1) goto L_0x003a;
    L_0x000c:
        goto L_0x0063;
    L_0x000d:
        r5 = r3.a();
        r0 = defpackage.jur.a(r5);
        if (r0 == 0) goto L_0x001f;
    L_0x0017:
        r3 = r5.b();
        r3.c();
        goto L_0x002e;
    L_0x001f:
        r5 = r2.b;
        r5 = r5.get();
        r5 = (defpackage.xpw) r5;
        r3 = r3.b();
        r5.a(r3);
    L_0x002e:
        r3 = r2.c;
        r3.sendEmptyMessage(r4);
        return;
    L_0x0034:
        r3.a(r0);
        r2.a = r3;
        return;
    L_0x003a:
        r5 = defpackage.ffu.a;
        r2.a = r5;
        r5 = r2.c;
        r5.removeMessages(r4);
        r3.a(r4);
        r4 = r3.a();
        r4 = defpackage.jur.a(r4);
        if (r4 != 0) goto L_0x0063;
    L_0x0050:
        r4 = r2.b;
        r4 = r4.get();
        r4 = (defpackage.xpw) r4;
        r5 = 0;
        r4.a(r5);
        r3 = r3.b();
        defpackage.jur.a(r3, r0);
    L_0x0063:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jur.a(ffu, int, int):void");
    }

    public static boolean a(fgz fgz) {
        return (fgz == null || fgz.b() == null) ? false : true;
    }

    public static void a(View view, int i) {
        if (view != null) {
            view.animate().cancel();
            view.setAlpha((float) i);
        }
    }
}
