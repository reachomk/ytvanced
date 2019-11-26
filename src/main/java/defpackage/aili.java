package defpackage;

/* renamed from: aili */
final class aili extends ailp {
    private final bcpu a;
    private final amul b;
    private final amul c;

    /* Access modifiers changed, original: final */
    public final bcpu a() {
        return this.a;
    }

    /* Access modifiers changed, original: final */
    public final amul b() {
        return this.b;
    }

    /* Access modifiers changed, original: final */
    public final amul c() {
        return this.c;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = valueOf.length();
        StringBuilder stringBuilder = new StringBuilder(((length + 90) + valueOf2.length()) + valueOf3.length());
        stringBuilder.append("SequentialAlphaAnimationHelper{delayBetweenAnimationsInSequence=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", views=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", animationSteps=");
        stringBuilder.append(valueOf3);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ailp) {
            ailp ailp = (ailp) obj;
            return this.a.equals(ailp.a()) && amvj.a(this.b, ailp.b()) && amvj.a(this.c, ailp.c());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    /* synthetic */ aili(bcpu bcpu, amul amul, amul amul2) {
        this.a = bcpu;
        this.b = amul;
        this.c = amul2;
    }
}
