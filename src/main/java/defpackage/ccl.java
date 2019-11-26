package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: ccl */
public final class ccl extends FilterInputStream {
    private volatile byte[] a;
    private int b;
    private int c;
    private int d = -1;
    private int e;
    private final bwb f;

    public ccl(InputStream inputStream, bwb bwb) {
        super(inputStream);
        this.f = bwb;
        this.a = (byte[]) bwb.a(65536, byte[].class);
    }

    public final boolean markSupported() {
        return true;
    }

    public final synchronized int available() {
        InputStream inputStream;
        inputStream = this.in;
        if (this.a == null || inputStream == null) {
            throw ccl.c();
        }
        return (this.b - this.e) + inputStream.available();
    }

    private static IOException c() {
        throw new IOException("BufferedInputStream is closed");
    }

    public final synchronized void a() {
        this.c = this.a.length;
    }

    public final synchronized void b() {
        if (this.a != null) {
            this.f.b(this.a);
            this.a = null;
        }
    }

    public final void close() {
        if (this.a != null) {
            this.f.b(this.a);
            this.a = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c  */
    private final int a(java.io.InputStream r6, byte[] r7) {
        /*
        r5 = this;
        r0 = r5.d;
        r1 = -1;
        r2 = 0;
        if (r0 == r1) goto L_0x0055;
    L_0x0006:
        r3 = r5.e;
        r4 = r5.c;
        r3 = r3 - r0;
        if (r3 < r4) goto L_0x000e;
    L_0x000d:
        goto L_0x0055;
    L_0x000e:
        if (r0 != 0) goto L_0x0032;
    L_0x0010:
        r1 = r7.length;
        if (r4 <= r1) goto L_0x0032;
    L_0x0013:
        r3 = r5.b;
        if (r3 != r1) goto L_0x0032;
    L_0x0017:
        r0 = r1 + r1;
        if (r0 <= r4) goto L_0x001c;
    L_0x001b:
        r0 = r4;
    L_0x001c:
        r3 = r5.f;
        r4 = byte[].class;
        r0 = r3.a(r0, r4);
        r0 = (byte[]) r0;
        java.lang.System.arraycopy(r7, r2, r0, r2, r1);
        r5.a = r0;
        r1 = r5.f;
        r1.b(r7);
        r7 = r0;
        goto L_0x0039;
    L_0x0032:
        if (r0 <= 0) goto L_0x0039;
    L_0x0034:
        r1 = r7.length;
        r1 = r1 - r0;
        java.lang.System.arraycopy(r7, r0, r7, r2, r1);
    L_0x0039:
        r0 = r5.e;
        r1 = r5.d;
        r0 = r0 - r1;
        r5.e = r0;
        r5.d = r2;
        r5.b = r2;
        r1 = r7.length;
        r1 = r1 - r0;
        r6 = r6.read(r7, r0, r1);
        if (r6 <= 0) goto L_0x0050;
    L_0x004c:
        r7 = r5.e;
        r7 = r7 + r6;
        goto L_0x0052;
    L_0x0050:
        r7 = r5.e;
    L_0x0052:
        r5.b = r7;
        return r6;
    L_0x0055:
        r6 = r6.read(r7);
        if (r6 <= 0) goto L_0x0061;
    L_0x005b:
        r5.d = r1;
        r5.e = r2;
        r5.b = r6;
    L_0x0061:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccl.a(java.io.InputStream, byte[]):int");
    }

    public final synchronized void mark(int i) {
        this.c = Math.max(this.c, i);
        this.d = this.e;
    }

    public final synchronized int read() {
        byte[] bArr = this.a;
        InputStream inputStream = this.in;
        if (bArr == null || inputStream == null) {
            throw ccl.c();
        } else if (this.e >= this.b && a(inputStream, bArr) == -1) {
            return -1;
        } else {
            if (bArr != this.a) {
                bArr = this.a;
                if (bArr == null) {
                    throw ccl.c();
                }
            }
            int i = this.b;
            int i2 = this.e;
            if (i - i2 <= 0) {
                return -1;
            }
            this.e = i2 + 1;
            return bArr[i2] & 255;
        }
    }

    /* JADX WARNING: Missing block: B:63:0x007e, code skipped:
            return r3;
     */
    public final synchronized int read(byte[] r6, int r7, int r8) {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = r5.a;	 Catch:{ all -> 0x008c }
        if (r0 == 0) goto L_0x0087;
    L_0x0005:
        if (r8 == 0) goto L_0x0084;
    L_0x0007:
        r1 = r5.in;	 Catch:{ all -> 0x008c }
        if (r1 == 0) goto L_0x007f;
    L_0x000b:
        r2 = r5.e;	 Catch:{ all -> 0x008c }
        r3 = r5.b;	 Catch:{ all -> 0x008c }
        if (r2 < r3) goto L_0x0013;
    L_0x0011:
        r2 = r8;
        goto L_0x002b;
    L_0x0013:
        r3 = r3 - r2;
        if (r3 >= r8) goto L_0x0017;
    L_0x0016:
        goto L_0x0018;
    L_0x0017:
        r3 = r8;
    L_0x0018:
        java.lang.System.arraycopy(r0, r2, r6, r7, r3);	 Catch:{ all -> 0x008c }
        r2 = r5.e;	 Catch:{ all -> 0x008c }
        r2 = r2 + r3;
        r5.e = r2;	 Catch:{ all -> 0x008c }
        if (r3 == r8) goto L_0x007d;
    L_0x0022:
        r2 = r1.available();	 Catch:{ all -> 0x008c }
        if (r2 == 0) goto L_0x007d;
    L_0x0028:
        r7 = r7 + r3;
        r2 = r8 - r3;
    L_0x002b:
        r3 = r5.d;	 Catch:{ all -> 0x008c }
        r4 = -1;
        if (r3 != r4) goto L_0x0041;
    L_0x0030:
        r3 = r0.length;	 Catch:{ all -> 0x008c }
        if (r2 < r3) goto L_0x0041;
    L_0x0033:
        r3 = r1.read(r6, r7, r2);	 Catch:{ all -> 0x008c }
        if (r3 == r4) goto L_0x003a;
    L_0x0039:
        goto L_0x0066;
    L_0x003a:
        if (r2 == r8) goto L_0x003f;
    L_0x003c:
        r8 = r8 - r2;
        monitor-exit(r5);
        return r8;
    L_0x003f:
        monitor-exit(r5);
        return r4;
    L_0x0041:
        r3 = r5.a(r1, r0);	 Catch:{ all -> 0x008c }
        if (r3 == r4) goto L_0x0076;
    L_0x0047:
        r3 = r5.a;	 Catch:{ all -> 0x008c }
        if (r0 == r3) goto L_0x0055;
    L_0x004b:
        r0 = r5.a;	 Catch:{ all -> 0x008c }
        if (r0 == 0) goto L_0x0050;
    L_0x004f:
        goto L_0x0055;
    L_0x0050:
        r6 = defpackage.ccl.c();	 Catch:{ all -> 0x008c }
        throw r6;	 Catch:{ all -> 0x008c }
    L_0x0055:
        r3 = r5.b;	 Catch:{ all -> 0x008c }
        r4 = r5.e;	 Catch:{ all -> 0x008c }
        r3 = r3 - r4;
        if (r3 >= r2) goto L_0x005d;
    L_0x005c:
        goto L_0x005e;
    L_0x005d:
        r3 = r2;
    L_0x005e:
        java.lang.System.arraycopy(r0, r4, r6, r7, r3);	 Catch:{ all -> 0x008c }
        r4 = r5.e;	 Catch:{ all -> 0x008c }
        r4 = r4 + r3;
        r5.e = r4;	 Catch:{ all -> 0x008c }
    L_0x0066:
        r2 = r2 - r3;
        if (r2 == 0) goto L_0x0074;
    L_0x0069:
        r4 = r1.available();	 Catch:{ all -> 0x008c }
        if (r4 == 0) goto L_0x0071;
    L_0x006f:
        r7 = r7 + r3;
        goto L_0x002b;
    L_0x0071:
        r8 = r8 - r2;
        monitor-exit(r5);
        return r8;
    L_0x0074:
        monitor-exit(r5);
        return r8;
    L_0x0076:
        if (r2 == r8) goto L_0x007b;
    L_0x0078:
        r8 = r8 - r2;
        monitor-exit(r5);
        return r8;
    L_0x007b:
        monitor-exit(r5);
        return r4;
    L_0x007d:
        monitor-exit(r5);
        return r3;
    L_0x007f:
        r6 = defpackage.ccl.c();	 Catch:{ all -> 0x008c }
        throw r6;	 Catch:{ all -> 0x008c }
    L_0x0084:
        r6 = 0;
        monitor-exit(r5);
        return r6;
    L_0x0087:
        r6 = defpackage.ccl.c();	 Catch:{ all -> 0x008c }
        throw r6;	 Catch:{ all -> 0x008c }
    L_0x008c:
        r6 = move-exception;
        monitor-exit(r5);
        goto L_0x0090;
    L_0x008f:
        throw r6;
    L_0x0090:
        goto L_0x008f;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccl.read(byte[], int, int):int");
    }

    public final synchronized void reset() {
        if (this.a != null) {
            int i = this.d;
            if (i != -1) {
                this.e = i;
            } else {
                int i2 = this.e;
                int i3 = this.c;
                StringBuilder stringBuilder = new StringBuilder(66);
                stringBuilder.append("Mark has been invalidated, pos: ");
                stringBuilder.append(i2);
                stringBuilder.append(" markLimit: ");
                stringBuilder.append(i3);
                throw new cco(stringBuilder.toString());
            }
        }
        throw new IOException("Stream is closed");
    }

    public final synchronized long skip(long j) {
        if (j < 1) {
            return 0;
        }
        byte[] bArr = this.a;
        if (bArr != null) {
            InputStream inputStream = this.in;
            if (inputStream != null) {
                int i = this.b;
                int i2 = this.e;
                if (((long) (i - i2)) >= j) {
                    this.e = (int) (((long) i2) + j);
                    return j;
                }
                long j2 = ((long) i) - ((long) i2);
                this.e = i;
                if (this.d == -1 || j > ((long) this.c)) {
                    return j2 + inputStream.skip(j - j2);
                } else if (a(inputStream, bArr) == -1) {
                    return j2;
                } else {
                    int i3 = this.b;
                    int i4 = this.e;
                    if (((long) (i3 - i4)) >= j - j2) {
                        this.e = (int) ((((long) i4) + j) - j2);
                        return j;
                    }
                    this.e = i3;
                    return (j2 + ((long) i3)) - ((long) i4);
                }
            }
            throw ccl.c();
        }
        throw ccl.c();
    }
}
