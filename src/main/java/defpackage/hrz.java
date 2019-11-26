package defpackage;

/* renamed from: hrz */
final /* synthetic */ class hrz implements amqv {
    private final agll a;

    hrz(agll agll) {
        this.a = agll;
    }

    public final boolean a(Object obj) {
        agll agll = this.a;
        if (!(obj instanceof aqgs)) {
            return false;
        }
        String str = agll.a;
        ayym ayym = ((aqgs) obj).x;
        if (ayym == null) {
            ayym = ayym.c;
        }
        if (str.equals(ayym.b)) {
            return true;
        }
        return false;
    }
}
