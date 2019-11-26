package defpackage;

/* renamed from: agnp */
final class agnp extends agoc {
    private final agnw a;
    private final agpb b;
    private final amul c;

    agnp(agnw agnw, agpb agpb, amul amul) {
        if (agnw != null) {
            this.a = agnw;
            this.b = agpb;
            if (amul != null) {
                this.c = amul;
                return;
            }
            throw new NullPointerException("Null encryptionInfos");
        }
        throw new NullPointerException("Null downloadTarget");
    }

    public final agnw a() {
        return this.a;
    }

    public final agpb b() {
        return this.b;
    }

    public final amul c() {
        return this.c;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = valueOf.length();
        StringBuilder stringBuilder = new StringBuilder(((length + 67) + valueOf2.length()) + valueOf3.length());
        stringBuilder.append("YtbDownloadState{downloadTarget=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", writerFactory=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", encryptionInfos=");
        stringBuilder.append(valueOf3);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agoc) {
            agoc agoc = (agoc) obj;
            return this.a.equals(agoc.a()) && this.b.equals(agoc.b()) && amvj.a(this.c, agoc.c());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }
}
