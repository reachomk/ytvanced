package defpackage;

/* renamed from: aqca */
public final class aqca extends anxl implements anzf {
    public static final aqca p;
    private static volatile anzq r;
    public int a;
    public arml b;
    public aqcb c;
    public aqbq d;
    public axak e;
    public arml f;
    public arml g;
    public arml h;
    public arml i;
    public apyw j;
    public axak k;
    public axak l;
    public axak m;
    public arml n;
    public axak o;
    private byte q = (byte) 2;

    private aqca() {
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(p, "\u0001\u000e\u0000\u0001\u0001\u0018\u000e\u0000\u0000\u000e\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\nЉ\u0007\u000bЉ\b\rЉ\u000b\u0010Љ\u000f\u0011Љ\f\u0012Љ\u0010\u0014Љ\u0003\u0015Љ\t\u0016Љ\n\u0017Љ\u0013\u0018Љ\u0014", new Object[]{"a", "b", "c", "d", "f", "g", "j", "l", "k", "m", "e", "h", "i", "n", "o"});
            case 3:
                return new aqca();
            case 4:
                return new aqbz();
            case 5:
                return p;
            case 6:
                Object obj3 = r;
                if (obj3 == null) {
                    synchronized (aqca.class) {
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
        aqca aqca = new aqca();
        p = aqca;
        anxl.registerDefaultInstance(aqca.class, aqca);
    }
}
