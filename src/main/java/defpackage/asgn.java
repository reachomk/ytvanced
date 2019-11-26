package defpackage;

/* renamed from: asgn */
public final class asgn extends anxl implements anzf {
    public static final asgn e;
    private static volatile anzq g;
    public int a;
    public ashy b;
    public String c = "";
    public int d;
    private byte f = (byte) 2;

    private asgn() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0001\u0001Љ\u0000\u0002\b\u0001\u0005\f\u0003", new Object[]{"a", "b", "c", "d", avuq.a});
            case 3:
                return new asgn();
            case 4:
                return new asgm();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (asgn.class) {
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
        asgn asgn = new asgn();
        e = asgn;
        anxl.registerDefaultInstance(asgn.class, asgn);
    }
}
