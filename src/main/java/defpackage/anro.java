package defpackage;

/* renamed from: anro */
public final class anro extends anxl implements anzf {
    public static final anro c;
    private static volatile anzq d;
    public int a = 0;
    public Object b;

    private anro() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001;\u0000\u00027\u0000\u0003:\u0000", new Object[]{"b", "a"});
            case 3:
                return new anro();
            case 4:
                return new anrr();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (anro.class) {
                        obj3 = d;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
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
        anro anro = new anro();
        c = anro;
        anxl.registerDefaultInstance(anro.class, anro);
    }
}
