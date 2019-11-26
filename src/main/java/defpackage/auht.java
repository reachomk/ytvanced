package defpackage;

/* renamed from: auht */
public final class auht extends anxl implements anzf {
    public static final auht d;
    private static volatile anzq e;
    public int a;
    public auhj b;
    public anyd c = anxl.emptyProtobufList();

    private auht() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\t\u0000\u0002\u001b", new Object[]{"a", "b", "c", auhv.class});
            case 3:
                return new auht();
            case 4:
                return new auhs();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (auht.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            e = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        auht auht = new auht();
        d = auht;
        anxl.registerDefaultInstance(auht.class, auht);
    }
}
