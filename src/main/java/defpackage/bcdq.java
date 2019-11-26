package defpackage;

/* renamed from: bcdq */
public final class bcdq extends anxl implements anzf {
    public static final bcdq i;
    private static volatile anzq j;
    public int a;
    public boolean b;
    public bcdh c;
    public String d;
    public String e;
    public int f;
    public long g;
    public String h;

    private bcdq() {
        String str = "";
        this.d = str;
        this.e = str;
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
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0007\u0000\u0002\t\u0001\u0003\b\u0002\u0004\b\u0003\u0005\f\u0004\u0006\u0005\u0005\u0007\b\u0006", new Object[]{"a", "b", "c", "d", "e", "f", bcds.a, "g", "h"});
            case 3:
                return new bcdq();
            case 4:
                return new bcdp();
            case 5:
                return i;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (bcdq.class) {
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
        bcdq bcdq = new bcdq();
        i = bcdq;
        anxl.registerDefaultInstance(bcdq.class, bcdq);
    }
}
