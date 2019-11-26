package defpackage;

/* renamed from: atrp */
public final class atrp extends anxl implements anzf {
    public static final atrp g;
    private static volatile anzq h;
    public int a;
    public azfa b;
    public String c;
    public String d;
    public atst e;
    public atrr f;

    private atrp() {
        String str = "";
        this.c = str;
        this.d = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\t\u0000\u0002\b\u0001\u0003\b\u0002\u0004\t\u0003\u0005\t\u0005", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new atrp();
            case 4:
                return new atro();
            case 5:
                return g;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (atrp.class) {
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
        atrp atrp = new atrp();
        g = atrp;
        anxl.registerDefaultInstance(atrp.class, atrp);
    }
}
