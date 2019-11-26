package defpackage;

/* renamed from: asqp */
public final class asqp extends anxl implements anzf {
    public static final asqp c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private asqp() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.d = b;
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0002\u0001\u0000礼㰕䝓\u0002\u0000\u0000\u0002礼㰕м\u0000䝓м\u0000", new Object[]{"b", "a", auyw.class, aqhp.class});
            case 3:
                return new asqp();
            case 4:
                return new asqs();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (asqp.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
                            e = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        asqp asqp = new asqp();
        c = asqp;
        anxl.registerDefaultInstance(asqp.class, asqp);
    }
}
