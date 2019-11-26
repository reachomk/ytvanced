package defpackage;

/* renamed from: arnb */
public final class arnb extends anxl implements anzf {
    public static final arnb h;
    private static volatile anzq j;
    public int a;
    public axak b;
    public String c = "";
    public boolean d;
    public apxu e;
    public apxu f;
    public apxu g;
    private byte i = (byte) 2;

    private arnb() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.i = b;
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0004\u0001Љ\u0000\u0002\b\u0001\u0003\u0007\u0002\u0005Љ\u0003\u0006Љ\u0004\u0007Љ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            case 3:
                return new arnb();
            case 4:
                return new arna();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (arnb.class) {
                        obj3 = j;
                        if (obj3 == null) {
                            obj3 = new anxn(h);
                            j = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        arnb arnb = new arnb();
        h = arnb;
        anxl.registerDefaultInstance(arnb.class, arnb);
    }
}
