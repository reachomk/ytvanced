package defpackage;

/* renamed from: apge */
public final class apge extends anxl implements anzf {
    public static final apge j;
    private static volatile anzq l;
    public int a;
    public String b;
    public String c;
    public String d;
    public boolean e;
    public apgk f;
    public apgm g;
    public aqtc h;
    public String i;
    private byte k = (byte) 2;

    private apge() {
        String str = "";
        this.b = str;
        this.c = str;
        this.d = str;
        this.i = str;
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
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0002\f\b\u0000\u0000\u0001\u0002\b\u0000\u0003\b\u0002\u0005\b\u0003\u0006Љ\u0005\u0007\u0007\u0004\b\t\u0006\t\t\u0007\f\b\n", new Object[]{"a", "b", "c", "d", "f", "e", "g", "h", "i"});
            case 3:
                return new apge();
            case 4:
                return new apgd();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (apge.class) {
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
        apge apge = new apge();
        j = apge;
        anxl.registerDefaultInstance(apge.class, apge);
    }
}
