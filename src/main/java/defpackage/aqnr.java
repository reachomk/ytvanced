package defpackage;

/* renamed from: aqnr */
public final class aqnr extends anxl implements anzf {
    public static final aqnr l;
    private static volatile anzq n;
    public int a;
    public long b;
    public long c;
    public String d;
    public arml e;
    public aygk f;
    public String g;
    public arml h;
    public apxu i;
    public apxu j;
    public aqnl k;
    private byte m = (byte) 2;

    private aqnr() {
        String str = "";
        this.d = str;
        this.g = str;
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
                return anxl.newMessageInfo(l, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0000\u0005\u0001\u0002\u0000\u0002\u0002\u0001\u0003\b\u0002\u0004Љ\u0003\u0005Љ\u0004\u0006\b\u0005\u0007Љ\u0006\bЉ\u0007\t\t\t\fЉ\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "k", "j"});
            case 3:
                return new aqnr();
            case 4:
                return new aqnq();
            case 5:
                return l;
            case 6:
                Object obj3 = n;
                if (obj3 == null) {
                    synchronized (aqnr.class) {
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
        aqnr aqnr = new aqnr();
        l = aqnr;
        anxl.registerDefaultInstance(aqnr.class, aqnr);
    }
}
