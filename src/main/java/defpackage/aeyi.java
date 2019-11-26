package defpackage;

import android.os.Handler;
import android.os.Handler.Callback;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: aeyi */
final class aeyi extends ons implements afae, Callback {
    public aeym b;
    public aeym c;
    private final List d = new ArrayList();
    private final Map e = new IdentityHashMap(2);
    private Handler f;
    private final Callable g = new aeyl(this);
    private final Callable h = new aeyk(this);

    aeyi(ool ool) {
        this.b = new aeym(ool);
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void c() {
        this.d.add(this.h);
        Handler handler = this.f;
        if (handler != null) {
            handler.obtainMessage(1).sendToTarget();
        }
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void d() {
        this.d.add(this.g);
        Handler handler = this.f;
        if (handler != null) {
            handler.obtainMessage(1).sendToTarget();
        }
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(ool ool, long j, long j2) {
        this.d.add(new aeyp(this, ool, j, j2));
        Handler handler = this.f;
        if (handler != null) {
            handler.obtainMessage(1).sendToTarget();
        }
    }

    private final void e() {
        a(new aeyn(this.b, this.c), null);
    }

    public final synchronized void a(owt owt) {
        super.a(owt);
        this.f = new Handler(this);
        Object obj = this.b;
        a(obj, obj.a);
        this.f.obtainMessage(1).sendToTarget();
    }

    public final ooj a(ook ook, ouw ouw, long j) {
        amqw.b(ook.a instanceof aeym);
        aeym aeym = (aeym) ook.a;
        amqw.b(aeym.c == null);
        onq onq = new onq(aeym.a.a(ook.a(((oau) amqw.a(aeym.e)).a(0)), ouw, j), false, aeym.a());
        this.e.put(onq, aeym);
        aeym.c = onq;
        return onq;
    }

    public final void a(ooj ooj) {
        Object obj = (aeym) this.e.remove(ooj);
        amqw.b(obj.c != null);
        obj.a.a(obj.c.a);
        obj.c = null;
        if (obj.d) {
            a(obj);
        }
    }

    public final synchronized void a() {
        super.a();
        this.f = null;
    }

    public final long a(long j) {
        ool ool = this.b.a;
        return ool instanceof afae ? ((afae) ool).a(j) : -1;
    }

    /* JADX WARNING: Missing block: B:11:?, code skipped:
            r4 = r4.iterator();
            r1 = 0;
     */
    /* JADX WARNING: Missing block: B:13:0x0026, code skipped:
            if (r4.hasNext() == false) goto L_0x003a;
     */
    /* JADX WARNING: Missing block: B:15:0x0038, code skipped:
            r1 = r1 | ((java.lang.Boolean) ((java.util.concurrent.Callable) r4.next()).call()).booleanValue();
     */
    /* JADX WARNING: Missing block: B:16:0x003a, code skipped:
            if (r1 == 0) goto L_0x003f;
     */
    /* JADX WARNING: Missing block: B:17:0x003c, code skipped:
            e();
     */
    /* JADX WARNING: Missing block: B:18:0x003f, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:19:0x0040, code skipped:
            r4 = move-exception;
     */
    /* JADX WARNING: Missing block: B:21:0x0046, code skipped:
            throw new java.lang.IllegalStateException(r4);
     */
    public final boolean handleMessage(android.os.Message r4) {
        /*
        r3 = this;
        r4 = r4.what;
        r0 = 1;
        if (r4 != r0) goto L_0x004a;
    L_0x0005:
        monitor-enter(r3);
        r4 = r3.d;	 Catch:{ all -> 0x0047 }
        r4 = r4.isEmpty();	 Catch:{ all -> 0x0047 }
        if (r4 == 0) goto L_0x0010;
    L_0x000e:
        monitor-exit(r3);	 Catch:{ all -> 0x0047 }
        return r0;
    L_0x0010:
        r4 = new java.util.ArrayList;	 Catch:{ all -> 0x0047 }
        r1 = r3.d;	 Catch:{ all -> 0x0047 }
        r4.<init>(r1);	 Catch:{ all -> 0x0047 }
        r1 = r3.d;	 Catch:{ all -> 0x0047 }
        r1.clear();	 Catch:{ all -> 0x0047 }
        monitor-exit(r3);	 Catch:{ all -> 0x0047 }
        r4 = r4.iterator();	 Catch:{ Exception -> 0x0040 }
        r1 = 0;
    L_0x0022:
        r2 = r4.hasNext();	 Catch:{ Exception -> 0x0040 }
        if (r2 == 0) goto L_0x003a;
    L_0x0028:
        r2 = r4.next();	 Catch:{ Exception -> 0x0040 }
        r2 = (java.util.concurrent.Callable) r2;	 Catch:{ Exception -> 0x0040 }
        r2 = r2.call();	 Catch:{ Exception -> 0x0040 }
        r2 = (java.lang.Boolean) r2;	 Catch:{ Exception -> 0x0040 }
        r2 = r2.booleanValue();	 Catch:{ Exception -> 0x0040 }
        r1 = r1 | r2;
        goto L_0x0022;
    L_0x003a:
        if (r1 == 0) goto L_0x003f;
    L_0x003c:
        r3.e();
    L_0x003f:
        return r0;
    L_0x0040:
        r4 = move-exception;
        r0 = new java.lang.IllegalStateException;
        r0.<init>(r4);
        throw r0;
    L_0x0047:
        r4 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0047 }
        throw r4;
    L_0x004a:
        r4 = new java.lang.IllegalArgumentException;
        r4.<init>();
        goto L_0x0051;
    L_0x0050:
        throw r4;
    L_0x0051:
        goto L_0x0050;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeyi.handleMessage(android.os.Message):boolean");
    }
}
