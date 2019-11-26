package defpackage;

/* renamed from: ayof */
public final class ayof extends anxl implements anzf {
    public static final ayof A;
    private static volatile anzq C;
    private byte B = (byte) 2;
    public int a;
    public int b;
    public arml c;
    public axak d;
    public arml e;
    public apxu f;
    public ayqn g;
    public aphj h;
    public aphj i;
    public ayoh j;
    public arml k;
    public arml l;
    public arml m;
    public apdh n;
    public arml o;
    public arml p;
    public apxu q;
    public arml r;
    public arml s;
    public arml t;
    public arml u;
    public arml v;
    public arml w;
    public arml x;
    public arml y;
    public arml z;

    private ayof() {
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.B);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.B = b;
                return null;
            case 2:
                return anxl.newMessageInfo(A, "\u0001\u0018\u0000\u0002\u0003#\u0018\u0000\u0000\u0018\u0003Љ\u0000\u0004Љ\u0015\u0007Љ \bЉ!\nЉ\u0006\u000bЉ\u001c\fЉ\u001d\rЉ\u0016\u000fЉ\u0018\u0010Љ\u001e\u0011Љ\u001a\u0012Љ\u001b\u0013Љ\u0019\u0015Љ\n\u0016Љ\u0003\u0018Љ\u0005\u0019Љ\u000b\u001aЉ\f\u001cЉ\r\u001dЉ\u000e\u001eЉ\u000f\u001fЉ\b\"Љ\t#Љ\u0001", new Object[]{"a", "b", "c", "p", "y", "z", "g", "v", "w", "q", "r", "x", "t", "u", "s", "j", "e", "f", "k", "l", "m", "n", "o", "h", "i", "d"});
            case 3:
                return new ayof();
            case 4:
                return new ayoi();
            case 5:
                return A;
            case 6:
                Object obj3 = C;
                if (obj3 == null) {
                    synchronized (ayof.class) {
                        obj3 = C;
                        if (obj3 == null) {
                            obj3 = new anxn(A);
                            C = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ayof ayof = new ayof();
        A = ayof;
        anxl.registerDefaultInstance(ayof.class, ayof);
    }
}
