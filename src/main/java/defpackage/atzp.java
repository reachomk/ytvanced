package defpackage;

/* renamed from: atzp */
public final class atzp extends anxl implements anzf {
    public static final atzp a;
    public static final anxr b = anxl.newSingularGeneratedExtension(atzr.p, Boolean.valueOf(false), null, null, 116410864, aobm.BOOL, Boolean.class);
    public static final anxr c = anxl.newSingularGeneratedExtension(atzr.p, auac.LIKE, null, auac.d, 116390062, aobm.ENUM, auac.class);
    private static volatile anzq d;

    private atzp() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new atzp();
            case 4:
                return new atzo();
            case 5:
                return a;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (atzp.class) {
                        obj3 = d;
                        if (obj3 == null) {
                            obj3 = new anxn(a);
                            d = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        atzp atzp = new atzp();
        a = atzp;
        anxl.registerDefaultInstance(atzp.class, atzp);
    }
}
