package defpackage;

/* renamed from: bass */
public final class bass {
    public final basp a;
    public final bavx b;

    public static bass a(basp basp) {
        amqw.a(basp != basp.TRANSIENT_FAILURE, (Object) "state is TRANSIENT_ERROR. Use forError() instead");
        return new bass(basp, bavx.b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bass) {
            bass bass = (bass) obj;
            if (this.a.equals(bass.a) && this.b.equals(bass.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        if (this.b.a()) {
            return this.a.toString();
        }
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 2) + valueOf2.length());
        stringBuilder.append(valueOf);
        stringBuilder.append("(");
        stringBuilder.append(valueOf2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public bass(basp basp, bavx bavx) {
        this.a = (basp) amqw.a((Object) basp, (Object) "state is null");
        this.b = (bavx) amqw.a((Object) bavx, (Object) "status is null");
    }
}
