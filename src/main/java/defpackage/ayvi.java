package defpackage;

/* renamed from: ayvi */
public final class ayvi extends anxl implements anzf {
    public static final ayvi r;
    private static volatile anzq t;
    public int a;
    public aygk b;
    public aygk c;
    public arml d;
    public arml e;
    public aphj f;
    public aphj g;
    public anvu h = anvu.a;
    public apxu i;
    public anyd j = anxl.emptyProtobufList();
    public boolean k;
    public String l = "";
    public arml m;
    public apxu n;
    public arml o;
    public ayvk p;
    public avmi q;
    private byte s = (byte) 2;

    private ayvi() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.s);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.s = b;
                return null;
            case 2:
                return anxl.newMessageInfo(r, "\u0001\u0010\u0000\u0001\u0002\u0014\u0010\u0000\u0001\f\u0002\b\f\u0004Љ\u000e\u0005Љ\u000f\u0006Љ\u0010\b\n\u0007\tЉ\u0001\nЉ\u0000\u000bЉ\u0002\fЉ\u0003\rЉ\b\u000eЉ\u0004\u000fЉ\u0005\u0010Л\u0011\u0007\t\u0013\t\u0011\u0014Љ\u0012", new Object[]{"a", "l", "m", "n", "o", "h", "c", "b", "d", "e", "i", "f", "g", "j", apxu.class, "k", "p", "q"});
            case 3:
                return new ayvi();
            case 4:
                return new ayvh();
            case 5:
                return r;
            case 6:
                Object obj3 = t;
                if (obj3 == null) {
                    synchronized (ayvi.class) {
                        obj3 = t;
                        if (obj3 == null) {
                            obj3 = new anxn(r);
                            t = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ayvi ayvi = new ayvi();
        r = ayvi;
        anxl.registerDefaultInstance(ayvi.class, ayvi);
    }
}
