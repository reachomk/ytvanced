package defpackage;

/* renamed from: axop */
public final class axop extends anxl implements anzf {
    public static final axop e;
    private static volatile anzq g;
    public int a;
    public axak b;
    public axak c;
    public aoje d;
    private byte f = (byte) 2;

    private axop() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\t\u0003\u0000\u0000\u0003\u0001Љ\u0000\u0002Љ\u0001\tЉ\u0006", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new axop();
            case 4:
                return new axor();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (axop.class) {
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
        axop axop = new axop();
        e = axop;
        anxl.registerDefaultInstance(axop.class, axop);
    }
}
