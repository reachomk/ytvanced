package defpackage;

/* renamed from: atlp */
public final class atlp extends anxl implements anzf {
    public static final atlp e;
    private static volatile anzq g;
    public int a;
    public ashy b;
    public anyd c = anxl.emptyProtobufList();
    public anyd d = anxl.emptyProtobufList();
    private byte f = (byte) 2;

    private atlp() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0002\u0001\u0001Љ\u0000\u0002\u001b\u0004\u001a", new Object[]{"a", "b", "c", ayuf.class, "d"});
            case 3:
                return new atlp();
            case 4:
                return new atls();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (atlp.class) {
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
        atlp atlp = new atlp();
        e = atlp;
        anxl.registerDefaultInstance(atlp.class, atlp);
    }
}
