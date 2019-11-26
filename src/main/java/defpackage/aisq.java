package defpackage;

import android.app.PendingIntent;

/* renamed from: aisq */
final class aisq extends aitj {
    private final boolean a;
    private final int b;
    private final int c;
    private final PendingIntent d;
    private final boolean e;

    /* Access modifiers changed, original: final */
    public final boolean a() {
        return this.a;
    }

    /* Access modifiers changed, original: final */
    public final int b() {
        return this.b;
    }

    /* Access modifiers changed, original: final */
    public final int c() {
        return this.c;
    }

    /* Access modifiers changed, original: final */
    public final PendingIntent d() {
        return this.d;
    }

    /* Access modifiers changed, original: final */
    public final boolean e() {
        return this.e;
    }

    public final String toString() {
        boolean z = this.a;
        int i = this.b;
        int i2 = this.c;
        String valueOf = String.valueOf(this.d);
        boolean z2 = this.e;
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 131);
        stringBuilder.append("NotificationActionModel{shouldShow=");
        stringBuilder.append(z);
        stringBuilder.append(", actionIcon=");
        stringBuilder.append(i);
        stringBuilder.append(", actionTitle=");
        stringBuilder.append(i2);
        stringBuilder.append(", pendingIntent=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", showInCompactMode=");
        stringBuilder.append(z2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aitj) {
            aitj aitj = (aitj) obj;
            return this.a == aitj.a() && this.b == aitj.b() && this.c == aitj.c() && this.d.equals(aitj.d()) && this.e == aitj.e();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = ((((((((!this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003;
        if (this.e) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    /* synthetic */ aisq(boolean z, int i, int i2, PendingIntent pendingIntent, boolean z2) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = pendingIntent;
        this.e = z2;
    }
}
