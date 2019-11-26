package defpackage;

/* renamed from: aqia */
public final class aqia extends anxl implements anzf {
    public static final aqia h;
    private static volatile anzq j;
    public int a;
    public arml b;
    public arml c;
    public apxu d;
    public arml e;
    public aphj f;
    public aphj g;
    private byte i = (byte) 2;

    private aqia() {
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0006\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0003\u0004Љ\u0004\u0005Љ\u0005\tЉ\u0002", new Object[]{"a", "b", "c", "e", "f", "g", "d"});
            case 3:
                return new aqia();
            case 4:
                return new aqhz();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (aqia.class) {
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
        aqia aqia = new aqia();
        h = aqia;
        anxl.registerDefaultInstance(aqia.class, aqia);
    }
}
