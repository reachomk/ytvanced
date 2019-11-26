package defpackage;

/* renamed from: audr */
public final class audr extends anxl implements anzf {
    public static final audr l;
    private static volatile anzq n;
    public int a;
    public String b;
    public arml c;
    public String d;
    public arml e;
    public arml f;
    public arml g;
    public aygk h;
    public arml i;
    public arml j;
    public apxu k;
    private byte m = (byte) 2;

    private audr() {
        String str = "";
        this.b = str;
        this.d = str;
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
                return anxl.newMessageInfo(l, "\u0001\n\u0000\u0001\u0001\r\n\u0000\u0000\b\u0001\b\u0000\u0003Љ\u0004\u0004Љ\u0005\u0005Љ\u0006\u0006Љ\u0007\u0007\b\u0003\bЉ\n\nЉ\b\u000bЉ\t\rЉ\u0002", new Object[]{"a", "b", "e", "f", "g", "h", "d", "k", "i", "j", "c"});
            case 3:
                return new audr();
            case 4:
                return new audq();
            case 5:
                return l;
            case 6:
                Object obj3 = n;
                if (obj3 == null) {
                    synchronized (audr.class) {
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
        audr audr = new audr();
        l = audr;
        anxl.registerDefaultInstance(audr.class, audr);
    }
}
