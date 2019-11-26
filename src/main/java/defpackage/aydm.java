package defpackage;

/* renamed from: aydm */
public final class aydm extends anxl implements anzf {
    public static final aydm i;
    private static volatile anzq j;
    public int a;
    public boolean b;
    public aydg c;
    public aydk d;
    public ayde e;
    public aydc f;
    public ayda g;
    public aycw h;

    private aydm() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\r\u0007\u0000\u0000\u0000\u0001\u0007\u0000\u0002\t\u0001\u0003\t\u0004\u0004\t\u0006\b\t\b\t\t\t\r\t\f", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new aydm();
            case 4:
                return new aydp();
            case 5:
                return i;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (aydm.class) {
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
        aydm aydm = new aydm();
        i = aydm;
        anxl.registerDefaultInstance(aydm.class, aydm);
    }
}
