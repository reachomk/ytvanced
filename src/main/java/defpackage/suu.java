package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: suu */
public final class suu implements swm {
    private final Map a = new HashMap();
    private final Object b = new Object();

    public final void a(String str, byte[] bArr) {
        swl.a(this, str, bArr);
    }

    public final void a(String str, byte[] bArr, boolean z) {
        amqw.a((Object) bArr, (Object) "Storing null entity is not allowed");
        synchronized (this.b) {
            sus sus = (sus) this.a.get(str);
            if (sus == null) {
                this.a.put(str, new sus(amqp.b(bArr)));
            } else {
                sus.a(amqp.b(bArr), z);
            }
        }
    }

    /* JADX WARNING: Missing block: B:12:0x0025, code skipped:
            return;
     */
    public final void a(java.lang.String r4) {
        /*
        r3 = this;
        r0 = r3.b;
        monitor-enter(r0);
        r1 = r3.a;	 Catch:{ all -> 0x0026 }
        r4 = r1.get(r4);	 Catch:{ all -> 0x0026 }
        r4 = (defpackage.sus) r4;	 Catch:{ all -> 0x0026 }
        if (r4 != 0) goto L_0x000f;
    L_0x000d:
        monitor-exit(r0);	 Catch:{ all -> 0x0026 }
        return;
    L_0x000f:
        r1 = r4.b;	 Catch:{ all -> 0x0026 }
        r1 = r1.get();	 Catch:{ all -> 0x0026 }
        r1 = (defpackage.amqp) r1;	 Catch:{ all -> 0x0026 }
        r1 = r1.a();	 Catch:{ all -> 0x0026 }
        if (r1 != 0) goto L_0x001e;
    L_0x001d:
        goto L_0x0024;
    L_0x001e:
        r1 = defpackage.ampo.a;	 Catch:{ all -> 0x0026 }
        r2 = 1;
        r4.a(r1, r2);	 Catch:{ all -> 0x0026 }
    L_0x0024:
        monitor-exit(r0);	 Catch:{ all -> 0x0026 }
        return;
    L_0x0026:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0026 }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.suu.a(java.lang.String):void");
    }

    public final bbmi b(String str) {
        bbmi b;
        synchronized (this.b) {
            sus sus = (sus) this.a.get(str);
            if (sus == null) {
                sus = new sus(ampo.a);
                this.a.put(str, sus);
            }
            b = sus.a.b(bbmi.a(new sur(sus)));
        }
        return b;
    }
}
