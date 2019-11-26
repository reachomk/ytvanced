package defpackage;

import android.content.Context;
import java.io.File;

/* renamed from: gfp */
final /* synthetic */ class gfp implements zlz {
    private final zlz a;
    private final Context b;

    gfp(zlz zlz, Context context) {
        this.a = zlz;
        this.b = context;
    }

    public final void a(File file, bada bada) {
        zlz zlz = this.a;
        Context context = this.b;
        zlz.a(file, bada);
        new zky(zkw.a(context.getApplicationContext())).execute(new Void[0]);
    }
}
