package defpackage;

/* renamed from: auej */
public final class auej extends anxl implements anzf {
    public static final auej m;
    private static volatile anzq o;
    public int a;
    public String b;
    public long c;
    public arml d;
    public String e;
    public arml f;
    public arml g;
    public aygk h;
    public anyd i;
    public arml j;
    public arml k;
    public apxu l;
    private byte n = (byte) 2;

    private auej() {
        String str = "";
        this.b = str;
        this.e = str;
        this.i = anxl.emptyProtobufList();
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.n = b;
                return null;
            case 2:
                return anxl.newMessageInfo(m, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0001\b\u0001Љ\u0004\u0002Љ\u0005\u0003Љ\u0006\u0004Љ\t\u0005\b\u0000\u0006\u0003\u0001\u0007Л\b\b\u0003\tЉ\u0007\nЉ\b\rЉ\u0002", new Object[]{"a", "f", "g", "h", "l", "b", "c", "i", auce.class, "e", "j", "k", "d"});
            case 3:
                return new auej();
            case 4:
                return new auei();
            case 5:
                return m;
            case 6:
                Object obj3 = o;
                if (obj3 == null) {
                    synchronized (auej.class) {
                        obj3 = o;
                        if (obj3 == null) {
                            obj3 = new anxn(m);
                            o = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        auej auej = new auej();
        m = auej;
        anxl.registerDefaultInstance(auej.class, auej);
    }
}
