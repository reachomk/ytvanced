package defpackage;

import android.util.Base64;
import java.security.KeyPair;
import java.util.Arrays;

/* renamed from: qig */
public final class qig {
    public final KeyPair a;
    public final long b;

    qig(KeyPair keyPair, long j) {
        this.a = keyPair;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qig) {
            qig qig = (qig) obj;
            if (this.b == qig.b && this.a.getPublic().equals(qig.a.getPublic()) && this.a.getPrivate().equals(qig.a.getPrivate())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a.getPublic(), this.a.getPrivate(), Long.valueOf(this.b)});
    }

    public final String a() {
        return Base64.encodeToString(this.a.getPublic().getEncoded(), 11);
    }

    public final String b() {
        return Base64.encodeToString(this.a.getPrivate().getEncoded(), 11);
    }
}
