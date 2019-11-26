package defpackage;

/* renamed from: atoi */
public final class atoi extends anxl implements anzf {
    public static final atoi f;
    private static volatile anzq g;
    public int a;
    public String b;
    public String c;
    public int d;
    public String e;

    private atoi() {
        String str = "";
        this.b = str;
        this.c = str;
        this.e = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u000b\u0002\u0004\b\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new atoi();
            case 4:
                return new atoh();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (atoi.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            g = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        atoi atoi = new atoi();
        f = atoi;
        anxl.registerDefaultInstance(atoi.class, atoi);
    }
}
