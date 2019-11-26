package defpackage;

/* renamed from: ahtn */
public final class ahtn {
    public final nlj a;
    public final ozt b;

    public ahtn(nlj nlj) {
        this.a = (nlj) amqw.a((Object) nlj);
        this.b = null;
    }

    public ahtn(ozt ozt) {
        this.a = null;
        this.b = (ozt) amqw.a((Object) ozt);
    }

    public final int a() {
        nlj nlj = this.a;
        if (nlj != null) {
            return nlj.a;
        }
        return this.b.a;
    }

    public final int b() {
        nlj nlj = this.a;
        if (nlj != null) {
            return nlj.c;
        }
        return this.b.c;
    }

    public final byte[] c() {
        nlj nlj = this.a;
        if (nlj != null) {
            return nlj.d;
        }
        return this.b.d;
    }

    public final String toString() {
        nlj nlj = this.a;
        if (nlj != null) {
            return nlj.toString();
        }
        return this.b.toString();
    }

    public final int hashCode() {
        nlj nlj = this.a;
        if (nlj != null) {
            return nlj.hashCode();
        }
        return this.b.hashCode();
    }
}
