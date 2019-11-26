package defpackage;

/* renamed from: aywz */
public final class aywz extends anxl implements anzf {
    public static final aywz a;
    private static volatile anzq b;

    private aywz() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new aywz();
            case 4:
                return new aywy();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (aywz.class) {
                        obj3 = b;
                        if (obj3 == null) {
                            obj3 = new anxn(a);
                            b = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aywz aywz = new aywz();
        a = aywz;
        anxl.registerDefaultInstance(aywz.class, aywz);
    }
}
