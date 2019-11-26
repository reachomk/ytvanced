package defpackage;

/* renamed from: aogx */
public final class aogx extends anxl implements anzf {
    public static final aogx f;
    private static volatile anzq h;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public apxu e;
    private byte g = (byte) 2;

    private aogx() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0000\u0004\u0002Љ\u0001\u0004Љ\u0003\u0005Љ\u0004\u0006Љ\u0005", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new aogx();
            case 4:
                return new aogw();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (aogx.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            h = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static anzq a() {
        return f.getParserForType();
    }

    static {
        aogx aogx = new aogx();
        f = aogx;
        anxl.registerDefaultInstance(aogx.class, aogx);
    }
}
