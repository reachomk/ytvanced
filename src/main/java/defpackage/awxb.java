package defpackage;

/* renamed from: awxb */
public final class awxb extends anxl implements anzf {
    public static final awxb h;
    private static volatile anzq j;
    public int a;
    public azaj b;
    public axak c;
    public axak d;
    public arwf e;
    public arml f;
    public axak g;
    private byte i = (byte) 2;

    private awxb() {
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0005\u0001Љ\u0000\u0002Љ\u0001\u0003\t\u0003\u0004Љ\u0004\u0007Љ\u0002\bЉ\u0007", new Object[]{"a", "b", "c", "e", "f", "d", "g"});
            case 3:
                return new awxb();
            case 4:
                return new awxa();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (awxb.class) {
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
        awxb awxb = new awxb();
        h = awxb;
        anxl.registerDefaultInstance(awxb.class, awxb);
    }
}
