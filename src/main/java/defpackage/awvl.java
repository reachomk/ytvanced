package defpackage;

/* renamed from: awvl */
public final class awvl extends anxp implements anzf {
    public static final awvl g;
    private static volatile anzq j;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public apxu e;
    public axak f;
    private byte i = (byte) 2;

    private awvl() {
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0003\t\u0005\u0000\u0000\u0005\u0003Љ\u0005\u0005Љ\u0006\u0006Љ\u0007\u0007Љ\b\tЉ\t", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new awvl();
            case 4:
                return new awvo();
            case 5:
                return g;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (awvl.class) {
                        obj3 = j;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
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
        awvl awvl = new awvl();
        g = awvl;
        anxl.registerDefaultInstance(awvl.class, awvl);
    }
}
