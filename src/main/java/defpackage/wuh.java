package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* renamed from: wuh */
public final class wuh implements akot {
    private final aaas a;
    private final ViewGroup b;

    public wuh(Context context, aaas aaas) {
        this.a = aaas;
        this.b = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.sponsorships_links_layout, null, false);
    }

    public final View K_() {
        return this.b;
    }

    public final void a(akpb akpb) {
        this.b.removeAllViews();
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        axst axst = (axst) obj;
        int dimensionPixelSize = this.b.getResources().getDimensionPixelSize(R.dimen.links_in_between_padding);
        for (arml arml : axst.a) {
            YouTubeTextView youTubeTextView = new YouTubeTextView(this.b.getContext());
            youTubeTextView.setText(aabb.a(arml, this.a, false));
            youTubeTextView.d();
            youTubeTextView.c = true;
            youTubeTextView.c();
            youTubeTextView.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
            this.b.addView(youTubeTextView);
        }
    }
}
