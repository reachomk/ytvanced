package defpackage;

/* renamed from: asaq */
public final class asaq extends anxl implements anzf {
    public static final asaq l;
    private static volatile anzq n;
    public int a;
    public ashy b;
    public long c;
    public long d;
    public int e;
    public float f;
    public int g;
    public anyd h = anxl.emptyProtobufList();
    public anyd i = anxl.emptyProtobufList();
    public anyd j;
    public anyd k;
    private byte m = (byte) 2;

    private asaq() {
        anxl.emptyProtobufList();
        this.j = anxl.emptyProtobufList();
        this.k = anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.m = b;
                return null;
            case 2:
                return anxl.newMessageInfo(l, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0004\u0001\u0001Љ\u0000\u0002\u0003\u0001\u0003\u0003\u0002\u0004\u000b\u0003\u0005\u0001\u0004\u0006\u000b\u0005\u0007\u001b\b\u001b\u000b\u001b\f\u001b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", asak.class, "i", asas.class, "j", asay.class, "k", asbc.class});
            case 3:
                return new asaq();
            case 4:
                return new asat();
            case 5:
                return l;
            case 6:
                Object obj3 = n;
                if (obj3 == null) {
                    synchronized (asaq.class) {
                        obj3 = n;
                        if (obj3 == null) {
                            obj3 = new anxn(l);
                            n = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        asaq asaq = new asaq();
        l = asaq;
        anxl.registerDefaultInstance(asaq.class, asaq);
    }
}
