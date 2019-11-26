package defpackage;

/* renamed from: aucc */
public final class aucc extends anxl implements anzf {
    public static final aucc e;
    private static volatile anzq g;
    public int a;
    public int b = 0;
    public Object c;
    public aodx d;
    private byte f = (byte) 2;

    private aucc() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001<\u0000\u0002м\u0000\u0004\t\u0003", new Object[]{"c", "b", "a", arwf.class, aygk.class, "d"});
            case 3:
                return new aucc();
            case 4:
                return new aucb();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (aucc.class) {
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
        aucc aucc = new aucc();
        e = aucc;
        anxl.registerDefaultInstance(aucc.class, aucc);
    }
}
