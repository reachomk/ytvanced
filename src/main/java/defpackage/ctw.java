package defpackage;

/* renamed from: ctw */
public final class ctw {
    public final ctv a;
    public final float b;

    public ctw(ctv ctv, float f) {
        this.a = ctv;
        this.b = f;
    }

    public final csd a() {
        return this.a.a;
    }

    public final cto b() {
        return this.a.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ctw ctw = (ctw) obj;
            return Float.compare(ctw.b, this.b) == 0 && this.a.equals(ctw.a);
        }
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        float f = this.b;
        return hashCode + (f != 0.0f ? Float.floatToIntBits(f) : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        float f = this.b;
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 64);
        stringBuilder.append("PropertyAnimation{ PropertyHandle=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", TargetValue=");
        stringBuilder.append(f);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
