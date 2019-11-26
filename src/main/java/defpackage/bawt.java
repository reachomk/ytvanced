package defpackage;

import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: bawt */
final class bawt implements bazv {
    public final String a;
    public bbej b;
    public final Object c = new Object();
    public final Set d = new HashSet();
    public final Executor e;
    public final int f;
    public final boolean g;
    public final bbht h;
    public boolean i;
    public bavx j;
    public boolean k;
    public final bawo l;
    private final batp m;
    private final InetSocketAddress n;
    private final String o;
    private final barq p;
    private boolean q;
    private boolean r;

    bawt(bawo bawo, InetSocketAddress inetSocketAddress, String str, String str2, barq barq, Executor executor, int i, boolean z, bbht bbht) {
        this.n = (InetSocketAddress) amqw.a((Object) inetSocketAddress, (Object) "address");
        this.m = batp.a(getClass(), inetSocketAddress.toString());
        this.o = str;
        this.a = bbby.a("cronet", str2);
        this.f = i;
        this.g = false;
        this.e = (Executor) amqw.a((Object) executor, (Object) "executor");
        this.l = (bawo) amqw.a((Object) bawo, (Object) "streamFactory");
        this.h = (bbht) amqw.a((Object) bbht, (Object) "transportTracer");
        barp a = barq.a();
        a.a(bbbv.c, bavr.PRIVACY_AND_INTEGRITY);
        a.a(bbbv.d, barq);
        this.p = a.a();
    }

    public final Runnable a(bbej bbej) {
        this.b = (bbej) amqw.a((Object) bbej, (Object) "listener");
        synchronized (this.c) {
            this.k = true;
        }
        return new baww(this);
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.n);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(obj).length() + 2) + valueOf.length());
        stringBuilder.append(obj);
        stringBuilder.append("(");
        stringBuilder.append(valueOf);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    /* JADX WARNING: Missing block: B:8:0x000a, code skipped:
            r1 = r3.c;
     */
    /* JADX WARNING: Missing block: B:9:0x000c, code skipped:
            monitor-enter(r1);
     */
    /* JADX WARNING: Missing block: B:12:0x000f, code skipped:
            if (r3.q == false) goto L_0x0013;
     */
    /* JADX WARNING: Missing block: B:13:0x0011, code skipped:
            monitor-exit(r1);
     */
    /* JADX WARNING: Missing block: B:14:0x0012, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:15:0x0013, code skipped:
            r3.q = true;
     */
    /* JADX WARNING: Missing block: B:16:0x0016, code skipped:
            monitor-exit(r1);
     */
    /* JADX WARNING: Missing block: B:17:0x0017, code skipped:
            r3.b.a(r4);
            r2 = r3.c;
     */
    /* JADX WARNING: Missing block: B:18:0x001e, code skipped:
            monitor-enter(r2);
     */
    /* JADX WARNING: Missing block: B:20:?, code skipped:
            r3.i = true;
            r3.j = r4;
     */
    /* JADX WARNING: Missing block: B:21:0x0023, code skipped:
            monitor-exit(r2);
     */
    /* JADX WARNING: Missing block: B:22:0x0024, code skipped:
            a();
     */
    /* JADX WARNING: Missing block: B:23:0x0027, code skipped:
            return;
     */
    public final void a(defpackage.bavx r4) {
        /*
        r3 = this;
        r0 = r3.c;
        monitor-enter(r0);
        r1 = r3.i;	 Catch:{ all -> 0x002e }
        if (r1 == 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r0);	 Catch:{ all -> 0x002e }
        return;
    L_0x0009:
        monitor-exit(r0);	 Catch:{ all -> 0x002e }
        r1 = r3.c;
        monitor-enter(r1);
        r0 = r3.q;	 Catch:{ all -> 0x002b }
        if (r0 == 0) goto L_0x0013;
    L_0x0011:
        monitor-exit(r1);	 Catch:{ all -> 0x002b }
        return;
    L_0x0013:
        r0 = 1;
        r3.q = r0;	 Catch:{ all -> 0x002b }
        monitor-exit(r1);	 Catch:{ all -> 0x002b }
        r1 = r3.b;
        r1.a(r4);
        r2 = r3.c;
        monitor-enter(r2);
        r3.i = r0;	 Catch:{ all -> 0x0028 }
        r3.j = r4;	 Catch:{ all -> 0x0028 }
        monitor-exit(r2);	 Catch:{ all -> 0x0028 }
        r3.a();
        return;
    L_0x0028:
        r4 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0028 }
        throw r4;
    L_0x002b:
        r4 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x002b }
        throw r4;
    L_0x002e:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x002e }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bawt.a(bavx):void");
    }

    public final void b(bavx bavx) {
        ArrayList arrayList;
        a(bavx);
        synchronized (this.c) {
            arrayList = new ArrayList(this.d);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            ((bawq) arrayList.get(i)).b(bavx);
        }
        a();
    }

    public final batp b() {
        return this.m;
    }

    private final void a() {
        synchronized (this.c) {
            if (this.i && !this.r && this.d.size() == 0) {
                this.r = true;
                this.b.b();
                return;
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(bawq bawq, bavx bavx) {
        synchronized (this.c) {
            if (this.d.remove(bawq)) {
                boolean z = true;
                if (bavx.m != bawa.CANCELLED) {
                    if (bavx.m != bawa.DEADLINE_EXCEEDED) {
                        z = false;
                    }
                }
                bawq.n.b(bavx, z, new baum());
                a();
                return;
            }
        }
    }

    public final /* synthetic */ bazo a(bauw bauw, baum baum, barv barv) {
        Object str;
        amqw.a((Object) bauw, (Object) "method");
        amqw.a((Object) baum, (Object) "headers");
        String valueOf = String.valueOf(bauw.b);
        String str2 = "/";
        if (valueOf.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(valueOf);
        }
        String str3 = this.o;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str3).length() + 8) + String.valueOf(str).length());
        stringBuilder.append("https://");
        stringBuilder.append(str3);
        stringBuilder.append(str);
        return new bawv(this, stringBuilder.toString(), baum, bauw, bbho.a(barv, this.p, baum), barv).a;
    }
}
