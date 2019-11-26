package defpackage;

import com.google.protos.youtube.api.innertube.MenuEndpointOuterClass$MenuEndpoint;
import com.google.protos.youtube.api.innertube.PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint;

@Deprecated
/* renamed from: arbc */
public final class arbc extends anxp implements anzf {
    public static final arbc n;
    private static volatile anzq p;
    public int a;
    public apge b;
    public azje c;
    public MenuEndpointOuterClass$MenuEndpoint d;
    public ayvl e;
    public aowy f;
    public aqxc g;
    public PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint i;
    public axkz j;
    public arba k;
    public apxu l;
    public apxu m;
    private byte o = (byte) 2;

    private arbc() {
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(n, "\u0001\u000b\u0000\u0001΄养\u000b\u0000\u0000\u000b΄Љ\u0010΅Љ\u0011᜷Љ\u0002᜷Љ\u0003ឰЉ\u0006ḇЉ\u0007￵ὯЉ\t⻍Љ\u0004丕Љ\u000b俻Љ\b养Љ\n", new Object[]{"a", "l", "m", "b", "c", "e", "f", "i", "d", "k", "g", "j"});
            case 3:
                return new arbc();
            case 4:
                return new arbf();
            case 5:
                return n;
            case 6:
                Object obj3 = p;
                if (obj3 == null) {
                    synchronized (arbc.class) {
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

    static {
        arbc arbc = new arbc();
        n = arbc;
        anxl.registerDefaultInstance(arbc.class, arbc);
    }
}
