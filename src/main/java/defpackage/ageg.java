package defpackage;

/* renamed from: ageg */
public final class ageg extends agee {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        boolean z4 = this.d;
        StringBuilder stringBuilder = new StringBuilder(156);
        stringBuilder.append("AutoOfflineConfig{channelAutoOfflineEnabled=");
        stringBuilder.append(z);
        stringBuilder.append(", videoListAutoOfflineEnabled=");
        stringBuilder.append(z2);
        stringBuilder.append(", offlineCandidatesEnabled=");
        stringBuilder.append(z3);
        stringBuilder.append(", offlineSubscriptionsSyncEnabled=");
        stringBuilder.append(z4);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agee) {
            agee agee = (agee) obj;
            return this.a == agee.a() && this.b == agee.b() && this.c == agee.c() && this.d == agee.d();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((((!this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (!this.b ? 1237 : 1231)) * 1000003) ^ (!this.c ? 1237 : 1231)) * 1000003;
        if (this.d) {
            i = 1231;
        }
        return i2 ^ i;
    }

    public /* synthetic */ ageg(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }
}
