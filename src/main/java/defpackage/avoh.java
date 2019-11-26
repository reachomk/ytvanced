package defpackage;

/* renamed from: avoh */
public final class avoh extends anxl implements anzf {
    public static final avoh i;
    private static volatile anzq j;
    public int a;
    public String b;
    public int c;
    public int d;
    public boolean e;
    public int f;
    public String g;
    public boolean h;

    private avoh() {
        String str = "";
        this.b = str;
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
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0000\u0001\b\u0000\u0002\u000b\u0001\u0004\u0007\u0004\u0006\f\u0006\u0007\u000b\u0002\b\b\u0007\t\u0007\b", new Object[]{"a", "b", "c", "e", "f", avoj.a, "d", "g", "h"});
            case 3:
                return new avoh();
            case 4:
                return new avok();
            case 5:
                return i;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (avoh.class) {
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
        avoh avoh = new avoh();
        i = avoh;
        anxl.registerDefaultInstance(avoh.class, avoh);
    }
}
