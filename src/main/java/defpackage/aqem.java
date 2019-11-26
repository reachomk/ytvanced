package defpackage;

/* renamed from: aqem */
public final class aqem extends anxl implements anzf {
    public static final aqem e;
    private static volatile anzq g;
    public int a;
    public arml b;
    public arml c;
    public apxu d;
    private byte f = (byte) 2;

    private aqem() {
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0003\u0007\u0003\u0000\u0000\u0003\u0003Љ\u0000\u0005Љ\u0003\u0007Љ\u0001", new Object[]{"a", "b", "d", "c"});
            case 3:
                return new aqem();
            case 4:
                return new aqel();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (aqem.class) {
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
        aqem aqem = new aqem();
        e = aqem;
        anxl.registerDefaultInstance(aqem.class, aqem);
    }
}
