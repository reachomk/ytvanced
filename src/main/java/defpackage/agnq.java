package defpackage;

/* renamed from: agnq */
public final class agnq extends agnz {
    public final ovf a;
    public final agnw b;

    public agnq(ovf ovf, agnw agnw) {
        this.a = ovf;
        if (agnw != null) {
            this.b = agnw;
            return;
        }
        throw new NullPointerException("Null target");
    }

    public final ovf a() {
        return this.a;
    }

    public final agnw b() {
        return this.b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 40) + valueOf2.length());
        stringBuilder.append("YtbDownloadContext{ytbFactory=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", target=");
        stringBuilder.append(valueOf2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agnz) {
            agnz agnz = (agnz) obj;
            return this.a.equals(agnz.a()) && this.b.equals(agnz.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
