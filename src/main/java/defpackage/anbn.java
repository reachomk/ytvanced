package defpackage;

/* renamed from: anbn */
public final class anbn extends anxl implements anzf {
    public static final anbn g;
    private static volatile anzq i;
    public int a;
    public angm b;
    public anyd c = anxl.emptyProtobufList();
    public angm d;
    public angm e;
    public anbu f;
    private byte h = (byte) 2;

    private anbn() {
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0001\u0005\u0001Љ\u0000\u0002Л\u0003Љ\u0001\u0004Љ\u0004\bЉ\u0003", new Object[]{"a", "b", "c", anbw.class, "d", "f", "e"});
            case 3:
                return new anbn();
            case 4:
                return new anbq();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (anbn.class) {
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
        anbn anbn = new anbn();
        g = anbn;
        anxl.registerDefaultInstance(anbn.class, anbn);
    }
}
