package defpackage;

/* renamed from: aufs */
public final class aufs extends anxl implements anzf {
    public static final aufs g;
    private static volatile anzq i;
    public int a;
    public axak b;
    public aufo c;
    public aufq d;
    public aufu e;
    public axak f;
    private byte h = (byte) 2;

    private aufs() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0005\u0013\u0005\u0000\u0000\u0005\u0005Љ\u0004\u0006Љ\u0002\u000eЉ\n\u0012Љ\u0001\u0013Љ\u000e", new Object[]{"a", "d", "c", "e", "b", "f"});
            case 3:
                return new aufs();
            case 4:
                return new aufv();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (aufs.class) {
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
        aufs aufs = new aufs();
        g = aufs;
        anxl.registerDefaultInstance(aufs.class, aufs);
    }
}
