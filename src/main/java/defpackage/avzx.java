package defpackage;

/* renamed from: avzx */
public final class avzx extends anxl implements anzf {
    public static final avzx j;
    private static volatile anzq l;
    public int a;
    public String b;
    public String c;
    public apxu d;
    public arml e;
    public arwf f;
    public avzt g;
    public avzr h;
    public anvu i;
    private byte k = (byte) 2;

    private avzx() {
        String str = "";
        this.b = str;
        this.c = str;
        this.i = anvu.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.k = b;
                return null;
            case 2:
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\u0003\u0001\b\u0000\u0002Љ\u0002\u0003Љ\u0003\u0005\t\u0005\u0006\t\u0006\u0007Љ\u0007\t\n\t\n\b\u0001", new Object[]{"a", "b", "d", "e", "f", "g", "h", "i", "c"});
            case 3:
                return new avzx();
            case 4:
                return new avzw();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (avzx.class) {
                        obj3 = l;
                        if (obj3 == null) {
                            obj3 = new anxn(j);
                            l = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        avzx avzx = new avzx();
        j = avzx;
        anxl.registerDefaultInstance(avzx.class, avzx);
    }
}
