package defpackage;

/* renamed from: auuz */
public final class auuz extends anxl implements anzf {
    public static final auuz f;
    private static volatile anzq h;
    public int a;
    public int b = 0;
    public Object c;
    public arwf d;
    public aqhr e;
    private byte g = (byte) 2;

    private auuz() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001м\u0000\u0002\t\u0002\u0003Љ\u0003\u0004м\u0000", new Object[]{"c", "b", "a", arml.class, "d", "e", armr.class});
            case 3:
                return new auuz();
            case 4:
                return new auuy();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (auuz.class) {
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
        auuz auuz = new auuz();
        f = auuz;
        anxl.registerDefaultInstance(auuz.class, auuz);
    }
}
