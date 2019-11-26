package defpackage;

/* renamed from: rfx */
final class rfx implements rgf {
    private final rgf[] a;

    rfx(rgf... rgfArr) {
        this.a = rgfArr;
    }

    public final boolean a(Class cls) {
        for (rgf a : this.a) {
            if (a.a(cls)) {
                return true;
            }
        }
        return false;
    }

    public final rgg b(Class cls) {
        for (rgf rgf : this.a) {
            if (rgf.a(cls)) {
                return rgf.b(cls);
            }
        }
        String name = cls.getName();
        String str = "No factory is available for message type: ";
        throw new UnsupportedOperationException(name.length() == 0 ? new String(str) : str.concat(name));
    }
}
