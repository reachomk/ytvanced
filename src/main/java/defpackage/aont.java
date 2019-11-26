package defpackage;

/* renamed from: aont */
public final class aont extends anxl implements anzf {
    public static final aont c;
    private static volatile anzq d;
    public int a = 0;
    public Object b;

    private aont() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\f\u0001\u0000\u0001\f\f\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000", new Object[]{"b", "a", aonz.class, aooj.class, aoob.class, aoof.class, aood.class, aoor.class, aoop.class, aoon.class, aonx.class, aool.class, aonv.class, aooh.class});
            case 3:
                return new aont();
            case 4:
                return new aons();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (aont.class) {
                        obj3 = d;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
                            d = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aont aont = new aont();
        c = aont;
        anxl.registerDefaultInstance(aont.class, aont);
    }
}
