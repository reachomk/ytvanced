package defpackage;

/* renamed from: arno */
public final class arno extends anxl implements anzf {
    public static final arno e;
    private static volatile anzq g;
    public int a;
    public int b = 0;
    public Object c;
    public axak d;
    private byte f = (byte) 2;

    private arno() {
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(e, "\u0001\u0004\u0001\u0001\u0001\u000e\u0004\u0000\u0000\u0004\u0001Љ\u0000\u0002м\u0000\rм\u0000\u000eм\u0000", new Object[]{"c", "b", "a", "d", apxu.class, apxu.class, axak.class});
            case 3:
                return new arno();
            case 4:
                return new arnn();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (arno.class) {
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
        arno arno = new arno();
        e = arno;
        anxl.registerDefaultInstance(arno.class, arno);
    }
}
