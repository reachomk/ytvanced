package defpackage;

import android.content.Context;

/* renamed from: rbz */
public final class rbz extends rhf {
    private static final rih d = new rih();
    private final Context e;
    private qoh f = null;

    public rbz(qui qui, String str, String str2, qpa qpa, int i, Context context, qoh qoh) {
        super(qui, str, str2, qpa, i, 27);
        this.e = context;
        this.f = qoh;
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0100  */
    /* JADX WARNING: Missing exception handler attribute for start block: B:58:0x00fa */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:48|49|(1:51)(1:52)|53|(2:55|(1:57))|58|59|(1:61)) */
    public final void a() {
        /*
        r10 = this;
        r0 = d;
        r1 = r10.e;
        r1 = r1.getPackageName();
        r0 = r0.a(r1);
        monitor-enter(r0);
        r1 = r0.get();	 Catch:{ all -> 0x0132 }
        r1 = (defpackage.qrh) r1;	 Catch:{ all -> 0x0132 }
        if (r1 == 0) goto L_0x0031;
    L_0x0015:
        r2 = r1.a;	 Catch:{ all -> 0x0132 }
        r2 = defpackage.qyb.b(r2);	 Catch:{ all -> 0x0132 }
        if (r2 != 0) goto L_0x0031;
    L_0x001d:
        r2 = r1.a;	 Catch:{ all -> 0x0132 }
        r3 = "E";
        r2 = r2.equals(r3);	 Catch:{ all -> 0x0132 }
        if (r2 != 0) goto L_0x0031;
    L_0x0027:
        r1 = r1.a;	 Catch:{ all -> 0x0132 }
        r2 = "0000000000000000000000000000000000000000000000000000000000000000";
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0132 }
        if (r1 == 0) goto L_0x0105;
    L_0x0031:
        r1 = r10.f;	 Catch:{ all -> 0x0132 }
        r1 = defpackage.rbz.a(r1);	 Catch:{ all -> 0x0132 }
        r1 = defpackage.qyb.b(r1);	 Catch:{ all -> 0x0132 }
        r2 = 4;
        r3 = 1;
        r4 = 3;
        r5 = 2;
        r6 = 0;
        if (r1 == 0) goto L_0x009a;
    L_0x0042:
        r1 = r10.f;	 Catch:{ all -> 0x0132 }
        r7 = defpackage.rbz.a(r1);	 Catch:{ all -> 0x0132 }
        r7 = defpackage.qyb.b(r7);	 Catch:{ all -> 0x0132 }
        if (r7 != 0) goto L_0x0050;
    L_0x004e:
        r1 = 0;
        goto L_0x0060;
    L_0x0050:
        if (r1 == 0) goto L_0x004e;
    L_0x0052:
        r1 = r1.a;	 Catch:{ all -> 0x0132 }
        if (r1 == 0) goto L_0x004e;
    L_0x0056:
        r1 = r1.a;	 Catch:{ all -> 0x0132 }
        r1 = r1.intValue();	 Catch:{ all -> 0x0132 }
        if (r1 == r4) goto L_0x005f;
    L_0x005e:
        goto L_0x004e;
    L_0x005f:
        r1 = 1;
    L_0x0060:
        r1 = java.lang.Boolean.valueOf(r1);	 Catch:{ all -> 0x0132 }
        r1 = r1.booleanValue();	 Catch:{ all -> 0x0132 }
        if (r1 == 0) goto L_0x0098;
    L_0x006a:
        r1 = r10.a;	 Catch:{ all -> 0x0132 }
        r1 = r1.n;	 Catch:{ all -> 0x0132 }
        if (r1 != 0) goto L_0x0071;
    L_0x0070:
        goto L_0x0098;
    L_0x0071:
        r1 = defpackage.roe.o;	 Catch:{ all -> 0x0132 }
        r7 = defpackage.rlj.d();	 Catch:{ all -> 0x0132 }
        r1 = r7.a(r1);	 Catch:{ all -> 0x0132 }
        r1 = (java.lang.Boolean) r1;	 Catch:{ all -> 0x0132 }
        r1 = r1.booleanValue();	 Catch:{ all -> 0x0132 }
        if (r1 == 0) goto L_0x0098;
    L_0x0083:
        r1 = defpackage.roe.p;	 Catch:{ all -> 0x0132 }
        r7 = defpackage.rlj.d();	 Catch:{ all -> 0x0132 }
        r1 = r7.a(r1);	 Catch:{ all -> 0x0132 }
        r1 = (java.lang.Boolean) r1;	 Catch:{ all -> 0x0132 }
        r1 = r1.booleanValue();	 Catch:{ all -> 0x0132 }
        if (r1 != 0) goto L_0x0096;
    L_0x0095:
        goto L_0x0098;
    L_0x0096:
        r1 = 3;
        goto L_0x009b;
    L_0x0098:
        r1 = 2;
        goto L_0x009b;
    L_0x009a:
        r1 = 4;
    L_0x009b:
        r7 = r10.c;	 Catch:{ all -> 0x0132 }
        r8 = new java.lang.Object[r4];	 Catch:{ all -> 0x0132 }
        r9 = r10.e;	 Catch:{ all -> 0x0132 }
        r8[r6] = r9;	 Catch:{ all -> 0x0132 }
        if (r1 != r5) goto L_0x00a6;
    L_0x00a5:
        r6 = 1;
    L_0x00a6:
        r6 = java.lang.Boolean.valueOf(r6);	 Catch:{ all -> 0x0132 }
        r8[r3] = r6;	 Catch:{ all -> 0x0132 }
        r3 = defpackage.roe.i;	 Catch:{ all -> 0x0132 }
        r6 = defpackage.rlj.d();	 Catch:{ all -> 0x0132 }
        r3 = r6.a(r3);	 Catch:{ all -> 0x0132 }
        r8[r5] = r3;	 Catch:{ all -> 0x0132 }
        r3 = 0;
        r5 = r7.invoke(r3, r8);	 Catch:{ all -> 0x0132 }
        r5 = (java.lang.String) r5;	 Catch:{ all -> 0x0132 }
        r6 = new qrh;	 Catch:{ all -> 0x0132 }
        r6.<init>(r5);	 Catch:{ all -> 0x0132 }
        r5 = r6.a;	 Catch:{ all -> 0x0132 }
        r5 = defpackage.qyb.b(r5);	 Catch:{ all -> 0x0132 }
        if (r5 != 0) goto L_0x00d7;
    L_0x00cc:
        r5 = r6.a;	 Catch:{ all -> 0x0132 }
        r7 = "E";
        r5 = r5.equals(r7);	 Catch:{ all -> 0x0132 }
        if (r5 != 0) goto L_0x00d7;
    L_0x00d6:
        goto L_0x0102;
    L_0x00d7:
        if (r1 == r4) goto L_0x00e5;
    L_0x00d9:
        if (r1 == r2) goto L_0x00dc;
    L_0x00db:
        goto L_0x0102;
    L_0x00dc:
        r1 = r10.f;	 Catch:{ all -> 0x0132 }
        r1 = r1.b;	 Catch:{ all -> 0x0132 }
        r1 = r1.a;	 Catch:{ all -> 0x0132 }
        r6.a = r1;	 Catch:{ all -> 0x0132 }
        goto L_0x0102;
    L_0x00e5:
        r1 = r10.a;	 Catch:{ InterruptedException | ExecutionException -> 0x00fa, InterruptedException | ExecutionException -> 0x00fa }
        r1 = r1.k;	 Catch:{ InterruptedException | ExecutionException -> 0x00fa, InterruptedException | ExecutionException -> 0x00fa }
        if (r1 != 0) goto L_0x00ec;
    L_0x00eb:
        goto L_0x00ef;
    L_0x00ec:
        r1.get();	 Catch:{ InterruptedException | ExecutionException -> 0x00fa, InterruptedException | ExecutionException -> 0x00fa }
    L_0x00ef:
        r1 = r10.a;	 Catch:{ InterruptedException | ExecutionException -> 0x00fa, InterruptedException | ExecutionException -> 0x00fa }
        r1 = r1.j;	 Catch:{ InterruptedException | ExecutionException -> 0x00fa, InterruptedException | ExecutionException -> 0x00fa }
        if (r1 == 0) goto L_0x00fa;
    L_0x00f5:
        r1 = r1.n;	 Catch:{ InterruptedException | ExecutionException -> 0x00fa, InterruptedException | ExecutionException -> 0x00fa }
        if (r1 == 0) goto L_0x00fa;
    L_0x00f9:
        r3 = r1;
    L_0x00fa:
        r1 = defpackage.qyb.b(r3);	 Catch:{ all -> 0x0132 }
        if (r1 != 0) goto L_0x0102;
    L_0x0100:
        r6.a = r3;	 Catch:{ all -> 0x0132 }
    L_0x0102:
        r0.set(r6);	 Catch:{ all -> 0x0132 }
    L_0x0105:
        r1 = r0.get();	 Catch:{ all -> 0x0132 }
        r1 = (defpackage.qrh) r1;	 Catch:{ all -> 0x0132 }
        monitor-exit(r0);	 Catch:{ all -> 0x0132 }
        r2 = r10.b;
        monitor-enter(r2);
        if (r1 == 0) goto L_0x012d;
    L_0x0111:
        r0 = r10.b;	 Catch:{ all -> 0x012f }
        r3 = r1.a;	 Catch:{ all -> 0x012f }
        r0.n = r3;	 Catch:{ all -> 0x012f }
        r3 = r1.b;	 Catch:{ all -> 0x012f }
        r3 = java.lang.Long.valueOf(r3);	 Catch:{ all -> 0x012f }
        r0.t = r3;	 Catch:{ all -> 0x012f }
        r0 = r10.b;	 Catch:{ all -> 0x012f }
        r3 = r1.c;	 Catch:{ all -> 0x012f }
        r0.s = r3;	 Catch:{ all -> 0x012f }
        r3 = r1.d;	 Catch:{ all -> 0x012f }
        r0.C = r3;	 Catch:{ all -> 0x012f }
        r1 = r1.e;	 Catch:{ all -> 0x012f }
        r0.D = r1;	 Catch:{ all -> 0x012f }
    L_0x012d:
        monitor-exit(r2);	 Catch:{ all -> 0x012f }
        return;
    L_0x012f:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x012f }
        throw r0;
    L_0x0132:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0132 }
        goto L_0x0136;
    L_0x0135:
        throw r1;
    L_0x0136:
        goto L_0x0135;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rbz.a():void");
    }

    private static String a(qoh qoh) {
        if (qoh != null) {
            qom qom = qoh.b;
            if (!(qom == null || qyb.b(qom.a))) {
                return qoh.b.a;
            }
        }
        return null;
    }
}
