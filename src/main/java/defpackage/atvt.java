package defpackage;

/* renamed from: atvt */
public final class atvt extends anxl implements anzf {
    public static final atvt e;
    private static volatile anzq g;
    public int a;
    public arml b;
    public atvx c;
    public anyd d = anxl.emptyProtobufList();
    private byte f = (byte) 2;

    private atvt() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.f = b;
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0001\u0003\u0003Љ\u0002\u0004Љ\u0003\u0005Л", new Object[]{"a", "b", "c", "d", aphj.class});
            case 3:
                return new atvt();
            case 4:
                return new atvs();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (atvt.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
                            g = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        atvt atvt = new atvt();
        e = atvt;
        anxl.registerDefaultInstance(atvt.class, atvt);
    }
}
