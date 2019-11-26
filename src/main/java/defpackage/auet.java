package defpackage;

/* renamed from: auet */
public final class auet extends anxl implements anzf {
    public static final auet c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private auet() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.d = b;
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0001\u0000ﮓ㼭ﮓ㼭\u0001\u0000\u0000\u0001ﮓ㼭м\u0000", new Object[]{"b", "a", aued.class});
            case 3:
                return new auet();
            case 4:
                return new auew();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (auet.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
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
        auet auet = new auet();
        c = auet;
        anxl.registerDefaultInstance(auet.class, auet);
    }
}
