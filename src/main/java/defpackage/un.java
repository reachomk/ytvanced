package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.service.media.MediaBrowserService.Result;

/* renamed from: un */
final class un extends ui {
    private final /* synthetic */ ul a;

    un(ul ulVar, Context context) {
        this.a = ulVar;
        super(ulVar, context);
    }

    public final void onLoadChildren(String str, Result result, Bundle bundle) {
        wq.a(bundle);
        ul ulVar = this.a;
        tv tvVar = ulVar.d;
        tvVar.e = tvVar.b;
        uk ukVar = new uk(str, new uq(result), bundle);
        tv tvVar2 = ulVar.d;
        tvVar2.e = tvVar2.b;
        tvVar2.b(ukVar);
        ulVar.d.e = null;
        this.a.d.e = null;
    }
}
