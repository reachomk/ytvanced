package defpackage;

import java.util.Arrays;

/* renamed from: jjg */
final class jjg {
    private final Class a;
    private final byte[] b;

    private jjg(Class cls, byte[] bArr) {
        this.a = cls;
        this.b = (byte[]) bArr.clone();
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + Arrays.hashCode(this.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jjg) {
            jjg jjg = (jjg) obj;
            return this.a.equals(jjg.a) && Arrays.equals(this.b, jjg.b);
        }
    }

    /* synthetic */ jjg(Class cls, byte[] bArr, byte b) {
        this(cls, bArr);
    }
}
