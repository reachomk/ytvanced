package defpackage;

/* renamed from: asmc */
public final class asmc extends anxl implements anzf {
    public static final asmc h;
    private static volatile anzq j;
    public int a;
    public asic b;
    public int c;
    public String d = "";
    public boolean e;
    public anvu f = anvu.a;
    public anyd g = anxl.emptyProtobufList();
    private byte i = (byte) 2;

    private asmc() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.i = b;
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001Љ\u0000\u0002\f\u0001\u0003\b\u0002\u0004\u0007\u0003\u0005\n\u0004\u0006\u001b", new Object[]{"a", "b", "c", argk.a, "d", "e", "f", "g", asly.class});
            case 3:
                return new asmc();
            case 4:
                return new asmf();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (asmc.class) {
                        obj3 = j;
                        if (obj3 == null) {
                            obj3 = new anxn(h);
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
        asmc asmc = new asmc();
        h = asmc;
        anxl.registerDefaultInstance(asmc.class, asmc);
    }
}
