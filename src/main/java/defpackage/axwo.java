package defpackage;

/* renamed from: axwo */
public final class axwo extends anxl implements anzf {
    public static final axwo e;
    private static volatile anzq f;
    public int a;
    public String b = "";
    public long c;
    public anyd d = anxl.emptyProtobufList();

    private axwo() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0000\u0002\u0002\u0001\u0003\b\u0000\u0004\u001a", new Object[]{"a", "c", "b", "d"});
            case 3:
                return new axwo();
            case 4:
                return new axwr();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (axwo.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
                            f = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        axwo axwo = new axwo();
        e = axwo;
        anxl.registerDefaultInstance(axwo.class, axwo);
    }
}
