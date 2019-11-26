package defpackage;

/* renamed from: aqmc */
public final class aqmc extends anxl implements anzf {
    public static final aqmc f;
    private static volatile anzq h;
    public int a;
    public arml b;
    public arml c;
    public aqkp d;
    public anyd e = anxl.emptyProtobufList();
    private byte g = (byte) 2;

    private aqmc() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.g = b;
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0004\u0001Љ\u0000\u0002Л\u0005Љ\u0001\u0006Љ\u0002", new Object[]{"a", "b", "e", aqma.class, "c", "d"});
            case 3:
                return new aqmc();
            case 4:
                return new aqmb();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (aqmc.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
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
        aqmc aqmc = new aqmc();
        f = aqmc;
        anxl.registerDefaultInstance(aqmc.class, aqmc);
    }
}
