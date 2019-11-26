package defpackage;

/* renamed from: atqy */
public final class atqy extends anxl implements anzf {
    public static final atqy e;
    private static volatile anzq g;
    public int a;
    public arml b;
    public anyd c = anxl.emptyProtobufList();
    public aodx d;
    private byte f = (byte) 2;

    private atqy() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0001\u0002\u0002Љ\u0001\u0004Л\u0005\t\u0003", new Object[]{"a", "b", "c", atra.class, "d"});
            case 3:
                return new atqy();
            case 4:
                return new atrb();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (atqy.class) {
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
        atqy atqy = new atqy();
        e = atqy;
        anxl.registerDefaultInstance(atqy.class, atqy);
    }
}
