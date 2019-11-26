package defpackage;

/* renamed from: aycn */
public final class aycn extends anxl implements anzf {
    public static final aycn i;
    private static volatile anzq j;
    public int a;
    public int b;
    public aycj c;
    public aych d;
    public anvu e = anvu.a;
    public aycf f;
    public anyd g = anxl.emptyProtobufList();
    public aoqv h;

    private aycn() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\f\u0007\u0000\u0001\u0000\u0001\f\u0000\u0002\t\u0001\u0003\t\u0002\u0004\n\u0003\t\t\u0006\n\u001b\f\t\b", new Object[]{"a", "b", ayct.a, "c", "d", "e", "f", "g", aque.class, "h"});
            case 3:
                return new aycn();
            case 4:
                return new aycm();
            case 5:
                return i;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (aycn.class) {
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
        aycn aycn = new aycn();
        i = aycn;
        anxl.registerDefaultInstance(aycn.class, aycn);
    }
}
