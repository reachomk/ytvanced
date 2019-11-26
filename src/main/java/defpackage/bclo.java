package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.impl.CronetBidirectionalStream;

/* renamed from: bclo */
public final class bclo implements Runnable {
    private ByteBuffer a;
    private final boolean b;
    private final /* synthetic */ CronetBidirectionalStream c;

    public bclo(CronetBidirectionalStream cronetBidirectionalStream, ByteBuffer byteBuffer, boolean z) {
        this.c = cronetBidirectionalStream;
        this.a = byteBuffer;
        this.b = z;
    }

    /* JADX WARNING: Missing block: B:15:?, code skipped:
            r1 = r6.c;
            r1.a.b(r1, r1.g, r0, r6.b);
     */
    /* JADX WARNING: Missing block: B:16:0x0031, code skipped:
            if (r3 == null) goto L_0x0038;
     */
    /* JADX WARNING: Missing block: B:17:0x0033, code skipped:
            r6.c.e();
     */
    /* JADX WARNING: Missing block: B:18:0x0038, code skipped:
            return;
     */
    public final void run() {
        /*
        r6 = this;
        r0 = r6.a;	 Catch:{ Exception -> 0x003c }
        r1 = 0;
        r6.a = r1;	 Catch:{ Exception -> 0x003c }
        r1 = r6.c;	 Catch:{ Exception -> 0x003c }
        r1 = r1.c;	 Catch:{ Exception -> 0x003c }
        monitor-enter(r1);	 Catch:{ Exception -> 0x003c }
        r2 = r6.c;	 Catch:{ all -> 0x0039 }
        r2 = r2.d();	 Catch:{ all -> 0x0039 }
        if (r2 == 0) goto L_0x0014;
    L_0x0012:
        monitor-exit(r1);	 Catch:{ all -> 0x0039 }
        return;
    L_0x0014:
        r2 = r6.b;	 Catch:{ all -> 0x0039 }
        r3 = 0;
        if (r2 == 0) goto L_0x0025;
    L_0x0019:
        r2 = r6.c;	 Catch:{ all -> 0x0039 }
        r4 = 10;
        r2.f = r4;	 Catch:{ all -> 0x0039 }
        r2 = r2.e;	 Catch:{ all -> 0x0039 }
        r4 = 4;
        if (r2 != r4) goto L_0x0025;
    L_0x0024:
        r3 = 1;
    L_0x0025:
        monitor-exit(r1);	 Catch:{ all -> 0x0039 }
        r1 = r6.c;	 Catch:{ Exception -> 0x003c }
        r2 = r1.a;	 Catch:{ Exception -> 0x003c }
        r4 = r1.g;	 Catch:{ Exception -> 0x003c }
        r5 = r6.b;	 Catch:{ Exception -> 0x003c }
        r2.b(r1, r4, r0, r5);	 Catch:{ Exception -> 0x003c }
        if (r3 == 0) goto L_0x0038;
    L_0x0033:
        r0 = r6.c;	 Catch:{ Exception -> 0x003c }
        r0.e();	 Catch:{ Exception -> 0x003c }
    L_0x0038:
        return;
    L_0x0039:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0039 }
        throw r0;	 Catch:{ Exception -> 0x003c }
    L_0x003c:
        r0 = move-exception;
        r1 = r6.c;
        r1.a(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bclo.run():void");
    }
}
