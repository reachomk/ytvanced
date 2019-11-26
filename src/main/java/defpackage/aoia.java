package defpackage;

/* renamed from: aoia */
public final class aoia extends anxl implements anzf {
    public static final aoia e;
    private static volatile anzq g;
    public int a;
    public int b = 0;
    public Object c;
    public arml d;
    private byte f = (byte) 2;

    private aoia() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0001\u0001\u0001\t\u0003\u0000\u0000\u0001\u0001=\u0000\u0005Љ\u0005\t;\u0000", new Object[]{"c", "b", "a", "d"});
            case 3:
                return new aoia();
            case 4:
                return new aoid();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (aoia.class) {
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
        aoia aoia = new aoia();
        e = aoia;
        anxl.registerDefaultInstance(aoia.class, aoia);
    }
}
