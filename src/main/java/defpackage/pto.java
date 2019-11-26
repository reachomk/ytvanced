package defpackage;

/* renamed from: pto */
public final class pto extends UnsupportedOperationException {
    private final psc a;

    public pto(psc psc) {
        this.a = psc;
    }

    public final String getMessage() {
        String valueOf = String.valueOf(this.a);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 8);
        stringBuilder.append("Missing ");
        stringBuilder.append(valueOf);
        return stringBuilder.toString();
    }
}
