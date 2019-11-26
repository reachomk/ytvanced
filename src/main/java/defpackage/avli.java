package defpackage;

/* renamed from: avli */
public final class avli extends anxl implements anzf {
    public static final avli g;
    private static volatile anzq h;
    public int a;
    public anvu b = anvu.a;
    public boolean c;
    public boolean d;
    public String e = "";
    public anyd f = anxl.emptyProtobufList();

    private avli() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001\n\u0000\u0002\u0007\u0001\u0003\u0007\u0002\u0004\b\u0003\u0006\u001b", new Object[]{"a", "b", "c", "d", "e", "f", avlk.class});
            case 3:
                return new avli();
            case 4:
                return new avlh();
            case 5:
                return g;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (avli.class) {
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
        avli avli = new avli();
        g = avli;
        anxl.registerDefaultInstance(avli.class, avli);
    }
}
