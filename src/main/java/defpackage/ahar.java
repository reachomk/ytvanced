package defpackage;

/* renamed from: ahar */
final class ahar extends ahbv {
    private final boolean a;
    private final amqp b;

    public final boolean a() {
        return this.a;
    }

    public final amqp b() {
        return this.b;
    }

    public final String toString() {
        boolean z = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 62);
        stringBuilder.append("OfflineActionDialogConfig{shouldShow=");
        stringBuilder.append(z);
        stringBuilder.append(", removeActionType=");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahbv) {
            ahbv ahbv = (ahbv) obj;
            return this.a == ahbv.a() && this.b.equals(ahbv.b());
        }
    }

    public final int hashCode() {
        return (((!this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    /* synthetic */ ahar(boolean z, amqp amqp) {
        this.a = z;
        this.b = amqp;
    }
}
