package defpackage;

import java.util.List;

/* renamed from: bbkk */
final class bbkk extends bblf {
    private final List a;

    bbkk(List list) {
        if (list != null) {
            this.a = list;
            return;
        }
        throw new NullPointerException("Null entries");
    }

    public final List a() {
        return this.a;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 20);
        stringBuilder.append("Tracestate{entries=");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bblf)) {
            return false;
        }
        return this.a.equals(((bblf) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }
}
