package defpackage;

/* renamed from: aowy */
public final class aowy extends anxl implements anzf {
    public static final aowy i;
    private static volatile anzq k;
    public int a;
    public String b;
    public String c;
    public String d;
    public String e;
    public boolean f;
    public anyd g;
    public anyd h;
    private byte j = (byte) 2;

    private aowy() {
        String str = "";
        this.b = str;
        this.c = str;
        this.d = str;
        this.e = str;
        this.g = anxl.emptyProtobufList();
        this.h = anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.j = b;
                return null;
            case 2:
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0002\u0002\u0001\b\u0000\u0002\b\u0002\u0003\b\u0003\u0004\b\u0004\u0005\u0007\u0005\u0006Л\bЛ", new Object[]{"a", "b", "c", "d", "e", "f", "g", apxu.class, "h", apxu.class});
            case 3:
                return new aowy();
            case 4:
                return new aoxa();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (aowy.class) {
                        obj3 = k;
                        if (obj3 == null) {
                            obj3 = new anxn(i);
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
        aowy aowy = new aowy();
        i = aowy;
        anxl.registerDefaultInstance(aowy.class, aowy);
    }
}
