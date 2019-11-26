package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import com.google.android.apps.youtube.app.common.ui.chipcloud.ChipCloudView;
import com.google.android.youtube.R;

/* renamed from: kag */
public final class kag extends akpl {
    private final akou a;
    private final FrameLayout b;
    private final ChipCloudView c;
    private final HorizontalScrollView d;
    private final kaj e;

    public kag(Context context, flu flu, epf epf) {
        this.a = (akou) amqw.a((Object) flu);
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.cloud_chip_side_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.cloud_chip_bottom_padding);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.cloud_chip_margin);
        this.c = new ChipCloudView(context);
        this.c.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize2);
        this.c.a(dimensionPixelSize3, dimensionPixelSize3);
        this.d = new HorizontalScrollView(context);
        this.d.setHorizontalScrollBarEnabled(false);
        this.b = new FrameLayout(context);
        this.e = new kaj(context, (akpb) epf.get());
        flu.a(this.b);
        flu.a(false);
    }

    public final View K_() {
        return this.a.a();
    }

    public final void a(akpb akpb) {
        this.e.a(this.c);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(akor akor, Object obj) {
        aptr aptr = (aptr) obj;
        this.b.removeAllViews();
        this.d.removeAllViews();
        this.c.removeAllViews();
        if (aptr.e) {
            this.c.a(1);
            this.d.addView(this.c);
            this.b.addView(this.d);
        } else {
            this.b.addView(this.c);
            this.c.a(aptr.c);
        }
        for (aptt aptt : aptr.b) {
            if (aptt.a == 91394224) {
                Object obj2;
                kaj kaj = this.e;
                akor a = kaj.a(akor);
                if (aptt.a == 91394224) {
                    obj2 = (aptl) aptt.b;
                } else {
                    obj2 = aptl.i;
                }
                this.c.addView(kaj.a(a, obj2));
            }
        }
        this.a.a(akor);
    }
}
