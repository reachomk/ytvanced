package defpackage;

/* renamed from: asxy */
public final class asxy extends anxl implements anzf {
    public static final asxy Y;
    private static volatile anzq aa;
    public asyi A;
    public asyi B;
    public asyi C;
    public asyi D;
    public asyi E;
    public asyi F;
    public asyi G;
    public asyi H;
    public asyi I;
    public asyi J;
    public asyi K;
    public asyi L;
    public asyi M;
    public asyi N;
    public asyi O;
    public asyi P;
    public asyi Q;
    public asyi R;
    public asyi S;
    public asyi T;
    public asyi U;
    public asyi V;
    public asyc W;
    public asya X;
    private byte Z = (byte) 2;
    public int a;
    public int b;
    public asic c;
    public apxu d;
    public asye e;
    public asyi f;
    public asyi g;
    public asyi h;
    public asyi i;
    public asyi j;
    public asyi k;
    public asyi l;
    public asyi m;
    public asyi n;
    public asyi o;
    public asyi p;
    public asyi q;
    public asyi r;
    public asyi s;
    public asyi t;
    public asyi u;
    public asyi v;
    public asyi w;
    public asyi x;
    public asyi y;
    public asyi z;

    private asxy() {
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.Z);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.Z = b;
                return null;
            case 2:
                return anxl.newMessageInfo(Y, "\u00010\u0000\u0002\u000140\u0000\u00000\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005Љ\u0004\u0006Љ\u0005\u0007Љ\u0007\bЉ\b\tЉ\t\nЉ\n\u000bЉ\u000b\fЉ\f\rЉ\r\u000fЉ.\u0010Љ/\u0011Љ\u000e\u0012Љ\u000f\u0013Љ\u0010\u0014Љ\u0011\u0015Љ\u0012\u0016Љ\u0013\u0017Љ\u0014\u0018Љ\u0015\u0019Љ\u0016\u001aЉ\u0017\u001bЉ\u0019\u001dЉ\u001a\u001eЉ\u001b\u001fЉ\u001c Љ\u001d!Љ\u001e\"Љ\u001f#Љ $Љ!%Љ\"(Љ#)Љ$*Љ%+Љ&,Љ(-Љ).Љ*/Љ+0Љ,1Љ\u00062Љ'3Љ-4Љ\u0018", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "j", "k", "l", "m", "n", "o", "p", "W", "X", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "Q", "R", "S", "T", "U", "i", "P", "V", "A"});
            case 3:
                return new asxy();
            case 4:
                return new asxx();
            case 5:
                return Y;
            case 6:
                Object obj3 = aa;
                if (obj3 == null) {
                    synchronized (asxy.class) {
                        obj3 = aa;
                        if (obj3 == null) {
                            obj3 = new anxn(Y);
                            aa = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        asxy asxy = new asxy();
        Y = asxy;
        anxl.registerDefaultInstance(asxy.class, asxy);
    }
}
