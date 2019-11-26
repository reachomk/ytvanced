package defpackage;

/* renamed from: ausa */
public final class ausa extends anxl implements anzf {
    public static final ausa c;
    private static volatile anzq d;
    public int a;
    public boolean b;

    private ausa() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0000\u0007\u0007\u0006", new Object[]{"a", "b"});
            case 3:
                return new ausa();
            case 4:
                return new aurz();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (ausa.class) {
                        obj3 = d;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
                            d = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ausa ausa = new ausa();
        c = ausa;
        anxl.registerDefaultInstance(ausa.class, ausa);
    }
}
