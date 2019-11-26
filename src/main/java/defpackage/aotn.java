package defpackage;

/* renamed from: aotn */
public final class aotn extends anxl implements anzf {
    public static final anyb e = new aotq();
    public static final anyb g = new aotp();
    public static final aotn i;
    private static volatile anzq j;
    public int a;
    public boolean b;
    public int c;
    public anxz d = anxl.emptyIntList();
    public anxz f = anxl.emptyIntList();
    public boolean h;

    private aotn() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(i, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u0007\u0000\u0002\u0004\u0001\u0003\u001e\u0004\u001e\u0005\u0007\u0002", new Object[]{"a", "b", "c", "d", aotr.a(), "f", aotr.a(), "h"});
            case 3:
                return new aotn();
            case 4:
                return new aots();
            case 5:
                return i;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (aotn.class) {
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
        aotn aotn = new aotn();
        i = aotn;
        anxl.registerDefaultInstance(aotn.class, aotn);
    }
}
