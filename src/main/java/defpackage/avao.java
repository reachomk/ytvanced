package defpackage;

/* renamed from: avao */
public final class avao extends anxl implements anzf {
    public static final avao f;
    private static volatile anzq g;
    public int a;
    public boolean b;
    public boolean c;
    public anxz d = anxl.emptyIntList();
    public boolean e;

    private avao() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u000b\u0017\u0004\u0000\u0001\u0000\u000b\u0007\b\r\u0007\n\u000f\u0016\u0017\u0007\u0011", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new avao();
            case 4:
                return new avaq();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (avao.class) {
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
        avao avao = new avao();
        f = avao;
        anxl.registerDefaultInstance(avao.class, avao);
    }
}
