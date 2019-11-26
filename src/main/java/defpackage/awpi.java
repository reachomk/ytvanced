package defpackage;

/* renamed from: awpi */
public final class awpi extends anxl implements anzf {
    public static final awpi j;
    private static volatile anzq l;
    public int a;
    public axak b;
    public axak c;
    public awqw d;
    public awqw e;
    public apxu f;
    public aygk g;
    public apxu h;
    public arml i;
    private byte k = (byte) 2;

    private awpi() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.k = b;
                return null;
            case 2:
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0006\u0001Љ\u0000\u0002Љ\u0001\u0003\t\u0002\u0004\t\u0003\u0005Љ\u0004\u0006Љ\u0005\u0007Љ\u0006\bЉ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new awpi();
            case 4:
                return new awpl();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (awpi.class) {
                        obj3 = l;
                        if (obj3 == null) {
                            obj3 = new anxn(j);
                            l = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        awpi awpi = new awpi();
        j = awpi;
        anxl.registerDefaultInstance(awpi.class, awpi);
    }
}
