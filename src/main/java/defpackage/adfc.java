package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: adfc */
public final class adfc {
    private static final String d = xtl.b("MDX.DiscoveryController");
    public final Set a;
    public final Set b;
    public final Object c;
    private final bapu e;
    private final bapu f;
    private final bapu g;
    private final bapu h;
    private boolean i;
    private boolean j;
    private boolean k;
    private final bbe l = new adfb();

    public adfc(bapu bapu, bapu bapu2, bapu bapu3, bapu bapu4) {
        this.e = bapu;
        this.f = bapu2;
        this.g = bapu3;
        this.h = bapu4;
        this.a = Collections.newSetFromMap(new ConcurrentHashMap());
        this.c = new Object();
        this.b = Collections.newSetFromMap(new ConcurrentHashMap());
    }

    /* JADX WARNING: Missing block: B:24:0x0059, code skipped:
            if (r3.k == false) goto L_0x005b;
     */
    public final void a(java.lang.Object r4, boolean r5) {
        /*
        r3 = this;
        defpackage.amqw.a(r4);
        defpackage.xak.a();
        r0 = r3.i;
        r1 = 1;
        if (r0 != 0) goto L_0x002d;
    L_0x000b:
        r0 = r3.f;
        r0.get();
        r0 = r3.h;
        r0 = r0.get();
        r0 = (defpackage.ban) r0;
        if (r0 == 0) goto L_0x0025;
    L_0x001a:
        defpackage.bbb.e();
        r2 = defpackage.bbb.a;
        r2.a(r0);
        r3.i = r1;
        goto L_0x002d;
    L_0x0025:
        r4 = new java.lang.IllegalArgumentException;
        r5 = "providerInstance must not be null";
        r4.<init>(r5);
        throw r4;
    L_0x002d:
        r0 = r3.c;
        monitor-enter(r0);
        r2 = r3.a;	 Catch:{ all -> 0x0064 }
        r2 = r2.add(r4);	 Catch:{ all -> 0x0064 }
        if (r2 != 0) goto L_0x0039;
    L_0x0038:
        goto L_0x0062;
    L_0x0039:
        if (r5 != 0) goto L_0x003c;
    L_0x003b:
        goto L_0x0041;
    L_0x003c:
        r2 = r3.b;	 Catch:{ all -> 0x0064 }
        r2.add(r4);	 Catch:{ all -> 0x0064 }
    L_0x0041:
        r4 = r3.j;	 Catch:{ all -> 0x0064 }
        if (r4 != 0) goto L_0x0050;
    L_0x0045:
        r4 = r3.e;	 Catch:{ all -> 0x0064 }
        r4 = r4.get();	 Catch:{ all -> 0x0064 }
        r4 = (defpackage.tgk) r4;	 Catch:{ all -> 0x0064 }
        r4.b();	 Catch:{ all -> 0x0064 }
    L_0x0050:
        r4 = r3.j;	 Catch:{ all -> 0x0064 }
        if (r4 != 0) goto L_0x0055;
    L_0x0054:
        goto L_0x005b;
    L_0x0055:
        if (r5 == 0) goto L_0x0062;
    L_0x0057:
        r4 = r3.k;	 Catch:{ all -> 0x0064 }
        if (r4 != 0) goto L_0x0062;
    L_0x005b:
        r3.a(r5);	 Catch:{ all -> 0x0064 }
        r3.j = r1;	 Catch:{ all -> 0x0064 }
        r3.k = r5;	 Catch:{ all -> 0x0064 }
    L_0x0062:
        monitor-exit(r0);	 Catch:{ all -> 0x0064 }
        return;
    L_0x0064:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0064 }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adfc.a(java.lang.Object, boolean):void");
    }

    private final void a(boolean z) {
        ((bbb) this.f.get()).a((baz) this.g.get(), this.l, !z ? 4 : 1);
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Missing block: B:21:0x0076, code skipped:
            return;
     */
    public final void a(java.lang.Object r5) {
        /*
        r4 = this;
        defpackage.xak.a();
        defpackage.amqw.a(r5);
        r0 = r4.c;
        monitor-enter(r0);
        r1 = r4.a;	 Catch:{ all -> 0x0077 }
        r1 = r1.remove(r5);	 Catch:{ all -> 0x0077 }
        r2 = r4.b;	 Catch:{ all -> 0x0077 }
        r2.remove(r5);	 Catch:{ all -> 0x0077 }
        if (r1 != 0) goto L_0x0038;
    L_0x0016:
        r1 = d;	 Catch:{ all -> 0x0077 }
        r5 = java.lang.String.valueOf(r5);	 Catch:{ all -> 0x0077 }
        r2 = r5.length();	 Catch:{ all -> 0x0077 }
        r2 = r2 + 41;
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0077 }
        r3.<init>(r2);	 Catch:{ all -> 0x0077 }
        r2 = "cancelDiscoveryRequest ignored requester ";
        r3.append(r2);	 Catch:{ all -> 0x0077 }
        r3.append(r5);	 Catch:{ all -> 0x0077 }
        r5 = r3.toString();	 Catch:{ all -> 0x0077 }
        defpackage.xtl.b(r1, r5);	 Catch:{ all -> 0x0077 }
        monitor-exit(r0);	 Catch:{ all -> 0x0077 }
        return;
    L_0x0038:
        r5 = r4.j;	 Catch:{ all -> 0x0077 }
        if (r5 != 0) goto L_0x003e;
    L_0x003c:
        monitor-exit(r0);	 Catch:{ all -> 0x0077 }
        return;
    L_0x003e:
        r5 = r4.a;	 Catch:{ all -> 0x0077 }
        r5 = r5.isEmpty();	 Catch:{ all -> 0x0077 }
        r1 = 0;
        if (r5 == 0) goto L_0x0064;
    L_0x0047:
        r5 = r4.e;	 Catch:{ all -> 0x0077 }
        r5 = r5.get();	 Catch:{ all -> 0x0077 }
        r5 = (defpackage.tgk) r5;	 Catch:{ all -> 0x0077 }
        r5.c();	 Catch:{ all -> 0x0077 }
        r5 = r4.f;	 Catch:{ all -> 0x0077 }
        r5 = r5.get();	 Catch:{ all -> 0x0077 }
        r5 = (defpackage.bbb) r5;	 Catch:{ all -> 0x0077 }
        r2 = r4.l;	 Catch:{ all -> 0x0077 }
        r5.a(r2);	 Catch:{ all -> 0x0077 }
        r4.j = r1;	 Catch:{ all -> 0x0077 }
        r4.k = r1;	 Catch:{ all -> 0x0077 }
        goto L_0x0075;
    L_0x0064:
        r5 = r4.k;	 Catch:{ all -> 0x0077 }
        if (r5 == 0) goto L_0x0075;
    L_0x0068:
        r5 = r4.b;	 Catch:{ all -> 0x0077 }
        r5 = r5.isEmpty();	 Catch:{ all -> 0x0077 }
        if (r5 == 0) goto L_0x0075;
    L_0x0070:
        r4.a(r1);	 Catch:{ all -> 0x0077 }
        r4.k = r1;	 Catch:{ all -> 0x0077 }
    L_0x0075:
        monitor-exit(r0);	 Catch:{ all -> 0x0077 }
        return;
    L_0x0077:
        r5 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0077 }
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adfc.a(java.lang.Object):void");
    }
}
