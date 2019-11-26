package defpackage;

/* renamed from: aodj */
public final class aodj extends anxl implements anzf {
    public static final aodj i;
    private static volatile anzq j;
    public int a;
    public int b;
    public anxz c = anxl.emptyIntList();
    public int d;
    public String e;
    public int f;
    public String g;
    public String h;

    private aodj() {
        String str = "";
        this.e = str;
        this.g = str;
        this.h = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0000\u0001\f\u0000\u0002\u001e\u0003\f\u0001\u0005\b\u0003\u0006\f\u0004\u0007\b\u0005\b\b\u0006", new Object[]{"a", "b", aodk.a, "c", aode.a(), "d", aodk.a, "e", "f", aodg.a(), "g", "h"});
            case 3:
                return new aodj();
            case 4:
                return new aodm();
            case 5:
                return i;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (aodj.class) {
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
        aodj aodj = new aodj();
        i = aodj;
        anxl.registerDefaultInstance(aodj.class, aodj);
    }
}
