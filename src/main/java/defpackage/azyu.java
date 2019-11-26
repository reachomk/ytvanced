package defpackage;

import java.io.BufferedInputStream;
import java.io.InputStream;

/* renamed from: azyu */
public class azyu implements azyl {
    private final int a;
    private final int b;
    private final InputStream c;
    private long d;
    private long e;
    private boolean f;
    private long g;

    public azyu(InputStream inputStream, int i) {
        this(inputStream, -1, i);
    }

    public azyu(InputStream inputStream, long j, int i) {
        if (inputStream.markSupported()) {
            this.c = inputStream;
        } else {
            this.c = new BufferedInputStream(inputStream);
        }
        this.g = j;
        this.a = i;
        i++;
        this.b = i;
        this.c.mark(i);
    }

    /* JADX WARNING: Missing block: B:20:0x0047, code skipped:
            return 0;
     */
    /* JADX WARNING: Missing block: B:32:0x006a, code skipped:
            return r11;
     */
    public final synchronized int a(byte[] r11, int r12, int r13) {
        /*
        r10 = this;
        monitor-enter(r10);
        r0 = r11.length;	 Catch:{ all -> 0x006d }
        r0 = r0 - r12;
        r1 = 0;
        if (r0 < r13) goto L_0x0008;
    L_0x0006:
        r0 = 1;
        goto L_0x0009;
    L_0x0008:
        r0 = 0;
    L_0x0009:
        r2 = "Cannot read into a buffer smaller than given length";
        defpackage.amqw.a(r0, r2);	 Catch:{ all -> 0x006d }
        if (r13 == 0) goto L_0x006b;
    L_0x0010:
        r0 = r10.f;	 Catch:{ all -> 0x006d }
        if (r0 == 0) goto L_0x001b;
    L_0x0014:
        r0 = r10.c;	 Catch:{ all -> 0x006d }
        r0.reset();	 Catch:{ all -> 0x006d }
        r10.f = r1;	 Catch:{ all -> 0x006d }
    L_0x001b:
        r0 = r10.a;	 Catch:{ all -> 0x006d }
        r2 = r10.e;	 Catch:{ all -> 0x006d }
        r4 = r10.d;	 Catch:{ all -> 0x006d }
        r6 = (long) r13;	 Catch:{ all -> 0x006d }
        r8 = (long) r0;	 Catch:{ all -> 0x006d }
        r2 = r2 - r4;
        r8 = r8 - r2;
        r2 = java.lang.Math.min(r6, r8);	 Catch:{ all -> 0x006d }
        r13 = r10.c;	 Catch:{ all -> 0x006d }
        r0 = (int) r2;	 Catch:{ all -> 0x006d }
        r11 = r13.read(r11, r12, r0);	 Catch:{ all -> 0x006d }
        r12 = -1;
        r2 = -1;
        if (r11 != r12) goto L_0x0050;
    L_0x0035:
        r11 = r10.g;	 Catch:{ all -> 0x006d }
        r13 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1));
        if (r13 != 0) goto L_0x0040;
    L_0x003b:
        r11 = r10.e;	 Catch:{ all -> 0x006d }
        r10.g = r11;	 Catch:{ all -> 0x006d }
        goto L_0x0046;
    L_0x0040:
        r2 = r10.e;	 Catch:{ all -> 0x006d }
        r13 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1));
        if (r13 < 0) goto L_0x0048;
    L_0x0046:
        monitor-exit(r10);
        return r1;
    L_0x0048:
        r11 = new java.io.IOException;	 Catch:{ all -> 0x006d }
        r12 = "The stream ended before all expected bytes were read";
        r11.<init>(r12);	 Catch:{ all -> 0x006d }
        throw r11;	 Catch:{ all -> 0x006d }
    L_0x0050:
        r12 = r10.e;	 Catch:{ all -> 0x006d }
        r0 = (long) r11;	 Catch:{ all -> 0x006d }
        r12 = r12 + r0;
        r10.e = r12;	 Catch:{ all -> 0x006d }
        r0 = r10.g;	 Catch:{ all -> 0x006d }
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r4 == 0) goto L_0x0069;
    L_0x005c:
        r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1));
        if (r2 > 0) goto L_0x0061;
    L_0x0060:
        goto L_0x0069;
    L_0x0061:
        r11 = new java.io.IOException;	 Catch:{ all -> 0x006d }
        r12 = "The stream continues beyond expected size";
        r11.<init>(r12);	 Catch:{ all -> 0x006d }
        throw r11;	 Catch:{ all -> 0x006d }
    L_0x0069:
        monitor-exit(r10);
        return r11;
    L_0x006b:
        monitor-exit(r10);
        return r1;
    L_0x006d:
        r11 = move-exception;
        monitor-exit(r10);
        throw r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azyu.a(byte[], int, int):int");
    }

    public final synchronized void b() {
        if (this.d != this.e) {
            this.c.mark(this.b);
        }
        this.d = this.e;
    }

    public final synchronized long c() {
        return this.d;
    }

    public final synchronized long d() {
        return this.e;
    }

    public final synchronized long e() {
        return (long) this.a;
    }

    public final synchronized void f() {
        this.e = this.d;
        this.f = true;
    }

    public final synchronized long a(long j) {
        j = Math.min(j, ((long) this.a) - (this.e - this.d));
        if (j == 0) {
            return 0;
        }
        if (this.f) {
            this.c.reset();
            this.f = false;
        }
        long skip = this.c.skip(j);
        if (skip == 0 && g()) {
            do {
                skip = this.c.skip(j);
            } while (skip == 0);
            this.e += skip;
            return skip;
        }
        this.e += skip;
        return skip;
    }

    public synchronized long a() {
        return this.g;
    }

    public final synchronized boolean g() {
        if (this.f) {
            this.c.reset();
            this.f = false;
        }
        if (this.c.available() > 0) {
            return true;
        }
        if (this.c.read() == -1) {
            this.g = this.e;
            return false;
        }
        this.c.reset();
        long j = this.e;
        long j2 = this.d;
        while (true) {
            j -= j2;
            if (j <= 0) {
                return true;
            }
            j2 = this.c.skip(j);
        }
    }

    public final synchronized void close() {
        this.c.close();
    }
}
