package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: rav */
public final class rav implements quq {
    private final rbi a;
    private final qva b;

    public rav(rbi rbi, qva qva) {
        this.a = rbi;
        this.b = qva;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        bArr = this.a.a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) << 3).array(), 8);
        copyOf = this.b.a(raj.a(bArr2, bArr, copyOf));
        return raj.a(bArr, copyOf);
    }
}
