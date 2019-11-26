package defpackage;

/* renamed from: axxv */
public final class axxv extends anxl implements anzf {
    public static final axxv g;
    private static volatile anzq i;
    public int a;
    public anvu b = anvu.a;
    public arml c;
    public aphj d;
    public long e;
    public String f = "";
    private byte h = (byte) 2;

    private axxv() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.h = b;
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0000\u0002\u0002\n\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005\u0002\u0004\u0006\b\u0005", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new axxv();
            case 4:
                return new axxu();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (axxv.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
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
        axxv axxv = new axxv();
        g = axxv;
        anxl.registerDefaultInstance(axxv.class, axxv);
    }
}
