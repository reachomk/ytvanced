package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.Map;

/* renamed from: fdf */
public final /* synthetic */ class fdf implements OnClickListener {
    private final fdg a;
    private final Map b;
    private final avkh c;
    private final aphg d;

    public fdf(fdg fdg, Map map, avkh avkh, aphg aphg) {
        this.a = fdg;
        this.b = map;
        this.c = avkh;
        this.d = aphg;
    }

    public final void onClick(View view) {
        fdg fdg = this.a;
        Map map = this.b;
        avkh avkh = this.c;
        aphg aphg = this.d;
        map = acwi.a(map);
        map.put("com.google.android.libraries.youtube.innertube.endpoint.tag", avkh);
        if ((aphg.a & 2048) != 0) {
            aaas aaas = fdg.b;
            apxu apxu = aphg.l;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, map);
        }
        if ((aphg.a & 4096) != 0) {
            aaas aaas2 = fdg.b;
            apxu apxu2 = aphg.m;
            if (apxu2 == null) {
                apxu2 = apxu.d;
            }
            aaas2.a(apxu2, map);
        }
    }
}
