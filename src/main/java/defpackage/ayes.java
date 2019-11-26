package defpackage;

/* renamed from: ayes */
public final class ayes extends anxl implements anzf {
    public static final ayes e;
    private static volatile anzq f;
    public int a;
    public String b;
    public String c;
    public anyy d = anyy.b;

    private ayes() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u0001\b\u0000\u00022\u0003\b\u0001", new Object[]{"a", "b", "d", ayeu.a, "c"});
            case 3:
                return new ayes();
            case 4:
                return new ayer();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (ayes.class) {
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
        ayes ayes = new ayes();
        e = ayes;
        anxl.registerDefaultInstance(ayes.class, ayes);
    }
}
