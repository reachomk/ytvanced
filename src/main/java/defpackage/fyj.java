package defpackage;

/* renamed from: fyj */
public final class fyj implements ajan, t, xcp {
    private final fyi a;
    private final fyh b;
    private final afvu c;
    private final tit d;
    private final tio e;
    private final xci f;
    private final ajam g;
    private final zyw h;
    private final bdfu i = new bdfu();

    public fyj(fyi fyi, fyh fyh, afvu afvu, tit tit, tio tio, xci xci, ajam ajam, zyw zyw) {
        this.c = afvu;
        this.a = fyi;
        this.b = fyh;
        this.e = tio;
        this.d = tit;
        this.f = xci;
        this.g = ajam;
        this.h = zyw;
    }

    public final void a(af afVar) {
    }

    public final void aw_() {
    }

    public final void c() {
    }

    public final void d() {
    }

    public final long e() {
        return 1;
    }

    public final void B_() {
        if (foh.x(this.h)) {
            this.i.a();
            this.i.a(a(this.g));
            return;
        }
        this.f.a((Object) this);
    }

    public final void C_() {
        if (foh.x(this.h)) {
            this.i.a();
        } else {
            this.f.b(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044 A:{SYNTHETIC, Splitter:B:14:0x0044} */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0100  */
    /* JADX WARNING: Missing block: B:21:0x0075, code skipped:
            if (r1 != 1) goto L_0x00fe;
     */
    public final void a(defpackage.ahkn r7) {
        /*
        r6 = this;
        r0 = r6.c;
        r0 = r0.d;
        if (r0 == 0) goto L_0x0112;
    L_0x0006:
        r0 = r7.a;
        r1 = defpackage.airi.PLAYBACK_LOADED;
        if (r0 == r1) goto L_0x000e;
    L_0x000c:
        goto L_0x010a;
    L_0x000e:
        r7 = r7.b;
        r0 = r6.d;
        r1 = r6.a;
        defpackage.amqw.a(r7);
        r2 = r1.b;	 Catch:{ tiq -> 0x010b }
        r3 = "WatchAction";
        r2 = r2.a(r3);	 Catch:{ tiq -> 0x010b }
        r3 = r1.b;	 Catch:{ tiq -> 0x010b }
        r3 = r3.a();	 Catch:{ tiq -> 0x010b }
        r3 = r3.a();	 Catch:{ tiq -> 0x010b }
        r1 = r1.a;	 Catch:{ tiq -> 0x010b }
        r4 = r1.a;	 Catch:{ tiq -> 0x010b }
        r4 = r4.a();	 Catch:{ tiq -> 0x010b }
        r5 = 0;
        if (r4 == 0) goto L_0x0041;
    L_0x0034:
        r4 = r1.b;	 Catch:{ RemoteException | tei | tej -> 0x0041, RemoteException | tei | tej -> 0x0041, RemoteException | tei | tej -> 0x0041 }
        r1 = r1.a;	 Catch:{ RemoteException | tei | tej -> 0x0041, RemoteException | tei | tej -> 0x0041, RemoteException | tei | tej -> 0x0041 }
        r1 = r1.c();	 Catch:{ RemoteException | tei | tej -> 0x0041, RemoteException | tei | tej -> 0x0041, RemoteException | tei | tej -> 0x0041 }
        r1 = r4.b(r1);	 Catch:{ RemoteException | tei | tej -> 0x0041, RemoteException | tei | tej -> 0x0041, RemoteException | tei | tej -> 0x0041 }
        goto L_0x0042;
    L_0x0041:
        r1 = r5;
    L_0x0042:
        if (r1 == 0) goto L_0x0049;
    L_0x0044:
        r1 = r1.name;	 Catch:{ tiq -> 0x010b }
        r3.a(r1);	 Catch:{ tiq -> 0x010b }
    L_0x0049:
        r1 = r2.a(r3);	 Catch:{ tiq -> 0x010b }
        r2 = defpackage.fyk.a(r7);	 Catch:{ tiq -> 0x010b }
        r3 = defpackage.fyk.b(r7);	 Catch:{ tiq -> 0x010b }
        r1 = r1.a(r2, r3);	 Catch:{ tiq -> 0x010b }
        r1 = r1.a();	 Catch:{ tiq -> 0x010b }
        r0.a(r1);
        r0 = r6.b;
        defpackage.amqw.a(r7);
        r1 = r7.l();
        r2 = 1;
        if (r1 != 0) goto L_0x006d;
    L_0x006c:
        goto L_0x0079;
    L_0x006d:
        r1 = r1.b;
        r1 = defpackage.awah.a(r1);
        if (r1 == 0) goto L_0x0079;
    L_0x0075:
        if (r1 == r2) goto L_0x0079;
    L_0x0077:
        goto L_0x00fe;
    L_0x0079:
        r1 = r0.a;
        r1 = r1.b();
        r3 = r0.a;
        r3 = r3.c();
        r1 = r1.a(r3);
        r1 = (defpackage.tiy) r1;
        r0 = r0.a;
        r0 = r0.a();
        r3 = r7.f();
        r0 = r0.a(r3);
        r0 = (defpackage.tiz) r0;
        r0 = r1.a(r0);
        r1 = defpackage.fyk.a(r7);
        r0 = r0.a(r1);
        r0 = (defpackage.tiy) r0;
        r1 = r7.b();
        if (r1 == 0) goto L_0x00df;
    L_0x00af:
        r3 = r1.isEmpty();
        if (r3 != 0) goto L_0x00df;
    L_0x00b5:
        r3 = new android.net.Uri$Builder;
        r3.<init>();
        r4 = "https";
        r3 = r3.scheme(r4);
        r4 = "i.ytimg.com";
        r3 = r3.authority(r4);
        r4 = "vi";
        r3 = r3.appendPath(r4);
        r1 = r3.appendPath(r1);
        r3 = "mqdefault.jpg";
        r1 = r1.appendPath(r3);
        r1 = r1.build();
        r1 = r1.toString();
        goto L_0x00e1;
    L_0x00df:
        r1 = "";
    L_0x00e1:
        r0 = r0.c(r1);
        r0 = (defpackage.tiy) r0;
        r1 = defpackage.fyk.b(r7);
        r0 = r0.b(r1);
        r0 = (defpackage.tiy) r0;
        r7 = r7.h();
        r3 = (long) r7;
        r7 = r0.a(r3);
        r5 = r7.a();
    L_0x00fe:
        if (r5 == 0) goto L_0x010a;
    L_0x0100:
        r7 = r6.e;
        r0 = new defpackage.tis[r2];
        r1 = 0;
        r0[r1] = r5;
        r7.a(r0);
    L_0x010a:
        return;
    L_0x010b:
        r7 = move-exception;
        r0 = new java.lang.IllegalStateException;
        r0.<init>(r7);
        throw r0;
    L_0x0112:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fyj.a(ahkn):void");
    }

    public final void f() {
        if (this.c.d) {
            this.e.a();
        }
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.Q().a.f().a(emg.a(this.h, 32768, 1)).a(new fym(this), fyl.a)};
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkn.class};
        } else if (i == 0) {
            a((ahkn) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
