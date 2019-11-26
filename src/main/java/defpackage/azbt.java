package defpackage;

/* renamed from: azbt */
public final class azbt extends anxl implements anzf {
    public static final azbt C;
    private static volatile anzq E;
    public auvr A;
    public apxu B;
    private byte D = (byte) 2;
    public int a;
    public int b;
    public arml c;
    public arml d;
    public arml e;
    public azbz f;
    public axwz g;
    public arml h;
    public arml i;
    public arml j;
    public arml k;
    public arml l;
    public arml m;
    public arml n;
    public azbv o;
    public arml p;
    public apdx q;
    public apdx r;
    public apel s;
    public atzt t;
    public aphr u;
    public azbr v;
    public axak w;
    public axak x;
    public azbp y;
    public azbx z;

    private azbt() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.D);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.D = b;
                return null;
            case 2:
                return anxl.newMessageInfo(C, "\u0001\u001a\u0000\u0002\u0001/\u001a\u0000\u0000\u001a\u0001Љ\u0000\u0003Љ\u0002\u0004Љ\u0003\u0005Љ\u0005\u0006Љ\u0006\u0007Љ\u0007\bЉ\b\tЉ\n\nЉ\f\fЉ\u000e\u0010Љ\u0013\u0017Љ\u0011\u0018Љ\u001a\u001bЉ\u000b Љ\"!Љ\u0004\"Љ#%Љ$&Љ%'Љ\u001b(Љ\u0015)Љ\u0016*Љ\u001c+Љ\u0017.Љ\u001d/Љ\u001e", new Object[]{"a", "b", "c", "d", "e", "g", "h", "i", "j", "k", "m", "n", "p", "o", "t", "l", "y", "f", "z", "A", "B", "u", "q", "r", "v", "s", "w", "x"});
            case 3:
                return new azbt();
            case 4:
                return new azbs();
            case 5:
                return C;
            case 6:
                Object obj3 = E;
                if (obj3 == null) {
                    synchronized (azbt.class) {
                        obj3 = E;
                        if (obj3 == null) {
                            obj3 = new anxn(C);
                            E = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        azbt azbt = new azbt();
        C = azbt;
        anxl.registerDefaultInstance(azbt.class, azbt);
    }
}
