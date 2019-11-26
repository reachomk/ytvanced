package defpackage;

/* renamed from: azaa */
public final class azaa extends anxl implements anzf {
    public static final azaa j;
    private static volatile anzq k;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;

    private azaa() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0005\u0012\b\u0000\u0000\u0000\u0005\u0007\u0004\t\u0007\b\n\u0007\t\u000b\u0007\n\f\u0007\u000b\u000f\u0007\u000e\u0011\u0007\u0010\u0012\u0007\u0011", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new azaa();
            case 4:
                return new ayzz();
            case 5:
                return j;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (azaa.class) {
                        obj3 = k;
                        if (obj3 == null) {
                            obj3 = new anxn(j);
                            k = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        azaa azaa = new azaa();
        j = azaa;
        anxl.registerDefaultInstance(azaa.class, azaa);
    }
}
