package defpackage;

/* renamed from: aokt */
public final class aokt extends anxl implements anzf {
    public static final aokt g;
    private static volatile anzq i;
    public int a;
    public int b;
    public aygk c;
    public apxu d;
    public apxu e;
    public anvu f = anvu.a;
    private byte h = (byte) 2;

    private aokt() {
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0003\u0001\u000b\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003\u0006\n\u0005", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new aokt();
            case 4:
                return new aokv();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (aokt.class) {
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
        aokt aokt = new aokt();
        g = aokt;
        anxl.registerDefaultInstance(aokt.class, aokt);
    }
}
