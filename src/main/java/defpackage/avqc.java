package defpackage;

/* renamed from: avqc */
public final class avqc extends anxl implements anzf {
    public static final avqc j;
    private static volatile anzq l;
    public int a;
    public String b;
    public int c;
    public int d;
    public int e;
    public String f;
    public avqa g;
    public boolean h;
    public anvu i;
    private byte k = (byte) 2;

    private avqc() {
        String str = "";
        this.b = str;
        this.f = str;
        this.i = anvu.a;
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
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0001\u0001\b\u0000\u0002\u000b\u0001\u0003\u000b\u0002\u0005\f\u0003\u0006\b\u0004\u0007Љ\u0005\b\u0007\u0006\t\n\u0007", new Object[]{"a", "b", "c", "d", "e", avqd.a, "f", "g", "h", "i"});
            case 3:
                return new avqc();
            case 4:
                return new avqb();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (avqc.class) {
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
        avqc avqc = new avqc();
        j = avqc;
        anxl.registerDefaultInstance(avqc.class, avqc);
    }
}
