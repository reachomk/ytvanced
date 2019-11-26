package defpackage;

/* renamed from: auxv */
public final class auxv extends anxl implements anzf {
    public static final auxv j;
    private static volatile anzq l;
    public int a;
    public int b;
    public aygk c;
    public arml d;
    public arml e;
    public arml f;
    public arwf g;
    public apxu h;
    public anvu i;
    private byte k = (byte) 2;

    private auxv() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        this.i = anvu.a;
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
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0005\u0001\f\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005Љ\u0004\u0006\t\u0005\u0007Љ\u0006\t\n\b", new Object[]{"a", "b", auxh.a(), "c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new auxv();
            case 4:
                return new auxu();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (auxv.class) {
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
        auxv auxv = new auxv();
        j = auxv;
        anxl.registerDefaultInstance(auxv.class, auxv);
    }
}
