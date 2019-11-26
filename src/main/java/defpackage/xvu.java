package defpackage;

import android.content.ContentResolver;

/* renamed from: xvu */
public final class xvu implements baqa {
    private final bcaa a;

    private xvu(bcaa bcaa) {
        this.a = bcaa;
    }

    public static xvu a(bcaa bcaa) {
        return new xvu(bcaa);
    }

    public final /* synthetic */ Object get() {
        return new xvp((ContentResolver) this.a.get());
    }
}
