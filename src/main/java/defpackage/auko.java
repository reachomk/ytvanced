package defpackage;

/* renamed from: auko */
public final class auko extends anxp implements anzf {
    public static final anyb e = new aukr();
    public static final auko f;
    private static volatile anzq i;
    public int a;
    public anvu b = anvu.a;
    public azey c;
    public anxz d = anxl.emptyIntList();
    private byte g = (byte) 2;

    private auko() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.g = b;
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0001\u0000\u0001\n\u0000\u0004\t\u0001\u0006\u001e", new Object[]{"a", "b", "c", "d", auky.a()});
            case 3:
                return new auko();
            case 4:
                return new aukq();
            case 5:
                return f;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (auko.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            i = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        auko auko = new auko();
        f = auko;
        anxl.registerDefaultInstance(auko.class, auko);
    }
}
