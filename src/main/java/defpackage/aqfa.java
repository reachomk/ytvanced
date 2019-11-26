package defpackage;

/* renamed from: aqfa */
public final class aqfa extends anxl implements anzf {
    public static final aqfa f;
    private static volatile anzq h;
    public int a;
    public apps b;
    public awkr c;
    public awkt d;
    public arwj e;
    private byte g = (byte) 2;

    private aqfa() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.g = b;
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001ᜤⴙ\u0004\u0000\u0000\u0003ᜤЉ\u0001ᜫЉ\u0000⊉Љ\u0002ⴙ\t\u0007", new Object[]{"a", "c", "b", "d", "e"});
            case 3:
                return new aqfa();
            case 4:
                return new aqez();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (aqfa.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            h = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aqfa aqfa = new aqfa();
        f = aqfa;
        anxl.registerDefaultInstance(aqfa.class, aqfa);
    }
}
