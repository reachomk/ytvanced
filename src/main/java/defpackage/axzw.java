package defpackage;

/* renamed from: axzw */
public final class axzw extends anxl implements anzf {
    public static final axzw k;
    private static volatile anzq m;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public arml c;
    public arml d;
    public apxu e;
    public apxu f;
    public anyd g;
    public apxu h;
    public int i;
    public aphj j;
    private byte l = (byte) 2;

    private axzw() {
        anxl.emptyProtobufList();
        this.g = anxl.emptyProtobufList();
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(k, "\u0001\t\u0000\u0001\u0001\r\t\u0000\u0002\b\u0001Л\u0002Љ\u0000\u0003Љ\u0001\u0004Љ\u0002\u0005Л\u0006Љ\u0004\b\f\u0007\u000bЉ\t\rЉ\u0003", new Object[]{"a", "b", axzs.class, "c", "d", "e", "g", axzy.class, "h", "i", ayat.a, "j", "f"});
            case 3:
                return new axzw();
            case 4:
                return new axzz();
            case 5:
                return k;
            case 6:
                Object obj3 = m;
                if (obj3 == null) {
                    synchronized (axzw.class) {
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
        axzw axzw = new axzw();
        k = axzw;
        anxl.registerDefaultInstance(axzw.class, axzw);
    }
}
