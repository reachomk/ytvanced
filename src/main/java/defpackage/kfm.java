package defpackage;

import android.view.ViewGroup;
import com.google.android.youtube.R;

/* renamed from: kfm */
final /* synthetic */ class kfm implements akox {
    private final epv a;
    private final akyx b;

    kfm(epv epv, akyx akyx) {
        this.a = epv;
        this.b = akyx;
    }

    public final akot a(ViewGroup viewGroup) {
        epv epv = this.a;
        akyx akyx = this.b;
        eps a = epv.a(R.layout.mysubs_content_filter_button);
        a.a.d = akyx;
        return a;
    }
}
