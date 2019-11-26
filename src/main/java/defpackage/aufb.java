package defpackage;

/* renamed from: aufb */
public final class aufb extends anxl implements anzf {
    public static final aufb c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private aufb() {
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
                return anxl.newMessageInfo(c, "\u0001\u0003\u0001\u0000㰼媆\u0003\u0000\u0000\u0003㰼м\u0000㶈м\u0000媆м\u0000", new Object[]{"b", "a", arec.class, auck.class, aufl.class});
            case 3:
                return new aufb();
            case 4:
                return new aufe();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (aufb.class) {
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
        aufb aufb = new aufb();
        c = aufb;
        anxl.registerDefaultInstance(aufb.class, aufb);
    }
}
