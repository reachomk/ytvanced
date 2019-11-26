package defpackage;

/* renamed from: azck */
public final class azck extends anxp implements anzf {
    public static final azck B;
    private static volatile anzq D;
    public apxu A;
    private byte C = (byte) 2;
    public int a;
    public int b;
    public apdx c;
    public apdx d;
    public arml e;
    public arml f;
    public arml g;
    public azcq i;
    public arml j;
    public arml k;
    public azcg l;
    public arml m;
    public arml n;
    public arml o;
    public arml p;
    public arml q;
    public arml r;
    public arml s;
    public atzt t;
    public aphr u;
    public azcc v;
    public arml w;
    public azco x;
    public azce y;
    public azcm z;

    private azck() {
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.C);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.C = b;
                return null;
            case 2:
                return anxl.newMessageInfo(B, "\u0001\u0018\u0000\u0002\u0001-\u0018\u0000\u0000\u0018\u0001Љ\u0002\u0002Љ\u0004\u0003Љ\u0007\u0004Љ\u000b\u0005Љ\r\u0006Љ\n\u0007Љ\f\nЉ\u0013\rЉ\u0017\u0011Љ\u001d\u0012Љ\u0006\u0014Љ \u0015Љ!\u0016Љ\u0005\u0019Љ#\u001eЉ\u0018\u001fЉ\u001b!Љ\u0003\"Љ\u0000#Љ\u0001%Љ\u000f)Љ%*Љ\b-Љ\u0014", new Object[]{"a", "b", "e", "g", "k", "n", "p", "m", "o", "r", "t", "w", "j", "x", "y", "i", "z", "u", "v", "f", "c", "d", "q", "A", "l", "s"});
            case 3:
                return new azck();
            case 4:
                return new azcj();
            case 5:
                return B;
            case 6:
                Object obj3 = D;
                if (obj3 == null) {
                    synchronized (azck.class) {
                        obj3 = D;
                        if (obj3 == null) {
                            obj3 = new anxn(B);
                            D = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        azck azck = new azck();
        B = azck;
        anxl.registerDefaultInstance(azck.class, azck);
    }
}
