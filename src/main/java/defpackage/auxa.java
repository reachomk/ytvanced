package defpackage;

/* renamed from: auxa */
public final class auxa extends anxl implements anzf {
    public static final auxa f;
    private static volatile anzq h;
    public int a;
    public arwf b;
    public int c;
    public String d = "";
    public aodv e;
    private byte g = (byte) 2;

    private auxa() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0000\u0001\t\u0000\u0002\f\u0001\u0003\b\u0002\u0007\t\u0006", new Object[]{"a", "b", "c", auxe.a, "d", "e"});
            case 3:
                return new auxa();
            case 4:
                return new auxc();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (auxa.class) {
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
        auxa auxa = new auxa();
        f = auxa;
        anxl.registerDefaultInstance(auxa.class, auxa);
    }
}
