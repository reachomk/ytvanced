package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import java.util.ArrayList;

/* renamed from: wuq */
public final class wuq implements akot {
    public final LinearLayout a;
    public final ArrayList b = new ArrayList();
    private final bcaa c;

    public wuq(Context context, bcaa bcaa) {
        this.c = bcaa;
        this.a = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.sponsorships_perks_layout, null, false);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.a;
    }

    /* renamed from: a */
    public final void a_(akor akor, axtj axtj) {
        this.a.removeAllViews();
        this.b.clear();
        if ((axtj.a & 1) != 0) {
            YouTubeTextView youTubeTextView = new YouTubeTextView(this.a.getContext());
            youTubeTextView.setTextAppearance(this.a.getContext(), R.style.f465TextAppearance.YouTube.Body2);
            arml arml = axtj.b;
            if (arml == null) {
                arml = arml.f;
            }
            youTubeTextView.setText(ajqy.a(arml));
            this.a.addView(youTubeTextView);
        }
        for (axak a : axtj.c) {
            axth axth = (axth) ajzv.a(ajzv.a(a), axth.class);
            if (axth != null) {
                wur wur = (wur) this.c.get();
                this.b.add(wur);
                this.a.addView(wur.b);
                wur.a_(akor, axth);
            }
        }
    }
}
