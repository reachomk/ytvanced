package defpackage;

/* renamed from: audg */
public final class audg extends anxl implements anzf {
    public static final audg h;
    private static volatile anzq j;
    public int a;
    public String b;
    public arwf c;
    public String d;
    public aodx e;
    public boolean f;
    public anvu g;
    private byte i = (byte) 2;

    private audg() {
        String str = "";
        this.b = str;
        this.d = str;
        this.g = anvu.a;
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001\b\u0000\u0002\t\u0001\u0003\b\u0002\u0004\t\u0003\u0005\u0007\u0004\b\n\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            case 3:
                return new audg();
            case 4:
                return new audi();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (audg.class) {
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
        audg audg = new audg();
        h = audg;
        anxl.registerDefaultInstance(audg.class, audg);
    }
}
