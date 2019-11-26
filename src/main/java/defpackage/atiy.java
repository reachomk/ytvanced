package defpackage;

/* renamed from: atiy */
public final class atiy extends anxl implements anzf {
    public static final atiy j;
    private static volatile anzq l;
    public int a;
    public asic b;
    public anyd c = anxl.emptyProtobufList();
    public anyd d = anxl.emptyProtobufList();
    public atiu e;
    public aszm f;
    public anvu g = anvu.a;
    public long h;
    public arnm i;
    private byte k = (byte) 2;

    private atiy() {
    }

    public final boolean hasFrameworkUpdates() {
        return (this.a & 64) != 0;
    }

    public final arnm getFrameworkUpdates() {
        arnm arnm = this.i;
        return arnm == null ? arnm.a : arnm;
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
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0001̉\b\u0000\u0002\u0005\u0001Љ\u0000\u0003\u001b\u0005Л\u0006Љ\u0001\u0007Љ\u0002\t\n\u0004\n\u0002\u0005̉Љ\u0006", new Object[]{"a", "b", "c", aule.class, "d", apxu.class, "e", "f", "g", "h", "i"});
            case 3:
                return new atiy();
            case 4:
                return new atix();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (atiy.class) {
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
        atiy atiy = new atiy();
        j = atiy;
        anxl.registerDefaultInstance(atiy.class, atiy);
    }
}
