package defpackage;

/* renamed from: apki */
public final class apki extends anxl implements anzf {
    public static final apki s;
    private static volatile anzq u;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public arml e;
    public apkm f;
    public anyd g;
    public arml h;
    public arml i;
    public arml j;
    public arml k;
    public apks l;
    public apko m;
    public apkq n;
    public apkg o;
    public apxu p;
    public apkk q;
    public axak r;
    private byte t = (byte) 2;

    private apki() {
        anxl.emptyProtobufList();
        this.g = anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(s, "\u0001\u0011\u0000\u0001\u0001\u001c\u0011\u0000\u0001\u0011\u0001Љ\u0002\u0002Л\u0004Љ\u0007\u0005Љ\b\u0006Љ\n\u0007Љ\u000b\bЉ\f\tЉ\r\nЉ\u000e\fЉ\u000f\u0012Љ\u0014\u0013Љ\u0000\u0015Љ\u0005\u0016Љ\u0006\u0018Љ\u0003\u001bЉ\u0015\u001cЉ\t", new Object[]{"a", "c", "g", apjw.class, "h", "i", "k", "l", "m", "n", "o", "p", "q", "b", "e", "f", "d", "r", "j"});
            case 3:
                return new apki();
            case 4:
                return new apkh();
            case 5:
                return s;
            case 6:
                Object obj3 = u;
                if (obj3 == null) {
                    synchronized (apki.class) {
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

    public static anzq a() {
        return s.getParserForType();
    }

    static {
        apki apki = new apki();
        s = apki;
        anxl.registerDefaultInstance(apki.class, apki);
    }
}
