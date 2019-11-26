package defpackage;

/* renamed from: audt */
public final class audt extends anxl implements anzf {
    public static final audt o;
    private static volatile anzq q;
    public int a;
    public int b = 0;
    public Object c;
    public String d;
    public arml e;
    public String f;
    public arml g;
    public arml h;
    public arml i;
    public aygk j;
    public anyd k;
    public arml l;
    public arml m;
    public apxu n;
    private byte p = (byte) 2;

    private audt() {
        String str = "";
        this.d = str;
        this.f = str;
        this.k = anxl.emptyProtobufList();
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.p = b;
                return null;
            case 2:
                return anxl.newMessageInfo(o, "\u0001\u000e\u0001\u0001\u0001\u000f\u000e\u0000\u0001\u000b\u0001\b\u0000\u0003Љ\u0002\u0004\b\u0003\u0005Љ\u0004\u0006Љ\u0005\u0007:\u0000\bм\u0000\tм\u0000\nЉ\t\u000bЉ\n\fЛ\rЉ\u000b\u000eЉ\f\u000fЉ\r", new Object[]{"c", "b", "a", "d", "e", "f", "g", "h", arml.class, aueb.class, "i", "j", "k", auce.class, "l", "m", "n"});
            case 3:
                return new audt();
            case 4:
                return new auds();
            case 5:
                return o;
            case 6:
                Object obj3 = q;
                if (obj3 == null) {
                    synchronized (audt.class) {
                        obj3 = q;
                        if (obj3 == null) {
                            obj3 = new anxn(o);
                            q = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        audt audt = new audt();
        o = audt;
        anxl.registerDefaultInstance(audt.class, audt);
    }
}
