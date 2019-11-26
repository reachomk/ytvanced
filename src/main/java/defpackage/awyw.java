package defpackage;

/* renamed from: awyw */
public final class awyw extends anxl implements anzf {
    public static final awyw k;
    private static volatile anzq m;
    public int a;
    public aygk b;
    public aygk c;
    public arml d;
    public apxu e;
    public anvu f = anvu.a;
    public aodx g;
    public axak h;
    public int i;
    public int j;
    private byte l = (byte) 2;

    private awyw() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.l = b;
                return null;
            case 2:
                return anxl.newMessageInfo(k, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\u0005\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003\u0006\n\u0005\u0007\t\u0006\bЉ\u0007\t\f\b\n\f\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", awwm.a, "j", awwk.a});
            case 3:
                return new awyw();
            case 4:
                return new awyv();
            case 5:
                return k;
            case 6:
                Object obj3 = m;
                if (obj3 == null) {
                    synchronized (awyw.class) {
                        obj3 = m;
                        if (obj3 == null) {
                            obj3 = new anxn(k);
                            m = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        awyw awyw = new awyw();
        k = awyw;
        anxl.registerDefaultInstance(awyw.class, awyw);
    }
}
