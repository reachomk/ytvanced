package defpackage;

/* renamed from: fnc */
final /* synthetic */ class fnc implements amqv {
    private final fnd a;
    private final String b;

    fnc(fnd fnd, String str) {
        this.a = fnd;
        this.b = str;
    }

    public final boolean a(Object obj) {
        fnd fnd = this.a;
        String str = this.b;
        ayhz ayhz = (ayhz) obj;
        if ((ayhz.a & 2) == 0 || !ayhz.c.equals(fnd.b) || str == null || !str.equals(fnd.a)) {
            return false;
        }
        return true;
    }
}
