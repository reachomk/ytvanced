package defpackage;

/* renamed from: ailj */
final class ailj extends ailo {
    private final float a;
    private final float b;
    private final bcpu c;

    ailj(float f, float f2, bcpu bcpu) {
        this.a = f;
        this.b = f2;
        if (bcpu != null) {
            this.c = bcpu;
            return;
        }
        throw new NullPointerException("Null duration");
    }

    /* Access modifiers changed, original: final */
    public final float a() {
        return this.a;
    }

    /* Access modifiers changed, original: final */
    public final float b() {
        return this.b;
    }

    /* Access modifiers changed, original: final */
    public final bcpu c() {
        return this.c;
    }

    public final String toString() {
        float f = this.a;
        float f2 = this.b;
        String valueOf = String.valueOf(this.c);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 83);
        stringBuilder.append("AlphaAnimationStep{startAlpha=");
        stringBuilder.append(f);
        stringBuilder.append(", endAlpha=");
        stringBuilder.append(f2);
        stringBuilder.append(", duration=");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ailo) {
            ailo ailo = (ailo) obj;
            return Float.floatToIntBits(this.a) == Float.floatToIntBits(ailo.a()) && Float.floatToIntBits(this.b) == Float.floatToIntBits(ailo.b()) && this.c.equals(ailo.c());
        }
    }

    public final int hashCode() {
        return ((((Float.floatToIntBits(this.a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ this.c.hashCode();
    }
}
