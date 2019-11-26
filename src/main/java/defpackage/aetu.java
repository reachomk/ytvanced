package defpackage;

/* renamed from: aetu */
final class aetu extends aeuw {
    private final String a;
    private final aevf b;

    aetu(String str, aevf aevf) {
        if (str != null) {
            this.a = str;
            if (aevf != null) {
                this.b = aevf;
                return;
            }
            throw new NullPointerException("Null value");
        }
        throw new NullPointerException("Null key");
    }

    /* Access modifiers changed, original: final */
    public final String a() {
        return this.a;
    }

    /* Access modifiers changed, original: final */
    public final aevf b() {
        return this.b;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 29) + valueOf.length());
        stringBuilder.append("GenericKeyValue{key=");
        stringBuilder.append(str);
        stringBuilder.append(", value=");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aeuw) {
            aeuw aeuw = (aeuw) obj;
            return this.a.equals(aeuw.a()) && this.b.equals(aeuw.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
