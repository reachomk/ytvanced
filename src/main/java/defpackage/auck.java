package defpackage;

/* renamed from: auck */
public final class auck extends anxl implements anzf {
    public static final auck e;
    private static volatile anzq g;
    public int a;
    public String b = "";
    public anyd c = anxl.emptyProtobufList();
    public aphj d;
    private byte f = (byte) 2;

    private auck() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001\b\u0000\u0002Л\u0003Љ\u0001", new Object[]{"a", "b", "c", auci.class, "d"});
            case 3:
                return new auck();
            case 4:
                return new aucj();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (auck.class) {
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
        auck auck = new auck();
        e = auck;
        anxl.registerDefaultInstance(auck.class, auck);
    }
}
