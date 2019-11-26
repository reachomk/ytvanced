package defpackage;

/* renamed from: aqbe */
public final class aqbe extends anxl implements anzf {
    public static final aqbe h;
    private static volatile anzq j;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public apxu e;
    public aphj f;
    public aqbg g;
    private byte i = (byte) 2;

    private aqbe() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0003\f\u0006\u0000\u0000\u0006\u0003Љ\u0000\u0006Љ\u0005\u0007Љ\u0001\bЉ\u0006\nЉ\u0002\fЉ\u0007", new Object[]{"a", "b", "e", "c", "f", "d", "g"});
            case 3:
                return new aqbe();
            case 4:
                return new aqbd();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (aqbe.class) {
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
        aqbe aqbe = new aqbe();
        h = aqbe;
        anxl.registerDefaultInstance(aqbe.class, aqbe);
    }
}
