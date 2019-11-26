package defpackage;

/* renamed from: vro */
public final class vro extends vrs {
    private final vso a;
    private final vrd b;

    public vro(vso vso, vrd vrd) {
        if (vso != null) {
            this.a = vso;
            if (vrd != null) {
                this.b = vrd;
                return;
            }
            throw new NullPointerException("Null adCountMetadata");
        }
        throw new NullPointerException("Null ad");
    }

    public final vso a() {
        return this.a;
    }

    public final vrd b() {
        return this.b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 44) + valueOf2.length());
        stringBuilder.append("BroadcasterAdMetadata{ad=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", adCountMetadata=");
        stringBuilder.append(valueOf2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vrs) {
            vrs vrs = (vrs) obj;
            return this.a.equals(vrs.a()) && this.b.equals(vrs.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
