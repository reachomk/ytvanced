package defpackage;

/* renamed from: ayxf */
public final class ayxf extends anxl implements anzf {
    public static final ayxf d;
    private static volatile anzq f;
    public int a;
    public arml b;
    public arml c;
    private byte e = (byte) 2;

    private ayxf() {
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.e = b;
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0007\t\u0002\u0000\u0000\u0002\u0007Љ\u0005\tЉ\u0007", new Object[]{"a", "b", "c"});
            case 3:
                return new ayxf();
            case 4:
                return new ayxe();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (ayxf.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            f = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ayxf ayxf = new ayxf();
        d = ayxf;
        anxl.registerDefaultInstance(ayxf.class, ayxf);
    }
}
