package defpackage;

import android.util.Base64;
import java.security.SecureRandom;

/* renamed from: xuu */
public final class xuu {
    public final bapu a;

    public xuu(bapu bapu) {
        this.a = bapu;
    }

    public final String a(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) this.a.get()).nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    public final double a(double d, double d2) {
        amqw.a(d <= d2);
        return d + (((SecureRandom) this.a.get()).nextDouble() * (d2 - d));
    }
}
