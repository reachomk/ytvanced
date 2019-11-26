package defpackage;

/* renamed from: aqnz */
public final class aqnz extends anxl implements anzf {
    public static final aqnz p;
    private static volatile anzq r;
    public int a;
    public aygk b;
    public arml c;
    public apxu d;
    public apxu e;
    public apxu f;
    public long g;
    public apxu h;
    public int i;
    public apxu j;
    public int k;
    public aqor l;
    public apxu m;
    public apxu n;
    public arup o;
    private byte q = (byte) 2;

    private aqnz() {
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.q);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.q = b;
                return null;
            case 2:
                return anxl.newMessageInfo(p, "\u0001\u000e\u0000\u0001\u0001\u0013\u000e\u0000\u0000\n\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005Љ\u0004\n\u0002\u0006\u000bЉ\u0007\f\u0004\b\rЉ\t\u000e\u0004\n\u000f\t\u000b\u0010Љ\f\u0012Љ\u000e\u0013Љ\u000f", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"});
            case 3:
                return new aqnz();
            case 4:
                return new aqny();
            case 5:
                return p;
            case 6:
                Object obj3 = r;
                if (obj3 == null) {
                    synchronized (aqnz.class) {
                        obj3 = r;
                        if (obj3 == null) {
                            obj3 = new anxn(p);
                            r = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aqnz aqnz = new aqnz();
        p = aqnz;
        anxl.registerDefaultInstance(aqnz.class, aqnz);
    }
}
