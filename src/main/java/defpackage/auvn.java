package defpackage;

/* renamed from: auvn */
public final class auvn extends anxl implements anzf {
    public static final auvn l;
    private static volatile anzq n;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public auvx c;
    public auvb d;
    public boolean e;
    public String f;
    public auvh g;
    public aodx h;
    public apxu i;
    public boolean j;
    public axak k;
    private byte m = (byte) 2;

    private auvn() {
        anxl.emptyProtobufList();
        this.f = "";
    }

    public final void a() {
        if (!this.b.a()) {
            this.b = anxl.mutableCopy(this.b);
        }
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
                return anxl.newMessageInfo(l, "\u0001\n\u0000\u0001\u0001\u0011\n\u0000\u0001\u0006\u0001Л\u0005Љ\u0002\u0007Љ\u0003\b\u0007\u0004\tЉ\u0007\n\t\b\u000b\b\u0006\u000e\u0007\u000b\u000fЉ\n\u0011Љ\r", new Object[]{"a", "b", auvj.class, "c", "d", "e", "g", "h", "f", "j", "i", "k"});
            case 3:
                return new auvn();
            case 4:
                return new auvq();
            case 5:
                return l;
            case 6:
                Object obj3 = n;
                if (obj3 == null) {
                    synchronized (auvn.class) {
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
        auvn auvn = new auvn();
        l = auvn;
        anxl.registerDefaultInstance(auvn.class, auvn);
    }
}
