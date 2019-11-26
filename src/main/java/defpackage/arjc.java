package defpackage;

/* renamed from: arjc */
public final class arjc extends anxl implements anzf {
    public static final arjc s;
    private static volatile anzq u;
    public int a;
    public apoo b;
    public avdb c;
    public avcz d;
    public awjp e;
    public axmk f;
    public awug g;
    public azdt h;
    public aqdy i;
    public aqfg j;
    public aqfs k;
    public aqgk l;
    public aqgi m;
    public aqgs n;
    public aqqg o;
    public aozs p;
    public aryi q;
    public arbs r;
    private byte t = (byte) 2;

    private arjc() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.t);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.t = b;
                return null;
            case 2:
                return anxl.newMessageInfo(s, "\u0001\u0011\u0000\u0001᠞䤳\u0011\u0000\u0000\u0011᠞Љ\u0006᠟Љ\u0000ᠤЉ\fﳴᠰЉ\u0003ᠲЉ\tᠸЉ\u0007ᥚЉ\u000bᯣЉ\u0001ᯣЉ\bḄЉ\u0005ἍЉ\u000eΆЉ\u0002⟕Љ\u000f⼞Љ\r㋴Љ\nﶜ㌆Љ\u0004䤳Љ\u0010", new Object[]{"a", "h", "b", "n", "e", "k", "i", "m", "c", "j", "g", "p", "d", "q", "o", "l", "f", "r"});
            case 3:
                return new arjc();
            case 4:
                return new arjf();
            case 5:
                return s;
            case 6:
                Object obj3 = u;
                if (obj3 == null) {
                    synchronized (arjc.class) {
                        obj3 = u;
                        if (obj3 == null) {
                            obj3 = new anxn(s);
                            u = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        arjc arjc = new arjc();
        s = arjc;
        anxl.registerDefaultInstance(arjc.class, arjc);
    }
}
