package defpackage;

/* renamed from: avug */
public final class avug extends anxl implements anzf {
    public static final avug i;
    private static volatile anzq k;
    public int a;
    public arml b;
    public anyd c = anxl.emptyProtobufList();
    public avuk d;
    public boolean e;
    public apxu f;
    public apxu g;
    public anyd h;
    private byte j = (byte) 2;

    private avug() {
        anxl.emptyProtobufList();
        this.h = anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.j = b;
                return null;
            case 2:
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\u000f\u0007\u0000\u0002\u0006\u0001Љ\u0000\bЛ\tЉ\u0003\n\u0007\u0004\fЉ\u0005\rЉ\u0006\u000fЛ", new Object[]{"a", "b", "c", avuc.class, "d", "e", "f", "g", "h", apxu.class});
            case 3:
                return new avug();
            case 4:
                return new avuf();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (avug.class) {
                        obj3 = k;
                        if (obj3 == null) {
                            obj3 = new anxn(i);
                            k = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        avug avug = new avug();
        i = avug;
        anxl.registerDefaultInstance(avug.class, avug);
    }
}
