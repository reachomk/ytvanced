package defpackage;

import android.content.Intent;

/* renamed from: dyd */
final /* synthetic */ class dyd implements wxe {
    private final dye a;

    dyd(dye dye) {
        this.a = dye;
    }

    public final boolean a(int i, int i2, Intent intent) {
        dye dye = this.a;
        if (intent != null && intent.getBooleanExtra("refresh_my_videos", false)) {
            dye.a.d(new fnm());
        }
        return true;
    }
}
