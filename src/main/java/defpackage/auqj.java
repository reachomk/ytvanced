package defpackage;

@Deprecated
/* renamed from: auqj */
public final class auqj extends anxl implements anzf {
    public static final auqj a;
    private static volatile anzq b;

    private auqj() {
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
                return new auqj();
            case 4:
                return new auqm();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (auqj.class) {
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
        auqj auqj = new auqj();
        a = auqj;
        anxl.registerDefaultInstance(auqj.class, auqj);
    }
}
