package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* renamed from: rbl */
abstract class rbl implements rbi {
    public static final int[] a = rbl.a(ByteBuffer.wrap(new byte[]{(byte) 101, (byte) 120, (byte) 112, (byte) 97, (byte) 110, (byte) 100, (byte) 32, (byte) 51, (byte) 50, (byte) 45, (byte) 98, (byte) 121, (byte) 116, (byte) 101, (byte) 32, (byte) 107}));
    public final rbf b;
    private final int c;

    rbl(byte[] bArr, int i) {
        if (bArr.length == 32) {
            this.b = rbf.a(bArr);
            this.c = i;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    static int a(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    public abstract int a();

    public abstract ByteBuffer a(byte[] bArr, int i);

    public final byte[] a(byte[] bArr) {
        int length = bArr.length;
        a();
        if (length <= 2147483635) {
            ByteBuffer allocate = ByteBuffer.allocate(a() + length);
            a(allocate, bArr);
            return allocate.array();
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    /* Access modifiers changed, original: final */
    public final void a(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() - a() >= bArr.length) {
            byte[] a = rbj.a(a());
            byteBuffer.put(a);
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int remaining = wrap.remaining();
            int i = (remaining / 64) + 1;
            for (int i2 = 0; i2 < i; i2++) {
                ByteBuffer a2 = a(a, this.c + i2);
                if (i2 == i - 1) {
                    raj.a(byteBuffer, wrap, a2, remaining % 64);
                } else {
                    raj.a(byteBuffer, wrap, a2, 64);
                }
            }
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    static int[] a(ByteBuffer byteBuffer) {
        IntBuffer asIntBuffer = byteBuffer.order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }
}
