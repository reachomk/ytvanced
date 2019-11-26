package defpackage;

/* renamed from: axrl */
public final class axrl extends anxl implements anzf {
    public static final axrl i;
    private static volatile anzq j;
    public int a;
    public int b;
    public String c;
    public int d;
    public boolean e;
    public String f;
    public String g;
    public int h;

    private axrl() {
        String str = "";
        this.c = str;
        this.f = str;
        this.g = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\f\u0000\u0002\b\u0001\u0003\f\u0002\u0004\u0007\u0003\u0005\b\u0004\u0006\b\u0005\u0007\u0004\u0006", new Object[]{"a", "b", axrz.a, "c", "d", axrw.a, "e", "f", "g", "h"});
            case 3:
                return new axrl();
            case 4:
                return new axrk();
            case 5:
                return i;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (axrl.class) {
                        obj3 = j;
                        if (obj3 == null) {
                            obj3 = new anxn(i);
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
        axrl axrl = new axrl();
        i = axrl;
        anxl.registerDefaultInstance(axrl.class, axrl);
    }
}
