package defpackage;

/* renamed from: aojo */
public final class aojo extends anxl implements anzf {
    public static final aojo f;
    private static volatile anzq g;
    public int a;
    public String b = "";
    public int c;
    public anyd d = anxl.emptyProtobufList();
    public boolean e;

    private aojo() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\b\u0000\u0002\u0004\u0001\u0003\u001b\u0004\u0007\u0002", new Object[]{"a", "b", "c", "d", aula.class, "e"});
            case 3:
                return new aojo();
            case 4:
                return new aojr();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (aojo.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            g = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aojo aojo = new aojo();
        f = aojo;
        anxl.registerDefaultInstance(aojo.class, aojo);
    }
}
