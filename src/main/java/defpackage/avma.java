package defpackage;

/* renamed from: avma */
public final class avma extends anxl implements anzf {
    public static final avma j;
    private static volatile anzq k;
    public int a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;

    private avma() {
        String str = "";
        this.b = str;
        this.c = str;
        this.d = str;
        this.e = str;
        this.f = str;
        this.g = str;
        this.h = str;
        this.i = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004\u0006\b\u0005\u0007\b\u0006\b\b\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new avma();
            case 4:
                return new avmd();
            case 5:
                return j;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (avma.class) {
                        obj3 = k;
                        if (obj3 == null) {
                            obj3 = new anxn(j);
                            k = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        avma avma = new avma();
        j = avma;
        anxl.registerDefaultInstance(avma.class, avma);
    }
}
