package defpackage;

/* renamed from: auqv */
public final class auqv extends anxl implements anzf {
    public static final auqv e;
    private static volatile anzq f;
    public int a;
    public boolean b;
    public int c;
    public boolean d;

    private auqv() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0006\u0012\u0003\u0000\u0000\u0000\u0006\u0007\u0005\b\u000b\u0007\u0012\u0007\u0011", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new auqv();
            case 4:
                return new auqy();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (auqv.class) {
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
        auqv auqv = new auqv();
        e = auqv;
        anxl.registerDefaultInstance(auqv.class, auqv);
    }
}
