package defpackage;

/* renamed from: awlq */
public final class awlq extends anxp implements anzf {
    public static final awlq C;
    private static volatile anzq E;
    public aqwj A;
    public axak B;
    private byte D = (byte) 2;
    public int a;
    public String b;
    public aygk c;
    public arml d;
    public arml e;
    public arml f;
    public arml g;
    public apxu i;
    public apdx j;
    public apdx k;
    public apdx l;
    public aphj m;
    public String n;
    public auvr o;
    public awlo p;
    public anvu q;
    public aygk r;
    public apxu s;
    public arml t;
    public boolean u;
    public anyd v;
    public ayri w;
    public awlm x;
    public anyd y;
    public axak z;

    private awlq() {
        String str = "";
        this.b = str;
        anxl.emptyProtobufList();
        this.n = str;
        anxl.emptyProtobufList();
        this.q = anvu.a;
        this.v = anxl.emptyProtobufList();
        this.y = anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(C, "\u0001\u001a\u0000\u0001\u0001#\u001a\u0000\u0002\u0014\u0001\b\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005Љ\u0004\u0006Љ\u0005\u0007Љ\u0006\n\b\f\u000fЉ\u0011\u0011\n\u0014\u0013Љ\u0010\u0014Љ\u0015\u0015Љ\u0016\u0016\u0007\u0018\u0017Љ\u0017\u0018Љ\t\u0019Л\u001aЉ\n\u001bЉ\b\u001cЉ\u0019\u001d\t\u001a\u001fЛ Љ\u000b!Љ\u001c\"\t\u001d#Љ\u001e", new Object[]{"a", "b", "c", "d", "e", "f", "g", "i", "n", "p", "q", "o", "r", "s", "u", "t", "k", "v", ayfu.class, "l", "j", "w", "x", "y", awls.class, "m", "z", "A", "B"});
            case 3:
                return new awlq();
            case 4:
                return new awlt();
            case 5:
                return C;
            case 6:
                Object obj3 = E;
                if (obj3 == null) {
                    synchronized (awlq.class) {
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
        awlq awlq = new awlq();
        C = awlq;
        anxl.registerDefaultInstance(awlq.class, awlq);
    }
}
