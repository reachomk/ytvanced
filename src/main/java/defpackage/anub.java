package defpackage;

/* renamed from: anub */
public final class anub extends anxl implements anzf {
    public static final anub b;
    private static volatile anzq c;
    public anyy a = anyy.b;

    private anub() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", anud.a});
            case 3:
                return new anub();
            case 4:
                return new anua();
            case 5:
                return b;
            case 6:
                Object obj3 = c;
                if (obj3 == null) {
                    synchronized (anub.class) {
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
        anub anub = new anub();
        b = anub;
        anxl.registerDefaultInstance(anub.class, anub);
    }
}
