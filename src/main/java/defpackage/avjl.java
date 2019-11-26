package defpackage;

/* renamed from: avjl */
public final class avjl extends anxl implements anzf {
    public static final avjl e;
    private static volatile anzq g;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public anyd c = anxl.emptyProtobufList();
    public int d;
    private byte f = (byte) 2;

    private avjl() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0002\u0001Л\u0002Л\u0003\u000b\u0000", new Object[]{"a", "b", axak.class, "c", axak.class, "d"});
            case 3:
                return new avjl();
            case 4:
                return new avjk();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (avjl.class) {
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
        avjl avjl = new avjl();
        e = avjl;
        anxl.registerDefaultInstance(avjl.class, avjl);
    }
}
