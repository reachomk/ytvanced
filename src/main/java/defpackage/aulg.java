package defpackage;

/* renamed from: aulg */
public final class aulg extends anxl implements anzf {
    public static final aulg e;
    private static volatile anzq f;
    public int a;
    public String b = "";
    public int c;
    public anyd d = anxl.emptyProtobufList();

    private aulg() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\b\u0000\u0002\u0004\u0001\u0003\u001b", new Object[]{"a", "b", "c", "d", aula.class});
            case 3:
                return new aulg();
            case 4:
                return new auli();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (aulg.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
                            f = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aulg aulg = new aulg();
        e = aulg;
        anxl.registerDefaultInstance(aulg.class, aulg);
    }
}
