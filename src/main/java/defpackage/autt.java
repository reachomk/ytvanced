package defpackage;

/* renamed from: autt */
public final class autt extends anxl implements anzf {
    public static final autt i;
    private static volatile anzq j;
    public int a;
    public aure b;
    public String c;
    public int d;
    public String e;
    public int f;
    public String g;
    public boolean h;

    private autt() {
        String str = "";
        this.c = str;
        this.e = str;
        this.g = str;
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\t\u0000\u0002\b\u0001\u0003\u0004\u0002\u0004\b\u0003\u0005\u0004\u0004\u0006\b\u0005\u0007\u0007\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new autt();
            case 4:
                return new auts();
            case 5:
                return i;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (autt.class) {
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
        autt autt = new autt();
        i = autt;
        anxl.registerDefaultInstance(autt.class, autt);
    }
}
