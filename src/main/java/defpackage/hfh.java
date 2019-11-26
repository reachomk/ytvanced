package defpackage;

/* renamed from: hfh */
public final class hfh implements adqi {
    public final adqf a;
    public eyb b;
    public boolean c = true;
    private final nn d;
    private final lsu e;
    private final amro f;
    private nf g;

    public hfh(nn nnVar, adqf adqf, lsu lsu) {
        Object hfg = new hfg();
        this.d = (nn) amqw.a((Object) nnVar);
        this.a = (adqf) amqw.a((Object) adqf);
        this.e = (lsu) amqw.a((Object) lsu);
        this.f = (amro) amqw.a(hfg);
    }

    public final void b(adqe adqe) {
    }

    public final void a(adqe adqe) {
        b();
        this.e.a(true);
    }

    public final void c(adqe adqe) {
        c();
        this.e.a(false);
    }

    public final nf a() {
        if (this.g == null) {
            this.g = this.d.f().a("MdxWatchFragment");
        }
        return this.g;
    }

    /* JADX WARNING: Missing block: B:23:0x006e, code skipped:
            return;
     */
    public final synchronized void b() {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = r5.c;	 Catch:{ all -> 0x0071 }
        if (r0 != 0) goto L_0x006f;
    L_0x0005:
        r0 = r5.a;	 Catch:{ all -> 0x0071 }
        r0 = r0.c();	 Catch:{ all -> 0x0071 }
        if (r0 == 0) goto L_0x006d;
    L_0x000d:
        r0 = r5.a();	 Catch:{ all -> 0x0071 }
        r1 = 0;
        r2 = 2131758733; // 0x7f100e8d float:1.9148438E38 double:1.053228755E-314;
        if (r0 == 0) goto L_0x0018;
    L_0x0017:
        goto L_0x0043;
    L_0x0018:
        r0 = r5.a();	 Catch:{ all -> 0x0071 }
        if (r0 != 0) goto L_0x0020;
    L_0x001e:
        r0 = 1;
        goto L_0x0021;
    L_0x0020:
        r0 = 0;
    L_0x0021:
        defpackage.amqw.b(r0);	 Catch:{ all -> 0x0071 }
        r0 = r5.f;	 Catch:{ all -> 0x0071 }
        r0 = r0.get();	 Catch:{ all -> 0x0071 }
        r0 = (defpackage.nf) r0;	 Catch:{ all -> 0x0071 }
        r5.g = r0;	 Catch:{ all -> 0x0071 }
        r0 = r5.d;	 Catch:{ all -> 0x0071 }
        r0 = r0.f();	 Catch:{ all -> 0x0071 }
        r0 = r0.a();	 Catch:{ all -> 0x0071 }
        r3 = r5.g;	 Catch:{ all -> 0x0071 }
        r4 = "MdxWatchFragment";
        r0 = r0.a(r2, r3, r4);	 Catch:{ all -> 0x0071 }
        r0.c();	 Catch:{ all -> 0x0071 }
    L_0x0043:
        r0 = r5.d;	 Catch:{ all -> 0x0071 }
        r0 = r0.findViewById(r2);	 Catch:{ all -> 0x0071 }
        r2 = r0.getVisibility();	 Catch:{ all -> 0x0071 }
        r3 = 8;
        if (r2 != r3) goto L_0x0054;
    L_0x0051:
        r0.setVisibility(r1);	 Catch:{ all -> 0x0071 }
    L_0x0054:
        r0 = r5.b;	 Catch:{ all -> 0x0071 }
        if (r0 == 0) goto L_0x006d;
    L_0x0058:
        r0 = r5.a();	 Catch:{ all -> 0x0071 }
        r0 = r0 instanceof defpackage.hfc;	 Catch:{ all -> 0x0071 }
        if (r0 == 0) goto L_0x006d;
    L_0x0060:
        r0 = r5.a();	 Catch:{ all -> 0x0071 }
        r0 = (defpackage.hfc) r0;	 Catch:{ all -> 0x0071 }
        r1 = r5.b;	 Catch:{ all -> 0x0071 }
        r1 = r1.b;	 Catch:{ all -> 0x0071 }
        r0.d(r1);	 Catch:{ all -> 0x0071 }
    L_0x006d:
        monitor-exit(r5);
        return;
    L_0x006f:
        monitor-exit(r5);
        return;
    L_0x0071:
        r0 = move-exception;
        monitor-exit(r5);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hfh.b():void");
    }

    public final void c() {
        if (!this.c && this.a.c() == null && a() != null) {
            amqw.a(a());
            this.d.f().a().a(a()).c();
            this.g = null;
        }
    }

    static {
        xtl.b("MDX.LazyInitializer");
    }
}
