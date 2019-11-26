package defpackage;

import android.util.Pair;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

/* renamed from: agsa */
public final class agsa extends airv {
    private final bcaa j;
    private final bcaa k;
    private final zzl l;
    private final agwm m;
    private Pair n;
    private afzi o;
    private final ahdm p;

    public agsa(xci xci, abfc abfc, bcaa bcaa, bcaa bcaa2, Executor executor, Executor executor2, Set set, ahhq ahhq, zzl zzl, abfd abfd, xsc xsc, agwm agwm, xua xua, ahdm ahdm) {
        super(xci, abfc, executor, executor2, set, ahhq, abfd, xsc, zzl, xua);
        this.j = bcaa;
        this.k = bcaa2;
        this.l = zzl;
        this.m = agwm;
        this.p = ahdm;
    }

    public agsa(xci xci, abfc abfc, bcaa bcaa, bcaa bcaa2, Executor executor, Executor executor2, List list, zzl zzl, agwm agwm, xua xua, ahdm ahdm) {
        super(xci, abfc, executor, executor2, list, xua);
        this.j = (bcaa) amqw.a((Object) bcaa);
        this.k = (bcaa) amqw.a((Object) bcaa2);
        this.l = zzl;
        this.m = agwm;
        this.p = ahdm;
    }

    public final anjv a(aiqq aiqq, String str, int i, aajf aajf, aaje aaje, boolean z, aiqw aiqw) {
        Object b;
        String b2 = aiqq.b();
        String b3 = aiqq.b();
        if (a()) {
            b = ((agwc) this.j.get()).b().p().b(b3);
        } else {
            b = new FutureTask(agrz.a);
        }
        this.n = new Pair(b2, b);
        this.c.execute((Runnable) this.n.second);
        return super.a(aiqq, str, i, aajf, aaje, z, aiqw);
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Missing block: B:67:0x0117, code skipped:
            if (a(r1.b) != false) goto L_0x0119;
     */
    public final defpackage.aakj a(java.lang.String r14, defpackage.aakj r15) {
        /*
        r13 = this;
        r0 = r13.a();
        r1 = 0;
        if (r0 == 0) goto L_0x0045;
    L_0x0007:
        r0 = r13.l;
        if (r0 == 0) goto L_0x0045;
    L_0x000b:
        r2 = r0.b();
        if (r2 == 0) goto L_0x0045;
    L_0x0011:
        r0 = r0.b();
        r0 = r0.h;
        if (r0 != 0) goto L_0x001b;
    L_0x0019:
        r0 = defpackage.avoa.w;
    L_0x001b:
        r0 = r0.m;
        if (r0 == 0) goto L_0x0045;
    L_0x001f:
        r0 = r13.j;
        r0 = r0.get();
        r0 = (defpackage.agwc) r0;
        r0 = r0.b();
        r0 = r0.k();
        r14 = r0.a(r14);
        if (r14 == 0) goto L_0x003a;
    L_0x0035:
        r14 = r14.e();
        goto L_0x003b;
    L_0x003a:
        r14 = r1;
    L_0x003b:
        if (r14 == 0) goto L_0x0045;
    L_0x003d:
        r0 = new aaft;
        r0.<init>(r14);
        r15.a(r0);
    L_0x0045:
        r14 = r13.a();
        if (r14 == 0) goto L_0x0170;
    L_0x004b:
        r14 = r13.j;
        r14 = r14.get();
        r14 = (defpackage.agwc) r14;
        r14 = r14.b();
        r14 = r14.j();
        r13.o = r14;
        r14 = r13.n;
        if (r14 == 0) goto L_0x007e;
    L_0x0061:
        r14 = r15.b();
        r0 = r13.n;
        r0 = r0.first;
        r14 = r14.equals(r0);
        if (r14 == 0) goto L_0x007e;
    L_0x006f:
        r14 = r13.n;	 Catch:{ InterruptedException | ExecutionException -> 0x007d, InterruptedException | ExecutionException -> 0x007d }
        r14 = r14.second;	 Catch:{ InterruptedException | ExecutionException -> 0x007d, InterruptedException | ExecutionException -> 0x007d }
        r14 = (java.util.concurrent.RunnableFuture) r14;	 Catch:{ InterruptedException | ExecutionException -> 0x007d, InterruptedException | ExecutionException -> 0x007d }
        r14 = r14.get();	 Catch:{ InterruptedException | ExecutionException -> 0x007d, InterruptedException | ExecutionException -> 0x007d }
        r14 = (defpackage.agqn) r14;	 Catch:{ InterruptedException | ExecutionException -> 0x007d, InterruptedException | ExecutionException -> 0x007d }
        r1 = r14;
        goto L_0x007e;
    L_0x007e:
        if (r1 == 0) goto L_0x0170;
    L_0x0080:
        r14 = r13.o;
        if (r14 == 0) goto L_0x0170;
    L_0x0084:
        r14 = r13.l;	 Catch:{ aocg -> 0x0170 }
        r0 = r15.n();	 Catch:{ aocg -> 0x0170 }
        r2 = 0;
        if (r14 != 0) goto L_0x008f;
    L_0x008e:
        goto L_0x00ef;
    L_0x008f:
        r4 = r14.b();	 Catch:{ aocg -> 0x0170 }
        if (r4 == 0) goto L_0x00ef;
    L_0x0095:
        r14 = r14.b();	 Catch:{ aocg -> 0x0170 }
        r14 = r14.h;	 Catch:{ aocg -> 0x0170 }
        if (r14 != 0) goto L_0x009f;
    L_0x009d:
        r14 = defpackage.avoa.w;	 Catch:{ aocg -> 0x0170 }
    L_0x009f:
        r14 = r14.k;	 Catch:{ aocg -> 0x0170 }
        if (r14 == 0) goto L_0x00ef;
    L_0x00a3:
        r14 = r0.o();	 Catch:{ aocg -> 0x0170 }
        if (r14 == 0) goto L_0x00aa;
    L_0x00a9:
        goto L_0x00b3;
    L_0x00aa:
        r14 = r1.a;	 Catch:{ aocg -> 0x0170 }
        r14 = r13.a(r14);	 Catch:{ aocg -> 0x0170 }
        if (r14 != 0) goto L_0x00b3;
    L_0x00b2:
        goto L_0x00ef;
    L_0x00b3:
        r14 = r1.b;	 Catch:{ aocg -> 0x0170 }
        r14 = r13.a(r14);	 Catch:{ aocg -> 0x0170 }
        if (r14 == 0) goto L_0x00ef;
    L_0x00bb:
        r14 = r13.k;	 Catch:{ aocg -> 0x0170 }
        r14 = r14.get();	 Catch:{ aocg -> 0x0170 }
        r5 = r14;
        r5 = (defpackage.aajx) r5;	 Catch:{ aocg -> 0x0170 }
        r14 = r13.o;	 Catch:{ aocg -> 0x0170 }
        r14 = r14.a();	 Catch:{ aocg -> 0x0170 }
        r0 = r13.l;	 Catch:{ aocg -> 0x0170 }
        r6 = r1.a(r14, r0);	 Catch:{ aocg -> 0x0170 }
        r14 = r13.o;	 Catch:{ aocg -> 0x0170 }
        r14 = r14.a();	 Catch:{ aocg -> 0x0170 }
        r0 = r13.l;	 Catch:{ aocg -> 0x0170 }
        r7 = r1.b(r14, r0);	 Catch:{ aocg -> 0x0170 }
        r14 = r15.a;	 Catch:{ aocg -> 0x0170 }
        r14 = r14.b;	 Catch:{ aocg -> 0x0170 }
        if (r14 == 0) goto L_0x00e4;
    L_0x00e2:
        r2 = r14.b;	 Catch:{ aocg -> 0x0170 }
    L_0x00e4:
        r10 = r2;
        r8 = r15.b;	 Catch:{ aocg -> 0x0170 }
        r12 = 0;
        r4 = r15;
        r15 = r4.a(r5, r6, r7, r8, r10, r12);	 Catch:{ aocg -> 0x0170 }
        goto L_0x0170;
    L_0x00ef:
        r14 = r13.l;	 Catch:{ aocg -> 0x0170 }
        if (r14 != 0) goto L_0x00f4;
    L_0x00f3:
        goto L_0x014c;
    L_0x00f4:
        r0 = r14.b();	 Catch:{ aocg -> 0x0170 }
        if (r0 == 0) goto L_0x014c;
    L_0x00fa:
        r14 = r14.b();	 Catch:{ aocg -> 0x0170 }
        r14 = r14.h;	 Catch:{ aocg -> 0x0170 }
        if (r14 != 0) goto L_0x0104;
    L_0x0102:
        r14 = defpackage.avoa.w;	 Catch:{ aocg -> 0x0170 }
    L_0x0104:
        r14 = r14.u;	 Catch:{ aocg -> 0x0170 }
        if (r14 == 0) goto L_0x014c;
    L_0x0108:
        r14 = r1.a;	 Catch:{ aocg -> 0x0170 }
        r14 = r13.a(r14);	 Catch:{ aocg -> 0x0170 }
        if (r14 == 0) goto L_0x0111;
    L_0x0110:
        goto L_0x0119;
    L_0x0111:
        r14 = r1.b;	 Catch:{ aocg -> 0x0170 }
        r14 = r13.a(r14);	 Catch:{ aocg -> 0x0170 }
        if (r14 == 0) goto L_0x014c;
    L_0x0119:
        r14 = r13.k;	 Catch:{ aocg -> 0x0170 }
        r14 = r14.get();	 Catch:{ aocg -> 0x0170 }
        r5 = r14;
        r5 = (defpackage.aajx) r5;	 Catch:{ aocg -> 0x0170 }
        r14 = r13.o;	 Catch:{ aocg -> 0x0170 }
        r14 = r14.a();	 Catch:{ aocg -> 0x0170 }
        r0 = r13.l;	 Catch:{ aocg -> 0x0170 }
        r6 = r1.a(r14, r0);	 Catch:{ aocg -> 0x0170 }
        r14 = r13.o;	 Catch:{ aocg -> 0x0170 }
        r14 = r14.a();	 Catch:{ aocg -> 0x0170 }
        r0 = r13.l;	 Catch:{ aocg -> 0x0170 }
        r7 = r1.b(r14, r0);	 Catch:{ aocg -> 0x0170 }
        r14 = r15.a;	 Catch:{ aocg -> 0x0170 }
        r14 = r14.b;	 Catch:{ aocg -> 0x0170 }
        if (r14 == 0) goto L_0x0142;
    L_0x0140:
        r2 = r14.b;	 Catch:{ aocg -> 0x0170 }
    L_0x0142:
        r10 = r2;
        r8 = r15.b;	 Catch:{ aocg -> 0x0170 }
        r12 = 1;
        r4 = r15;
        r15 = r4.a(r5, r6, r7, r8, r10, r12);	 Catch:{ aocg -> 0x0170 }
        goto L_0x0170;
    L_0x014c:
        r14 = r13.k;	 Catch:{ aocg -> 0x0170 }
        r14 = r14.get();	 Catch:{ aocg -> 0x0170 }
        r14 = (defpackage.aajx) r14;	 Catch:{ aocg -> 0x0170 }
        r0 = r13.o;	 Catch:{ aocg -> 0x0170 }
        r0 = r0.a();	 Catch:{ aocg -> 0x0170 }
        r2 = r13.l;	 Catch:{ aocg -> 0x0170 }
        r0 = r1.a(r0, r2);	 Catch:{ aocg -> 0x0170 }
        r2 = r13.o;	 Catch:{ aocg -> 0x0170 }
        r2 = r2.a();	 Catch:{ aocg -> 0x0170 }
        r3 = r13.l;	 Catch:{ aocg -> 0x0170 }
        r1 = r1.b(r2, r3);	 Catch:{ aocg -> 0x0170 }
        r15 = r15.a(r14, r0, r1);	 Catch:{ aocg -> 0x0170 }
    L_0x0170:
        return r15;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agsa.a(java.lang.String, aakj):aakj");
    }

    private final boolean a(agql agql) {
        return agql != null && this.m.a(agql, this.o).a == 1;
    }

    private final boolean a() {
        return this.p.b() && ((agwc) this.j.get()).e();
    }
}
