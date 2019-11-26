package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aikv */
public class aikv {
    private final bcaa a;
    private final Map b = new HashMap();
    private Enum c;

    public aikv(aikf aikf) {
        this.a = new aiky(aikf);
    }

    public final synchronized void a(Enum enumR, aikw aikw) {
        amqw.a((Object) enumR);
        amqw.a((Object) aikw);
        amqw.a(enumR != this.c);
        this.b.put(enumR, aikw);
    }

    /* JADX WARNING: Missing block: B:12:0x0049, code skipped:
            return;
     */
    public final synchronized void a(java.lang.Enum r7) {
        /*
        r6 = this;
        monitor-enter(r6);
        defpackage.amqw.a(r7);	 Catch:{ all -> 0x004c }
        r0 = r6.c;	 Catch:{ all -> 0x004c }
        if (r0 == r7) goto L_0x004a;
    L_0x0008:
        r1 = r6.b;	 Catch:{ all -> 0x004c }
        r1 = r1.get(r7);	 Catch:{ all -> 0x004c }
        r1 = (defpackage.aikw) r1;	 Catch:{ all -> 0x004c }
        r1 = defpackage.amqw.a(r1);	 Catch:{ all -> 0x004c }
        r1 = (defpackage.aikw) r1;	 Catch:{ all -> 0x004c }
        r2 = 0;
        if (r0 == 0) goto L_0x002b;
    L_0x0019:
        r2 = r6.b;	 Catch:{ all -> 0x004c }
        r2 = r2.get(r0);	 Catch:{ all -> 0x004c }
        r2 = (defpackage.aikw) r2;	 Catch:{ all -> 0x004c }
        r3 = r2.get();	 Catch:{ all -> 0x004c }
        r3 = (defpackage.aikc) r3;	 Catch:{ all -> 0x004c }
        r5 = r3;
        r3 = r2;
        r2 = r5;
        goto L_0x002c;
    L_0x002b:
        r3 = r2;
    L_0x002c:
        r4 = r1.get();	 Catch:{ all -> 0x004c }
        r4 = (defpackage.aikc) r4;	 Catch:{ all -> 0x004c }
        r1 = r1.a(r2);	 Catch:{ all -> 0x004c }
        r6.c = r7;	 Catch:{ all -> 0x004c }
        r7 = r6.a;	 Catch:{ all -> 0x004c }
        r7 = r7.get();	 Catch:{ all -> 0x004c }
        r7 = (defpackage.aikf) r7;	 Catch:{ all -> 0x004c }
        r7.a(r4, r1);	 Catch:{ all -> 0x004c }
        if (r0 == 0) goto L_0x0048;
    L_0x0045:
        r3.a();	 Catch:{ all -> 0x004c }
    L_0x0048:
        monitor-exit(r6);
        return;
    L_0x004a:
        monitor-exit(r6);
        return;
    L_0x004c:
        r7 = move-exception;
        monitor-exit(r6);
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aikv.a(java.lang.Enum):void");
    }
}
