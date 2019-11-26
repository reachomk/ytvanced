package defpackage;

/* renamed from: ebe */
public abstract class ebe {
    public final ebg a;
    public nki b;
    private Object c;
    private final /* synthetic */ eav d;

    public abstract Object a(byte[] bArr);

    public abstract byte[] a(Object obj);

    public final synchronized void b(Object obj) {
        nki nki;
        amqw.a(obj);
        nkh nkh = (nkh) nki.e.createBuilder();
        if (this.d.a.a()) {
            String a = this.d.a.c().a();
            nkh.copyOnWrite();
            nki = (nki) nkh.instance;
            if (a != null) {
                nki.a |= 1;
                nki.b = a;
            } else {
                throw new NullPointerException();
            }
        }
        long a2 = this.d.b.a();
        nkh.copyOnWrite();
        nki nki2 = (nki) nkh.instance;
        nki2.a |= 2;
        nki2.c = a2;
        anvu a3 = anvu.a(a(obj));
        nkh.copyOnWrite();
        nki = (nki) nkh.instance;
        if (a3 != null) {
            nki.a |= 4;
            nki.d = a3;
            this.b = (nki) ((anxl) nkh.build());
            this.c = obj;
            this.d.c.execute(new ebd(this));
        } else {
            throw new NullPointerException();
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x002c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0072 */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:12|13|14|15) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:37|38|39|40) */
    /* JADX WARNING: Missing block: B:36:0x0071, code skipped:
            return null;
     */
    /* JADX WARNING: Missing block: B:38:?, code skipped:
            b();
     */
    /* JADX WARNING: Missing block: B:40:0x0076, code skipped:
            return null;
     */
    public final synchronized java.lang.Object a() {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.b;	 Catch:{ all -> 0x0079 }
        r1 = 0;
        if (r0 == 0) goto L_0x000b;
    L_0x0006:
        r0 = r4.c;	 Catch:{ all -> 0x0079 }
        if (r0 == 0) goto L_0x000b;
    L_0x000a:
        goto L_0x0042;
    L_0x000b:
        r0 = r4.a;	 Catch:{ all -> 0x0079 }
        r2 = r0.a;	 Catch:{ all -> 0x0079 }
        r2 = r2.exists();	 Catch:{ all -> 0x0079 }
        if (r2 == 0) goto L_0x001c;
    L_0x0015:
        r0 = r0.a;	 Catch:{ all -> 0x0079 }
        r0 = defpackage.anbk.b(r0);	 Catch:{ all -> 0x0079 }
        goto L_0x001d;
    L_0x001c:
        r0 = r1;
    L_0x001d:
        if (r0 == 0) goto L_0x002f;
    L_0x001f:
        r2 = defpackage.anxa.c();	 Catch:{ anyg -> 0x002c }
        r3 = defpackage.nki.e;	 Catch:{ anyg -> 0x002c }
        r0 = defpackage.anxl.parseFrom(r3, r0, r2);	 Catch:{ anyg -> 0x002c }
        r0 = (defpackage.nki) r0;	 Catch:{ anyg -> 0x002c }
        goto L_0x0030;
    L_0x002c:
        r4.b();	 Catch:{ all -> 0x0079 }
    L_0x002f:
        r0 = r1;
    L_0x0030:
        r4.b = r0;	 Catch:{ all -> 0x0079 }
        r0 = r4.b;	 Catch:{ all -> 0x0079 }
        if (r0 == 0) goto L_0x0077;
    L_0x0036:
        r0 = r0.d;	 Catch:{ IOException -> 0x0072 }
        r0 = r0.d();	 Catch:{ IOException -> 0x0072 }
        r0 = r4.a(r0);	 Catch:{ IOException -> 0x0072 }
        r4.c = r0;	 Catch:{ IOException -> 0x0072 }
    L_0x0042:
        r0 = r4.b;	 Catch:{ all -> 0x0079 }
        r0 = r0.b;	 Catch:{ all -> 0x0079 }
        r2 = r4.d;	 Catch:{ all -> 0x0079 }
        r2 = r2.a;	 Catch:{ all -> 0x0079 }
        r2 = r2.a();	 Catch:{ all -> 0x0079 }
        if (r2 == 0) goto L_0x0066;
    L_0x0050:
        r2 = r4.d;	 Catch:{ all -> 0x0079 }
        r2 = r2.a;	 Catch:{ all -> 0x0079 }
        r2 = r2.c();	 Catch:{ all -> 0x0079 }
        r2 = r2.a();	 Catch:{ all -> 0x0079 }
        r0 = android.text.TextUtils.equals(r2, r0);	 Catch:{ all -> 0x0079 }
        if (r0 == 0) goto L_0x0070;
    L_0x0062:
        r0 = r4.c;	 Catch:{ all -> 0x0079 }
        monitor-exit(r4);
        return r0;
    L_0x0066:
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ all -> 0x0079 }
        if (r0 == 0) goto L_0x0070;
    L_0x006c:
        r0 = r4.c;	 Catch:{ all -> 0x0079 }
        monitor-exit(r4);
        return r0;
    L_0x0070:
        monitor-exit(r4);
        return r1;
    L_0x0072:
        r4.b();	 Catch:{ all -> 0x0079 }
        monitor-exit(r4);
        return r1;
    L_0x0077:
        monitor-exit(r4);
        return r1;
    L_0x0079:
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ebe.a():java.lang.Object");
    }

    public final synchronized void b() {
        this.a.a();
        this.b = null;
        this.c = null;
    }

    /* synthetic */ ebe(eav eav, ebg ebg) {
        this.d = eav;
        this.a = ebg;
    }
}
