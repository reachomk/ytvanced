package defpackage;

import android.content.ContentResolver;
import android.content.Context;

/* renamed from: iee */
final /* synthetic */ class iee implements bcvk {
    private final Context a;
    private final int b = 3;

    iee(Context context) {
        this.a = context;
    }

    public final void a(Object obj) {
        Context context = this.a;
        int i = this.b;
        bctx bctx = (bctx) obj;
        ContentResolver contentResolver = context.getContentResolver();
        ieb ieb = new ieb(context, bctx, i);
        contentResolver.registerContentObserver(ieb.a, true, ieb);
        bctx.a(new ied(contentResolver, ieb));
    }
}
