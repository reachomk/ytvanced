package defpackage;

/* renamed from: szl */
final class szl extends szt {
    private final amuw a;

    public final amuw a() {
        return this.a;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 23);
        stringBuilder.append("SpanInfo{templateUris=");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof szt)) {
            return false;
        }
        return this.a.equals(((szt) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    /* synthetic */ szl(amuw amuw) {
        this.a = amuw;
    }
}
