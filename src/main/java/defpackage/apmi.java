package defpackage;

/* renamed from: apmi */
public final class apmi extends anxl implements anzf {
    public static final apmi n;
    private static volatile anzq p;
    public int a;
    public int b = 0;
    public Object c;
    public String d = "";
    public arml e;
    public aygk f;
    public apxu g;
    public anvu h = anvu.a;
    public apme i;
    public anyd j = anxl.emptyProtobufList();
    public anyd k = anxl.emptyProtobufList();
    public anyd l = anxl.emptyProtobufList();
    public long m;
    private byte o = (byte) 2;

    private apmi() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.o = b;
                return null;
            case 2:
                return anxl.newMessageInfo(n, "\u0001\f\u0001\u0001\u0001\r\f\u0000\u0003\b\u0001Љ\u0001\u0002Љ\u0002\u0003Љ\u0003\u0004м\u0000\u0005м\u0000\u0007\n\u0007\b\t\b\tЛ\nЛ\u000bЛ\f\b\u0000\r\u0002\n", new Object[]{"c", "b", "a", "e", "f", "g", arml.class, arml.class, "h", "i", "j", apmq.class, "k", apmc.class, "l", apmo.class, "d", "m"});
            case 3:
                return new apmi();
            case 4:
                return new apml();
            case 5:
                return n;
            case 6:
                Object obj3 = p;
                if (obj3 == null) {
                    synchronized (apmi.class) {
                        obj3 = p;
                        if (obj3 == null) {
                            obj3 = new anxn(n);
                            p = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static anzq a() {
        return n.getParserForType();
    }

    static {
        apmi apmi = new apmi();
        n = apmi;
        anxl.registerDefaultInstance(apmi.class, apmi);
    }
}
