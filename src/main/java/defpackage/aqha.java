package defpackage;

/* renamed from: aqha */
public final class aqha extends anxl implements anzf {
    public static final aqha s;
    private static volatile anzq u;
    public int a;
    public arml b;
    public axak c;
    public arml d;
    public axak e;
    public aygk f;
    public axak g;
    public apxu h;
    public auvr i;
    public aqgy j;
    public axak k;
    public anyd l = anxl.emptyProtobufList();
    public apxu m;
    public axak n;
    public int o;
    public aqlj p;
    public int q;
    public anvu r = anvu.a;
    private byte t = (byte) 2;

    private aqha() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.t);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.t = b;
                return null;
            case 2:
                return anxl.newMessageInfo(s, "\u0001\u0011\u0000\u0001\u0002\u0015\u0011\u0000\u0001\r\u0002Љ\u0001\u0003Љ\u0003\u0004Љ\u0005\u0005Љ\u0007\u0007Љ\t\t\n\u0013\nЉ\n\fЛ\rЉ\u000e\u000e\f\u000f\u000fЉ\u0002\u0010Љ\u0004\u0011Љ\u0006\u0012\t\u0010\u0013\u000b\u0011\u0014Љ\u000b\u0015Љ\r", new Object[]{"a", "b", "d", "f", "h", "i", "r", "j", "l", apxu.class, "n", "o", aqhd.a, "c", "e", "g", "p", "q", "k", "m"});
            case 3:
                return new aqha();
            case 4:
                return new aqgz();
            case 5:
                return s;
            case 6:
                Object obj3 = u;
                if (obj3 == null) {
                    synchronized (aqha.class) {
                        obj3 = u;
                        if (obj3 == null) {
                            obj3 = new anxn(s);
                            u = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aqha aqha = new aqha();
        s = aqha;
        anxl.registerDefaultInstance(aqha.class, aqha);
    }
}
