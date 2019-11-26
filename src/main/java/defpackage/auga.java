package defpackage;

/* renamed from: auga */
public final class auga extends anxl implements anzf {
    public static final auga e;
    private static volatile anzq f;
    public int a;
    public int b;
    public String c = "";
    public anvu d = anvu.a;

    private auga() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\n\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new auga();
            case 4:
                return new augd();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (auga.class) {
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
        auga auga = new auga();
        e = auga;
        anxl.registerDefaultInstance(auga.class, auga);
    }
}
