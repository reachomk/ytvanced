package defpackage;

/* renamed from: avrl */
public final class avrl extends anxl implements anzf {
    public static final avrl e;
    private static volatile anzq g;
    public int a;
    public ashy b;
    public anyd c = anxl.emptyProtobufList();
    public long d;
    private byte f = (byte) 2;

    private avrl() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001Љ\u0000\u0002\u001b\u0003\u0002\u0001", new Object[]{"a", "b", "c", azcy.class, "d"});
            case 3:
                return new avrl();
            case 4:
                return new avrk();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (avrl.class) {
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
        avrl avrl = new avrl();
        e = avrl;
        anxl.registerDefaultInstance(avrl.class, avrl);
    }
}
