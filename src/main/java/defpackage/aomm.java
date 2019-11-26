package defpackage;

/* renamed from: aomm */
public final class aomm extends anxl implements anzf {
    public static final aomm g;
    private static volatile anzq i;
    public int a;
    public int b = 0;
    public Object c;
    public aygk d;
    public arml e;
    public anvu f = anvu.a;
    private byte h = (byte) 2;

    private aomm() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.h = b;
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0001\u0001\u0001\u0006\u0005\u0000\u0000\u0004\u0001Љ\u0000\u0002Љ\u0001\u0003м\u0000\u0004м\u0000\u0006\n\u0005", new Object[]{"c", "b", "a", "d", "e", apxu.class, apxu.class, "f"});
            case 3:
                return new aomm();
            case 4:
                return new aoml();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (aomm.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
                            i = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aomm aomm = new aomm();
        g = aomm;
        anxl.registerDefaultInstance(aomm.class, aomm);
    }
}
