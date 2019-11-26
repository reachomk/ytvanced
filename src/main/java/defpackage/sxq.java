package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: sxq */
public final class sxq {
    public static final sxq a = new sxq(d);
    private static final byte[] d = new byte[0];
    public final byte[] b;
    public final boolean c;

    public static sxq a(ByteBuffer byteBuffer, int i) {
        if (byteBuffer == null) {
            return a;
        }
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return new sxq(bArr);
    }

    public static sxq a(aztl aztl) {
        if (aztl == null) {
            return a;
        }
        aztg aztg = (aztg) azth.a.createBuilder();
        aztg.a(aztl.c, aztl);
        return new sxq(((azth) ((anxl) aztg.build())).toByteArray(), true);
    }

    public sxq(byte[] bArr) {
        this(bArr, false);
    }

    public sxq(byte[] bArr, boolean z) {
        this.b = bArr;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sxq) {
            sxq sxq = (sxq) obj;
            if (sxq.c == this.c && Arrays.equals(sxq.b, this.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Boolean.valueOf(this.c), Integer.valueOf(Arrays.hashCode(this.b))});
    }
}
