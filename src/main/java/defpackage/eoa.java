package defpackage;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: eoa */
public final class eoa {
    private final bcaa a;
    private final bcaa b;

    public eoa(bcaa bcaa, bcaa bcaa2) {
        this.a = (bcaa) eoa.a(bcaa, 1);
        this.b = (bcaa) eoa.a(bcaa2, 2);
    }

    public final enx a(SwipeRefreshLayout swipeRefreshLayout) {
        return new enx((eif) eoa.a((eif) this.a.get(), 1), (ebk) eoa.a((ebk) this.b.get(), 2), (SwipeRefreshLayout) eoa.a(swipeRefreshLayout, 3));
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
