package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kxl */
public final class kxl extends akpl {
    private final akkq a;
    private final View b;

    public kxl(akkq akkq, ViewStub viewStub) {
        this.a = akkq;
        viewStub.setLayoutResource(R.layout.primetime_promo_header_layout);
        this.b = viewStub.inflate();
    }

    public final void a(akpb akpb) {
    }

    private static void a(int i, ImageView imageView, TextView textView) {
        LayoutParams layoutParams = (LayoutParams) imageView.getLayoutParams();
        layoutParams.addRule(i);
        imageView.setLayoutParams(layoutParams);
        LayoutParams layoutParams2 = (LayoutParams) textView.getLayoutParams();
        layoutParams2.addRule(i);
        textView.setLayoutParams(layoutParams2);
    }

    public final View K_() {
        return this.b;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(akor akor, Object obj) {
        arml arml;
        awnu awnu = (awnu) obj;
        ImageView imageView = (ImageView) this.b.findViewById(R.id.logo);
        if ((awnu.a & 1) != 0) {
            aygk aygk = awnu.b;
            if (aygk == null) {
                aygk = aygk.f;
            }
            aygm c = aklb.c(aygk);
            if (c != null) {
                int i = c.c;
                int i2 = c.d;
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                layoutParams.width = (int) ((((float) i) / ((float) i2)) * ((float) layoutParams.height));
                imageView.setLayoutParams(layoutParams);
            }
        }
        akkq akkq = this.a;
        aygk aygk2 = awnu.b;
        if (aygk2 == null) {
            aygk2 = aygk.f;
        }
        akkq.a(imageView, aygk2, akko.h);
        TextView textView = (TextView) this.b.findViewById(R.id.headline);
        if ((awnu.a & 8) != 0) {
            arml = awnu.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        int a = awnl.a(awnu.d);
        if (a == 0) {
            a = 1;
        }
        if (a - 1 != 2) {
            kxl.a(20, imageView, textView);
        } else {
            kxl.a(14, imageView, textView);
        }
    }
}
