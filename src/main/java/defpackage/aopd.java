package defpackage;

/* renamed from: aopd */
public final class aopd extends anxl implements anzf {
    public static final aopd h;
    private static volatile anzq j;
    public int a;
    public String b;
    public String c;
    public boolean d;
    public apxu e;
    public boolean f;
    public anvu g;
    private byte i = (byte) 2;

    private aopd() {
        String str = "";
        this.b = str;
        this.c = str;
        this.g = anvu.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.i = b;
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0001\u0001\b\u0001\u0003\n\u0006\u0004\b\u0000\u0005Љ\u0003\u0006\u0007\u0004\u0007\u0007\u0002", new Object[]{"a", "c", "g", "b", "e", "f", "d"});
            case 3:
                return new aopd();
            case 4:
                return new aopg();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (aopd.class) {
                        obj3 = j;
                        if (obj3 == null) {
                            obj3 = new anxn(h);
                            j = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static anzq a() {
        return h.getParserForType();
    }

    static {
        aopd aopd = new aopd();
        h = aopd;
        anxl.registerDefaultInstance(aopd.class, aopd);
    }
}
