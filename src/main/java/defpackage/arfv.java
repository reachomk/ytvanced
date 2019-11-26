package defpackage;

/* renamed from: arfv */
public final class arfv extends anxl implements anzf {
    public static final arfv b;
    private static volatile anzq c;
    public anyy a = anyy.b;

    private arfv() {
    }

    public final boolean a(String str) {
        return this.a.containsKey(str);
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", arfx.a});
            case 3:
                return new arfv();
            case 4:
                return new arfu();
            case 5:
                return b;
            case 6:
                Object obj3 = c;
                if (obj3 == null) {
                    synchronized (arfv.class) {
                        obj3 = c;
                        if (obj3 == null) {
                            obj3 = new anxn(b);
                            c = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        arfv arfv = new arfv();
        b = arfv;
        anxl.registerDefaultInstance(arfv.class, arfv);
    }
}
