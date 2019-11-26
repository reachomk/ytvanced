package defpackage;

/* renamed from: asyy */
public final class asyy extends anxl implements anzf {
    public static final asyy e;
    private static volatile anzq g;
    public int a;
    public asic b;
    public anyd c = anxl.emptyProtobufList();
    public aphj d;
    private byte f = (byte) 2;

    private asyy() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0003\u0001Љ\u0000\u0003Л\u0004Љ\u0001", new Object[]{"a", "b", "c", apxu.class, "d"});
            case 3:
                return new asyy();
            case 4:
                return new asyx();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (asyy.class) {
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
        asyy asyy = new asyy();
        e = asyy;
        anxl.registerDefaultInstance(asyy.class, asyy);
    }
}
