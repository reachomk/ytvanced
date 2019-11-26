package defpackage;

/* renamed from: babs */
public final class babs extends anxl implements anzf {
    public static final babs f;
    private static volatile anzq g;
    public int a;
    public int b = 0;
    public Object c;
    public int d;
    public anyd e = anxl.emptyProtobufList();

    private babs() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0000\u0002<\u0000\u0003\u001b", new Object[]{"c", "b", "a", "d", babz.a, babu.class, "e", baby.class});
            case 3:
                return new babs();
            case 4:
                return new babv();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (babs.class) {
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
        babs babs = new babs();
        f = babs;
        anxl.registerDefaultInstance(babs.class, babs);
    }
}
