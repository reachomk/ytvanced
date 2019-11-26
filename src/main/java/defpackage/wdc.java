package defpackage;

import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: wdc */
final /* synthetic */ class wdc implements wla {
    private final wda a;
    private final wkt b;
    private final wdj c;
    private final akvy d;
    private final wef e;

    wdc(wda wda, wkt wkt, wdj wdj, akvy akvy, wef wef) {
        this.a = wda;
        this.b = wkt;
        this.c = wdj;
        this.d = akvy;
        this.e = wef;
    }

    public final void a(String str, String str2) {
        wda wda = this.a;
        wkt wkt = this.b;
        wdj wdj = this.c;
        akvy akvy = this.d;
        wef wef = this.e;
        if (wda.d.c()) {
            int i = wdj.i;
            int i2 = i - 1;
            if (i != 0) {
                String str3 = "com.google.android.libraries.youtube.innertube.endpoint.tag";
                Map zjVar;
                if (i2 != 0) {
                    if (i2 == 1) {
                        if (wdj.g == null) {
                            xpr.a(wda.a, (int) R.string.error_comment_failed, 1);
                            wkt.d();
                            return;
                        }
                        wdl wdl = new wdl(wda, akvy, wdj, wkt, str);
                        zjVar = new zj();
                        zjVar.put(str3, wdl);
                        wda.b.a(wdj.g, zjVar);
                        return;
                    }
                } else if (wdj.g == null) {
                    xpr.a(wda.a, (int) R.string.error_comment_failed, 1);
                    wkt.d();
                    return;
                } else {
                    wdm wdm = new wdm(wda, akvy, wef, wdj, wkt, str, str2);
                    zjVar = new HashMap();
                    zjVar.put(str3, wdm);
                    wda.b.a(wdj.g, zjVar);
                    return;
                }
            }
            throw null;
        }
        wkt.d();
        wda.a(wda.a.getText(R.string.common_error_connection), wdj, akvy, wef, wkt);
    }
}
