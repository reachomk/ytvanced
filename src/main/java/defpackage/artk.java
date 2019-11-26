package defpackage;

/* renamed from: artk */
public final class artk extends anxl implements anzf {
    public static final artk f;
    private static volatile anzq h;
    public int a;
    public int b = 0;
    public Object c;
    public arwf d;
    public aodv e;
    private byte g = (byte) 2;

    private artk() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001\t\u0000\u0002м\u0000\u0003м\u0000\u0004\t\u0003", new Object[]{"c", "b", "a", "d", apxu.class, apxu.class, "e"});
            case 3:
                return new artk();
            case 4:
                return new artj();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (artk.class) {
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
        artk artk = new artk();
        f = artk;
        anxl.registerDefaultInstance(artk.class, artk);
    }
}
