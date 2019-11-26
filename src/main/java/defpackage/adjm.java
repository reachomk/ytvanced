package defpackage;

/* renamed from: adjm */
final class adjm extends adln {
    public final adls a;
    public final adpw b;

    adjm(adls adls, adpw adpw) {
        this.a = adls;
        if (adpw != null) {
            this.b = adpw;
            return;
        }
        throw new NullPointerException("Null mdxPlaybackDescriptor");
    }

    /* Access modifiers changed, original: final */
    public final adls a() {
        return this.a;
    }

    /* Access modifiers changed, original: final */
    public final adpw b() {
        return this.b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 66) + valueOf2.length());
        stringBuilder.append("LocalNotificationModel{notificationModel=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", mdxPlaybackDescriptor=");
        stringBuilder.append(valueOf2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adln) {
            adln adln = (adln) obj;
            return this.a.equals(adln.a()) && this.b.equals(adln.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
