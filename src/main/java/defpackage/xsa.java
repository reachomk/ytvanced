package defpackage;

import java.nio.ByteBuffer;

/* renamed from: xsa */
public final class xsa {
    public static byte[] a(byte[]... bArr) {
        int i = 0;
        for (byte[] length : bArr) {
            i += length.length;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i);
        for (byte[] put : bArr) {
            allocate.put(put);
        }
        return allocate.array();
    }

    public static byte[] a(byte[] bArr) {
        amqw.a(bArr != null);
        amqw.a(true);
        int length = bArr.length;
        int i = length & 15;
        if (i != 0) {
            return xsa.a(bArr, length + (16 - i));
        }
        return (byte[]) bArr.clone();
    }

    public static byte[] a(byte[] bArr, int i) {
        boolean z = true;
        amqw.a(bArr != null);
        if (i < 0) {
            z = false;
        }
        amqw.a(z);
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, Math.min(i, bArr.length));
        return bArr2;
    }

    public static byte[] a(byte[] bArr, int i, int i2) {
        boolean z = true;
        amqw.a(bArr != null);
        amqw.a(i >= 0);
        if (i2 < 0) {
            z = false;
        }
        amqw.a(z);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }
}
