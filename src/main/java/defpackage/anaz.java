package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/* renamed from: anaz */
public final class anaz {
    private static byte[] a() {
        return new byte[8192];
    }

    public static long a(InputStream inputStream, OutputStream outputStream) {
        amqw.a((Object) inputStream);
        amqw.a((Object) outputStream);
        byte[] a = anaz.a();
        long j = 0;
        while (true) {
            int read = inputStream.read(a);
            if (read == -1) {
                return j;
            }
            outputStream.write(a, 0, read);
            j += (long) read;
        }
    }

    /* JADX WARNING: Missing block: B:11:0x0025, code skipped:
            r0 = (long) r0;
            r0 = defpackage.anhe.a(r0 + r0);
     */
    private static byte[] a(java.io.InputStream r5, java.util.Deque r6, int r7) {
        /*
        r0 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
    L_0x0002:
        r1 = -1;
        r2 = 2147483639; // 0x7ffffff7 float:NaN double:1.060997891E-314;
        if (r7 >= r2) goto L_0x002c;
    L_0x0008:
        r2 = r2 - r7;
        r2 = java.lang.Math.min(r0, r2);
        r2 = new byte[r2];
        r6.add(r2);
        r3 = 0;
    L_0x0013:
        r4 = r2.length;
        if (r3 >= r4) goto L_0x0025;
    L_0x0016:
        r4 = r4 - r3;
        r4 = r5.read(r2, r3, r4);
        if (r4 == r1) goto L_0x0020;
    L_0x001d:
        r3 = r3 + r4;
        r7 = r7 + r4;
        goto L_0x0013;
    L_0x0020:
        r5 = defpackage.anaz.a(r6, r7);
        return r5;
    L_0x0025:
        r0 = (long) r0;
        r0 = r0 + r0;
        r0 = defpackage.anhe.a(r0);
        goto L_0x0002;
    L_0x002c:
        r5 = r5.read();
        if (r5 != r1) goto L_0x0037;
    L_0x0032:
        r5 = defpackage.anaz.a(r6, r2);
        return r5;
    L_0x0037:
        r5 = new java.lang.OutOfMemoryError;
        r6 = "input is too large to fit in a byte array";
        r5.<init>(r6);
        goto L_0x0040;
    L_0x003f:
        throw r5;
    L_0x0040:
        goto L_0x003f;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anaz.a(java.io.InputStream, java.util.Deque, int):byte[]");
    }

    private static byte[] a(Deque deque, int i) {
        byte[] bArr = new byte[i];
        int i2 = i;
        while (i2 > 0) {
            byte[] bArr2 = (byte[]) deque.removeFirst();
            int min = Math.min(i2, bArr2.length);
            System.arraycopy(bArr2, 0, bArr, i - i2, min);
            i2 -= min;
        }
        return bArr;
    }

    public static byte[] a(InputStream inputStream) {
        amqw.a((Object) inputStream);
        return anaz.a(inputStream, new ArrayDeque(20), 0);
    }

    static byte[] a(InputStream inputStream, long j) {
        amqw.a(j >= 0, "expectedSize (%s) must be non-negative", j);
        if (j <= 2147483639) {
            int i = (int) j;
            byte[] bArr = new byte[i];
            int i2 = i;
            while (i2 > 0) {
                int i3 = i - i2;
                int read = inputStream.read(bArr, i3, i2);
                if (read == -1) {
                    return Arrays.copyOf(bArr, i3);
                }
                i2 -= read;
            }
            if (inputStream.read() == -1) {
                return bArr;
            }
            Deque arrayDeque = new ArrayDeque(22);
            arrayDeque.add(bArr);
            arrayDeque.add(new byte[]{(byte) i});
            return anaz.a(inputStream, arrayDeque, bArr.length + 1);
        }
        StringBuilder stringBuilder = new StringBuilder(62);
        stringBuilder.append(j);
        stringBuilder.append(" bytes is too large to fit in a byte array");
        throw new OutOfMemoryError(stringBuilder.toString());
    }

    public static void a(InputStream inputStream, byte[] bArr) {
        anaz.a(inputStream, bArr, bArr.length);
    }

    public static void a(InputStream inputStream, byte[] bArr, int i) {
        amqw.a((Object) inputStream);
        amqw.a((Object) bArr);
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read == -1) {
                break;
            }
            i2 += read;
        }
        if (i2 != i) {
            StringBuilder stringBuilder = new StringBuilder(81);
            stringBuilder.append("reached end of stream after reading ");
            stringBuilder.append(i2);
            stringBuilder.append(" bytes; ");
            stringBuilder.append(i);
            stringBuilder.append(" bytes expected");
            throw new EOFException(stringBuilder.toString());
        }
    }

    public static void b(InputStream inputStream, long j) {
        byte[] a = anaz.a();
        long j2 = 0;
        while (j2 < j) {
            long j3 = j - j2;
            int available = inputStream.available();
            long skip = available != 0 ? inputStream.skip(Math.min((long) available, j3)) : 0;
            if (skip == 0) {
                skip = (long) inputStream.read(a, 0, (int) Math.min(j3, (long) a.length));
                if (skip == -1) {
                    break;
                }
            }
            j2 += skip;
        }
        if (j2 < j) {
            StringBuilder stringBuilder = new StringBuilder(100);
            stringBuilder.append("reached end of stream after skipping ");
            stringBuilder.append(j2);
            stringBuilder.append(" bytes; ");
            stringBuilder.append(j);
            stringBuilder.append(" bytes expected");
            throw new EOFException(stringBuilder.toString());
        }
    }

    static {
        anbc anbc = new anbc();
    }
}
