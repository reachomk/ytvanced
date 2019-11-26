package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.view.MenuItem;
import android.widget.ImageView;

/* renamed from: wgd */
final class wgd implements ase {
    public final /* synthetic */ wfz a;

    wgd(wfz wfz) {
        this.a = wfz;
    }

    public final boolean a(MenuItem menuItem) {
        this.a.p().onBackPressed();
        wfz wfz = this.a;
        if (wfz.b != null) {
            ImageView imageView = wfz.ac;
            if (imageView == null || imageView.getDrawable() == null) {
                xtl.c("Preview image does not exist.");
            } else {
                this.a.a.execute(new wgg(this, ((BitmapDrawable) this.a.ac.getDrawable()).getBitmap()));
            }
        }
        return true;
    }
}
