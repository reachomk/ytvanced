package defpackage;

/* renamed from: aszc */
public final class aszc extends anxl implements anzf {
    public static final aszc f;
    private static volatile anzq h;
    public int a;
    public asic b;
    public apxu c;
    public apxu d;
    public aoxs e;
    private byte g = (byte) 2;

    private aszc() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0003\u0001Љ\u0000\u0002Љ\u0001\u0004\t\u0003\u0005Љ\u0002", new Object[]{"a", "b", "c", "e", "d"});
            case 3:
                return new aszc();
            case 4:
                return new aszb();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (aszc.class) {
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
        aszc aszc = new aszc();
        f = aszc;
        anxl.registerDefaultInstance(aszc.class, aszc);
    }
}
