package defpackage;

/* renamed from: armh */
public final class armh extends anxl implements anzf {
    public static final armh d;
    private static volatile anzq e;
    public int a;
    public apfb b;
    public int c;

    private armh() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0000\u0002\f\u0001", new Object[]{"a", "b", "c", arme.a});
            case 3:
                return new armh();
            case 4:
                return new armg();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (armh.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
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
        armh armh = new armh();
        d = armh;
        anxl.registerDefaultInstance(armh.class, armh);
    }
}
