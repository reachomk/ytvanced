package defpackage;

/* renamed from: addn */
final /* synthetic */ class addn implements Runnable {
    private final addo a;

    addn(addo addo) {
        this.a = addo;
    }

    /* JADX WARNING: Missing block: B:13:0x0053, code skipped:
            if (r4 == null) goto L_0x0055;
     */
    public final void run() {
        /*
        r10 = this;
        r0 = r10.a;
        r1 = r0.l;
        r2 = r1.e;
        r3 = 0;
        r4 = "UsbCastDiscovery";
        r2 = r2.getBoolean(r4, r3);
        if (r2 == 0) goto L_0x0055;
    L_0x000f:
        r2 = r1.b;
        r2 = r2.f();
        r2 = r2.iterator();
    L_0x0019:
        r4 = r2.hasNext();
        if (r4 == 0) goto L_0x0052;
    L_0x001f:
        r4 = r2.next();
        r4 = (defpackage.xhr) r4;
        r5 = r4.a();
        r5 = java.lang.String.valueOf(r5);
        r6 = "interface name: ";
        r7 = r5.length();
        if (r7 != 0) goto L_0x003b;
    L_0x0035:
        r5 = new java.lang.String;
        r5.<init>(r6);
        goto L_0x003e;
    L_0x003b:
        r6.concat(r5);
    L_0x003e:
        r5 = r4.a();
        r6 = "rndis0";
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x0019;
    L_0x004a:
        r2 = defpackage.aebl.a;
        r5 = "found usb tethering";
        defpackage.xtl.c(r2, r5);
        goto L_0x0053;
    L_0x0052:
        r4 = 0;
    L_0x0053:
        if (r4 != 0) goto L_0x0059;
    L_0x0055:
        r4 = r1.b();
    L_0x0059:
        if (r4 == 0) goto L_0x00b0;
    L_0x005b:
        r1 = new java.util.ArrayList;
        r1.<init>();
        r0.a();
        r2 = r0.k;
        r2 = r2.b(r4);
        if (r2 == 0) goto L_0x00a7;
    L_0x006b:
        r4 = 0;
    L_0x006c:
        r5 = 3;
        if (r4 >= r5) goto L_0x0081;
    L_0x006f:
        r5 = r0.d;
        r6 = new addt;
        r6.<init>(r2);
        r7 = r4 * 300;
        r7 = (long) r7;
        r9 = java.util.concurrent.TimeUnit.MILLISECONDS;
        r5.schedule(r6, r7, r9);
        r4 = r4 + 1;
        goto L_0x006c;
    L_0x0081:
        r4 = r0.d;
        r5 = new adds;
        r5.<init>(r0, r2);
        r4 = r4.submit(r5);
        r1.add(r4);
        r4 = r1.isEmpty();
        if (r4 != 0) goto L_0x00a4;
    L_0x0095:
        r3 = r0.d;
        r4 = new addu;
        r4.<init>(r0, r1, r2);
        r0 = 2;
        r2 = java.util.concurrent.TimeUnit.SECONDS;
        r3.schedule(r4, r0, r2);
        return;
    L_0x00a4:
        r0.i = r3;
        return;
    L_0x00a7:
        r0 = 2;
        r1 = defpackage.afpf.mdx;
        r2 = "failed to create a multicast socket, not discovering DIAL devices";
        defpackage.afpc.a(r0, r1, r2);
        return;
    L_0x00b0:
        r0.i = r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.addn.run():void");
    }
}
