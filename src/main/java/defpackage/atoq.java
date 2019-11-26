package defpackage;

/* renamed from: atoq */
public final class atoq extends anxl implements anzf {
    public static final atoq c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private atoq() {
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
                return anxl.newMessageInfo(c, "\u0001\u0005\u0001\u0000ᾮ㳩\u0005\u0000\u0000\u0005ᾮм\u0000ⓣм\u0000┢м\u0000㘿м\u0000㳩м\u0000", new Object[]{"b", "a", auvn.class, axoi.class, avum.class, axav.class, atxs.class});
            case 3:
                return new atoq();
            case 4:
                return new atop();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (atoq.class) {
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
        atoq atoq = new atoq();
        c = atoq;
        anxl.registerDefaultInstance(atoq.class, atoq);
    }
}
