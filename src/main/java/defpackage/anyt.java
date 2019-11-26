package defpackage;

/* renamed from: anyt */
final class anyt implements anzb {
    private final anzb[] a;

    anyt(anzb... anzbArr) {
        this.a = anzbArr;
    }

    public final boolean a(Class cls) {
        for (anzb a : this.a) {
            if (a.a(cls)) {
                return true;
            }
        }
        return false;
    }

    public final anzc b(Class cls) {
        for (anzb anzb : this.a) {
            if (anzb.a(cls)) {
                return anzb.b(cls);
            }
        }
        String name = cls.getName();
        String str = "No factory is available for message type: ";
        throw new UnsupportedOperationException(name.length() == 0 ? new String(str) : str.concat(name));
    }
}
