package defpackage;

/* renamed from: axth */
public final class axth extends anxl implements anzf {
    public static final axth h;
    private static volatile anzq j;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public anyd e = anxl.emptyProtobufList();
    public arml f;
    public axak g;
    private byte i = (byte) 2;

    private axth() {
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0006\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Л\u0005Љ\u0003\u0006Љ\u0004", new Object[]{"a", "b", "c", "d", "e", aygk.class, "f", "g"});
            case 3:
                return new axth();
            case 4:
                return new axtg();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (axth.class) {
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
        axth axth = new axth();
        h = axth;
        anxl.registerDefaultInstance(axth.class, axth);
    }
}
