package defpackage;

/* renamed from: arzk */
public final class arzk extends anxl implements anzf {
    public static final arzk j;
    private static volatile anzq l;
    public int a;
    public ashy b;
    public String c;
    public long d;
    public int e;
    public awat f;
    public String g;
    public String h;
    public long i;
    private byte k = (byte) 2;

    private arzk() {
        String str = "";
        this.c = str;
        this.g = str;
        this.h = str;
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
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0001\u0010\b\u0000\u0000\u0001\u0001Љ\u0001\u0002\b\u0002\u0003\u0002\u0003\u0004\u0004\u0004\u0005\t\u0005\u0006\b\u0006\u000f\b\u000e\u0010\u0003\u000f", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new arzk();
            case 4:
                return new arzn();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (arzk.class) {
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
        arzk arzk = new arzk();
        j = arzk;
        anxl.registerDefaultInstance(arzk.class, arzk);
    }
}
