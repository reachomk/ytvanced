package defpackage;

/* renamed from: awfu */
public final class awfu extends anxl implements anzf {
    public static final awfu e;
    private static volatile anzq g;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public arml c;
    public anvu d = anvu.a;
    private byte f = (byte) 2;

    private awfu() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0002\u0001Л\u0002Љ\u0000\u0004\n\u0002", new Object[]{"a", "b", awfw.class, "c", "d"});
            case 3:
                return new awfu();
            case 4:
                return new awfx();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (awfu.class) {
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
        awfu awfu = new awfu();
        e = awfu;
        anxl.registerDefaultInstance(awfu.class, awfu);
    }
}
