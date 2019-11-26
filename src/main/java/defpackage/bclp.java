package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.impl.CronetBidirectionalStream;

/* renamed from: bclp */
public final class bclp implements Runnable {
    public ByteBuffer a;
    public boolean b;
    private final /* synthetic */ CronetBidirectionalStream c;

    /* JADX WARNING: Missing block: B:16:?, code skipped:
            r1 = r6.c;
            r1.a.a(r1, r1.g, r0, r6.b);
     */
    /* JADX WARNING: Missing block: B:17:0x0037, code skipped:
            if (r3 == null) goto L_0x003e;
     */
    /* JADX WARNING: Missing block: B:18:0x0039, code skipped:
            r6.c.e();
     */
    /* JADX WARNING: Missing block: B:19:0x003e, code skipped:
            return;
     */
    public final void run() {
        /*
        r6 = this;
        r0 = r6.a;	 Catch:{ Exception -> 0x0042 }
        r1 = 0;
        r6.a = r1;	 Catch:{ Exception -> 0x0042 }
        r1 = r6.c;	 Catch:{ Exception -> 0x0042 }
        r1 = r1.c;	 Catch:{ Exception -> 0x0042 }
        monitor-enter(r1);	 Catch:{ Exception -> 0x0042 }
        r2 = r6.c;	 Catch:{ all -> 0x003f }
        r2 = r2.d();	 Catch:{ all -> 0x003f }
        if (r2 == 0) goto L_0x0014;
    L_0x0012:
        monitor-exit(r1);	 Catch:{ all -> 0x003f }
        return;
    L_0x0014:
        r2 = r6.b;	 Catch:{ all -> 0x003f }
        r3 = 0;
        if (r2 == 0) goto L_0x0026;
    L_0x0019:
        r2 = r6.c;	 Catch:{ all -> 0x003f }
        r4 = 4;
        r2.e = r4;	 Catch:{ all -> 0x003f }
        r2 = r2.f;	 Catch:{ all -> 0x003f }
        r4 = 10;
        if (r2 != r4) goto L_0x002b;
    L_0x0024:
        r3 = 1;
        goto L_0x002b;
    L_0x0026:
        r2 = r6.c;	 Catch:{ all -> 0x003f }
        r4 = 2;
        r2.e = r4;	 Catch:{ all -> 0x003f }
    L_0x002b:
        monitor-exit(r1);	 Catch:{ all -> 0x003f }
        r1 = r6.c;	 Catch:{ Exception -> 0x0042 }
        r2 = r1.a;	 Catch:{ Exception -> 0x0042 }
        r4 = r1.g;	 Catch:{ Exception -> 0x0042 }
        r5 = r6.b;	 Catch:{ Exception -> 0x0042 }
        r2.a(r1, r4, r0, r5);	 Catch:{ Exception -> 0x0042 }
        if (r3 == 0) goto L_0x003e;
    L_0x0039:
        r0 = r6.c;	 Catch:{ Exception -> 0x0042 }
        r0.e();	 Catch:{ Exception -> 0x0042 }
    L_0x003e:
        return;
    L_0x003f:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x003f }
        throw r0;	 Catch:{ Exception -> 0x0042 }
    L_0x0042:
        r0 = move-exception;
        r1 = r6.c;
        r1.a(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bclp.run():void");
    }

    public /* synthetic */ bclp(CronetBidirectionalStream cronetBidirectionalStream) {
        this.c = cronetBidirectionalStream;
    }
}
