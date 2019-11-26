package defpackage;

/* renamed from: arxf */
public final class arxf extends anxl implements anzf {
    public static final arxf k;
    private static volatile anzq m;
    public int a;
    public aygk b;
    public arml c;
    public arml d;
    public arml e;
    public arml f;
    public arml g;
    public apxu h;
    public anvu i = anvu.a;
    public anyd j = anxl.emptyProtobufList();
    private byte l = (byte) 2;

    private arxf() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.l = b;
                return null;
            case 2:
                return anxl.newMessageInfo(k, "\u0001\t\u0000\u0001\u0003\u0010\t\u0000\u0001\u0007\u0003Љ\u0000\u0004Љ\u0001\u0005Љ\u0003\u0006Љ\u0004\u0007Љ\u0005\bЉ\u0006\u000b\n\b\u000f\u001b\u0010Љ\u0002", new Object[]{"a", "b", "c", "e", "f", "g", "h", "i", "j", aule.class, "d"});
            case 3:
                return new arxf();
            case 4:
                return new arxi();
            case 5:
                return k;
            case 6:
                Object obj3 = m;
                if (obj3 == null) {
                    synchronized (arxf.class) {
                        obj3 = m;
                        if (obj3 == null) {
                            obj3 = new anxn(k);
                            m = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        arxf arxf = new arxf();
        k = arxf;
        anxl.registerDefaultInstance(arxf.class, arxf);
    }
}
