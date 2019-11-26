package defpackage;

/* renamed from: aiqk */
final class aiqk extends aiqw {
    private final acxt b;

    public final acxt a() {
        return this.b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 45);
        stringBuilder.append("PlaybackStartParameters{latencyActionLogger=");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        boolean z = false;
        if (!(obj instanceof aiqw)) {
            return false;
        }
        aiqw aiqw = (aiqw) obj;
        acxt acxt = this.b;
        acxt a = aiqw.a();
        if (acxt != null) {
            z = acxt.equals(a);
        } else if (a != null) {
            return z;
        } else {
            return true;
        }
        return z;
    }

    public final int hashCode() {
        acxt acxt = this.b;
        return (acxt != null ? acxt.hashCode() : 0) ^ 1000003;
    }

    /* synthetic */ aiqk(acxt acxt) {
        this.b = acxt;
    }
}
