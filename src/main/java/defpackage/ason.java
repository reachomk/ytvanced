package defpackage;

/* renamed from: ason */
public final class ason extends anxl implements anzf {
    public static final ason j;
    private static volatile anzq l;
    public int a;
    public ashy b;
    public String c;
    public int d;
    public String e;
    public boolean f;
    public asor g;
    public asoz h;
    public int i;
    private byte k = (byte) 2;

    private ason() {
        String str = "";
        this.c = str;
        this.e = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.k = b;
                return null;
            case 2:
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0001\u0013\b\u0000\u0000\u0001\u0001Љ\u0000\u0002\b\u0001\u0003\u0004\u000b\u0004\b\u0003\u0010\t\t\u0011\f\u0002\u0012\t\n\u0013\u0007\u0004", new Object[]{"a", "b", "c", "i", "e", "g", "d", arke.a, "h", "f"});
            case 3:
                return new ason();
            case 4:
                return new asoq();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (ason.class) {
                        obj3 = l;
                        if (obj3 == null) {
                            obj3 = new anxn(j);
                            l = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ason ason = new ason();
        j = ason;
        anxl.registerDefaultInstance(ason.class, ason);
    }
}
