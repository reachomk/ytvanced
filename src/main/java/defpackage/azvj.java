package defpackage;

/* renamed from: azvj */
public final class azvj extends anxl implements anzf {
    public static final azvj c;
    public static final anxr d;
    private static volatile anzq e;
    public int a;
    public azvf b;

    private azvj() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t\u0000", new Object[]{"a", "b"});
            case 3:
                return new azvj();
            case 4:
                return new azvi();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (azvj.class) {
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
        azvj azvj = new azvj();
        c = azvj;
        anxl.registerDefaultInstance(azvj.class, azvj);
        azvl azvl = azvl.a;
        azvj azvj2 = c;
        d = anxl.newSingularGeneratedExtension(azvl, azvj2, azvj2, null, 193804845, aobm.MESSAGE, azvj.class);
    }
}
