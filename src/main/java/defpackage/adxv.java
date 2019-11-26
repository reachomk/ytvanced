package defpackage;

/* renamed from: adxv */
final class adxv extends adye {
    private final adym a;
    private final Runnable b;

    /* Access modifiers changed, original: final */
    public final adym a() {
        return this.a;
    }

    /* Access modifiers changed, original: final */
    public final Runnable b() {
        return this.b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 33) + valueOf2.length());
        stringBuilder.append("Entry{message=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", timeoutRunnable=");
        stringBuilder.append(valueOf2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adye) {
            adye adye = (adye) obj;
            return this.a.equals(adye.a()) && this.b.equals(adye.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    /* synthetic */ adxv(adym adym, Runnable runnable) {
        this.a = adym;
        this.b = runnable;
    }
}
