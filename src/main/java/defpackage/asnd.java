package defpackage;

/* renamed from: asnd */
public final class asnd extends anxl implements anzf {
    public static final asnd g;
    private static volatile anzq i;
    public int a;
    public ashy b;
    public long c;
    public asnj d;
    public anyd e = anxl.emptyProtobufList();
    public int f;
    private byte h = (byte) 2;

    private asnd() {
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0001\u0001Љ\u0000\u0002\u0002\u0001\u0003\u001b\u0005\t\u0002\u0007\f\u0005", new Object[]{"a", "b", "c", "e", asmw.class, "d", "f", aqui.a()});
            case 3:
                return new asnd();
            case 4:
                return new asnc();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (asnd.class) {
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
        asnd asnd = new asnd();
        g = asnd;
        anxl.registerDefaultInstance(asnd.class, asnd);
    }
}
