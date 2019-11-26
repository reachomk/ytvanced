package defpackage;

import android.util.Base64;
import java.security.KeyPair;
import java.util.Arrays;

/* renamed from: anql */
public final class anql {
    public final KeyPair a;
    public final long b;

    anql(KeyPair keyPair, long j) {
        this.a = keyPair;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof anql) {
            anql anql = (anql) obj;
            if (this.b == anql.b && this.a.getPublic().equals(anql.a.getPublic()) && this.a.getPrivate().equals(anql.a.getPrivate())) {
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
