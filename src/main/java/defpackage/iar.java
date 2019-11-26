package defpackage;

/* renamed from: iar */
final class iar extends idl {
    private final idj a;
    private final boolean b;

    iar(idj idj, boolean z) {
        this.a = idj;
        this.b = z;
    }

    /* Access modifiers changed, original: final */
    public final idj a() {
        return this.a;
    }

    /* Access modifiers changed, original: final */
    public final boolean b() {
        return this.b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 50);
        stringBuilder.append("StateTransition{midUiAction=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", shouldAnimate=");
        stringBuilder.append(z);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof idl) {
            idl idl = (idl) obj;
            return this.a.equals(idl.a()) && this.b == idl.b();
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (!this.b ? 1237 : 1231);
    }
}
