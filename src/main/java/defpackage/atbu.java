package defpackage;

/* renamed from: atbu */
public final class atbu extends anxl implements anzf {
    public static final atbu f;
    private static volatile anzq g;
    public int a;
    public String b = "";
    public anyd c = anxl.emptyProtobufList();
    public anvu d = anvu.a;
    public boolean e;

    private atbu() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\b\u0000\u0002\u001b\u0003\n\u0001\u0004\u0007\u0002", new Object[]{"a", "b", "c", atbs.class, "d", "e"});
            case 3:
                return new atbu();
            case 4:
                return new atbt();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (atbu.class) {
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
        atbu atbu = new atbu();
        f = atbu;
        anxl.registerDefaultInstance(atbu.class, atbu);
    }
}
