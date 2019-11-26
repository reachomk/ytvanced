package defpackage;

/* renamed from: axif */
public final class axif extends anxl implements anzf {
    public static final axif h;
    private static volatile anzq j;
    public int a;
    public int b;
    public arml c;
    public aygk d;
    public apxu e;
    public apxu f;
    public anvu g = anvu.a;
    private byte i = (byte) 2;

    private axif() {
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0004\u0001\u0004\u0001\u0002Љ\u0002\u0003Љ\u0004\u0004Љ\u0005\u0005Љ\u0003\b\n\u0007", new Object[]{"a", "b", "c", "e", "f", "d", "g"});
            case 3:
                return new axif();
            case 4:
                return new axii();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (axif.class) {
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
        axif axif = new axif();
        h = axif;
        anxl.registerDefaultInstance(axif.class, axif);
    }
}
