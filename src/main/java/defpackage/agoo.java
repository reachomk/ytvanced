package defpackage;

/* renamed from: agoo */
public final class agoo implements agmm {
    private final agmo a;
    private amqp b = ampo.a;

    public agoo(agmo agmo) {
        this.a = agmo;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e8  */
    public final boolean a() {
        /*
        r9 = this;
        r0 = new agop;	 Catch:{ IOException -> 0x00e3 }
        r1 = r9.a;	 Catch:{ IOException -> 0x00e3 }
        r0.<init>(r1);	 Catch:{ IOException -> 0x00e3 }
        r1 = r0.a;	 Catch:{ IOException -> 0x00e1 }
        r1 = r1.a();	 Catch:{ IOException -> 0x00e1 }
        r2 = new java.util.HashMap;	 Catch:{ IOException -> 0x00e1 }
        r2.<init>();	 Catch:{ IOException -> 0x00e1 }
    L_0x0012:
        r3 = defpackage.agoj.a(r1);	 Catch:{ all -> 0x00dc }
        r4 = 1;
        r5 = 0;
        if (r3 == 0) goto L_0x003f;
    L_0x001a:
        r6 = r3.a();	 Catch:{ all -> 0x00dc }
        r6 = r2.get(r6);	 Catch:{ all -> 0x00dc }
        r6 = (java.util.List) r6;	 Catch:{ all -> 0x00dc }
        if (r6 != 0) goto L_0x003b;
    L_0x0026:
        r6 = r3.a();	 Catch:{ all -> 0x00dc }
        r7 = new java.util.ArrayList;	 Catch:{ all -> 0x00dc }
        r4 = new defpackage.agoh[r4];	 Catch:{ all -> 0x00dc }
        r4[r5] = r3;	 Catch:{ all -> 0x00dc }
        r3 = java.util.Arrays.asList(r4);	 Catch:{ all -> 0x00dc }
        r7.<init>(r3);	 Catch:{ all -> 0x00dc }
        r2.put(r6, r7);	 Catch:{ all -> 0x00dc }
        goto L_0x0012;
    L_0x003b:
        r6.add(r3);	 Catch:{ all -> 0x00dc }
        goto L_0x0012;
    L_0x003f:
        r1.close();	 Catch:{ IOException -> 0x00e1 }
        r1 = new agok;	 Catch:{ IOException -> 0x00e1 }
        r1.<init>(r2);	 Catch:{ IOException -> 0x00e1 }
        r2 = 2;
        r2 = r1.a(r2);	 Catch:{ IOException -> 0x00e1 }
        r3 = r2.a();	 Catch:{ IOException -> 0x00e1 }
        if (r3 == 0) goto L_0x00d4;
    L_0x0052:
        r2 = r2.b();	 Catch:{ IOException -> 0x00e1 }
        r2 = (defpackage.agoh) r2;	 Catch:{ IOException -> 0x00e1 }
        r2 = r2.a(r5);	 Catch:{ IOException -> 0x00e1 }
        r2 = r0.a(r2);	 Catch:{ IOException -> 0x00e1 }
        r3 = defpackage.anxa.c();	 Catch:{ IOException -> 0x00e1 }
        r6 = defpackage.azqf.d;	 Catch:{ IOException -> 0x00e1 }
        r2 = defpackage.anxl.parseFrom(r6, r2, r3);	 Catch:{ IOException -> 0x00e1 }
        r2 = (defpackage.azqf) r2;	 Catch:{ IOException -> 0x00e1 }
        r3 = 4;
        r3 = r1.a(r3);	 Catch:{ IOException -> 0x00e1 }
        r6 = r3.a();	 Catch:{ IOException -> 0x00e1 }
        if (r6 == 0) goto L_0x00cc;
    L_0x0077:
        r3 = r3.b();	 Catch:{ IOException -> 0x00e1 }
        r3 = (defpackage.agoh) r3;	 Catch:{ IOException -> 0x00e1 }
        r3 = r3.a(r5);	 Catch:{ IOException -> 0x00e1 }
        r3 = r0.a(r3);	 Catch:{ IOException -> 0x00e1 }
        r6 = defpackage.anxa.c();	 Catch:{ IOException -> 0x00e1 }
        r7 = defpackage.azqj.b;	 Catch:{ IOException -> 0x00e1 }
        r3 = defpackage.anxl.parseFrom(r7, r3, r6);	 Catch:{ IOException -> 0x00e1 }
        r3 = (defpackage.azqj) r3;	 Catch:{ IOException -> 0x00e1 }
        r6 = 3;
        r6 = r1.a(r6);	 Catch:{ IOException -> 0x00e1 }
        r7 = defpackage.ampo.a;	 Catch:{ IOException -> 0x00e1 }
        r8 = r6.a();	 Catch:{ IOException -> 0x00e1 }
        if (r8 == 0) goto L_0x00bc;
    L_0x009e:
        r6 = r6.b();	 Catch:{ IOException -> 0x00e1 }
        r6 = (defpackage.agoh) r6;	 Catch:{ IOException -> 0x00e1 }
        r5 = r6.a(r5);	 Catch:{ IOException -> 0x00e1 }
        r5 = r0.a(r5);	 Catch:{ IOException -> 0x00e1 }
        r6 = defpackage.anxa.c();	 Catch:{ IOException -> 0x00e1 }
        r7 = defpackage.azqb.b;	 Catch:{ IOException -> 0x00e1 }
        r5 = defpackage.anxl.parseFrom(r7, r5, r6);	 Catch:{ IOException -> 0x00e1 }
        r5 = (defpackage.azqb) r5;	 Catch:{ IOException -> 0x00e1 }
        r7 = defpackage.amqp.b(r5);	 Catch:{ IOException -> 0x00e1 }
    L_0x00bc:
        r5 = new agon;	 Catch:{ IOException -> 0x00e1 }
        r2 = defpackage.agoq.a(r2, r7, r3);	 Catch:{ IOException -> 0x00e1 }
        r5.<init>(r0, r1, r2);	 Catch:{ IOException -> 0x00e1 }
        r1 = defpackage.amqp.b(r5);	 Catch:{ IOException -> 0x00e1 }
        r9.b = r1;	 Catch:{ IOException -> 0x00e1 }
        return r4;
    L_0x00cc:
        r1 = new agml;	 Catch:{ IOException -> 0x00e1 }
        r2 = "Missing signatures box.";
        r1.<init>(r2);	 Catch:{ IOException -> 0x00e1 }
        throw r1;	 Catch:{ IOException -> 0x00e1 }
    L_0x00d4:
        r1 = new agml;	 Catch:{ IOException -> 0x00e1 }
        r2 = "Missing offline file box.";
        r1.<init>(r2);	 Catch:{ IOException -> 0x00e1 }
        throw r1;	 Catch:{ IOException -> 0x00e1 }
    L_0x00dc:
        r2 = move-exception;
        r1.close();	 Catch:{ IOException -> 0x00e1 }
        throw r2;	 Catch:{ IOException -> 0x00e1 }
    L_0x00e1:
        r1 = move-exception;
        goto L_0x00e6;
    L_0x00e3:
        r0 = move-exception;
        r1 = r0;
        r0 = 0;
    L_0x00e6:
        if (r0 == 0) goto L_0x00eb;
    L_0x00e8:
        r0.close();
    L_0x00eb:
        goto L_0x00ed;
    L_0x00ec:
        throw r1;
    L_0x00ed:
        goto L_0x00ec;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agoo.a():boolean");
    }

    public final amul b() {
        return agos.a(c().c);
    }

    public final void close() {
        if (this.b.a()) {
            try {
                ((agon) this.b.b()).a.close();
            } finally {
                this.b = ampo.a;
            }
        }
    }

    public final agon c() {
        if (this.b.a()) {
            return (agon) this.b.b();
        }
        throw new IllegalStateException("Yt4File is not open!");
    }
}
