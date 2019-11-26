package defpackage;

/* renamed from: azhw */
public final class azhw extends anxl implements anzf {
    public static final azhw n;
    private static volatile anzq p;
    public int a;
    public aygk b;
    public arml c;
    public arml d;
    public arml e;
    public arml f;
    public ayri g;
    public apxu h;
    public anyd i;
    public int j;
    public auvr k;
    public String l;
    public anvu m;
    private byte o = (byte) 2;

    private azhw() {
        anxl.emptyProtobufList();
        this.i = anxl.emptyProtobufList();
        this.l = "";
        this.m = anvu.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.o = b;
                return null;
            case 2:
                return anxl.newMessageInfo(n, "\u0001\f\u0000\u0001\u0001\u000f\f\u0000\u0001\t\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0004\u0005Љ\u0006\u0007\n\f\nЛ\u000b\f\b\fЉ\t\r\b\n\u000eЉ\u0003\u000fЉ\u0005", new Object[]{"a", "b", "c", "d", "f", "h", "m", "i", azhq.class, "j", azgl.a, "k", "l", "e", "g"});
            case 3:
                return new azhw();
            case 4:
                return new azhz();
            case 5:
                return n;
            case 6:
                Object obj3 = p;
                if (obj3 == null) {
                    synchronized (azhw.class) {
                        obj3 = p;
                        if (obj3 == null) {
                            obj3 = new anxn(n);
                            p = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        azhw azhw = new azhw();
        n = azhw;
        anxl.registerDefaultInstance(azhw.class, azhw);
    }
}
