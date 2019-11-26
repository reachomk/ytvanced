package defpackage;

/* renamed from: aqwh */
public final class aqwh extends anxl implements anzf {
    public static final aqwh i;
    public static final anxr j;
    private static volatile anzq l;
    public int a;
    public String b;
    public String c;
    public String d;
    public String e;
    public azuj f;
    public azsr g;
    public azsr h;
    private byte k = (byte) 2;

    private aqwh() {
        String str = "";
        this.b = str;
        this.c = str;
        this.d = str;
        this.e = str;
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
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0003\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002\u0004\b\u0003\u0005Љ\u0005\u0006Љ\u0006\u0007Љ\u0004", new Object[]{"a", "b", "c", "d", "e", "g", "h", "f"});
            case 3:
                return new aqwh();
            case 4:
                return new aqwg();
            case 5:
                return i;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (aqwh.class) {
                        obj3 = l;
                        if (obj3 == null) {
                            obj3 = new anxn(i);
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
        aqwh aqwh = new aqwh();
        i = aqwh;
        anxl.registerDefaultInstance(aqwh.class, aqwh);
        azsr azsr = azsr.a;
        aqwh aqwh2 = i;
        j = anxl.newSingularGeneratedExtension(azsr, aqwh2, aqwh2, null, 183321338, aobm.MESSAGE, aqwh.class);
    }
}
