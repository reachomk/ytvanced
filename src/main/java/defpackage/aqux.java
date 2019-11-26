package defpackage;

/* renamed from: aqux */
public final class aqux extends anxl implements anzf {
    public static final aqux e;
    private static volatile anzq g;
    public int a;
    public arml b;
    public apxu c;
    public axak d;
    private byte f = (byte) 2;

    private aqux() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0003\u0007\u0003\u0000\u0000\u0003\u0003Љ\u0002\u0004Љ\u0003\u0007Љ\u0004", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new aqux();
            case 4:
                return new aqva();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (aqux.class) {
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
        aqux aqux = new aqux();
        e = aqux;
        anxl.registerDefaultInstance(aqux.class, aqux);
    }
}
