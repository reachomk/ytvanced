package defpackage;

/* renamed from: adpp */
final class adpp extends adqp {
    private final int a;
    private final String b;

    public final int a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String toString() {
        int i = this.a;
        String str = this.b;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 61);
        stringBuilder.append("SessionRecoveryStatus{recoveryState=");
        stringBuilder.append(i);
        stringBuilder.append(", screenName=");
        stringBuilder.append(str);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adqp) {
            adqp adqp = (adqp) obj;
            return this.a == adqp.a() && this.b.equals(adqp.b());
        }
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    /* synthetic */ adpp(int i, String str) {
        this.a = i;
        this.b = str;
    }
}
