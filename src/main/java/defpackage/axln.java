package defpackage;

/* renamed from: axln */
public final class axln extends anxl implements anzf {
    public static final axln d;
    public static final anxr e;
    private static volatile anzq g;
    public int a;
    public azuj b;
    public arbk c;
    private byte f = (byte) 2;

    private axln() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.f = b;
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001Љ\u0000\u0002Љ\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new axln();
            case 4:
                return new axlp();
            case 5:
                return d;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (axln.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            g = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        axln axln = new axln();
        d = axln;
        anxl.registerDefaultInstance(axln.class, axln);
        azsr azsr = azsr.a;
        axln axln2 = d;
        e = anxl.newSingularGeneratedExtension(azsr, axln2, axln2, null, 221293762, aobm.MESSAGE, axln.class);
    }
}
