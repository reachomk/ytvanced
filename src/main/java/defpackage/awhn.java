package defpackage;

/* renamed from: awhn */
public final class awhn extends anxl implements anzf {
    public static final awhn l;
    private static volatile anzq n;
    public int a;
    public int b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public int i;
    public String j;
    public boolean k;
    private byte m = (byte) 2;

    private awhn() {
        String str = "";
        this.c = str;
        this.d = str;
        this.e = str;
        this.f = str;
        this.g = str;
        this.h = str;
        this.j = str;
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.m = b;
                return null;
            case 2:
                return anxl.newMessageInfo(l, "\u0001\n\u0000\u0001\u0002\u001e\n\u0000\u0000\u0000\u0002\b\u0001\u0003\b\u0003\u0005\b\u0005\u0006\f\u0000\n\b\u0007\u000b\b\b\r\f\n\u0011\b\u000e\u001d\u0007\u0015\u001e\b\u0004", new Object[]{"a", "c", "d", "f", "b", awho.a, "g", "h", "i", awnx.a(), "j", "k", "e"});
            case 3:
                return new awhn();
            case 4:
                return new awhm();
            case 5:
                return l;
            case 6:
                Object obj3 = n;
                if (obj3 == null) {
                    synchronized (awhn.class) {
                        obj3 = n;
                        if (obj3 == null) {
                            obj3 = new anxn(l);
                            n = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        awhn awhn = new awhn();
        l = awhn;
        anxl.registerDefaultInstance(awhn.class, awhn);
    }
}
