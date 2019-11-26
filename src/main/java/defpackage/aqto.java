package defpackage;

/* renamed from: aqto */
public final class aqto extends anxp implements anzf {
    public static final aqto v;
    private static volatile anzq x;
    public int a;
    public int b = 0;
    public Object c;
    public arml d;
    public arml e;
    public aphj f;
    public aygo g;
    public aygo i;
    public aygk j;
    public apxu k;
    public apxu l;
    public aqtm m;
    public anyd n = anxl.emptyProtobufList();
    public anxz o = anxl.emptyIntList();
    public auvr p;
    public float q;
    public boolean r;
    public int s;
    public int t;
    public anvu u = anvu.a;
    private byte w = (byte) 2;

    private aqto() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.w);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.w = b;
                return null;
            case 2:
                return anxl.newMessageInfo(v, "\u0001\u0013\u0001\u0001\u0001\u0016\u0013\u0000\u0002\f\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0005Љ\u0005\u0006Љ\u0006\u0007\t\b\bЛ\n\n\u0011\u000bЉ\u0003\fЉ\u0004\r\u001d\u000eЉ\t\u000fЉ\u0007\u0010\u0001\n\u0011\u0007\u000b\u0012м\u0000\u0013\u0004\u000e\u0014\u0004\u000f\u0016м\u0000", new Object[]{"c", "b", "a", "d", "e", "f", "j", "k", "m", "n", apxu.class, "u", "g", "i", "o", "p", "l", "q", "r", ayxo.class, "s", "t", axak.class});
            case 3:
                return new aqto();
            case 4:
                return new aqtr();
            case 5:
                return v;
            case 6:
                Object obj3 = x;
                if (obj3 == null) {
                    synchronized (aqto.class) {
                        obj3 = x;
                        if (obj3 == null) {
                            obj3 = new anxn(v);
                            x = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aqto aqto = new aqto();
        v = aqto;
        anxl.registerDefaultInstance(aqto.class, aqto);
    }
}
