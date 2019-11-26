package defpackage;

/* renamed from: aouo */
public final class aouo extends anxl implements anzf {
    public static final aouo u;
    private static volatile anzq w;
    public int a;
    public int b = 0;
    public Object c;
    public aour d;
    public apxu e;
    public apxu f;
    public apxu g;
    public apxu h;
    public apxu i;
    public anyd j = anxl.emptyProtobufList();
    public anyd k = anxl.emptyProtobufList();
    public anyd l = anxl.emptyProtobufList();
    public anye m = anxl.emptyLongList();
    public aofq n;
    public int o;
    public aypp p;
    public aouu q;
    public int r;
    public axak s;
    public auko t;
    private byte v = (byte) 2;

    private aouo() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.v);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.v = b;
                return null;
            case 2:
                return anxl.newMessageInfo(u, "\u0001\u0012\u0001\u0001\u0001ϧ\u0012\u0000\u0004\u000e\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0003\u0004Љ\u0004\u0005Л\u0006Л\b\u0014\nЉ\u0006\u0011м\u0000\u0012\f\t\u0016Љ\u0005\u0018\t\n\u0019Љ\u000b\u001a\u0004\f\u001bЉ\u0002\u001cЛ\u001dЉ\rϧЉ\u0011", new Object[]{"c", "b", "a", "d", "e", "g", "h", "j", aouy.class, "k", apxu.class, "m", "n", aout.class, "o", aouz.a, "i", "p", "q", "r", "f", "l", apxu.class, "s", "t"});
            case 3:
                return new aouo();
            case 4:
                return new aouv();
            case 5:
                return u;
            case 6:
                Object obj3 = w;
                if (obj3 == null) {
                    synchronized (aouo.class) {
                        obj3 = w;
                        if (obj3 == null) {
                            obj3 = new anxn(u);
                            w = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aouo aouo = new aouo();
        u = aouo;
        anxl.registerDefaultInstance(aouo.class, aouo);
    }
}
