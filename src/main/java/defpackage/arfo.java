package defpackage;

/* renamed from: arfo */
public final class arfo extends anxl implements anzf {
    public static final arfo f;
    private static volatile anzq h;
    public int a;
    public String b = "";
    public int c;
    public arfy d;
    public arfw e;
    private byte g = (byte) 2;

    private arfo() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001\b\u0000\u0002\f\u0001\u0003Љ\u0003\u0005\t\u0004", new Object[]{"a", "b", "c", argd.a, "d", "e"});
            case 3:
                return new arfo();
            case 4:
                return new arfr();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (arfo.class) {
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
        arfo arfo = new arfo();
        f = arfo;
        anxl.registerDefaultInstance(arfo.class, arfo);
    }
}
