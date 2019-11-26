package defpackage;

/* renamed from: apmc */
public final class apmc extends anxl implements anzf {
    public static final apmc f;
    private static volatile anzq h;
    public int a;
    public aphv b;
    public aphg c;
    public axxl d;
    public axxd e;
    private byte g = (byte) 2;

    private apmc() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001ἑﺷ䃢\u0004\u0000\u0000\u0004ἑЉ\u0001☢Љ\u0000㣚Љ\u0002ﺷ䃢Љ\u0003", new Object[]{"a", "c", "b", "d", "e"});
            case 3:
                return new apmc();
            case 4:
                return new apmf();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (apmc.class) {
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
        apmc apmc = new apmc();
        f = apmc;
        anxl.registerDefaultInstance(apmc.class, apmc);
    }
}
