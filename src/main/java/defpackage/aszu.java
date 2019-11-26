package defpackage;

/* renamed from: aszu */
public final class aszu extends anxl implements anzf {
    public static final aszu g;
    private static volatile anzq i;
    public int a;
    public ashy b;
    public String c = "";
    public anyd d = anxl.emptyProtobufList();
    public boolean e;
    public int f;
    private byte h = (byte) 2;

    private aszu() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.h = b;
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0001\u0001Љ\u0000\u0002\b\u0001\u0003\u0007\u0002\u0004\u001a\u0006\f\u0003", new Object[]{"a", "b", "c", "e", "d", "f", avks.a});
            case 3:
                return new aszu();
            case 4:
                return new aszt();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (aszu.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
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
        aszu aszu = new aszu();
        g = aszu;
        anxl.registerDefaultInstance(aszu.class, aszu);
    }
}
