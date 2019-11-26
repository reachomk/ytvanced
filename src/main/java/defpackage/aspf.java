package defpackage;

/* renamed from: aspf */
public final class aspf extends anxl implements anzf {
    public static final aspf e;
    private static volatile anzq g;
    public int a;
    public asic b;
    public aspb c;
    public anvu d = anvu.a;
    private byte f = (byte) 2;

    private aspf() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.f = b;
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0002\u0001Љ\u0000\u0003Љ\u0001\u0005\n\u0003", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new aspf();
            case 4:
                return new aspi();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (aspf.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
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
        aspf aspf = new aspf();
        e = aspf;
        anxl.registerDefaultInstance(aspf.class, aspf);
    }
}
