package defpackage;

/* renamed from: azdt */
public final class azdt extends anxp implements anzf {
    public static final azdt K;
    private static volatile anzq M;
    public boolean A;
    public anyd B;
    public azdr C;
    public azdx D;
    public azdp E;
    public azdp F;
    public azdp G;
    public azdp H;
    public ayym I;
    public anvu J;
    private byte L = (byte) 2;
    public int a;
    public int b;
    public int c = 0;
    public Object d;
    public String e = "";
    public aygk f;
    public arml g;
    public arml i;
    public arml j;
    public arml k;
    public arml l;
    public arml m;
    public arml n;
    public arml o;
    public arml p;
    public apxu q;
    public anyd r = anxl.emptyProtobufList();
    public apdx s;
    public apdx t;
    public apdx u;
    public aopn v;
    public atwi w;
    public ayri x;
    public azdv y;
    public auvr z;

    private azdt() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        this.B = anxl.emptyProtobufList();
        this.J = anvu.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.L);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.L = b;
                return null;
            case 2:
                return anxl.newMessageInfo(K, "\u0001!\u0001\u0002\u0001-!\u0000\u0002\u001c\u0001\b\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005Љ\u0005\u0006Љ\n\u0007Љ\u000b\bЉ\f\tЉ\u000e\nЛ\rЉ\u0012\u000fЉ\b\u0011Љ\u0014\u0012Љ\t\u0013м\u0000\u0014Љ\u0015\u0015\n#\u0016Љ\u0013\u001aЉ\r\u001b\u0007\u0018\u001cЉ\u0016\u001dЉ\u001a Љ\u0010!м\u0000\"Л#Љ\u000f$Љ\u0011&\t\u001b'Љ\u001c(Љ\u001d)Љ\u001e*Љ\u001f-\t!", new Object[]{"d", "c", "a", "b", "e", "f", "g", "i", "j", "m", "n", "o", "q", "r", apdh.class, "v", "k", "x", "l", aygk.class, "y", "J", "w", "p", "A", "z", "C", "t", appu.class, "B", ayfu.class, "s", "u", "D", "E", "F", "G", "H", "I"});
            case 3:
                return new azdt();
            case 4:
                return new azdw();
            case 5:
                return K;
            case 6:
                Object obj3 = M;
                if (obj3 == null) {
                    synchronized (azdt.class) {
                        obj3 = M;
                        if (obj3 == null) {
                            obj3 = new anxn(K);
                            M = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        azdt azdt = new azdt();
        K = azdt;
        anxl.registerDefaultInstance(azdt.class, azdt);
    }
}
