package defpackage;

/* renamed from: anep */
public final class anep extends anxl implements anzf {
    public static final anep e;
    private static volatile anzq f;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public anfq c;
    public float d;

    static {
        anep anep = new anep();
        e = anep;
        anxl.registerDefaultInstance(anep.class, anep);
    }

    private anep() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\t\u0000\u0003\u0001\u0001", new Object[]{"a", "b", anfq.class, "c", "d"});
            case 3:
                return new anep();
            case 4:
                return new anes();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (anep.class) {
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
}
