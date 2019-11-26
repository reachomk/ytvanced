package defpackage;

import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;

/* renamed from: zrm */
final /* synthetic */ class zrm implements Runnable {
    private final zrg a;
    private final ChooseFilterView b;
    private final String c;

    zrm(zrg zrg, ChooseFilterView chooseFilterView, String str) {
        this.a = zrg;
        this.b = chooseFilterView;
        this.c = str;
    }

    public final void run() {
        zrg zrg = this.a;
        ChooseFilterView chooseFilterView = this.b;
        String str = this.c;
        if (chooseFilterView.c() == null) {
            zjy zjy = zrg.aC;
            boolean z = zjy != null && zjy.a(ayzc.EFFECTS_FEATURE_DOT_ON_EFFECT_THUMBNAIL);
            chooseFilterView.a(zrg.au, zrg.ab(), z, false, zrg.ap);
            zjx zjx = zrg.aD;
            if (zjx != null) {
                zjx.a(chooseFilterView.c());
            }
            chooseFilterView.c().registerObserver(new zrn(zrg, chooseFilterView));
            zrg.at.b.a(zrg.ay, chooseFilterView.c());
            acvx acvx = zrg.aa;
            if (acvx != null) {
                uit uit = zrg.av;
                if (uit != null) {
                    chooseFilterView.a(acvx, uit);
                }
            }
            if (str != null) {
                chooseFilterView.a.c(str);
            }
            zrg.an();
        }
    }
}
