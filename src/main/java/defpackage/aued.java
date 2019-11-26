package defpackage;

/* renamed from: aued */
public final class aued extends anxl implements anzf {
    public static final aued t;
    private static volatile anzq v;
    public int a;
    public int b = 0;
    public Object c;
    public String d;
    public long e;
    public arml f;
    public String g;
    public arml h;
    public aygk i;
    public arml j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public arml p;
    public arml q;
    public apxu r;
    public axak s;
    private byte u = (byte) 2;

    private aued() {
        String str = "";
        this.d = str;
        this.g = str;
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.u);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.u = b;
                return null;
            case 2:
                return anxl.newMessageInfo(t, "\u0001\u0013\u0001\u0001\u0001\u0017\u0013\u0000\u0000\n\u0001\b\u0000\u0002\u0003\u0001\u0003Љ\u0004\u0004Љ\u0005\u0005Љ\u0006\u0006:\u0000\u0007м\u0000\bм\u0000\t\u000b\b\n\u000b\t\u000b\u000b\n\f\u000b\u000b\r\b\u0003\u000e\u000b\u0007\u000fЉ\u0012\u0012Љ\u0010\u0013Љ\u0011\u0016Љ\u0002\u0017Љ\u0014", new Object[]{"c", "b", "a", "d", "e", "h", "i", "j", arml.class, aueb.class, "l", "m", "n", "o", "g", "k", "r", "p", "q", "f", "s"});
            case 3:
                return new aued();
            case 4:
                return new auec();
            case 5:
                return t;
            case 6:
                Object obj3 = v;
                if (obj3 == null) {
                    synchronized (aued.class) {
                        obj3 = v;
                        if (obj3 == null) {
                            obj3 = new anxn(t);
                            v = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aued aued = new aued();
        t = aued;
        anxl.registerDefaultInstance(aued.class, aued);
    }
}
