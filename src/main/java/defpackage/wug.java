package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* renamed from: wug */
public final class wug implements akot {
    public final View a;
    public final ViewGroup b = ((ViewGroup) this.a.findViewById(R.id.expanded_content));
    private final aaas c;
    private final Context d;
    private final akkq e;
    private final YouTubeTextView f = ((YouTubeTextView) this.a.findViewById(R.id.title));
    private final YouTubeTextView g = ((YouTubeTextView) this.a.findViewById(R.id.subtitle));
    private final YouTubeTextView h = ((YouTubeTextView) this.a.findViewById(R.id.detail));
    private final ImageView i = ((ImageView) this.a.findViewById(R.id.icon));
    private final ImageView j = ((ImageView) this.a.findViewById(R.id.expand_icon));

    public wug(Context context, aaas aaas, akkq akkq) {
        this.d = context;
        this.c = aaas;
        this.e = akkq;
        this.a = LayoutInflater.from(context).inflate(R.layout.sponsorships_list_tile_layout, null, false);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.a;
    }

    /* renamed from: a */
    public final void a_(akor akor, axsv axsv) {
        arml arml;
        aygk aygk;
        TextView textView = this.f;
        Drawable drawable = null;
        if ((axsv.a & 2) != 0) {
            arml = axsv.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, aabb.a(arml, this.c, false));
        textView = this.g;
        if ((axsv.a & 4) != 0) {
            arml = axsv.d;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, aabb.a(arml, this.c, false));
        textView = this.h;
        if ((axsv.a & 8) != 0) {
            arml = axsv.e;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, aabb.a(arml, this.c, false));
        akkq akkq = this.e;
        ImageView imageView = this.i;
        if ((axsv.a & 1) != 0) {
            aygk = axsv.b;
            if (aygk == null) {
                aygk = aygk.f;
            }
        } else {
            aygk = null;
        }
        akkq.a(imageView, aygk);
        boolean z = axsv.f.size() > 0;
        xpr.a(this.j, z);
        this.a.setOnClickListener(z ? new wuj(this) : null);
        if (axsv.g) {
            drawable = new ColorDrawable(xwe.a(this.a.getContext(), R.attr.ytGeneralBackgroundB));
        }
        if (z) {
            xpr.a(this.a, drawable, 0);
        } else {
            this.a.setBackground(drawable);
        }
        this.b.removeAllViews();
        for (axak a : axsv.f) {
            ajzw a2 = ajzv.a(a);
            if (ajzv.b(a2, axsv.class)) {
                wug wug = new wug(this.d, this.c, this.e);
                wug.a_(akor, (axsv) ajzv.a(a2, axsv.class));
                this.b.addView(wug.a);
            } else if (ajzv.b(a2, axsz.class)) {
                wul wul = new wul(this.d, this.c, this.e);
                wul.a((axsz) ajzv.a(a2, axsz.class));
                wul.a(true);
                ViewGroup viewGroup = wul.a;
                viewGroup.setPadding(xss.a(this.a.getResources().getDisplayMetrics(), 48), 0, 0, 0);
                this.b.addView(viewGroup);
            }
        }
        a(false);
    }

    public final void a(boolean z) {
        xpr.a(this.b, z);
        this.j.setImageResource(!z ? R.drawable.quantum_ic_keyboard_arrow_down_grey600_24 : R.drawable.quantum_ic_keyboard_arrow_up_grey600_24);
    }
}
