package defpackage;

/* renamed from: atmy */
public final class atmy extends anxl implements anzf {
    public static final atmy c;
    private static volatile anzq d;
    public anyd a = anxl.emptyProtobufList();
    public anyd b = anxl.emptyProtobufList();

    private atmy() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0000\u0001\u001b\u0003\u001b", new Object[]{"a", atmw.class, "b", atni.class});
            case 3:
                return new atmy();
            case 4:
                return new atmx();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (atmy.class) {
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
        atmy atmy = new atmy();
        c = atmy;
        anxl.registerDefaultInstance(atmy.class, atmy);
    }
}
