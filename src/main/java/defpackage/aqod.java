package defpackage;

/* renamed from: aqod */
public final class aqod extends anxl implements anzf {
    public static final aqod l;
    private static volatile anzq n;
    public int a;
    public aqnn b;
    public axak c;
    public axak d;
    public arml e;
    public auvr f;
    public aqob g;
    public apxu h;
    public arml i;
    public axak j;
    public aqql k;
    private byte m = (byte) 2;

    private aqod() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.m = b;
                return null;
            case 2:
                return anxl.newMessageInfo(l, "\u0001\n\u0000\u0001\u0005\u001d\n\u0000\u0000\n\u0005Љ\u0006\tЉ\b\u000bЉ\t\u0010Љ\n\u0012Љ\u0002\u0014Љ\u000e\u0018Љ\u0011\u001bЉ\u0012\u001cЉ\u0003\u001dЉ\u0004", new Object[]{"a", "e", "f", "g", "h", "b", "i", "j", "k", "c", "d"});
            case 3:
                return new aqod();
            case 4:
                return new aqoc();
            case 5:
                return l;
            case 6:
                Object obj3 = n;
                if (obj3 == null) {
                    synchronized (aqod.class) {
                        obj3 = n;
                        if (obj3 == null) {
                            obj3 = new anxn(l);
                            n = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aqod aqod = new aqod();
        l = aqod;
        anxl.registerDefaultInstance(aqod.class, aqod);
    }
}
