package defpackage;

import java.io.Serializable;
import java.util.HashMap;

/* renamed from: bcsa */
public final class bcsa extends bcpx implements Serializable {
    private static HashMap a = null;
    public static final long serialVersionUID = -6390301302770925357L;
    private final bcpw b;

    public static synchronized bcsa a(bcpw bcpw) {
        synchronized (bcsa.class) {
            bcsa bcsa;
            if (a == null) {
                a = new HashMap(7);
                bcsa = null;
            } else {
                bcsa = (bcsa) a.get(bcpw);
            }
            if (bcsa == null) {
                bcsa = new bcsa(bcpw);
                a.put(bcpw, bcsa);
                return bcsa;
            }
            return bcsa;
        }
    }

    public final boolean b() {
        return false;
    }

    public final boolean c() {
        return true;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return 0;
    }

    public final long d() {
        return 0;
    }

    private bcsa(bcpw bcpw) {
        this.b = bcpw;
    }

    public final bcpw a() {
        return this.b;
    }

    private final String e() {
        return this.b.m;
    }

    public final long a(long j, int i) {
        throw f();
    }

    public final long a(long j, long j2) {
        throw f();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bcsa)) {
            return false;
        }
        bcsa bcsa = (bcsa) obj;
        if (bcsa.e() == null) {
            return e() == null;
        } else {
            return bcsa.e().equals(e());
        }
    }

    public final int hashCode() {
        return e().hashCode();
    }

    public final String toString() {
        String e = e();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(e).length() + 26);
        stringBuilder.append("UnsupportedDurationField[");
        stringBuilder.append(e);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    private final Object readResolve() {
        return bcsa.a(this.b);
    }

    private final UnsupportedOperationException f() {
        String valueOf = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 21);
        stringBuilder.append(valueOf);
        stringBuilder.append(" field is unsupported");
        return new UnsupportedOperationException(stringBuilder.toString());
    }
}
