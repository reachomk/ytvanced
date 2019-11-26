package defpackage;

/* renamed from: avte */
public final class avte extends anxl implements anzf {
    public static final avte x;
    private static volatile anzq z;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public anxz e = anxl.emptyIntList();
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public anyd p = anxl.emptyProtobufList();
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    private byte y = (byte) 2;

    private avte() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.y);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.y = b;
                return null;
            case 2:
                return anxl.newMessageInfo(x, "\u0001\u0016\u0000\u0001\u0001!\u0016\u0000\u0002\u0001\u0001\u0007\u0000\u0004\u0007\u0003\u0005\u0007\u0004\u0006\u0016\u0007\u0007\u0005\u000b\u0007\t\f\u0007\n\u000e\u0007\f\u000f\u0007\r\u0010\u0004\u000e\u0011\u0004\u000f\u0012\u0007\u0010\u0013\u0007\u0011\u0014\u0007\u0012\u0018Л\u0019\u0007\u0013\u001a\u0007\u0014\u001b\u0007\u0015\u001c\u0007\u0016\u001d\u0007\u0017\u001f\u0007\u0019!\u0007\u001b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", arlv.class, "q", "r", "s", "t", "u", "v", "w"});
            case 3:
                return new avte();
            case 4:
                return new avth();
            case 5:
                return x;
            case 6:
                Object obj3 = z;
                if (obj3 == null) {
                    synchronized (avte.class) {
                        obj3 = z;
                        if (obj3 == null) {
                            obj3 = new anxn(x);
                            z = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        avte avte = new avte();
        x = avte;
        anxl.registerDefaultInstance(avte.class, avte);
    }
}
