package defpackage;

/* renamed from: ayqd */
public final class ayqd extends anxl implements anzf {
    public static final ayqd h;
    private static volatile anzq j;
    public int a;
    public ayqj b;
    public avix c;
    public ayqj d;
    public avix e;
    public avix f;
    public avix g;
    private byte i = (byte) 2;

    private ayqd() {
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0002\n\u0006\u0000\u0000\u0006\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005Љ\u0004\u0006Љ\u0006\nЉ\u0005", new Object[]{"a", "b", "c", "d", "e", "g", "f"});
            case 3:
                return new ayqd();
            case 4:
                return new ayqc();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (ayqd.class) {
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
        ayqd ayqd = new ayqd();
        h = ayqd;
        anxl.registerDefaultInstance(ayqd.class, ayqd);
    }
}
