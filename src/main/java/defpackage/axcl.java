package defpackage;

/* renamed from: axcl */
public final class axcl extends anxl implements anzf {
    public static final axcl i;
    private static volatile anzq j;
    public int a;
    public String b = "";
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public aqyr h;

    private axcl() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0000\u0001\b\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0004\f\u0003\u0005\f\u0004\u0007\u0007\u0006\t\t\b", new Object[]{"a", "b", "c", "d", "e", axci.a, "f", axcj.a, "g", "h"});
            case 3:
                return new axcl();
            case 4:
                return new axck();
            case 5:
                return i;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (axcl.class) {
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
        axcl axcl = new axcl();
        i = axcl;
        anxl.registerDefaultInstance(axcl.class, axcl);
    }
}
