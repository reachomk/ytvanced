package defpackage;

/* renamed from: aovq */
public final class aovq extends anxl implements anzf {
    public static final aovq l;
    private static volatile anzq n;
    public int a;
    public long b;
    public long c;
    public int d;
    public String e;
    public String f;
    public apxu g;
    public aygk h;
    public awgs i;
    public anyd j;
    public anyd k;
    private byte m = (byte) 2;

    private aovq() {
        String str = "";
        this.e = str;
        this.f = str;
        this.j = anxl.emptyProtobufList();
        this.k = anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.m = b;
                return null;
            case 2:
                return anxl.newMessageInfo(l, "\u0001\n\u0000\u0001\u0001\u0010\n\u0000\u0002\u0002\u0001\u0002\u0000\u0002\u0002\u0001\u0004\b\u0004\u0007\b\u0005\bЉ\u0006\tЉ\u0007\r\t\b\u000e\u001b\u000f\u001b\u0010\u0004\u0003", new Object[]{"a", "b", "c", "e", "f", "g", "h", "i", "j", aule.class, "k", aule.class, "d"});
            case 3:
                return new aovq();
            case 4:
                return new aovt();
            case 5:
                return l;
            case 6:
                Object obj3 = n;
                if (obj3 == null) {
                    synchronized (aovq.class) {
                        obj3 = n;
                        if (obj3 == null) {
                            obj3 = new anxn(l);
                            n = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aovq aovq = new aovq();
        l = aovq;
        anxl.registerDefaultInstance(aovq.class, aovq);
    }
}
