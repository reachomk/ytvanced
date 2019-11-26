package defpackage;

/* renamed from: axxt */
public final class axxt extends anxl implements anzf {
    public static final axxt i;
    private static volatile anzq k;
    public int a;
    public arml b;
    public arwf c;
    public apxu d;
    public boolean e;
    public boolean f;
    public anvu g = anvu.a;
    public aodx h;
    private byte j = (byte) 2;

    private axxt() {
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
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0002\u0001Љ\u0000\u0002\t\u0001\u0003Љ\u0002\u0006\n\u0006\u0007\u0007\u0003\b\u0007\u0004\t\t\u0007", new Object[]{"a", "b", "c", "d", "g", "e", "f", "h"});
            case 3:
                return new axxt();
            case 4:
                return new axxs();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (axxt.class) {
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

    static {
        axxt axxt = new axxt();
        i = axxt;
        anxl.registerDefaultInstance(axxt.class, axxt);
    }
}
