package defpackage;

/* renamed from: aeor */
final class aeor extends aeox {
    private final String a;
    private final int b;
    private final long c;
    private final long d;
    private final String e;
    private final amqp f;
    private final amqp g;

    aeor(String str, int i, long j, long j2, String str2, amqp amqp, amqp amqp2) {
        if (str != null) {
            this.a = str;
            this.b = i;
            this.c = j;
            this.d = j2;
            if (str2 != null) {
                this.e = str2;
                if (amqp != null) {
                    this.f = amqp;
                    if (amqp2 != null) {
                        this.g = amqp2;
                        return;
                    }
                    throw new NullPointerException("Null expectedTimeRange");
                }
                throw new NullPointerException("Null expectedMediaSizeBytes");
            }
            throw new NullPointerException("Null xtags");
        }
        throw new NullPointerException("Null encryptedVideoId");
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    public final long d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public final amqp f() {
        return this.f;
    }

    public final amqp g() {
        return this.g;
    }

    public final String toString() {
        String str = this.a;
        int i = this.b;
        long j = this.c;
        long j2 = this.d;
        String str2 = this.e;
        String valueOf = String.valueOf(this.f);
        String valueOf2 = String.valueOf(this.g);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder stringBuilder = new StringBuilder((((length + 178) + length2) + valueOf.length()) + valueOf2.length());
        stringBuilder.append("OnesieStreamMetadata{encryptedVideoId=");
        stringBuilder.append(str);
        stringBuilder.append(", itag=");
        stringBuilder.append(i);
        stringBuilder.append(", lastModifiedTime=");
        stringBuilder.append(j);
        stringBuilder.append(", seqNum=");
        stringBuilder.append(j2);
        stringBuilder.append(", xtags=");
        stringBuilder.append(str2);
        stringBuilder.append(", expectedMediaSizeBytes=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", expectedTimeRange=");
        stringBuilder.append(valueOf2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aeox) {
            aeox aeox = (aeox) obj;
            return this.a.equals(aeox.a()) && this.b == aeox.b() && this.c == aeox.c() && this.d == aeox.d() && this.e.equals(aeox.e()) && this.f.equals(aeox.f()) && this.g.equals(aeox.g());
        }
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int i = this.b;
        long j = this.c;
        long j2 = this.d;
        return ((((((((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }
}
