package defpackage;

/* renamed from: aujn */
public final class aujn extends anxl implements anzf {
    public static final aujn f;
    private static volatile anzq h;
    public int a;
    public apxu b;
    public boolean c;
    public aujl d;
    public boolean e;
    private byte g = (byte) 2;

    private aujn() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0003\u0007\u0004\u0000\u0000\u0002\u0003Љ\u0002\u0004Љ\u0005\u0006\u0007\u0003\u0007\u0007\u0006", new Object[]{"a", "b", "d", "c", "e"});
            case 3:
                return new aujn();
            case 4:
                return new aujq();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (aujn.class) {
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

    static {
        aujn aujn = new aujn();
        f = aujn;
        anxl.registerDefaultInstance(aujn.class, aujn);
    }
}
