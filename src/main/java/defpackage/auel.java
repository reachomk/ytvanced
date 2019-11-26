package defpackage;

/* renamed from: auel */
public final class auel extends anxl implements anzf {
    public static final auel g;
    private static volatile anzq i;
    public int a;
    public int b = 0;
    public Object c;
    public String d = "";
    public arml e;
    public axak f;
    private byte h = (byte) 2;

    private auel() {
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0001\u0001\u0001\u0006\u0005\u0000\u0000\u0003\u0001\b\u0000\u0003<\u0000\u0004м\u0000\u0005Љ\u0004\u0006Љ\u0005", new Object[]{"c", "b", "a", "d", arwf.class, axak.class, "e", "f"});
            case 3:
                return new auel();
            case 4:
                return new auek();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (auel.class) {
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
        auel auel = new auel();
        g = auel;
        anxl.registerDefaultInstance(auel.class, auel);
    }
}
