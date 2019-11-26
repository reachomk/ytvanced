package defpackage;

/* renamed from: ants */
public final class ants extends anxl implements anzf {
    public static final ants e;
    private static volatile anzq f;
    public String a;
    public String b;
    public String c;
    public aoaq d;

    private ants() {
        String str = "";
        this.a = str;
        this.b = str;
        this.c = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0004Ȉ", new Object[]{"a", "d", "c"});
            case 3:
                return new ants();
            case 4:
                return new antv();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (ants.class) {
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
        ants ants = new ants();
        e = ants;
        anxl.registerDefaultInstance(ants.class, ants);
    }
}
