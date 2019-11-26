package defpackage;

/* renamed from: apzy */
public final class apzy extends anxl implements anzf {
    public static final apzy L;
    private static volatile anzq N;
    public aqrq A;
    public aqao B;
    public apxu C;
    public apxu D;
    public aqae E;
    public aqcb F;
    public axak G;
    public aphj H;
    public axak I;
    public axak J;
    public axak K;
    private byte M = (byte) 2;
    public int a;
    public int b;
    public int c;
    public axak d;
    public arml e;
    public arml f;
    public arml g;
    public apxu h;
    public arml i;
    public arml j;
    public arml k;
    public aphj l;
    public aphj m;
    public arml n;
    public arml o;
    public apxy p;
    public auvr q;
    public apzo r;
    public arml s;
    public arml t;
    public apdh u;
    public apyg v;
    public axak w;
    public apyg x;
    public apyg y;
    public apyg z;

    private apzy() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.M);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.M = b;
                return null;
            case 2:
                return anxl.newMessageInfo(L, "\u0001\"\u0000\u0003\u0001Q\"\u0000\u0000\"\u0001Љ\u0004\u0003Љ\t\u0004Љ\r\u0005Љ\u0011\bЉ\u0016\nЉ\u0015\u000eЉ\u000e\u0010Љ\u001c\u0012Љ\u001e\u0017Љ'\u0019Љ\u0006\u001aЉ\f\u001cЉ\u0014 Љ)!Љ!\"Љ\u000f#Љ\u0010$Љ+&Љ*'Љ\u001f)Љ,,Љ$1Љ\u00053Љ\u00177Љ\u001a8Љ7:Љ\"<Љ#>Љ=IЉ JЉCKЉDNЉFQЉ\u0003", new Object[]{"a", "b", "c", "e", "h", "j", "n", "q", "p", "k", "t", "u", "B", "g", "i", "o", "C", "x", "l", "m", "E", "D", "v", "F", "A", "f", "r", "s", "G", "y", "z", "H", "w", "I", "J", "K", "d"});
            case 3:
                return new apzy();
            case 4:
                return new aqab();
            case 5:
                return L;
            case 6:
                Object obj3 = N;
                if (obj3 == null) {
                    synchronized (apzy.class) {
                        obj3 = N;
                        if (obj3 == null) {
                            obj3 = new anxn(L);
                            N = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        apzy apzy = new apzy();
        L = apzy;
        anxl.registerDefaultInstance(apzy.class, apzy);
    }
}
