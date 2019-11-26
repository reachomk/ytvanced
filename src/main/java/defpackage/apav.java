package defpackage;

/* renamed from: apav */
public final class apav extends anxl implements anzf {
    public static final apav c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private apav() {
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
                return anxl.newMessageInfo(c, "\u0001\u0002\u0001\u0000䂎䑺\u0002\u0000\u0000\u0001䂎<\u0000䑺м\u0000", new Object[]{"b", "a", apat.class, apax.class});
            case 3:
                return new apav();
            case 4:
                return new apau();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (apav.class) {
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
        apav apav = new apav();
        c = apav;
        anxl.registerDefaultInstance(apav.class, apav);
    }
}
