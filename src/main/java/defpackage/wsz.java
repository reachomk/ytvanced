package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: wsz */
final class wsz {
    public final TextView a;
    public final ImageView b;
    public final ImageView c;
    public final TextView d;
    public final View e;
    public final View f;
    public final TextView g;
    public final int h;
    public final akyy i;
    public final xom j;
    public int[] k;
    public final /* synthetic */ wsw l;
    private final TextView m;

    wsz(wsw wsw, int i) {
        this.l = wsw;
        this.h = i;
        if (i != 0) {
            this.f = a(R.layout.unlimited_page_header_v2).findViewById(R.id.unlimited_page_header);
        } else {
            this.f = a(R.layout.unlimited_page_header);
        }
        this.b = (ImageView) this.f.findViewById(R.id.promo_background);
        this.c = (ImageView) this.f.findViewById(R.id.promo_logo);
        this.a = (TextView) this.f.findViewById(R.id.promo_header_description);
        this.m = (TextView) this.f.findViewById(R.id.subscription_button);
        this.d = (TextView) this.f.findViewById(R.id.metadata);
        this.e = this.f.findViewById(R.id.background_scrim);
        this.i = wsw.d.a(this.m);
        this.j = xop.a(this.e);
        this.g = (TextView) this.f.findViewById(R.id.promotion_text);
        this.m.addOnLayoutChangeListener(akza.a(this.m, wsw.c.getResources().getDimensionPixelSize(R.dimen.price_icon_size)));
    }

    private final View a(int i) {
        return LayoutInflater.from(this.l.c).inflate(i, this.l.b, false);
    }

    public static aygk a(aygo aygo, boolean z) {
        if (aygo == null) {
            return null;
        }
        aygk aygk;
        aygn aygn = aygo.b;
        if (aygn == null) {
            aygn = aygn.d;
        }
        if (z) {
            aygk = aygn.c;
            if (aygk == null) {
                return aygk.f;
            }
        }
        aygk = aygn.b;
        if (aygk == null) {
            return aygk.f;
        }
        return aygk;
    }

    public final void a(ImageView imageView, aygk aygk) {
        if (aygk == null) {
            this.l.a.a(imageView);
        } else {
            this.l.a.a(imageView, aygk);
        }
    }
}
