package defpackage;

/* renamed from: axqn */
public final class axqn extends anxl implements anzf {
    public static final axqn f;
    private static volatile anzq h;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public String c = "";
    public arwf d;
    public aodx e;
    private byte g = (byte) 2;

    private axqn() {
    }

    public final void a() {
        if (!this.b.a()) {
            this.b = anxl.mutableCopy(this.b);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.g = b;
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001Л\u0002\b\u0000\u0003\t\u0001\u0004\t\u0002", new Object[]{"a", "b", axql.class, "c", "d", "e"});
            case 3:
                return new axqn();
            case 4:
                return new axqm();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (axqn.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            h = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        axqn axqn = new axqn();
        f = axqn;
        anxl.registerDefaultInstance(axqn.class, axqn);
    }
}
