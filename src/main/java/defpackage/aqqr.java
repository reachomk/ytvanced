package defpackage;

/* renamed from: aqqr */
public final class aqqr extends anxl implements anzf {
    public static final aqqr g;
    private static volatile anzq i;
    public int a;
    public axak b;
    public axak c;
    public axak d;
    public axak e;
    public axak f;
    private byte h = (byte) 2;

    private aqqr() {
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0004\n\u0005\u0000\u0000\u0005\u0004Љ\u0000\u0005Љ\u0001\u0006Љ\u0002\tЉ\u0003\nЉ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new aqqr();
            case 4:
                return new aqqt();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (aqqr.class) {
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
        aqqr aqqr = new aqqr();
        g = aqqr;
        anxl.registerDefaultInstance(aqqr.class, aqqr);
    }
}
