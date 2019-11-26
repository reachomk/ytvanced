package defpackage;

/* renamed from: atvr */
public final class atvr extends anxl implements anzf {
    public static final atvr h;
    private static volatile anzq j;
    public int a;
    public atvp b;
    public atvt c;
    public aqca d;
    public atwd e;
    public axqh f;
    public arbs g;
    private byte i = (byte) 2;

    private atvr() {
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001ᵆ拄\u0006\u0000\u0000\u0006ᵆЉ\u0000⩩Љ\u0001㊈Љ\u0002䤳Љ\u0006廾Љ\u0004拄Љ\u0005", new Object[]{"a", "b", "c", "d", "g", "e", "f"});
            case 3:
                return new atvr();
            case 4:
                return new atvq();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (atvr.class) {
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
        atvr atvr = new atvr();
        h = atvr;
        anxl.registerDefaultInstance(atvr.class, atvr);
    }
}
