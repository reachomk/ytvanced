package defpackage;

import android.content.Context;
import android.os.Handler;

/* renamed from: yor */
public final class yor extends yig {
    public final yxl f;
    public final String g;
    public final ywk h;
    public ylf i;
    public ymh j;
    public bbnc k;
    private final String l;

    public yor(Context context, Handler handler, String str, ywk ywk, yxl yxl, String str2) {
        super(context, handler, ywk.i, ywk);
        this.l = xvd.a(str);
        this.f = (yxl) amqw.a((Object) yxl);
        yxl.a = new you(this);
        this.g = xvd.a(str2);
        this.h = (ywk) amqw.a((Object) ywk);
        yxl.a(false);
    }

    /* Access modifiers changed, original: protected|final */
    public final yih b() {
        return new yih(this.l, null, new yot(this), null);
    }

    public final void bl_() {
        super.bl_();
        yor.a(this.k);
    }

    /* JADX WARNING: Missing block: B:7:0x0015, code skipped:
            if (r0 != 0) goto L_0x0019;
     */
    public final boolean f() {
        /*
        r4 = this;
        r0 = r4.i;
        r1 = 0;
        if (r0 == 0) goto L_0x002e;
    L_0x0005:
        r0 = r4.j;
        r2 = 1;
        if (r0 == 0) goto L_0x0018;
    L_0x000a:
        r3 = r0.a;
        r3 = r3 & r2;
        if (r3 == 0) goto L_0x0018;
    L_0x000f:
        r0 = r0.b;
        r0 = defpackage.ymj.a(r0);
        if (r0 == 0) goto L_0x0018;
    L_0x0017:
        goto L_0x0019;
    L_0x0018:
        r0 = 1;
    L_0x0019:
        r3 = 2;
        if (r0 == r3) goto L_0x002d;
    L_0x001c:
        r3 = 3;
        if (r0 != r3) goto L_0x0021;
    L_0x001f:
        r2 = 0;
        goto L_0x002d;
    L_0x0021:
        r0 = r4.i;
        r3 = r4.g;
        r0 = r0.b(r3);
        if (r0 == 0) goto L_0x002c;
    L_0x002b:
        goto L_0x002d;
    L_0x002c:
        return r1;
    L_0x002d:
        return r2;
    L_0x002e:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yor.f():boolean");
    }

    public static void a(bbnc bbnc) {
        if (bbnc != null && !bbnc.c()) {
            bbnc.bK_();
        }
    }
}
