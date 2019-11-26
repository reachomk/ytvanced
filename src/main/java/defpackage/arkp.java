package defpackage;

/* renamed from: arkp */
public final class arkp extends anxl implements anzf {
    public static final arkp i;
    private static volatile anzq j;
    public int a;
    public int b = 1;
    public arkr c;
    public String d;
    public String e;
    public long f;
    public String g;
    public String h;

    private arkp() {
        String str = "";
        this.d = str;
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
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\b\u0002\u0004\b\u0003\u0005\u0002\u0004\u0006\b\u0005\u0007\b\u0006", new Object[]{"a", "b", arks.a, "c", "d", "e", "f", "g", "h"});
            case 3:
                return new arkp();
            case 4:
                return new arko();
            case 5:
                return i;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (arkp.class) {
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
        arkp arkp = new arkp();
        i = arkp;
        anxl.registerDefaultInstance(arkp.class, arkp);
    }
}
