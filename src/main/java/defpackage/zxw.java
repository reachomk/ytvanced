package defpackage;

import java.util.concurrent.Executor;

/* renamed from: zxw */
public final class zxw implements baqa {
    private final bcaa a;
    private final bcaa b;

    private zxw(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static zxw a(bcaa bcaa, bcaa bcaa2) {
        return new zxw(bcaa, bcaa2);
    }

    /* JADX WARNING: Missing block: B:9:0x0015, code skipped:
            if (r1.b != false) goto L_0x001d;
     */
    public static java.util.concurrent.Executor a(java.util.concurrent.Executor r0, defpackage.zyw r1) {
        /*
        r1 = r1.a();
        if (r1 != 0) goto L_0x0007;
    L_0x0006:
        goto L_0x0018;
    L_0x0007:
        r1 = r1.i;
        if (r1 != 0) goto L_0x000d;
    L_0x000b:
        r1 = defpackage.auya.J;
    L_0x000d:
        r1 = r1.o;
        if (r1 != 0) goto L_0x0013;
    L_0x0011:
        r1 = defpackage.awmw.c;
    L_0x0013:
        r1 = r1.b;
        if (r1 == 0) goto L_0x0018;
    L_0x0017:
        goto L_0x001d;
    L_0x0018:
        r0 = new xaj;
        r0.<init>();
    L_0x001d:
        r1 = "Cannot return null from a non-@Nullable @Provides method";
        r0 = defpackage.baqd.a(r0, r1);
        r0 = (java.util.concurrent.Executor) r0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zxw.a(java.util.concurrent.Executor, zyw):java.util.concurrent.Executor");
    }

    public final /* synthetic */ Object get() {
        return zxw.a((Executor) this.a.get(), (zyw) this.b.get());
    }
}
