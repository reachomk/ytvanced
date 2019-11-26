package defpackage;

/* renamed from: axyq */
public final class axyq extends anxl implements anzf {
    public static final axyq j;
    private static volatile anzq l;
    public int a;
    public arml b;
    public arml c;
    public axak d;
    public anyd e = anxl.emptyProtobufList();
    public anyd f = anxl.emptyProtobufList();
    public axak g;
    public String h = "";
    public anvu i = anvu.a;
    private byte k = (byte) 2;

    private axyq() {
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
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0002\u0006\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Л\u0005Л\u0006Љ\u0003\b\b\u0005\n\n\u0007", new Object[]{"a", "b", "c", "d", "e", axak.class, "f", axak.class, "g", "h", "i"});
            case 3:
                return new axyq();
            case 4:
                return new axyp();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (axyq.class) {
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
        axyq axyq = new axyq();
        j = axyq;
        anxl.registerDefaultInstance(axyq.class, axyq);
    }
}
