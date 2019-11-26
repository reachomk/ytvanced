package defpackage;

/* renamed from: aoyg */
public final class aoyg extends anxl implements anzf {
    public static final aoyg e;
    private static volatile anzq f;
    public int a;
    public String b;
    public String c;
    public boolean d;

    private aoyg() {
        String str = "";
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0004\u0006\u0003\u0000\u0000\u0000\u0004\b\u0000\u0005\b\u0001\u0006\u0007\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new aoyg();
            case 4:
                return new aoyf();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (aoyg.class) {
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
        aoyg aoyg = new aoyg();
        e = aoyg;
        anxl.registerDefaultInstance(aoyg.class, aoyg);
    }
}
