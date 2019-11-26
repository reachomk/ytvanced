package defpackage;

/* renamed from: axpk */
public final class axpk extends anxl implements anzf {
    public static final axpk i;
    private static volatile anzq k;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public apxu e;
    public auuq f;
    public axak g;
    public axak h;
    private byte j = (byte) 2;

    private axpk() {
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0002\n\u0007\u0000\u0000\u0007\u0002Љ\u0001\u0003Љ\u0006\u0006Љ\b\u0007Љ\t\bЉ\n\tЉ\u0004\nЉ\u0005", new Object[]{"a", "b", "e", "f", "g", "h", "c", "d"});
            case 3:
                return new axpk();
            case 4:
                return new axpj();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (axpk.class) {
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
        axpk axpk = new axpk();
        i = axpk;
        anxl.registerDefaultInstance(axpk.class, axpk);
    }
}
