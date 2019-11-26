package defpackage;

import android.content.Context;
import android.service.media.MediaBrowserService.Result;

/* renamed from: ui */
class ui extends uh {
    private final /* synthetic */ ug a;

    ui(ug ugVar, Context context) {
        this.a = ugVar;
        super(ugVar, context);
    }

    public final void onLoadItem(String str, Result result) {
        ug ugVar = this.a;
        uj ujVar = new uj(str, new uq(result));
        tv tvVar = ugVar.d;
        tvVar.e = tvVar.b;
        tv.c(ujVar);
        ugVar.d.e = null;
    }
}
