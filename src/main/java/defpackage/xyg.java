package defpackage;

/* renamed from: xyg */
public final class xyg {
    public xyg(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8, bcaa bcaa9, bcaa bcaa10, bcaa bcaa11, bcaa bcaa12, bcaa bcaa13, bcaa bcaa14, bcaa bcaa15, bcaa bcaa16, bcaa bcaa17) {
        bcaa bcaa18 = bcaa;
        xyg.a(bcaa, 1);
        bcaa18 = bcaa2;
        xyg.a(bcaa2, 2);
        bcaa18 = bcaa3;
        xyg.a(bcaa3, 3);
        bcaa18 = bcaa4;
        xyg.a(bcaa4, 4);
        bcaa18 = bcaa5;
        xyg.a(bcaa5, 5);
        bcaa18 = bcaa6;
        xyg.a(bcaa6, 6);
        bcaa18 = bcaa7;
        xyg.a(bcaa7, 7);
        bcaa18 = bcaa8;
        xyg.a(bcaa8, 8);
        bcaa18 = bcaa9;
        xyg.a(bcaa9, 9);
        bcaa18 = bcaa10;
        xyg.a(bcaa10, 10);
        bcaa18 = bcaa11;
        xyg.a(bcaa11, 11);
        bcaa18 = bcaa12;
        xyg.a(bcaa12, 12);
        bcaa18 = bcaa13;
        xyg.a(bcaa13, 13);
        xyg.a(bcaa14, 14);
        xyg.a(bcaa15, 15);
        xyg.a(bcaa16, 16);
        xyg.a(bcaa17, 17);
    }

    private static Object a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder(93);
        stringBuilder.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }
}
