package defpackage;

/* renamed from: aowi */
public final class aowi extends anxl implements anzf {
    public static final aowi g;
    private static volatile anzq i;
    public int a;
    public String b;
    public String c;
    public apxu d;
    public anyd e;
    public anyd f;
    private byte h = (byte) 2;

    private aowi() {
        String str = "";
        this.b = str;
        this.c = str;
        this.e = anxl.emptyProtobufList();
        this.f = anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0002\u0003\u0001\b\u0000\u0002\b\u0001\u0004Љ\u0003\u0005Л\u0006Л", new Object[]{"a", "b", "c", "d", "e", apxu.class, "f", apxu.class});
            case 3:
                return new aowi();
            case 4:
                return new aowh();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (aowi.class) {
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
        aowi aowi = new aowi();
        g = aowi;
        anxl.registerDefaultInstance(aowi.class, aowi);
    }
}
