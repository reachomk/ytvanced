package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* renamed from: khj */
public final class khj implements akot, OnClickListener {
    private final View a;
    private final ImageView b = ((ImageView) this.a.findViewById(R.id.poster_image));
    private final Context c;
    private final akkq d;
    private final aaas e;
    private final acvx f;
    private awmm g;

    public khj(Context context, akkq akkq, aaas aaas, acwa acwa) {
        this.c = context;
        this.d = akkq;
        this.e = aaas;
        this.f = acwa.t();
        this.a = LayoutInflater.from(context).inflate(R.layout.poster, null);
        this.a.setOnClickListener(this);
    }

    public final View K_() {
        return this.a;
    }

    public final void a(akpb akpb) {
        this.g = null;
    }

    public final void onClick(View view) {
        awmm awmm = this.g;
        if (awmm != null) {
            if ((awmm.a & 32) != 0) {
                this.f.a(3, new acvs(awmm.f.d()), null);
            }
            awmm = this.g;
            if ((awmm.a & 2) != 0) {
                aaas aaas = this.e;
                apxu apxu = awmm.c;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, null);
            }
        }
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        awmm awmm = (awmm) obj;
        this.g = awmm;
        this.f.a(awmm.f.d(), null);
        akkq akkq = this.d;
        ImageView imageView = this.b;
        aygk aygk = awmm.b;
        if (aygk == null) {
            aygk = aygk.f;
        }
        akkq.a(imageView, aygk);
        ImageView imageView2 = this.b;
        aygk aygk2 = awmm.b;
        if (aygk2 == null) {
            aygk2 = aygk.f;
        }
        imageView2.setContentDescription(ezh.a(aygk2));
        Resources resources = this.c.getResources();
        int i = -1;
        if ((awmm.a & 4) != 0) {
            awmo awmo = awmm.d;
            if (awmo == null) {
                awmo = awmo.c;
            }
            int a = awmq.a(awmo.b);
            if (a == 0) {
                a = 1;
            }
            a--;
            if (a == 0) {
                i = resources.getDimensionPixelSize(R.dimen.poster_art_width_default);
            } else if (a == 1) {
                i = resources.getDimensionPixelSize(R.dimen.poster_art_width_large);
            }
        } else {
            i = resources.getDimensionPixelSize(R.dimen.poster_art_width_default);
        }
        if (i > 0) {
            LayoutParams layoutParams = this.a.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = i;
            }
        }
    }
}
