package defpackage;

/* renamed from: atak */
public final class atak extends anxl implements anzf {
    public static final atak g;
    private static volatile anzq h;
    public int a;
    public String b = "";
    public long c;
    public anyd d = anxl.emptyProtobufList();
    public boolean e;
    public long f;

    private atak() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\b\u0000\u0002\u0002\u0001\u0003\u001a\u0004\u0007\u0002\u0005\u0002\u0003", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new atak();
            case 4:
                return new ataj();
            case 5:
                return g;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (atak.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
                            h = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        atak atak = new atak();
        g = atak;
        anxl.registerDefaultInstance(atak.class, atak);
    }
}
