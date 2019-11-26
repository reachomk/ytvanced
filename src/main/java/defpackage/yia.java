package defpackage;

import java.util.concurrent.Executor;

/* renamed from: yia */
public final class yia implements aaap {
    public final aadg a;
    private final ywk b;
    private final Executor c;

    public yia(aadg aadg, ywk ywk, Executor executor) {
        this.a = aadg;
        this.b = ywk;
        this.c = executor;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0064 */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:18|19) */
    /* JADX WARNING: Missing block: B:19:?, code skipped:
            r11 = java.lang.String.valueOf(r11);
            r3 = new java.lang.StringBuilder(r11.length() + 43);
            r3.append("Error while getting field ");
            r3.append(5);
            r3.append(" from ");
            r3.append(r11);
            defpackage.xtl.d(r3.toString());
     */
    public final void a(defpackage.apxu r10, java.util.Map r11) {
        /*
        r9 = this;
        r11 = com.google.protos.youtube.api.innertube.SocialSharingSyncActionOuterClass$SocialSharingSyncAction.socialSharingSyncAction;
        r11 = defpackage.anxl.checkIsLite(r11);
        r10.a(r11);
        r0 = r10.h;
        r11 = r11.d;
        r11 = r0.a(r11);
        if (r11 == 0) goto L_0x0122;
    L_0x0013:
        r11 = com.google.protos.youtube.api.innertube.SocialSharingSyncActionOuterClass$SocialSharingSyncAction.socialSharingSyncAction;
        r11 = defpackage.anxl.checkIsLite(r11);
        r10.a(r11);
        r10 = r10.h;
        r0 = r11.d;
        r10 = r10.b(r0);
        if (r10 != 0) goto L_0x0029;
    L_0x0026:
        r10 = r11.b;
        goto L_0x002d;
    L_0x0029:
        r10 = r11.a(r10);
    L_0x002d:
        r10 = (com.google.protos.youtube.api.innertube.SocialSharingSyncActionOuterClass$SocialSharingSyncAction) r10;
        r11 = defpackage.amqw.a(r10);	 Catch:{ anyg -> 0x00a2 }
        r11 = (defpackage.anze) r11;	 Catch:{ anyg -> 0x00a2 }
        r11 = r11.toByteString();	 Catch:{ anyg -> 0x00a2 }
        defpackage.amqw.a(r11);	 Catch:{ anyg -> 0x00a2 }
        r0 = "fieldNumber must be > 0";
        r1 = 1;
        defpackage.amqw.a(r1, r0);	 Catch:{ anyg -> 0x00a2 }
        r0 = r11.g();	 Catch:{ anyg -> 0x00a2 }
    L_0x0046:
        r1 = 5;
        r2 = 0;
        r3 = r0.u();	 Catch:{ IOException -> 0x0064 }
        if (r3 != 0) goto L_0x008a;
    L_0x004e:
        r3 = r0.a();	 Catch:{ IOException -> 0x0064 }
        r4 = defpackage.aobj.b(r3);	 Catch:{ IOException -> 0x0064 }
        r3 = defpackage.aobj.a(r3);	 Catch:{ IOException -> 0x0064 }
        if (r4 != r1) goto L_0x0046;
    L_0x005c:
        r4 = 2;
        if (r3 != r4) goto L_0x0046;
    L_0x005f:
        r2 = r0.l();	 Catch:{ IOException -> 0x0064 }
        goto L_0x008a;
    L_0x0064:
        r11 = java.lang.String.valueOf(r11);	 Catch:{ anyg -> 0x00a2 }
        r0 = r11.length();	 Catch:{ anyg -> 0x00a2 }
        r0 = r0 + 43;
        r3 = new java.lang.StringBuilder;	 Catch:{ anyg -> 0x00a2 }
        r3.<init>(r0);	 Catch:{ anyg -> 0x00a2 }
        r0 = "Error while getting field ";
        r3.append(r0);	 Catch:{ anyg -> 0x00a2 }
        r3.append(r1);	 Catch:{ anyg -> 0x00a2 }
        r0 = " from ";
        r3.append(r0);	 Catch:{ anyg -> 0x00a2 }
        r3.append(r11);	 Catch:{ anyg -> 0x00a2 }
        r11 = r3.toString();	 Catch:{ anyg -> 0x00a2 }
        defpackage.xtl.d(r11);	 Catch:{ anyg -> 0x00a2 }
    L_0x008a:
        if (r2 != 0) goto L_0x008d;
    L_0x008c:
        goto L_0x00c0;
    L_0x008d:
        r11 = defpackage.arfm.b;	 Catch:{ anyg -> 0x00a2 }
        r11 = defpackage.anxl.parseFrom(r11, r2);	 Catch:{ anyg -> 0x00a2 }
        r11 = (defpackage.arfm) r11;	 Catch:{ anyg -> 0x00a2 }
        if (r11 == 0) goto L_0x00c0;
    L_0x0097:
        r0 = r9.c;	 Catch:{ anyg -> 0x00a2 }
        r1 = new yhz;	 Catch:{ anyg -> 0x00a2 }
        r1.<init>(r9, r11);	 Catch:{ anyg -> 0x00a2 }
        r0.execute(r1);	 Catch:{ anyg -> 0x00a2 }
        goto L_0x00c0;
    L_0x00a2:
        r11 = move-exception;
        r11 = r11.toString();
        r11 = java.lang.String.valueOf(r11);
        r0 = "Error parsing EntityBatchUpdate bytes ";
        r1 = r11.length();
        if (r1 != 0) goto L_0x00b9;
    L_0x00b3:
        r11 = new java.lang.String;
        r11.<init>(r0);
        goto L_0x00bd;
    L_0x00b9:
        r11 = r0.concat(r11);
    L_0x00bd:
        defpackage.xtl.c(r11);
    L_0x00c0:
        r11 = r9.b;
        r0 = new java.util.HashSet;
        r0.<init>();
        r1 = new java.util.HashSet;
        r1.<init>();
        r2 = r10.b;
        r2 = r2.size();
        if (r2 == 0) goto L_0x010e;
    L_0x00d4:
        r2 = r10.b;
        r2 = r2.iterator();
    L_0x00da:
        r3 = r2.hasNext();
        if (r3 == 0) goto L_0x010e;
    L_0x00e0:
        r3 = r2.next();
        r3 = (java.lang.String) r3;
        r4 = r11.b;
        r4 = r4.a(r3);
        r5 = r4 instanceof defpackage.yie;
        if (r5 == 0) goto L_0x010a;
    L_0x00f0:
        r4 = (defpackage.yie) r4;
        r3 = r4.getSyncToken();
        r5 = android.text.TextUtils.isEmpty(r3);
        if (r5 != 0) goto L_0x0106;
    L_0x00fc:
        r4 = r4.e();
        r6 = r10.c;
        r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r8 >= 0) goto L_0x00da;
    L_0x0106:
        r1.add(r3);
        goto L_0x00da;
    L_0x010a:
        r0.add(r3);
        goto L_0x00da;
    L_0x010e:
        r10 = r0.isEmpty();
        if (r10 == 0) goto L_0x011a;
    L_0x0114:
        r10 = r1.isEmpty();
        if (r10 != 0) goto L_0x0121;
    L_0x011a:
        r10 = defpackage.ywo.a;
        r2 = defpackage.ywn.a;
        r11.a(r0, r1, r10, r2);
    L_0x0121:
        return;
    L_0x0122:
        r10 = new aabf;
        r10.<init>();
        goto L_0x0129;
    L_0x0128:
        throw r10;
    L_0x0129:
        goto L_0x0128;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yia.a(apxu, java.util.Map):void");
    }
}
