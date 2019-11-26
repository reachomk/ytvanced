package defpackage;

/* renamed from: amor */
public final class amor extends anxl implements anzf {
    public static final amor c;
    private static volatile anzq d;
    public String a;
    public String b;

    private amor() {
        String str = "";
        this.a = str;
        this.b = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new amor();
            case 4:
                return new amou();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (amor.class) {
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
        amor amor = new amor();
        c = amor;
        anxl.registerDefaultInstance(amor.class, amor);
    }
}
