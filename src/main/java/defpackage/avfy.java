package defpackage;

/* renamed from: avfy */
public final class avfy extends anxl implements anzf {
    public static final avfy j;
    private static volatile anzq l;
    public int a;
    public axak b;
    public axak c;
    public axak d;
    public axak e;
    public axak f;
    public axak g;
    public axak h;
    public axak i;
    private byte k = (byte) 2;

    private avfy() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.k = b;
                return null;
            case 2:
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\b\u0001Љ\u0000\u0002Љ\u0002\u0003Љ\u0001\u0004Љ\u0003\u0005Љ\u0004\bЉ\u0005\tЉ\u0006\nЉ\u0007", new Object[]{"a", "b", "d", "c", "e", "f", "g", "h", "i"});
            case 3:
                return new avfy();
            case 4:
                return new avfx();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (avfy.class) {
                        obj3 = l;
                        if (obj3 == null) {
                            obj3 = new anxn(j);
                            l = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        avfy avfy = new avfy();
        j = avfy;
        anxl.registerDefaultInstance(avfy.class, avfy);
    }
}
