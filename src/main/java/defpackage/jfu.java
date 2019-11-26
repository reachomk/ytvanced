package defpackage;

/* renamed from: jfu */
final class jfu extends jiw {
    private final Object a;
    private final int b;
    private final boolean c;

    jfu(Object obj, int i, boolean z) {
        if (obj != null) {
            this.a = obj;
            this.b = i;
            this.c = z;
            return;
        }
        throw new NullPointerException("Null eventTag");
    }

    /* Access modifiers changed, original: final */
    public final Object a() {
        return this.a;
    }

    /* Access modifiers changed, original: final */
    public final int b() {
        return this.b;
    }

    /* Access modifiers changed, original: final */
    public final boolean c() {
        return this.c;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        boolean z = this.c;
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 68);
        stringBuilder.append("HiddenItem{eventTag=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", undoIndex=");
        stringBuilder.append(i);
        stringBuilder.append(", separatorRemoved=");
        stringBuilder.append(z);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jiw) {
            jiw jiw = (jiw) obj;
            return this.a.equals(jiw.a()) && this.b == jiw.b() && this.c == jiw.c();
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (!this.c ? 1237 : 1231);
    }
}
