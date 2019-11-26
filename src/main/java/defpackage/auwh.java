package defpackage;

/* renamed from: auwh */
public final class auwh extends anxl implements anzf {
    public static final auwh k;
    private static volatile anzq m;
    public int a;
    public String b;
    public apxu c;
    public anyd d;
    public String e;
    public apxu f;
    public int g;
    public boolean h;
    public boolean i;
    public anvu j;
    private byte l = (byte) 2;

    private auwh() {
        String str = "";
        this.b = str;
        this.d = anxl.emptyProtobufList();
        this.e = str;
        this.j = anvu.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.l = b;
                return null;
            case 2:
                return anxl.newMessageInfo(k, "\u0001\t\u0000\u0001\u0002\u000e\t\u0000\u0001\u0003\u0002Л\u0003\b\u0006\u0004Љ\u0007\u0006\n\f\u0007\b\u0002\bЉ\u0005\f\u0004\b\r\u0007\t\u000e\u0007\n", new Object[]{"a", "d", auwf.class, "e", "f", "j", "b", "c", "g", "h", "i"});
            case 3:
                return new auwh();
            case 4:
                return new auwj();
            case 5:
                return k;
            case 6:
                Object obj3 = m;
                if (obj3 == null) {
                    synchronized (auwh.class) {
                        obj3 = m;
                        if (obj3 == null) {
                            obj3 = new anxn(k);
                            m = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        auwh auwh = new auwh();
        k = auwh;
        anxl.registerDefaultInstance(auwh.class, auwh);
    }
}
