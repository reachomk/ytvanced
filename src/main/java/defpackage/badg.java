package defpackage;

/* renamed from: badg */
public final class badg extends anxl implements anzf {
    public static final badg k;
    private static volatile anzq l;
    public int a;
    public String b;
    public String c;
    public aocv d;
    public aocv e;
    public baao f;
    public int g;
    public int h;
    public float i;
    public boolean j;

    private badg() {
        String str = "";
        this.b = str;
        this.c = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(k, "\u0001\t\u0000\u0001\u0001\u000f\t\u0000\u0000\u0000\u0001\b\u0000\u0005\b\u0002\u0006\t\u0003\u0007\t\u0004\b\t\u0007\t\f\b\n\f\t\u000b\u0001\n\u000f\u0007\u000e", new Object[]{"a", "b", "c", "d", "e", "f", "g", baan.a, "h", babk.a(), "i", "j"});
            case 3:
                return new badg();
            case 4:
                return new badj();
            case 5:
                return k;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (badg.class) {
                        obj3 = l;
                        if (obj3 == null) {
                            obj3 = new anxn(k);
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
        badg badg = new badg();
        k = badg;
        anxl.registerDefaultInstance(badg.class, badg);
    }
}
