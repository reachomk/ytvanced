package defpackage;

import java.util.Arrays;

/* renamed from: qbr */
public final class qbr extends qbs {
    private final byte[] a;

    public qbr(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.a = bArr;
    }

    /* Access modifiers changed, original: final */
    public final byte[] c() {
        return this.a;
    }
}
