package defpackage;

/* renamed from: awxi */
public final class awxi extends anxl implements anzf {
    public static final awxi d;
    private static volatile anzq f;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public anvu c = anvu.a;
    private byte e = (byte) 2;

    private awxi() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.e = b;
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0001\u0001Л\u0003\n\u0001", new Object[]{"a", "b", axak.class, "c"});
            case 3:
                return new awxi();
            case 4:
                return new awxl();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (awxi.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            f = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static anzq a() {
        return d.getParserForType();
    }

    static {
        awxi awxi = new awxi();
        d = awxi;
        anxl.registerDefaultInstance(awxi.class, awxi);
    }
}
