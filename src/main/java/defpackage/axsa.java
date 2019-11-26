package defpackage;

/* renamed from: axsa */
public final class axsa extends anxl implements anzf {
    public static final axsa j;
    private static volatile anzq l;
    public int a;
    public axak b;
    public arml c;
    public arml d;
    public axak e;
    public aphj f;
    public anyd g = anxl.emptyProtobufList();
    public anyd h = anxl.emptyProtobufList();
    public anvu i = anvu.a;
    private byte k = (byte) 2;

    private axsa() {
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
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0002\u0007\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0004\u0006\n\u0006\u0007Љ\u0003\bЛ\tЛ", new Object[]{"a", "b", "c", "d", "f", "i", "e", "g", apxu.class, "h", apxu.class});
            case 3:
                return new axsa();
            case 4:
                return new axsc();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (axsa.class) {
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
        axsa axsa = new axsa();
        j = axsa;
        anxl.registerDefaultInstance(axsa.class, axsa);
    }
}
