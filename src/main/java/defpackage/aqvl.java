package defpackage;

/* renamed from: aqvl */
public final class aqvl extends anxl implements anzf {
    public static final aqvl s;
    private static volatile anzq u;
    public int a;
    public arml b;
    public axak c;
    public axak d;
    public aqvh e;
    public anyd f = anxl.emptyProtobufList();
    public anyd g = anxl.emptyProtobufList();
    public arml h;
    public arml i;
    public arml j;
    public appu k;
    public axak l;
    public anxz m = anxl.emptyIntList();
    public aygk n;
    public axak o;
    public axak p;
    public axak q;
    public String r = "";
    private byte t = (byte) 2;

    private aqvl() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.t);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.t = b;
                return null;
            case 2:
                return anxl.newMessageInfo(s, "\u0001\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0003\u000e\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Л\u0005Л\u0006Љ\u0004\u0007Љ\u0006\bЉ\u0007\tЉ\b\n\u001d\u000b\t\u0003\fЉ\t\rЉ\n\u000eЉ\u000b\u000fЉ\u0005\u0010Љ\f\u0011\b\r", new Object[]{"a", "b", "c", "d", "f", axak.class, "g", arml.class, "h", "j", "k", "l", "m", "e", "n", "o", "p", "i", "q", "r"});
            case 3:
                return new aqvl();
            case 4:
                return new aqvk();
            case 5:
                return s;
            case 6:
                Object obj3 = u;
                if (obj3 == null) {
                    synchronized (aqvl.class) {
                        obj3 = u;
                        if (obj3 == null) {
                            obj3 = new anxn(s);
                            u = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aqvl aqvl = new aqvl();
        s = aqvl;
        anxl.registerDefaultInstance(aqvl.class, aqvl);
    }
}
