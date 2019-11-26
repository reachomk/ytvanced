package defpackage;

import java.util.Arrays;

/* renamed from: zdt */
public final class zdt {
    public final boolean a;

    public zdt(boolean z) {
        this.a = z;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zdt)) {
            return false;
        }
        return amqq.a(Boolean.valueOf(this.a), Boolean.valueOf(((zdt) obj).a));
    }

    public final String toString() {
        amqo a = amql.a(this);
        a.a("recoverableError", this.a);
        return a.toString();
    }
}
