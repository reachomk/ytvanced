package defpackage;

/* renamed from: aprg */
public final class aprg extends anxl implements anzf {
    public static final aprg e;
    private static volatile anzq f;
    public int a;
    public String b = "";
    public anyd c = anxl.emptyProtobufList();
    public axqf d;

    private aprg() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0000\u0001\b\u0000\u0002\u001a\u0005\t\u0001", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new aprg();
            case 4:
                return new aprj();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (aprg.class) {
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
        aprg aprg = new aprg();
        e = aprg;
        anxl.registerDefaultInstance(aprg.class, aprg);
    }
}
