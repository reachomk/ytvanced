package defpackage;

/* renamed from: anuy */
public final class anuy extends anxl implements anzf {
    public static final anuy e;
    private static volatile anzq g;
    public int a;
    public int b;
    public String c = "";
    public aodl d;
    private byte f = (byte) 2;

    private anuy() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001\u0004\u0000\u0003\b\u0002\u0004Љ\u0004", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new anuy();
            case 4:
                return new anux();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (anuy.class) {
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
        anuy anuy = new anuy();
        e = anuy;
        anxl.registerDefaultInstance(anuy.class, anuy);
    }
}
