package defpackage;

/* renamed from: adjk */
final class adjk extends adkl {
    private final boolean a;
    private final boolean b;

    public final boolean a() {
        return this.a;
    }

    /* Access modifiers changed, original: final */
    public final boolean b() {
        return this.b;
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        StringBuilder stringBuilder = new StringBuilder(80);
        stringBuilder.append("LocalNotificationsConfig{enableLocalNotifications=");
        stringBuilder.append(z);
        stringBuilder.append(", isCounterfactual=");
        stringBuilder.append(z2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adkl) {
            adkl adkl = (adkl) obj;
            return this.a == adkl.a() && this.b == adkl.b();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((!this.a ? 1237 : 1231) ^ 1000003) * 1000003;
        if (this.b) {
            i = 1231;
        }
        return i2 ^ i;
    }

    /* synthetic */ adjk(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
