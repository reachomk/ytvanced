package defpackage;

/* renamed from: augt */
public final class augt extends anxl implements anzf {
    public static final augt h;
    private static volatile anzq j;
    public int a;
    public arml b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    private byte i = (byte) 2;

    private augt() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.i = b;
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001Љ\u0000\u0002\u000b\u0001\u0003\u000b\u0002\u0004\u000b\u0003\u0005\u000b\u0004\u0006\u000b\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            case 3:
                return new augt();
            case 4:
                return new augs();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (augt.class) {
                        obj3 = j;
                        if (obj3 == null) {
                            obj3 = new anxn(h);
                            j = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        augt augt = new augt();
        h = augt;
        anxl.registerDefaultInstance(augt.class, augt);
    }
}
