package defpackage;

/* renamed from: aszm */
public final class aszm extends anxl implements anzf {
    public static final aszm c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private aszm() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.d = b;
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0002\u0001\u0000㣚ﺷ䃢\u0002\u0000\u0000\u0002㣚м\u0000ﺷ䃢м\u0000", new Object[]{"b", "a", axxl.class, axxd.class});
            case 3:
                return new aszm();
            case 4:
                return new aszl();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (aszm.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
                            e = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aszm aszm = new aszm();
        c = aszm;
        anxl.registerDefaultInstance(aszm.class, aszm);
    }
}
