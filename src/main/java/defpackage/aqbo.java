package defpackage;

/* renamed from: aqbo */
public final class aqbo extends anxl implements anzf {
    public static final aqbo e;
    private static volatile anzq g;
    public int a;
    public aqcd b;
    public aqbm c;
    public aqbq d;
    private byte f = (byte) 2;

    private aqbo() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0000\u0003\u0003Љ\u0000\u0004Љ\u0001\u0005Љ\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new aqbo();
            case 4:
                return new aqbn();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (aqbo.class) {
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
        aqbo aqbo = new aqbo();
        e = aqbo;
        anxl.registerDefaultInstance(aqbo.class, aqbo);
    }
}
