package defpackage;

import java.util.Arrays;

/* renamed from: qvc */
public final class qvc {
    public final Object a;
    private final byte[] b;

    public qvc(Object obj, byte[] bArr) {
        this.a = obj;
        this.b = Arrays.copyOf(bArr, bArr.length);
    }

    public final byte[] a() {
        byte[] bArr = this.b;
        return bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
    }
}
