package defpackage;

/* renamed from: nke */
public final class nke extends anxl implements anzf {
    public static final nke d;
    private static volatile anzq e;
    public int a;
    public String b = "";
    public anxz c = anxl.emptyIntList();

    private nke() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\b\u0000\u0002\u0016", new Object[]{"a", "b", "c"});
            case 3:
                return new nke();
            case 4:
                return new nkd();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (nke.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            e = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        nke nke = new nke();
        d = nke;
        anxl.registerDefaultInstance(nke.class, nke);
    }
}
