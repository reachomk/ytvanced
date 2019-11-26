package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* renamed from: epn */
public final class epn extends epi {
    public epk d;
    private final ImageView e;

    public epn(View view, akkq akkq, epk epk) {
        super(view, akkq, epk);
        view.setVisibility(8);
        this.e = (ImageView) view.findViewById(R.id.image);
        view.setOnClickListener(new epm(this));
        b();
    }

    public final void a(epk epk) {
        this.d = epk;
        b();
    }

    private final void b() {
        Object obj = this.c;
        boolean z = false;
        if (!(obj == null || (((aokt) obj).a & 4) == 0 || this.d == null)) {
            z = true;
        }
        a(z);
    }

    public final void a() {
        super.a();
        this.e.setImageDrawable(null);
    }

    public final void a(aokt aokt, acvx acvx) {
        if (acvx != null) {
            acvx.a(aokt.f.d(), null);
        }
        this.c = aokt;
        this.a.setVisibility(0);
        if ((aokt.a & 2) != 0) {
            akkq akkq = this.b;
            ImageView imageView = this.e;
            aygk aygk = aokt.c;
            if (aygk == null) {
                aygk = aygk.f;
            }
            akkq.a(imageView, aygk, epi.a((int) R.drawable.quantum_ic_expand_more_grey600_18));
            if (this.e.getBackground() != null && (this.e.getBackground().getCurrent() instanceof GradientDrawable)) {
                GradientDrawable gradientDrawable = (GradientDrawable) this.e.getBackground().getCurrent().mutate();
                gradientDrawable.setColor(aokt.b);
                this.e.setBackground(gradientDrawable);
            }
            b();
            return;
        }
        this.a.setVisibility(8);
    }

    public final void a(aokt aokt, acvx acvx, aaas aaas) {
        if ((aokt.a & 8) != 0) {
            apxu apxu = aokt.e;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, null);
        }
        a(aokt, acvx);
    }
}
