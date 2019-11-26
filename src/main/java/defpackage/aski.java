package defpackage;

/* renamed from: aski */
public final class aski extends anxl implements anzf {
    public static final aski e;
    private static volatile anzq g;
    public int a;
    public asic b;
    public int c;
    public anyd d = anxl.emptyProtobufList();
    private byte f = (byte) 2;

    private aski() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0001\u0001Љ\u0000\u0003\f\u0001\u0005\u001b", new Object[]{"a", "b", "c", awxc.a, "d", askk.class});
            case 3:
                return new aski();
            case 4:
                return new askl();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (aski.class) {
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
        aski aski = new aski();
        e = aski;
        anxl.registerDefaultInstance(aski.class, aski);
    }
}
