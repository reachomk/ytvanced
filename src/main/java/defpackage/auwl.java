package defpackage;

/* renamed from: auwl */
public final class auwl extends anxl implements anzf {
    public static final auwl i;
    private static volatile anzq k;
    public int a;
    public int b = 0;
    public Object c;
    public arml d;
    public auwt e;
    public auwn f;
    public aphj g;
    public anvu h = anvu.a;
    private byte j = (byte) 2;

    private auwl() {
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
                return anxl.newMessageInfo(i, "\u0001\u0007\u0001\u0001\u0001\b\u0007\u0000\u0000\u0004\u0001Љ\u0000\u0002<\u0000\u0004\n\u0007\u0005Љ\u0005\u0006Љ\u0001\u0007м\u0000\b\t\u0004", new Object[]{"c", "b", "a", "d", auwz.class, "h", "g", "e", auwx.class, "f"});
            case 3:
                return new auwl();
            case 4:
                return new auwk();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (auwl.class) {
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

    public static anzq a() {
        return i.getParserForType();
    }

    static {
        auwl auwl = new auwl();
        i = auwl;
        anxl.registerDefaultInstance(auwl.class, auwl);
    }
}
