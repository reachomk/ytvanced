package defpackage;

/* renamed from: bavb */
public final class bavb {
    public final bavx a;
    public final Object b;

    public static bavb a(Object obj) {
        return new bavb(obj);
    }

    public static bavb a(bavx bavx) {
        return new bavb(bavx);
    }

    private bavb(Object obj) {
        this.b = amqw.a(obj, (Object) "config");
        this.a = null;
    }

    private bavb(bavx bavx) {
        this.b = null;
        this.a = (bavx) amqw.a((Object) bavx, (Object) "status");
        amqw.a(bavx.a() ^ 1, "cannot use OK status: %s", (Object) bavx);
    }

    public final String toString() {
        amqo a;
        if (this.b != null) {
            a = amql.a(this);
            a.a("config", this.b);
            return a.toString();
        }
        a = amql.a(this);
        a.a("error", this.a);
        return a.toString();
    }
}
