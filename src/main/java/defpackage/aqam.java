package defpackage;

/* renamed from: aqam */
public final class aqam extends anxl implements anzf {
    public static final aqam h;
    private static volatile anzq j;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public arml e;
    public arml f;
    public arml g;
    private byte i = (byte) 2;

    private aqam() {
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0006\u0001Љ\u0000\u0002Љ\u0001\u0004Љ\u0003\u0005Љ\u0004\u0006Љ\u0005\u0007Љ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            case 3:
                return new aqam();
            case 4:
                return new aqap();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (aqam.class) {
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
        aqam aqam = new aqam();
        h = aqam;
        anxl.registerDefaultInstance(aqam.class, aqam);
    }
}
