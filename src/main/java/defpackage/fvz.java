package defpackage;

import com.google.android.youtube.R;
import java.util.Map;

/* renamed from: fvz */
final /* synthetic */ class fvz implements xar {
    private final fvw a;
    private final apxu b;
    private final Map c;

    fvz(fvw fvw, apxu apxu, Map map) {
        this.a = fvw;
        this.b = apxu;
        this.c = map;
    }

    public final void accept(Object obj) {
        fvw fvw = this.a;
        apxu apxu = this.b;
        Map map = this.c;
        if (((atoa) obj).c) {
            fvw.b.d(new aaxd(apxu, xsb.c(map, "com.google.android.libraries.youtube.innertube.endpoint.tag")));
            xpr.a(fvw.a, (int) R.string.delete_inprogress_upload_done, 1);
        }
    }
}
