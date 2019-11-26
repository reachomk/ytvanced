package defpackage;

/* renamed from: aivy */
public final class aivy implements aepn {
    private final aivx a;

    public aivy(aivx aivx) {
        this.a = aivx;
    }

    public final aeps a(aahr aahr, boolean z) {
        if (!aahr.v()) {
            long c = aahr.c();
            if (z || aahr.b == null || ((c <= 0 && c != -1) || this.a == null)) {
                return new aepo();
            }
            return new aivq(new aepo(), this.a, aahr);
        } else if (this.a != null) {
            return new aivw(new aepo(), this.a);
        } else {
            throw new InstantiationException("Cannot create ProxyPlayer because MediaServer is null");
        }
    }
}
