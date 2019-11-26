package defpackage;

/* renamed from: axsr */
public final class axsr extends anxl implements anzf {
    public static final axsr i;
    private static volatile anzq k;
    public int a;
    public arml b;
    public aygk c;
    public arml d;
    public axak e;
    public axak f;
    public boolean g;
    public boolean h;
    private byte j = (byte) 2;

    private axsr() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.j = b;
                return null;
            case 2:
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0005\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005\u0007\u0005\u0006Љ\u0004\u0007\u0007\u0006", new Object[]{"a", "b", "c", "d", "e", "g", "f", "h"});
            case 3:
                return new axsr();
            case 4:
                return new axsq();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (axsr.class) {
                        obj3 = k;
                        if (obj3 == null) {
                            obj3 = new anxn(i);
                            k = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static anzq a() {
        return i.getParserForType();
    }

    static {
        axsr axsr = new axsr();
        i = axsr;
        anxl.registerDefaultInstance(axsr.class, axsr);
    }
}
