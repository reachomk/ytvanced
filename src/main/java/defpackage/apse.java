package defpackage;

/* renamed from: apse */
public final class apse extends anxl implements anzf {
    public static final apse i;
    private static volatile anzq j;
    public int a;
    public String b;
    public anyd c = anxl.emptyProtobufList();
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;

    private apse() {
        String str = "";
        this.b = str;
        this.d = str;
        this.e = str;
        this.f = str;
        this.g = str;
        this.h = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\b\u0000\u0002\u001b\u0003\b\u0001\u0004\b\u0002\u0005\b\u0003\u0006\b\u0004\u0007\b\u0005", new Object[]{"a", "b", "c", apru.class, "d", "e", "f", "g", "h"});
            case 3:
                return new apse();
            case 4:
                return new apsh();
            case 5:
                return i;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (apse.class) {
                        obj3 = j;
                        if (obj3 == null) {
                            obj3 = new anxn(i);
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
        apse apse = new apse();
        i = apse;
        anxl.registerDefaultInstance(apse.class, apse);
    }
}
