package defpackage;

/* renamed from: aztz */
public final class aztz extends anxl implements anzf {
    public static final aztz k;
    private static volatile anzq l;
    public int a;
    public azub b;
    public azub c;
    public azub d;
    public azub e;
    public azub f;
    public azub g;
    public azub h;
    public azub i;
    public azub j;

    private aztz() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002\u0004\t\u0003\u0005\t\u0004\u0006\t\u0005\u0007\t\u0006\b\t\u0007\t\t\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
            case 3:
                return new aztz();
            case 4:
                return new azty();
            case 5:
                return k;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (aztz.class) {
                        obj3 = l;
                        if (obj3 == null) {
                            obj3 = new anxn(k);
                            l = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aztz aztz = new aztz();
        k = aztz;
        anxl.registerDefaultInstance(aztz.class, aztz);
    }
}
