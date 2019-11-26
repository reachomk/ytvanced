package defpackage;

/* renamed from: audv */
public final class audv extends anxl implements anzf {
    public static final audv h;
    private static volatile anzq j;
    public int a;
    public String b = "";
    public arml c;
    public arwf d;
    public arml e;
    public arml f;
    public anyd g = anxl.emptyProtobufList();
    private byte i = (byte) 2;

    private audv() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.i = b;
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0004\u0001\b\u0000\u0003\t\u0003\u0004Љ\u0004\u0005Љ\u0005\u0006Л\u0007Љ\u0002", new Object[]{"a", "b", "d", "e", "f", "g", aphj.class, "c"});
            case 3:
                return new audv();
            case 4:
                return new audu();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (audv.class) {
                        obj3 = j;
                        if (obj3 == null) {
                            obj3 = new anxn(h);
                            j = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        audv audv = new audv();
        h = audv;
        anxl.registerDefaultInstance(audv.class, audv);
    }
}
