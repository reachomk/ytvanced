package defpackage;

import java.io.PipedInputStream;

/* renamed from: acim */
public final class acim extends PipedInputStream {
    private final int a = 2097152;
    private int b = Integer.MAX_VALUE;

    public acim() {
        super(2097152);
    }

    public final synchronized void a(int i) {
        int i2 = this.a;
        if (i > i2) {
            StringBuilder stringBuilder = new StringBuilder(78);
            stringBuilder.append("Attempted to set buffer limit to ");
            stringBuilder.append(i);
            stringBuilder.append(" when the pipe size is ");
            stringBuilder.append(i2);
            xtl.d(stringBuilder.toString());
            this.b = this.a;
        } else {
            this.b = i;
        }
        notifyAll();
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:9|10|11) */
    /* JADX WARNING: Missing block: B:11:0x0017, code skipped:
            throw new java.io.InterruptedIOException();
     */
    public final synchronized void a(byte[] r4, int r5, int r6) {
        /*
        r3 = this;
        monitor-enter(r3);
        r3.notifyAll();	 Catch:{ all -> 0x006e }
    L_0x0004:
        r0 = r3.available();	 Catch:{ all -> 0x006e }
        r1 = r3.b;	 Catch:{ all -> 0x006e }
        if (r0 <= r1) goto L_0x0018;
    L_0x000c:
        r0 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r3.wait(r0);	 Catch:{ InterruptedException -> 0x0012 }
        goto L_0x0004;
    L_0x0012:
        r4 = new java.io.InterruptedIOException;	 Catch:{ all -> 0x006e }
        r4.<init>();	 Catch:{ all -> 0x006e }
        throw r4;	 Catch:{ all -> 0x006e }
    L_0x0018:
        if (r6 <= 0) goto L_0x006c;
    L_0x001a:
        r0 = r5 + 1;
        r5 = r4[r5];	 Catch:{ all -> 0x006e }
        r3.receive(r5);	 Catch:{ all -> 0x006e }
        r3.notifyAll();	 Catch:{ all -> 0x006e }
        r6 = r6 + -1;
        r5 = r3.in;	 Catch:{ all -> 0x006e }
        r1 = r3.out;	 Catch:{ all -> 0x006e }
        if (r5 <= r1) goto L_0x0053;
    L_0x002c:
        r5 = r3.buffer;	 Catch:{ all -> 0x006e }
        r5 = r5.length;	 Catch:{ all -> 0x006e }
        r1 = r3.in;	 Catch:{ all -> 0x006e }
        r5 = r5 - r1;
        r5 = java.lang.Math.min(r6, r5);	 Catch:{ all -> 0x006e }
        r1 = r3.buffer;	 Catch:{ all -> 0x006e }
        r2 = r3.in;	 Catch:{ all -> 0x006e }
        java.lang.System.arraycopy(r4, r0, r1, r2, r5);	 Catch:{ all -> 0x006e }
        r1 = r3.in;	 Catch:{ all -> 0x006e }
        r1 = r1 + r5;
        r3.in = r1;	 Catch:{ all -> 0x006e }
        r0 = r0 + r5;
        r6 = r6 - r5;
        r5 = r3.in;	 Catch:{ all -> 0x006e }
        r1 = r3.buffer;	 Catch:{ all -> 0x006e }
        r1 = r1.length;	 Catch:{ all -> 0x006e }
        if (r5 != r1) goto L_0x004e;
    L_0x004b:
        r5 = 0;
        r3.in = r5;	 Catch:{ all -> 0x006e }
    L_0x004e:
        if (r6 == 0) goto L_0x0051;
    L_0x0050:
        goto L_0x0053;
    L_0x0051:
        monitor-exit(r3);
        return;
    L_0x0053:
        r5 = r3.out;	 Catch:{ all -> 0x006e }
        r1 = r3.in;	 Catch:{ all -> 0x006e }
        r5 = r5 - r1;
        r5 = java.lang.Math.min(r6, r5);	 Catch:{ all -> 0x006e }
        r1 = r3.buffer;	 Catch:{ all -> 0x006e }
        r2 = r3.in;	 Catch:{ all -> 0x006e }
        java.lang.System.arraycopy(r4, r0, r1, r2, r5);	 Catch:{ all -> 0x006e }
        r1 = r3.in;	 Catch:{ all -> 0x006e }
        r1 = r1 + r5;
        r3.in = r1;	 Catch:{ all -> 0x006e }
        r0 = r0 + r5;
        r6 = r6 - r5;
        r5 = r0;
        goto L_0x0018;
    L_0x006c:
        monitor-exit(r3);
        return;
    L_0x006e:
        r4 = move-exception;
        monitor-exit(r3);
        goto L_0x0072;
    L_0x0071:
        throw r4;
    L_0x0072:
        goto L_0x0071;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acim.a(byte[], int, int):void");
    }

    public final synchronized int read() {
        int read;
        read = super.read();
        notifyAll();
        return read;
    }

    public final synchronized int read(byte[] bArr, int i, int i2) {
        int read;
        read = super.read(bArr, i, i2);
        notifyAll();
        return read;
    }
}
