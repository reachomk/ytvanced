package defpackage;

/* renamed from: apcl */
public final class apcl extends anxl implements anzf {
    public static final apcl A;
    private static volatile anzq C;
    private byte B = (byte) 2;
    public int a;
    public int b;
    public arml c;
    public arml d;
    public arml e;
    public arml f;
    public arml g;
    public arml h;
    public arml i;
    public aphj j;
    public aphj k;
    public apbz l;
    public aphj m;
    public apcd n;
    public apcn o;
    public apcb p;
    public arml q;
    public arml r;
    public axak s;
    public arml t;
    public arml u;
    public arml v;
    public aphj w;
    public axak x;
    public axak y;
    public apxu z;

    private apcl() {
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
                return anxl.newMessageInfo(A, "\u0001\u0018\u0000\u0002\u0002$\u0018\u0000\u0000\u0018\u0002Љ\b\u0003Љ\t\u0004Љ\n\u0005Љ\u0003\u0006Љ\u0007\bЉ\u0000\tЉ\u0004\nЉ\f\u000bЉ\u0005\fЉ\r\rЉ\u000e\u000eЉ\u000f\u000fЉ\u0006\u0010Љ\u0010\u0012Љ\u0013\u0013Љ\u0014\u0014Љ\u0015\u0018Љ\u0019\u001eЉ\u001b\u001fЉ\u001f Љ !Љ!#Љ\u0002$Љ\u0011", new Object[]{"a", "b", "j", "k", "l", "e", "i", "c", "f", "m", "g", "n", "o", "p", "h", "q", "s", "t", "u", "v", "w", "x", "y", "z", "d", "r"});
            case 3:
                return new apcl();
            case 4:
                return new apck();
            case 5:
                return A;
            case 6:
                Object obj3 = C;
                if (obj3 == null) {
                    synchronized (apcl.class) {
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
        apcl apcl = new apcl();
        A = apcl;
        anxl.registerDefaultInstance(apcl.class, apcl);
    }
}
