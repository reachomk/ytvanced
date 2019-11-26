package defpackage;

/* renamed from: amnu */
abstract class amnu implements amnv {
    private final String a;

    amnu(String str) {
        this.a = str;
    }

    public final amnv a() {
        return null;
    }

    public final void close() {
        Object obj = this.a;
        amnv a = amoc.a();
        amqw.b(a != null, "Tried to end [%s], but no trace was active. This is caused by mismatched or missing calls to beginSpan.", obj);
        boolean equals = obj.equals(a.b());
        String b = a.b();
        if (equals) {
            amoc.a(a.a());
            return;
        }
        throw new IllegalStateException(amrl.a("Wrong trace, expected %s but got %s", obj, b));
    }

    public final String b() {
        return this.a;
    }

    public final String toString() {
        return amoc.b(this);
    }
}
