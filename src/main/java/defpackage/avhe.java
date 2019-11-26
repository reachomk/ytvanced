package defpackage;

/* renamed from: avhe */
public final class avhe extends anxl implements anzf {
    public static final avhe j;
    private static volatile anzq l;
    public int a;
    public avhc b;
    public aygk c;
    public arml d;
    public arml e;
    public arml f;
    public anyd g = anxl.emptyProtobufList();
    public anyd h = anxl.emptyProtobufList();
    public anvu i = anvu.a;
    private byte k = (byte) 2;

    private avhe() {
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
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0001\u000b\b\u0000\u0002\u0006\u0001Љ\u0004\u0002Љ\u0005\u0003Љ\u0006\u0004Љ\u0007\u0006\n\t\u0007Л\bЛ\u000b\t\u0001", new Object[]{"a", "c", "d", "e", "f", "i", "g", arml.class, "h", arml.class, "b"});
            case 3:
                return new avhe();
            case 4:
                return new avhd();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (avhe.class) {
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

    public static anzq a() {
        return j.getParserForType();
    }

    static {
        avhe avhe = new avhe();
        j = avhe;
        anxl.registerDefaultInstance(avhe.class, avhe);
    }
}
