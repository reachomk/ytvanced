package defpackage;

/* renamed from: augz */
public final class augz extends anxl implements anzf {
    public static final augz m;
    private static volatile anzq o;
    public int a;
    public String b;
    public arml c;
    public audp d;
    public int e;
    public int f;
    public int g;
    public aygk h;
    public int i;
    public int j;
    public apxu k;
    public String l;
    private byte n = (byte) 2;

    private augz() {
        String str = "";
        this.b = str;
        this.l = str;
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
                return anxl.newMessageInfo(m, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0000\u0004\u0001\b\u0000\u0003Љ\u0001\u0004Љ\u0002\u0006\u000b\u0004\u0007\u000b\u0005\b\u000b\u0006\tЉ\u0007\n\u000b\b\u000bЉ\n\f\b\u000b\r\u000b\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "k", "l", "j"});
            case 3:
                return new augz();
            case 4:
                return new augy();
            case 5:
                return m;
            case 6:
                Object obj3 = o;
                if (obj3 == null) {
                    synchronized (augz.class) {
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
        augz augz = new augz();
        m = augz;
        anxl.registerDefaultInstance(augz.class, augz);
    }
}
