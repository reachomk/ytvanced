package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* renamed from: kfa */
public final class kfa implements akot {
    public final aaas a;
    private final View b;
    private final ImageView c = ((ImageView) this.b.findViewById(R.id.thumbnail));
    private final YouTubeTextView d = ((YouTubeTextView) this.b.findViewById(R.id.title_view));
    private final YouTubeTextView e = ((YouTubeTextView) this.b.findViewById(R.id.price_view));
    private final YouTubeTextView f = ((YouTubeTextView) this.b.findViewById(R.id.link_view));
    private final akkq g;

    public kfa(Context context, aaas aaas, akkq akkq) {
        this.b = LayoutInflater.from(context).inflate(R.layout.merch_item, null, false);
        this.g = akkq;
        this.a = aaas;
        View view = this.b;
        view.setBackground(new eza(view.getBackground(), ra.c(context, R.color.line_separator_color), context.getResources().getDimensionPixelSize(R.dimen.line_separator_height)));
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.b;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        auwd auwd = (auwd) obj;
        xpr.a(this.d, auwd.b);
        xpr.a(this.e, auwd.e);
        xpr.a(this.f, auwd.f);
        akkq akkq = this.g;
        ImageView imageView = this.c;
        aygk aygk = auwd.d;
        if (aygk == null) {
            aygk = aygk.f;
        }
        akkq.a(imageView, aygk);
        this.b.setContentDescription(auwd.c);
        if ((auwd.a & 2048) == 0) {
            this.b.setClickable(false);
        } else {
            this.b.setOnClickListener(new kfd(this, auwd));
            this.b.setClickable(true);
        }
        akor.a.a(auwd.j.d(), null);
    }
}
