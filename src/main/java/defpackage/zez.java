package defpackage;

import android.view.View;
import com.google.android.libraries.youtube.edit.audioswap.ui.AudioSelectionActivity;
import com.google.android.libraries.youtube.edit.audioswap.ui.AudioSwapTabsBar;

/* renamed from: zez */
public final class zez implements zeo {
    private final /* synthetic */ AudioSelectionActivity a;

    public zez(AudioSelectionActivity audioSelectionActivity) {
        this.a = audioSelectionActivity;
    }

    public final void a(zep zep, zen zen, zer zer) {
        AudioSelectionActivity audioSelectionActivity = this.a;
        if (!audioSelectionActivity.p) {
            int i;
            audioSelectionActivity.h = new zfd(audioSelectionActivity.g, zep, zen, zer);
            audioSelectionActivity.j.a();
            boolean z = false;
            for (i = 0; i < audioSelectionActivity.h.c(); i++) {
                AudioSwapTabsBar audioSwapTabsBar = audioSelectionActivity.j;
                CharSequence b = audioSelectionActivity.h.b(i);
                audioSwapTabsBar.a(b, b);
            }
            audioSelectionActivity.j.setVisibility(0);
            audioSelectionActivity.i.a(audioSelectionActivity.h);
            acvx acvx = audioSelectionActivity.n;
            if (!(acvx == null || acvx.c() == null)) {
                for (i = 0; i < audioSelectionActivity.h.c(); i++) {
                    audioSelectionActivity.n.b(audioSelectionActivity.h.c(i), null);
                }
                audioSelectionActivity.j.v = new zfc(audioSelectionActivity);
            }
            xpr.a(audioSelectionActivity.k, false);
            nf a = audioSelectionActivity.g.a("category_contents_fragment_tag");
            View view = audioSelectionActivity.j;
            if (a == null) {
                z = true;
            }
            xpr.a(view, z);
            xpr.a(audioSelectionActivity.i, z);
        }
    }

    public final void a() {
        AudioSelectionActivity audioSelectionActivity = this.a;
        if (!audioSelectionActivity.p) {
            audioSelectionActivity.k.setVisibility(0);
            audioSelectionActivity.l.setVisibility(8);
            audioSelectionActivity.m.setVisibility(0);
            audioSelectionActivity.i.setVisibility(8);
        }
    }
}
