package defpackage;

/* renamed from: avjf */
public final class avjf extends anxl implements anzf {
    public static final avjf h;
    private static volatile anzq i;
    public int a;
    public String b;
    public int c;
    public int d;
    public String e;
    public boolean f;
    public azfa g;

    private avjf() {
        String str = "";
        this.b = str;
        this.e = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u000b\u0006\u0000\u0000\u0000\u0001\b\u0000\u0004\u0004\u0001\u0005\u0004\u0002\u0007\b\u0005\t\u0007\t\u000b\t\n", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            case 3:
                return new avjf();
            case 4:
                return new avjh();
            case 5:
                return h;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (avjf.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(h);
                            i = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        avjf avjf = new avjf();
        h = avjf;
        anxl.registerDefaultInstance(avjf.class, avjf);
    }
}
