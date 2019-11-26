package defpackage;

/* renamed from: avmc */
public final class avmc extends anxl implements anzf {
    public static final avmc m;
    private static volatile anzq n;
    public int a;
    public boolean b;
    public avma c;
    public boolean d;
    public boolean e;
    public avlw f;
    public aorh g;
    public avly h;
    public boolean i;
    public int j;
    public boolean k;
    public boolean l;

    private avmc() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(m, "\u0001\u000b\u0000\u0001\u0001\u0011\u000b\u0000\u0000\u0000\u0001\u0007\u0000\u0004\t\u0003\u0005\u0007\u0004\u0007\t\u0006\b\t\t\t\u0007\u0005\n\u0007\n\f\u0004\f\r\u0007\r\u0010\t\u0007\u0011\u0007\u0010", new Object[]{"a", "b", "c", "d", "f", "h", "e", "i", "j", "k", "g", "l"});
            case 3:
                return new avmc();
            case 4:
                return new avmf();
            case 5:
                return m;
            case 6:
                Object obj3 = n;
                if (obj3 == null) {
                    synchronized (avmc.class) {
                        obj3 = n;
                        if (obj3 == null) {
                            obj3 = new anxn(m);
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
        avmc avmc = new avmc();
        m = avmc;
        anxl.registerDefaultInstance(avmc.class, avmc);
    }
}
