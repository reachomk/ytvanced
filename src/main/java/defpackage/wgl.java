package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* renamed from: wgl */
final class wgl implements OnClickListener {
    private final /* synthetic */ int a;
    private final /* synthetic */ ImageView b;
    private final /* synthetic */ wgm c;

    wgl(wgm wgm, int i, ImageView imageView) {
        this.c = wgm;
        this.a = i;
        this.b = imageView;
    }

    public final void onClick(View view) {
        wgm wgm = this.c;
        int i = wgm.b;
        int i2 = this.a;
        if (i == i2) {
            i2 = 0;
        }
        wgm.b = i2;
        wgm.a();
        wgm = this.c;
        this.b.setImageDrawable(((ImageView) wgm.c.getChildAt(wgm.b).findViewById(R.id.filter_thumbnail)).getDrawable());
    }
}
