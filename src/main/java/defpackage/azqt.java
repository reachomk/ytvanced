package defpackage;

/* renamed from: azqt */
public final class azqt extends anxl implements anzf {
    public static final azqt i;
    private static volatile anzq j;
    public int a;
    public String b;
    public String c;
    public long d;
    public anvu e = anvu.a;
    public anvu f = anvu.a;
    public azqj g;
    public anyd h = anxl.emptyProtobufList();

    private azqt() {
        String str = "";
        this.b = str;
        this.c = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\n\u0003\u0005\n\u0004\u0006\t\u0005\u0007\u001b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", azle.class});
            case 3:
                return new azqt();
            case 4:
                return new azqs();
            case 5:
                return i;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (azqt.class) {
                        obj3 = j;
                        if (obj3 == null) {
                            obj3 = new anxn(i);
                            j = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        azqt azqt = new azqt();
        i = azqt;
        anxl.registerDefaultInstance(azqt.class, azqt);
    }
}
