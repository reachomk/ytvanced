package defpackage;

/* renamed from: bwm */
final class bwm implements bwp {
    public int a;
    public Class b;
    private final bwl c;

    bwm(bwl bwl) {
        this.c = bwl;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bwm) {
            bwm bwm = (bwm) obj;
            if (this.a == bwm.a && this.b == bwm.b) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 27);
        stringBuilder.append("Key{size=");
        stringBuilder.append(i);
        stringBuilder.append("array=");
        stringBuilder.append(valueOf);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public final void a() {
        this.c.a(this);
    }

    public final int hashCode() {
        int i = this.a * 31;
        Class cls = this.b;
        return i + (cls != null ? cls.hashCode() : 0);
    }
}
