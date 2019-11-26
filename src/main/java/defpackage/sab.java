package defpackage;

/* renamed from: sab */
final class sab implements rzx {
    private final /* synthetic */ Iterable a;

    sab(Iterable iterable) {
        this.a = iterable;
    }

    public final boolean a(String str) {
        for (rzx a : this.a) {
            if (a.a(str)) {
                return true;
            }
        }
        return false;
    }
}
