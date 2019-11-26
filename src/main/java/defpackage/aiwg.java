package defpackage;

/* renamed from: aiwg */
final class aiwg extends aiwy {
    private final boolean a;
    private final boolean b;

    @Deprecated
    public final boolean a() {
        return this.a;
    }

    @Deprecated
    public final boolean b() {
        return this.b;
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        StringBuilder stringBuilder = new StringBuilder(109);
        stringBuilder.append("Configuration{shouldCancelPendingRequestOnNavigate=");
        stringBuilder.append(z);
        stringBuilder.append(", shouldApplyDescriptorPlaybackStateOnNavigate=");
        stringBuilder.append(z2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aiwy) {
            aiwy aiwy = (aiwy) obj;
            return this.a == aiwy.a() && this.b == aiwy.b();
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

    /* synthetic */ aiwg(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
