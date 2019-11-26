package defpackage;

/* renamed from: atcw */
public final class atcw extends anxl implements anzf {
    public static final atcw d;
    private static volatile anzq f;
    public int a;
    public avqc b;
    public anyd c = anxl.emptyProtobufList();
    private byte e = (byte) 2;

    private atcw() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.e = b;
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Љ\u0000\u0002\u001b", new Object[]{"a", "b", "c", atcy.class});
            case 3:
                return new atcw();
            case 4:
                return new atcv();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (atcw.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            f = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        atcw atcw = new atcw();
        d = atcw;
        anxl.registerDefaultInstance(atcw.class, atcw);
    }
}
