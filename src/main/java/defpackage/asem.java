package defpackage;

/* renamed from: asem */
public final class asem extends anxl implements anzf {
    public static final asem h;
    private static volatile anzq j;
    public int a;
    public ashy b;
    public aseq c;
    public aseu d;
    public ases e;
    public asfa f;
    public int g;
    private byte i = (byte) 2;

    private asem() {
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0001\u0001Љ\u0000\u0002\t\u0001\u0003\t\u0002\u0004\t\u0003\u0005\t\u0004\u0007\f\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g", avuq.a});
            case 3:
                return new asem();
            case 4:
                return new asep();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (asem.class) {
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
        asem asem = new asem();
        h = asem;
        anxl.registerDefaultInstance(asem.class, asem);
    }
}
