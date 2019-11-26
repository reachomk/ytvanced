package defpackage;

import java.util.Arrays;

/* renamed from: acwq */
final class acwq {
    private aoca a;
    private byte[] b;

    acwq(aoca aoca, byte[] bArr) {
        a(aoca, bArr);
    }

    /* Access modifiers changed, original: final */
    public final void a(aoca aoca, byte[] bArr) {
        this.a = aoca;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof acwq)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        acwq acwq = (acwq) obj;
        return amqq.a(this.a, acwq.a) && Arrays.equals(this.b, acwq.b) && amqq.a(null, null);
    }

    public final int hashCode() {
        return (Arrays.hashCode(new Object[]{this.a, null}) * 31) + Arrays.hashCode(this.b);
    }
}
