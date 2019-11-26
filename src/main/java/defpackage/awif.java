package defpackage;

/* renamed from: awif */
public final class awif extends anxl implements anzf {
    public static final awif c;
    private static volatile anzq e;
    public int a;
    public awkp b;
    private byte d = (byte) 2;

    private awif() {
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
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001㔻㔻\u0001\u0000\u0000\u0001㔻Љ\u0001", new Object[]{"a", "b"});
            case 3:
                return new awif();
            case 4:
                return new awie();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (awif.class) {
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
        awif awif = new awif();
        c = awif;
        anxl.registerDefaultInstance(awif.class, awif);
    }
}
