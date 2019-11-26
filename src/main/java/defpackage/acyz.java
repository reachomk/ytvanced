package defpackage;

/* renamed from: acyz */
final class acyz extends aczq {
    public final String a;
    public final String b;
    public final int c;
    public final adpw d;
    public final int e;

    public final String a() {
        return this.a;
    }

    /* Access modifiers changed, original: final */
    public final String b() {
        return this.b;
    }

    /* Access modifiers changed, original: final */
    public final int c() {
        return this.c;
    }

    /* Access modifiers changed, original: final */
    public final adpw d() {
        return this.d;
    }

    public final String toString() {
        String str = this.a;
        int i = this.e;
        String valueOf = String.valueOf(i == 0 ? "null" : aurr.c(i));
        String str2 = this.b;
        int i2 = this.c;
        String valueOf2 = String.valueOf(this.d);
        int length = String.valueOf(str).length();
        StringBuilder stringBuilder = new StringBuilder((((length + 114) + valueOf.length()) + String.valueOf(str2).length()) + valueOf2.length());
        stringBuilder.append("MdxBackgroundPlaybackRequest{routeId=");
        stringBuilder.append(str);
        stringBuilder.append(", sessionType=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", deviceName=");
        stringBuilder.append(str2);
        stringBuilder.append(", timeoutSeconds=");
        stringBuilder.append(i2);
        stringBuilder.append(", playbackDescriptor=");
        stringBuilder.append(valueOf2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aczq) {
            aczq aczq = (aczq) obj;
            if (this.a.equals(aczq.a())) {
                int i = this.e;
                int f = aczq.f();
                if (i != 0) {
                    return i == f && this.b.equals(aczq.b()) && this.c == aczq.c() && this.d.equals(aczq.d());
                } else {
                    throw null;
                }
            }
        }
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ aurr.a(this.e)) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode();
    }

    public final aczt e() {
        return new aczc(this);
    }

    /* Access modifiers changed, original: final */
    public final int f() {
        return this.e;
    }

    /* synthetic */ acyz(String str, int i, String str2, int i2, adpw adpw) {
        this.a = str;
        this.e = i;
        this.b = str2;
        this.c = i2;
        this.d = adpw;
    }
}
