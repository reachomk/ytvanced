package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.Executor;

/* renamed from: agtr */
public final class agtr {
    private final Context a;
    private final Executor b;
    private final agvv c;
    private final aisl d;
    private final xhv e;
    private final ague f;
    private final agts g;
    private final bcaa h;

    public agtr(Context context, Executor executor, aisl aisl, agvv agvv, xhv xhv, ague ague, agts agts, bcaa bcaa) {
        this.a = context;
        this.b = executor;
        this.d = aisl;
        this.c = agvv;
        this.e = xhv;
        this.f = ague;
        this.g = agts;
        this.h = bcaa;
    }

    public final anjv a(aiqq aiqq, boolean z) {
        wxf a = wxf.a();
        this.b.execute(new agtu(this, aiqq, a, z));
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e2  */
    public final void a(defpackage.aiqq r24, defpackage.wxg r25, boolean r26) {
        /*
        r23 = this;
        r0 = r23;
        r1 = r24;
        r2 = r25;
        r3 = r0.c;
        r4 = r24.c();
        r24.b();
        r3 = r3.a(r4);
        r4 = 0;
        defpackage.amqw.a(r3);	 Catch:{ IllegalArgumentException | NullPointerException -> 0x015b, IllegalArgumentException | NullPointerException -> 0x015b }
        defpackage.amqw.a(r24);	 Catch:{ IllegalArgumentException | NullPointerException -> 0x015b, IllegalArgumentException | NullPointerException -> 0x015b }
        r5 = r3.c();	 Catch:{ IllegalArgumentException | NullPointerException -> 0x015b, IllegalArgumentException | NullPointerException -> 0x015b }
        r5 = defpackage.amqw.a(r5);	 Catch:{ IllegalArgumentException | NullPointerException -> 0x015b, IllegalArgumentException | NullPointerException -> 0x015b }
        r5 = (java.util.List) r5;	 Catch:{ IllegalArgumentException | NullPointerException -> 0x015b, IllegalArgumentException | NullPointerException -> 0x015b }
        r6 = r5.isEmpty();	 Catch:{ IllegalArgumentException | NullPointerException -> 0x015b, IllegalArgumentException | NullPointerException -> 0x015b }
        if (r6 != 0) goto L_0x0155;
    L_0x002a:
        r6 = r24.b();	 Catch:{ IllegalArgumentException | NullPointerException -> 0x015b, IllegalArgumentException | NullPointerException -> 0x015b }
        r7 = r24.d();	 Catch:{ IllegalArgumentException | NullPointerException -> 0x015b, IllegalArgumentException | NullPointerException -> 0x015b }
        r8 = -1;
        r9 = 0;
        if (r7 == r8) goto L_0x008c;
    L_0x0036:
        r10 = r5.size();	 Catch:{ IllegalArgumentException | NullPointerException -> 0x015b, IllegalArgumentException | NullPointerException -> 0x015b }
        r10 = defpackage.xty.a(r7, r9, r10);	 Catch:{ IllegalArgumentException | NullPointerException -> 0x015b, IllegalArgumentException | NullPointerException -> 0x015b }
        if (r10 == 0) goto L_0x008c;
    L_0x0040:
        r10 = android.text.TextUtils.isEmpty(r6);	 Catch:{ IllegalArgumentException | NullPointerException -> 0x015b, IllegalArgumentException | NullPointerException -> 0x015b }
        if (r10 != 0) goto L_0x0059;
    L_0x0046:
        r7 = r5.get(r7);	 Catch:{ IllegalArgumentException | NullPointerException -> 0x015b, IllegalArgumentException | NullPointerException -> 0x015b }
        r7 = (defpackage.agqp) r7;	 Catch:{ IllegalArgumentException | NullPointerException -> 0x015b, IllegalArgumentException | NullPointerException -> 0x015b }
        r7 = r7.a();	 Catch:{ IllegalArgumentException | NullPointerException -> 0x015b, IllegalArgumentException | NullPointerException -> 0x015b }
        r7 = android.text.TextUtils.equals(r6, r7);	 Catch:{ IllegalArgumentException | NullPointerException -> 0x015b, IllegalArgumentException | NullPointerException -> 0x015b }
        if (r7 != 0) goto L_0x0057;
    L_0x0056:
        goto L_0x008c;
    L_0x0057:
        r5 = r1;
        goto L_0x00a9;
    L_0x0059:
        r6 = r24.d();	 Catch:{ IllegalArgumentException | NullPointerException -> 0x015b, IllegalArgumentException | NullPointerException -> 0x015b }
        if (r6 == r8) goto L_0x0064;
    L_0x005f:
        r6 = r24.d();	 Catch:{ IllegalArgumentException | NullPointerException -> 0x015b, IllegalArgumentException | NullPointerException -> 0x015b }
        goto L_0x0065;
    L_0x0064:
        r6 = 0;
    L_0x0065:
        r7 = r3.c();	 Catch:{ IllegalArgumentException | NullPointerException -> 0x015b, IllegalArgumentException | NullPointerException -> 0x015b }
        r10 = r7.size();	 Catch:{ IllegalArgumentException | NullPointerException -> 0x015b, IllegalArgumentException | NullPointerException -> 0x015b }
        r9 = defpackage.xty.a(r6, r9, r10);	 Catch:{ IllegalArgumentException | NullPointerException -> 0x015b, IllegalArgumentException | NullPointerException -> 0x015b }
        if (r9 == 0) goto L_0x007a;
    L_0x0073:
        r6 = r7.get(r6);	 Catch:{ IllegalArgumentException | NullPointerException -> 0x015b, IllegalArgumentException | NullPointerException -> 0x015b }
        r6 = (defpackage.agqp) r6;	 Catch:{ IllegalArgumentException | NullPointerException -> 0x015b, IllegalArgumentException | NullPointerException -> 0x015b }
        goto L_0x007b;
    L_0x007a:
        r6 = r4;
    L_0x007b:
        if (r6 == 0) goto L_0x0086;
    L_0x007d:
        r5 = r5.indexOf(r6);	 Catch:{ IllegalArgumentException | NullPointerException -> 0x015b, IllegalArgumentException | NullPointerException -> 0x015b }
        r5 = defpackage.agtr.a(r1, r6, r5);	 Catch:{ IllegalArgumentException | NullPointerException -> 0x015b, IllegalArgumentException | NullPointerException -> 0x015b }
        goto L_0x00a9;
    L_0x0086:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException | NullPointerException -> 0x015b, IllegalArgumentException | NullPointerException -> 0x015b }
        r3.<init>();	 Catch:{ IllegalArgumentException | NullPointerException -> 0x015b, IllegalArgumentException | NullPointerException -> 0x015b }
        throw r3;	 Catch:{ IllegalArgumentException | NullPointerException -> 0x015b, IllegalArgumentException | NullPointerException -> 0x015b }
    L_0x008c:
        r7 = r5.size();	 Catch:{ IllegalArgumentException | NullPointerException -> 0x015b, IllegalArgumentException | NullPointerException -> 0x015b }
        if (r9 >= r7) goto L_0x014f;
    L_0x0092:
        r7 = r5.get(r9);	 Catch:{ IllegalArgumentException | NullPointerException -> 0x015b, IllegalArgumentException | NullPointerException -> 0x015b }
        r7 = (defpackage.agqp) r7;	 Catch:{ IllegalArgumentException | NullPointerException -> 0x015b, IllegalArgumentException | NullPointerException -> 0x015b }
        r10 = r7.a();	 Catch:{ IllegalArgumentException | NullPointerException -> 0x015b, IllegalArgumentException | NullPointerException -> 0x015b }
        r10 = android.text.TextUtils.equals(r6, r10);	 Catch:{ IllegalArgumentException | NullPointerException -> 0x015b, IllegalArgumentException | NullPointerException -> 0x015b }
        if (r10 != 0) goto L_0x00a5;
    L_0x00a2:
        r9 = r9 + 1;
        goto L_0x008c;
    L_0x00a5:
        r5 = defpackage.agtr.a(r1, r7, r9);	 Catch:{ IllegalArgumentException | NullPointerException -> 0x015b, IllegalArgumentException | NullPointerException -> 0x015b }
    L_0x00a9:
        r6 = r24.m();
        if (r6 != 0) goto L_0x00b0;
    L_0x00af:
        goto L_0x00b1;
    L_0x00b0:
        r1 = r5;
    L_0x00b1:
        r6 = r3.b();
        r7 = r3.c();
        r15 = r5.d();
        r9 = r7.get(r15);
        r14 = r9;
        r14 = (defpackage.agqp) r14;
        r9 = r0.e;
        r9 = r9.c();
        if (r9 == 0) goto L_0x011e;
    L_0x00cc:
        if (r26 == 0) goto L_0x011e;
    L_0x00ce:
        r9 = defpackage.afsx.a();
        r10 = r0.d;
        r17 = r14.a();
        r18 = r1.c();
        r11 = r3.e();
        if (r11 != 0) goto L_0x00e9;
    L_0x00e2:
        r8 = r1.d();
        r19 = r8;
        goto L_0x00eb;
    L_0x00e9:
        r19 = -1;
    L_0x00eb:
        r21 = r1.k();
        r20 = "";
        r16 = r10;
        r22 = r9;
        r16.a(r17, r18, r19, r20, r21, r22);
        r8 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x011e, InterruptedException | ExecutionException | TimeoutException -> 0x011e, InterruptedException | ExecutionException | TimeoutException -> 0x011e }
        r10 = 3;
        r8 = r9.get(r10, r8);	 Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x011e, InterruptedException | ExecutionException | TimeoutException -> 0x011e, InterruptedException | ExecutionException | TimeoutException -> 0x011e }
        r10 = r8;
        r10 = (defpackage.aafv) r10;	 Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x011e, InterruptedException | ExecutionException | TimeoutException -> 0x011e, InterruptedException | ExecutionException | TimeoutException -> 0x011e }
        r9 = r0.f;	 Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x011e, InterruptedException | ExecutionException | TimeoutException -> 0x011e, InterruptedException | ExecutionException | TimeoutException -> 0x011e }
        r11 = r0.a;	 Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x011e, InterruptedException | ExecutionException | TimeoutException -> 0x011e, InterruptedException | ExecutionException | TimeoutException -> 0x011e }
        r8 = r0.g;	 Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x011e, InterruptedException | ExecutionException | TimeoutException -> 0x011e, InterruptedException | ExecutionException | TimeoutException -> 0x011e }
        r16 = r8.a(r5, r3);	 Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x011e, InterruptedException | ExecutionException | TimeoutException -> 0x011e, InterruptedException | ExecutionException | TimeoutException -> 0x011e }
        r12 = r6;
        r13 = r7;
        r8 = r14;
        r14 = r15;
        r17 = r15;
        r15 = r1;
        r9 = r9.a(r10, r11, r12, r13, r14, r15, r16);	 Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x011c, InterruptedException | ExecutionException | TimeoutException -> 0x011c, InterruptedException | ExecutionException | TimeoutException -> 0x011c }
        r2.a(r4, r9);	 Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x011c, InterruptedException | ExecutionException | TimeoutException -> 0x011c, InterruptedException | ExecutionException | TimeoutException -> 0x011c }
        return;
        goto L_0x0121;
    L_0x011e:
        r8 = r14;
        r17 = r15;
    L_0x0121:
        if (r6 == 0) goto L_0x0143;
    L_0x0123:
        r9 = r3.e();
        if (r9 != 0) goto L_0x012f;
    L_0x0129:
        r9 = r7.size();
        if (r9 <= 0) goto L_0x0143;
    L_0x012f:
        r9 = r0.f;
        r10 = r0.a;
        r8 = r0.g;
        r15 = r8.a(r5, r3);
        r11 = r6;
        r12 = r7;
        r13 = r17;
        r14 = r1;
        r1 = r9.a(r10, r11, r12, r13, r14, r15);
        goto L_0x014b;
    L_0x0143:
        r3 = r0.f;
        r5 = r0.a;
        r1 = r3.a(r5, r8, r1);
    L_0x014b:
        r2.a(r4, r1);
        return;
    L_0x014f:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException | NullPointerException -> 0x015b, IllegalArgumentException | NullPointerException -> 0x015b }
        r3.<init>();	 Catch:{ IllegalArgumentException | NullPointerException -> 0x015b, IllegalArgumentException | NullPointerException -> 0x015b }
        throw r3;	 Catch:{ IllegalArgumentException | NullPointerException -> 0x015b, IllegalArgumentException | NullPointerException -> 0x015b }
    L_0x0155:
        r3 = new java.lang.NullPointerException;	 Catch:{ IllegalArgumentException | NullPointerException -> 0x015b, IllegalArgumentException | NullPointerException -> 0x015b }
        r3.<init>();	 Catch:{ IllegalArgumentException | NullPointerException -> 0x015b, IllegalArgumentException | NullPointerException -> 0x015b }
        throw r3;	 Catch:{ IllegalArgumentException | NullPointerException -> 0x015b, IllegalArgumentException | NullPointerException -> 0x015b }
        r3 = r24.b();
        r3 = android.text.TextUtils.isEmpty(r3);
        if (r3 != 0) goto L_0x0194;
    L_0x0166:
        r3 = r0.h;
        r3 = r3.get();
        r3 = (defpackage.agwc) r3;
        r3 = r3.b();
        r3 = r3.k();
        r5 = r24.b();
        r3 = r3.a(r5);
        if (r3 == 0) goto L_0x0194;
    L_0x0180:
        r5 = r3.i();
        if (r5 != 0) goto L_0x0194;
    L_0x0186:
        r5 = r0.f;
        r6 = r0.a;
        r3 = r3.a;
        r1 = r5.a(r6, r3, r1);
        r2.a(r4, r1);
        return;
    L_0x0194:
        r1 = new java.lang.NullPointerException;
        r1.<init>();
        r2.a(r4, r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agtr.a(aiqq, wxg, boolean):void");
    }

    private static aiqq a(aiqq aiqq, agqp agqp, int i) {
        apxu a = agrv.a(!TextUtils.isEmpty(aiqq.c()) ? aiqq.c() : "PPSV", agqp, i, aiqq.h(), aiqq.k());
        aiqs a2 = aiqq.a();
        a2.a = a;
        return a2.b();
    }
}
