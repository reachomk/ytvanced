package defpackage;

/* renamed from: bbzz */
public final class bbzz extends anxl implements anzf {
    public static final bbzz k;
    private static volatile anzq l;
    public int a;
    public int b;
    public long c;
    public String d;
    public String e;
    public bcbb f;
    public int g;
    public long h;
    public bcat i;
    public long j;

    private bbzz() {
        String str = "";
        this.d = str;
        this.e = str;
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(k, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0005\u0003\u0002\u0006\u0006\t\u0007\u0007\u0002\b\b\u0005\u0001\t\b\u0002\n\b\u0003\u000b\t\u0004", new Object[]{"a", "b", bcab.a(), "g", bcab.a(), "h", "i", "j", "c", "d", "e", "f"});
            case 3:
                return new bbzz();
            case 4:
                return new bcac();
            case 5:
                return k;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (bbzz.class) {
                        obj3 = l;
                        if (obj3 == null) {
                            obj3 = new anxn(k);
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
        bbzz bbzz = new bbzz();
        k = bbzz;
        anxl.registerDefaultInstance(bbzz.class, bbzz);
    }
}
