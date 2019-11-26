package defpackage;

/* renamed from: anti */
public final class anti extends anxl implements anzf {
    public static final anti b;
    private static volatile anzq c;
    public anyy a = anyy.b;

    private anti() {
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
                return anxl.newMessageInfo(b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"a", antk.a});
            case 3:
                return new anti();
            case 4:
                return new antl();
            case 5:
                return b;
            case 6:
                Object obj3 = c;
                if (obj3 == null) {
                    synchronized (anti.class) {
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
        anti anti = new anti();
        b = anti;
        anxl.registerDefaultInstance(anti.class, anti);
    }
}
