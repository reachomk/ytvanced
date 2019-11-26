package defpackage;

/* renamed from: atam */
public final class atam extends anxl implements anzf {
    public static final atam h;
    private static volatile anzq j;
    public int a;
    public String b = "";
    public boolean c;
    public arml d;
    public int e;
    public boolean f;
    public boolean g;
    private byte i = (byte) 2;

    private atam() {
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001\b\u0000\u0002\u0007\u0001\u0003Љ\u0002\u0004\u000b\u0003\u0005\u0007\u0004\u0006\u0007\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            case 3:
                return new atam();
            case 4:
                return new atal();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (atam.class) {
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
        atam atam = new atam();
        h = atam;
        anxl.registerDefaultInstance(atam.class, atam);
    }
}
