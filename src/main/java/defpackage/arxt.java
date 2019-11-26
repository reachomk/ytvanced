package defpackage;

/* renamed from: arxt */
public final class arxt extends anxl implements anzf {
    public static final arxt l;
    private static volatile anzq n;
    public int a;
    public aygk b;
    public arxd c;
    public arml d;
    public arml e;
    public arml f;
    public arml g;
    public arml h;
    public apxu i;
    public anvu j = anvu.a;
    public anyd k = anxl.emptyProtobufList();
    private byte m = (byte) 2;

    private arxt() {
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
                return anxl.newMessageInfo(l, "\u0001\n\u0000\u0001\u0003\u0011\n\u0000\u0001\b\u0003Љ\u0000\u0004Љ\u0001\u0005Љ\u0002\u0006Љ\u0004\u0007Љ\u0005\bЉ\u0006\tЉ\u0007\f\n\t\u0010\u001b\u0011Љ\u0003", new Object[]{"a", "b", "c", "d", "f", "g", "h", "i", "j", "k", aule.class, "e"});
            case 3:
                return new arxt();
            case 4:
                return new arxv();
            case 5:
                return l;
            case 6:
                Object obj3 = n;
                if (obj3 == null) {
                    synchronized (arxt.class) {
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
        arxt arxt = new arxt();
        l = arxt;
        anxl.registerDefaultInstance(arxt.class, arxt);
    }
}
