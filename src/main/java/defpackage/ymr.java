package defpackage;

/* renamed from: ymr */
public final class ymr extends anxl implements anzf {
    public static final ymr h;
    private static volatile anzq j;
    public int a;
    public anvu b = anvu.a;
    public aygk c;
    public long d;
    public long e;
    public String f;
    public String g;
    private byte i = (byte) 2;

    private ymr() {
        String str = "";
        this.f = str;
        this.g = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.i = b;
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0002\u0007\u0006\u0000\u0000\u0001\u0002Љ\u0001\u0003\u0002\u0002\u0004\u0002\u0003\u0005\b\u0004\u0006\n\u0000\u0007\b\u0005", new Object[]{"a", "c", "d", "e", "f", "b", "g"});
            case 3:
                return new ymr();
            case 4:
                return new ymu();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (ymr.class) {
                        obj3 = j;
                        if (obj3 == null) {
                            obj3 = new anxn(h);
                            j = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ymr ymr = new ymr();
        h = ymr;
        anxl.registerDefaultInstance(ymr.class, ymr);
    }
}
