package defpackage;

/* renamed from: jft */
final class jft extends jjh {
    private final amur a;

    jft(amur amur) {
        if (amur != null) {
            this.a = amur;
            return;
        }
        throw new NullPointerException("Null undoMap");
    }

    /* Access modifiers changed, original: final */
    public final amur a() {
        return this.a;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 26);
        stringBuilder.append("MyTransientState{undoMap=");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jjh)) {
            return false;
        }
        return amvr.b(this.a, ((jjh) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }
}
