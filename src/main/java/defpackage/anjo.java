package defpackage;

/* renamed from: anjo */
final class anjo extends anhv implements Runnable {
    private anjv a;

    anjo(anjv anjv) {
        this.a = anjv;
    }

    public final void run() {
        anjv anjv = this.a;
        if (anjv != null) {
            a(anjv);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final String ax_() {
        anjv anjv = this.a;
        if (anjv == null) {
            return null;
        }
        String valueOf = String.valueOf(anjv);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 11);
        stringBuilder.append("delegate=[");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        this.a = null;
    }
}
