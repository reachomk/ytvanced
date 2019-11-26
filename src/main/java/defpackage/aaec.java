package defpackage;

import java.util.Arrays;

/* renamed from: aaec */
public final class aaec implements aadq {
    private final String a;
    private final byte[] b;
    private final aaee c;

    public final String a() {
        return this.a;
    }

    public final aaee getType() {
        return this.c;
    }

    public final byte[] c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aaec) {
            aaec aaec = (aaec) obj;
            if (amqq.a(this.a, aaec.a) && Arrays.equals(this.b, aaec.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(Arrays.hashCode(this.b))});
    }

    /* synthetic */ aaec(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
        this.c = new aaee(str);
    }

    public final amuw d() {
        return amwp.a;
    }
}
