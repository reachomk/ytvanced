package defpackage;

/* renamed from: adqu */
final class adqu extends adtd {
    private final adjg a;

    public final adjg a() {
        return this.a;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 24);
        stringBuilder.append("DialSessionInfo{ssdpId=");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof adtd)) {
            return false;
        }
        return this.a.equals(((adtd) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    /* synthetic */ adqu(adjg adjg) {
        this.a = adjg;
    }
}
