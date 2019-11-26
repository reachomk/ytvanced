package defpackage;

/* renamed from: arot */
public final class arot extends anxl implements anzf {
    public static final arot s;
    private static volatile anzq u;
    public int a;
    public aygk b;
    public aygk c;
    public arml d;
    public arml e;
    public aphj f;
    public aphj g;
    public arml h;
    public arml i;
    public anyd j = anxl.emptyProtobufList();
    public axak k;
    public axak l;
    public arml m;
    public aygk n;
    public arwf o;
    public aphj p;
    public apxu q;
    public apxu r;
    private byte t = (byte) 2;

    private arot() {
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
                return anxl.newMessageInfo(s, "\u0001\u0011\u0000\u0001\u0004\u0015\u0011\u0000\u0001\u0010\u0004Љ\u0001\u0005Љ\u0002\u0006Љ\u0003\u0007Љ\u0004\bЉ\u0005\tЉ\u0006\nЉ\u0007\u000bЛ\fЉ\b\u000eЉ\n\u000fЉ\u000b\u0010Љ\f\u0011Љ\r\u0012\t\u000e\u0013Љ\u000f\u0014Љ\u0010\u0015Љ\u0011", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "j", arml.class, "i", "k", "l", "m", "n", "o", "p", "q", "r"});
            case 3:
                return new arot();
            case 4:
                return new arov();
            case 5:
                return s;
            case 6:
                Object obj3 = u;
                if (obj3 == null) {
                    synchronized (arot.class) {
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
        arot arot = new arot();
        s = arot;
        anxl.registerDefaultInstance(arot.class, arot);
    }
}
