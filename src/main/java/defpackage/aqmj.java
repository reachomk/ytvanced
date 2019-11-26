package defpackage;

/* renamed from: aqmj */
public final class aqmj extends anxl implements anzf {
    public static final aqmj j;
    private static volatile anzq l;
    public int a;
    public arml b;
    public aygk c;
    public auvr d;
    public aphj e;
    public arml f;
    public arml g;
    public apxu h;
    public String i = "";
    private byte k = (byte) 2;

    private aqmj() {
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
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0001\f\b\u0000\u0000\u0007\u0001Љ\u0000\u0002Љ\u0001\u0004Љ\u0002\u0005Љ\u0003\u0006Љ\u0006\t\b\t\u000bЉ\u0004\fЉ\u0005", new Object[]{"a", "b", "c", "d", "e", "h", "i", "f", "g"});
            case 3:
                return new aqmj();
            case 4:
                return new aqmm();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (aqmj.class) {
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
        aqmj aqmj = new aqmj();
        j = aqmj;
        anxl.registerDefaultInstance(aqmj.class, aqmj);
    }
}
