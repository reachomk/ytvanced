package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: prr */
public final class prr {
    private static long a(long j, long j2, long j3) {
        j = (j ^ j2) * j3;
        j = ((j ^ (j >>> 47)) ^ j2) * j3;
        return (j ^ (j >>> 47)) * j3;
    }

    public static long a(byte[] bArr) {
        byte[] bArr2 = bArr;
        int length = bArr2.length;
        int i = 37;
        long j;
        long b;
        long rotateRight;
        long j2;
        long b2;
        long j3;
        long rotateRight2;
        if (length > 32) {
            long b3;
            long j4;
            if (length <= 64) {
                j = ((long) (length + length)) - 7286425919675154353L;
                b3 = prr.b(bArr2, 0) * -7286425919675154353L;
                b = prr.b(bArr2, 8);
                long b4 = prr.b(bArr2, length - 8) * j;
                j4 = j;
                rotateRight = (Long.rotateRight(b3 + b, 43) + Long.rotateRight(b4, 30)) + (prr.b(bArr2, length - 16) * -7286425919675154353L);
                j2 = j4;
                b = prr.a(rotateRight, (b3 + Long.rotateRight(b - 7286425919675154353L, 18)) + b4, j2);
                j = prr.b(bArr2, 16) * j4;
                long b5 = prr.b(bArr2, 24);
                rotateRight = (rotateRight + prr.b(bArr2, length - 32)) * j4;
                return prr.a((Long.rotateRight(j + b5, 43) + Long.rotateRight(rotateRight, 30)) + ((b + prr.b(bArr2, length - 24)) * j4), (j + Long.rotateRight(b5 + b3, 18)) + rotateRight, j2);
            }
            long[] jArr = new long[2];
            long[] jArr2 = new long[2];
            b2 = prr.b(bArr2, 0) + 95310865018149119L;
            length--;
            int i2 = (length >> 6) << 6;
            int i3 = length & 63;
            int i4 = (i2 + i3) - 63;
            j3 = 2480279821605975764L;
            long j5 = 1390051526045402406L;
            int i5 = 0;
            while (true) {
                rotateRight2 = Long.rotateRight(((b2 + j3) + jArr[0]) + prr.b(bArr2, i5 + 8), i);
                b3 = (rotateRight2 * -5435081209227447693L) ^ jArr2[1];
                j4 = (Long.rotateRight((j3 + jArr[1]) + prr.b(bArr2, i5 + 48), 42) * -5435081209227447693L) + (jArr[0] + prr.b(bArr2, i5 + 40));
                j5 = Long.rotateRight(j5 + jArr2[0], 33) * -5435081209227447693L;
                i = i3;
                prr.a(bArr, i5, jArr[1] * -5435081209227447693L, b3 + jArr2[0], jArr);
                prr.a(bArr, i5 + 32, j5 + jArr2[1], j4 + prr.b(bArr2, i5 + 16), jArr2);
                length = i5 + 64;
                if (length != i2) {
                    i5 = length;
                    i3 = i;
                    b2 = j5;
                    j5 = b3;
                    j3 = j4;
                    i = 37;
                } else {
                    rotateRight2 = b3 & 255;
                    j = -5435081209227447693L + (rotateRight2 + rotateRight2);
                    rotateRight2 = jArr2[0] + ((long) i);
                    jArr2[0] = rotateRight2;
                    long j6 = jArr[0] + rotateRight2;
                    jArr[0] = j6;
                    jArr2[0] = rotateRight2 + j6;
                    rotateRight2 = Long.rotateRight(((j5 + j4) + j6) + prr.b(bArr2, i4 + 8), 37);
                    long j7 = (rotateRight2 * j) ^ (jArr2[1] * 9);
                    j4 = (Long.rotateRight((j4 + jArr[1]) + prr.b(bArr2, i4 + 48), 42) * j) + ((jArr[0] * 9) + prr.b(bArr2, i4 + 40));
                    b3 = Long.rotateRight(b3 + jArr2[0], 33) * j;
                    prr.a(bArr, i4, jArr[1] * j, j7 + jArr2[0], jArr);
                    prr.a(bArr, i4 + 32, b3 + jArr2[1], j4 + prr.b(bArr2, i4 + 16), jArr2);
                    long j8 = j;
                    return prr.a((prr.a(jArr[0], jArr2[0], j8) + ((j4 ^ (j4 >>> 47)) * -4348849565147123417L)) + j7, prr.a(jArr[1], jArr2[1], j8) + b3, j8);
                }
            }
        } else if (length > 16) {
            j2 = ((long) (length + length)) - 7286425919675154353L;
            rotateRight = prr.b(bArr2, 0) * -5435081209227447693L;
            b = prr.b(bArr2, 8);
            j = prr.b(bArr2, length - 8) * j2;
            return prr.a((prr.b(bArr2, length - 16) * -7286425919675154353L) + (Long.rotateRight(rotateRight + b, 43) + Long.rotateRight(j, 30)), (rotateRight + Long.rotateRight(b - 7286425919675154353L, 18)) + j, j2);
        } else if (length >= 8) {
            b2 = ((long) (length + length)) - 7286425919675154353L;
            j3 = prr.b(bArr2, 0) - 7286425919675154353L;
            b = prr.b(bArr2, length - 8);
            return prr.a((Long.rotateRight(b, 37) * b2) + j3, (Long.rotateRight(j3, 25) + b) * b2, b2);
        } else if (length >= 4) {
            return prr.a(((long) length) + ((((long) prr.a(bArr2, 0)) & 4294967295L) << 3), ((long) prr.a(bArr2, length - 4)) & 4294967295L, ((long) (length + length)) - 7286425919675154353L);
        } else {
            if (length <= 0) {
                return -7286425919675154353L;
            }
            rotateRight2 = (((long) (length + ((bArr2[length - 1] & 255) << 2))) * -4348849565147123417L) ^ (((long) ((bArr2[0] & 255) + ((bArr2[length >> 1] & 255) << 8))) * -7286425919675154353L);
            return (rotateRight2 ^ (rotateRight2 >>> 47)) * -7286425919675154353L;
        }
    }

    private static void a(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long b = prr.b(bArr, i);
        long b2 = prr.b(bArr, i + 8);
        long b3 = prr.b(bArr, i + 16);
        long b4 = prr.b(bArr, i + 24);
        j += b;
        j2 = Long.rotateRight((j2 + j) + b4, 21);
        b2 = (b2 + j) + b3;
        b = Long.rotateRight(b2, 44);
        jArr[0] = b2 + b4;
        jArr[1] = (j2 + b) + j;
    }

    private static int a(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8)) | ((bArr[i + 2] & 255) << 16));
    }

    private static long b(byte[] bArr, int i) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, 8);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return wrap.getLong();
    }
}
