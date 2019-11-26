package defpackage;

/* renamed from: axoq */
public final class axoq extends anxl implements anzf {
    public static final axoq h;
    private static volatile anzq j;
    public int a;
    public axos b;
    public aokm c;
    public axak d;
    public anvu e = anvu.a;
    public ayiv f;
    public aoje g;
    private byte i = (byte) 2;

    private axoq() {
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0003\u0001\t\u0000\u0002Љ\u0001\u0006\n\u0004\u0007Љ\u0002\b\t\u0005\tЉ\u0006", new Object[]{"a", "b", "c", "e", "d", "f", "g"});
            case 3:
                return new axoq();
            case 4:
                return new axot();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (axoq.class) {
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
        axoq axoq = new axoq();
        h = axoq;
        anxl.registerDefaultInstance(axoq.class, axoq);
    }
}
