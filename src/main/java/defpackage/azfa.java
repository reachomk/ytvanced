package defpackage;

/* renamed from: azfa */
public final class azfa extends anxl implements anzf {
    public static final azfa h;
    private static volatile anzq i;
    public int a;
    public anvu b = anvu.a;
    public int c;
    public int d = -1;
    public int e;
    public azfa f;
    public apww g;

    private azfa() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001\n\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0006\u0004\u0003\u0007\t\u0004\b\t\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            case 3:
                return new azfa();
            case 4:
                return new azfd();
            case 5:
                return h;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (azfa.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(h);
                            i = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        azfa azfa = new azfa();
        h = azfa;
        anxl.registerDefaultInstance(azfa.class, azfa);
    }
}
