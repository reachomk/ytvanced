package defpackage;

import java.util.List;

/* renamed from: agnm */
final class agnm extends agnn {
    private final azlk a;
    private final arlv b;
    private final amqp c;
    private final List d;

    agnm(azlk azlk, arlv arlv, amqp amqp, List list) {
        if (azlk != null) {
            this.a = azlk;
            if (arlv != null) {
                this.b = arlv;
                if (amqp != null) {
                    this.c = amqp;
                    if (list != null) {
                        this.d = list;
                        return;
                    }
                    throw new NullPointerException("Null blockHashes");
                }
                throw new NullPointerException("Null encryptionInfo");
            }
            throw new NullPointerException("Null formatStream");
        }
        throw new NullPointerException("Null streamKey");
    }

    public final azlk a() {
        return this.a;
    }

    public final arlv b() {
        return this.b;
    }

    public final amqp c() {
        return this.c;
    }

    public final List d() {
        return this.d;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        StringBuilder stringBuilder = new StringBuilder((((length + 71) + length2) + valueOf3.length()) + valueOf4.length());
        stringBuilder.append("YtbStreamData{streamKey=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", formatStream=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", encryptionInfo=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", blockHashes=");
        stringBuilder.append(valueOf4);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agnn) {
            agnn agnn = (agnn) obj;
            return this.a.equals(agnn.a()) && this.b.equals(agnn.b()) && this.c.equals(agnn.c()) && this.d.equals(agnn.d());
        }
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }
}
