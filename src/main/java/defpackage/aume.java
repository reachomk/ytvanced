package defpackage;

/* renamed from: aume */
public final class aume extends anxl implements anzf {
    public static final aume af;
    private static volatile anzq ag;
    public boolean A;
    public int B;
    public boolean C;
    public boolean D;
    public float E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public int K;
    public int L;
    public boolean M;
    public float N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public int S;
    public boolean T;
    public boolean U;
    public anyd V = anxl.emptyProtobufList();
    public boolean W;
    public String X;
    public anyd Y;
    public boolean Z;
    public int a;
    public boolean aa;
    public boolean ab;
    public boolean ac;
    public boolean ad;
    public boolean ae;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public String h;
    public boolean i;
    public boolean j;
    public int k;
    public boolean l;
    public boolean m;
    public aumk n;
    public boolean o;
    public boolean p;
    public int q;
    public boolean r;
    public anyd s = anxl.emptyProtobufList();
    public boolean t;
    public int u;
    public boolean v;
    public int w;
    public boolean x;
    public int y;
    public int z;

    private aume() {
        String str = "";
        this.h = str;
        this.X = str;
        this.Y = anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(af, "\u00013\u0000\u0006\u0007Ô3\u0000\u0003\u0000\u0007\u0007\u0005#\u0007\u001b$\u0007\u001c/\t+8\u0007?9\u001a:\u0004\u001d<\u0007AP\u0007\"Q\u0007#X\u0004R[\u0007U\\\u0004V^\u0007\\h\ffj\u0007jk\u0004]n\u00070q\u00074s\u0007ou\u0007qv\u0004^w\u0007rz\u0007t\u0007k\u0007x\u00048\f\u0007`¬\u0001l­\b\u0015¯\f°\u0007±\u0001³\u0007¹\u0007¼\u0007½\u0007À\u0004 Á\u0007¡Ã\u0007¢Ä\u001aÇ\u0007¥É\b§Ì\u001aÎ\u0007ªÏ\u0007«Ð\u0007¬Ñ\u0007­Ó\u0007®Ô\u0007¯", new Object[]{"a", "b", "c", "d", "e", "f", "g", "i", "j", "n", "r", "s", "k", "t", "l", "m", "u", "v", "w", "x", "B", arob.a, "C", "y", "o", "p", "F", "G", "z", "H", "I", "D", "J", "q", "K", arzx.a(), "A", "E", "h", "L", arzv.a(), "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "aa", "ab", "ac", "ad", "ae"});
            case 3:
                return new aume();
            case 4:
                return new aumd();
            case 5:
                return af;
            case 6:
                Object obj3 = ag;
                if (obj3 == null) {
                    synchronized (aume.class) {
                        obj3 = ag;
                        if (obj3 == null) {
                            obj3 = new anxn(af);
                            ag = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aume aume = new aume();
        af = aume;
        anxl.registerDefaultInstance(aume.class, aume);
    }
}
