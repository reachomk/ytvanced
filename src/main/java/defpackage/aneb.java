package defpackage;

/* renamed from: aneb */
public final class aneb extends anxl implements anzf {
    public static final aneb a;
    private static volatile anzq b;

    static {
        aneb aneb = new aneb();
        a = aneb;
        anxl.registerDefaultInstance(aneb.class, aneb);
    }

    private aneb() {
        anxl.emptyFloatList();
        anxl.emptyFloatList();
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
                return new aneb();
            case 4:
                return new anee();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (aneb.class) {
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
}
