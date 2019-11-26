package defpackage;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bbah */
class bbah implements bazo {
    public bazo a;
    private volatile boolean b;
    private bazn c;
    private bavx d;
    private List e = new ArrayList();
    private bbav f;

    bbah() {
    }

    public final void b(int i) {
        if (this.b) {
            this.a.b(i);
        } else {
            a(new bbak(this, i));
        }
    }

    public final void a(int i) {
        if (this.b) {
            this.a.a(i);
        } else {
            a(new bban(this, i));
        }
    }

    public final void a(basy basy) {
        a(new bbaq(this, basy));
    }

    /* Access modifiers changed, original: final */
    public final void a(bazo bazo) {
        synchronized (this) {
            if (this.a == null) {
                this.a = (bazo) amqw.a((Object) bazo, (Object) "stream");
                a();
                return;
            }
        }
    }

    /* JADX WARNING: Missing block: B:7:0x0017, code skipped:
            if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Missing block: B:8:0x0019, code skipped:
            r3 = new java.util.ArrayList();
     */
    /* JADX WARNING: Missing block: B:9:0x001e, code skipped:
            monitor-enter(r2);
     */
    /* JADX WARNING: Missing block: B:12:0x0025, code skipped:
            if (r2.c.isEmpty() == false) goto L_0x002d;
     */
    /* JADX WARNING: Missing block: B:13:0x0027, code skipped:
            r2.c = null;
            r2.b = true;
     */
    /* JADX WARNING: Missing block: B:14:0x002b, code skipped:
            monitor-exit(r2);
     */
    /* JADX WARNING: Missing block: B:16:0x002d, code skipped:
            r4 = r2.c;
            r2.c = r3;
     */
    /* JADX WARNING: Missing block: B:17:0x0031, code skipped:
            monitor-exit(r2);
     */
    /* JADX WARNING: Missing block: B:18:0x0032, code skipped:
            r3 = r4.iterator();
     */
    /* JADX WARNING: Missing block: B:20:0x003a, code skipped:
            if (r3.hasNext() == false) goto L_0x0046;
     */
    /* JADX WARNING: Missing block: B:21:0x003c, code skipped:
            ((java.lang.Runnable) r3.next()).run();
     */
    /* JADX WARNING: Missing block: B:22:0x0046, code skipped:
            r4.clear();
            r3 = r4;
     */
    /* JADX WARNING: Missing block: B:30:0x0054, code skipped:
            r0 = r1.iterator();
     */
    /* JADX WARNING: Missing block: B:32:0x005c, code skipped:
            if (r0.hasNext() == false) goto L_0x0068;
     */
    /* JADX WARNING: Missing block: B:33:0x005e, code skipped:
            ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARNING: Missing block: B:49:?, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:50:?, code skipped:
            return;
     */
    private final void a() {
        /*
        r6 = this;
        r0 = new java.util.ArrayList;
        r0.<init>();
    L_0x0005:
        monitor-enter(r6);
        r1 = r6.e;	 Catch:{ all -> 0x006d }
        r1 = r1.isEmpty();	 Catch:{ all -> 0x006d }
        if (r1 == 0) goto L_0x004f;
    L_0x000e:
        r0 = 0;
        r6.e = r0;	 Catch:{ all -> 0x006d }
        r1 = 1;
        r6.b = r1;	 Catch:{ all -> 0x006d }
        r2 = r6.f;	 Catch:{ all -> 0x006d }
        monitor-exit(r6);	 Catch:{ all -> 0x006d }
        if (r2 == 0) goto L_0x004e;
    L_0x0019:
        r3 = new java.util.ArrayList;
        r3.<init>();
    L_0x001e:
        monitor-enter(r2);
        r4 = r2.c;	 Catch:{ all -> 0x004b }
        r4 = r4.isEmpty();	 Catch:{ all -> 0x004b }
        if (r4 == 0) goto L_0x002d;
    L_0x0027:
        r2.c = r0;	 Catch:{ all -> 0x004b }
        r2.b = r1;	 Catch:{ all -> 0x004b }
        monitor-exit(r2);	 Catch:{ all -> 0x004b }
        goto L_0x004e;
    L_0x002d:
        r4 = r2.c;	 Catch:{ all -> 0x004b }
        r2.c = r3;	 Catch:{ all -> 0x004b }
        monitor-exit(r2);	 Catch:{ all -> 0x004b }
        r3 = r4.iterator();
    L_0x0036:
        r5 = r3.hasNext();
        if (r5 == 0) goto L_0x0046;
    L_0x003c:
        r5 = r3.next();
        r5 = (java.lang.Runnable) r5;
        r5.run();
        goto L_0x0036;
    L_0x0046:
        r4.clear();
        r3 = r4;
        goto L_0x001e;
    L_0x004b:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x004b }
        throw r0;
    L_0x004e:
        return;
    L_0x004f:
        r1 = r6.e;	 Catch:{ all -> 0x006d }
        r6.e = r0;	 Catch:{ all -> 0x006d }
        monitor-exit(r6);	 Catch:{ all -> 0x006d }
        r0 = r1.iterator();
    L_0x0058:
        r2 = r0.hasNext();
        if (r2 == 0) goto L_0x0068;
    L_0x005e:
        r2 = r0.next();
        r2 = (java.lang.Runnable) r2;
        r2.run();
        goto L_0x0058;
    L_0x0068:
        r1.clear();
        r0 = r1;
        goto L_0x0005;
    L_0x006d:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x006d }
        goto L_0x0071;
    L_0x0070:
        throw r0;
    L_0x0071:
        goto L_0x0070;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbah.a():void");
    }

    private final void a(Runnable runnable) {
        synchronized (this) {
            if (this.b) {
                runnable.run();
                return;
            }
            this.e.add(runnable);
        }
    }

    public final void a(String str) {
        amqw.b(this.c == null, (Object) "May only be called before start");
        amqw.a((Object) str, (Object) "authority");
        a(new bbap(this, str));
    }

    public final void a(bazn bazn) {
        bavx bavx;
        boolean z;
        amqw.b(this.c == null, (Object) "already started");
        synchronized (this) {
            this.c = (bazn) amqw.a((Object) bazn, (Object) "listener");
            bavx = this.d;
            z = this.b;
            if (!z) {
                bbav bbav = new bbav(bazn);
                this.f = bbav;
                bazn = bbav;
            }
        }
        if (bavx != null) {
            bazn.b(bavx, new baum());
        } else if (z) {
            this.a.a(bazn);
        } else {
            a(new bbas(this, bazn));
        }
    }

    public final void a(InputStream inputStream) {
        amqw.a((Object) inputStream, (Object) "message");
        if (this.b) {
            this.a.a(inputStream);
        } else {
            a(new bbar(this, inputStream));
        }
    }

    public final void f() {
        if (this.b) {
            this.a.f();
        } else {
            a(new bbau(this));
        }
    }

    public void b(bavx bavx) {
        bazn bazn;
        Object obj;
        amqw.a((Object) bavx, (Object) "reason");
        synchronized (this) {
            if (this.a == null) {
                this.a = bbet.a;
                bazn = this.c;
                this.d = bavx;
                obj = null;
            } else {
                obj = 1;
                bazn = null;
            }
        }
        if (obj != null) {
            a(new bbat(this, bavx));
            return;
        }
        if (bazn != null) {
            bazn.b(bavx, new baum());
        }
        a();
    }

    public final void e() {
        a(new bbaw(this));
    }

    public final void c(int i) {
        if (this.b) {
            this.a.c(i);
        } else {
            a(new bbaj(this, i));
        }
    }

    public final void a(basn basn) {
        amqw.a((Object) basn, (Object) "compressor");
        a(new bbam(this, basn));
    }

    public final void a(boolean z) {
        a(new bbal(this, z));
    }

    public final void a(batc batc) {
        amqw.a((Object) batc, (Object) "decompressorRegistry");
        a(new bbao(this, batc));
    }
}
