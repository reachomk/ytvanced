package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import androidx.cardview.widget.CardView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.RefinementChipRendererOuterClass;
import com.google.protos.youtube.api.innertube.RichListHeaderRendererOuterClass;
import com.google.protos.youtube.api.innertube.VideoCardRendererOuterClass;
import java.util.ArrayList;

/* renamed from: iub */
public final class iub extends akpl {
    private final CardView a;
    private final LinearLayout b;
    private final LinearLayout c;
    private final iug d;
    private final bcaa e;
    private final ivd f;
    private final int g;
    private final int h;
    private akot i;
    private final ArrayList j = new ArrayList();

    private final void a(View view) {
        view.setId(R.id.header);
        View findViewById = this.b.findViewById(R.id.header);
        if (findViewById != null) {
            this.b.removeView(findViewById);
        }
        this.b.addView(view, 0);
    }

    public final View K_() {
        return this.a;
    }

    public final void a(akpb akpb) {
        akot akot = this.i;
        if (akot != null) {
            akot.a(akpb);
        }
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((akot) arrayList.get(i)).a(akpb);
        }
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(akor akor, Object obj) {
        awne awne = (awne) obj;
        anxp anxp = awne.b;
        if (anxp == null) {
            anxp = axak.a;
        }
        anxr access$000 = anxl.checkIsLite(RichListHeaderRendererOuterClass.richListHeaderRenderer);
        anxp.a(access$000);
        anxp anxp2;
        anxr access$0002;
        Object b;
        if (anxp.h.a(access$000.d)) {
            iuj iuj = (iuj) this.e.get();
            this.i = iuj;
            anxp2 = awne.b;
            if (anxp2 == null) {
                anxp2 = axak.a;
            }
            access$0002 = anxl.checkIsLite(RichListHeaderRendererOuterClass.richListHeaderRenderer);
            anxp2.a(access$0002);
            b = anxp2.h.b(access$0002.d);
            if (b == null) {
                b = access$0002.b;
            } else {
                b = access$0002.a(b);
            }
            iuj.a_(akor, (axbo) b);
            a(iuj.a);
        } else {
            anxp = awne.b;
            if (anxp == null) {
                anxp = axak.a;
            }
            access$000 = anxl.checkIsLite(RefinementChipRendererOuterClass.refinementChipRenderer);
            anxp.a(access$000);
            if (anxp.h.a(access$000.d)) {
                iuh iuh = (iuh) this.d.a(null);
                this.i = iuh;
                anxp2 = awne.b;
                if (anxp2 == null) {
                    anxp2 = axak.a;
                }
                access$0002 = anxl.checkIsLite(RefinementChipRendererOuterClass.refinementChipRenderer);
                anxp2.a(access$0002);
                b = anxp2.h.b(access$0002.d);
                if (b == null) {
                    b = access$0002.b;
                } else {
                    b = access$0002.a(b);
                }
                iuh.a_(akor, (awyz) b);
                View view = iuh.a;
                a(view);
                LayoutParams layoutParams = new LayoutParams(-1, -2);
                int i = this.g;
                layoutParams.setMargins(i, i, i, this.h);
                view.setLayoutParams(layoutParams);
            }
        }
        this.c.removeAllViews();
        this.j.clear();
        for (int i2 = 0; i2 < awne.c.size(); i2++) {
            axak axak = (axak) awne.c.get(i2);
            anxr access$0003 = anxl.checkIsLite(VideoCardRendererOuterClass.videoCardRenderer);
            axak.a(access$0003);
            if (axak.h.a(access$0003.d)) {
                iuw iuw = (iuw) this.f.a(this.c);
                this.j.add(iuw);
                anxr access$0004 = anxl.checkIsLite(VideoCardRendererOuterClass.videoCardRenderer);
                axak.a(access$0004);
                Object b2 = axak.h.b(access$0004.d);
                if (b2 == null) {
                    b2 = access$0004.b;
                } else {
                    b2 = access$0004.a(b2);
                }
                iuw.a_(akor, (ayye) b2);
                this.c.addView(iuw.K_());
            }
        }
        anxp anxp3 = awne.b;
        if (anxp3 == null) {
            anxp3 = axak.a;
        }
        anxr access$0005 = anxl.checkIsLite(RichListHeaderRendererOuterClass.richListHeaderRenderer);
        anxp3.a(access$0005);
        if (anxp3.h.a(access$0005.d)) {
            View findViewById = this.a.findViewById(R.id.header);
            ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
            this.c.measure(0, 0);
            layoutParams2.width = this.c.getMeasuredWidth();
            findViewById.setLayoutParams(layoutParams2);
        }
    }

    /* synthetic */ iub(Activity activity, iug iug, bcaa bcaa, ivd ivd, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = (LayoutInflater) amqw.a(LayoutInflater.from(activity));
        this.d = (iug) amqw.a((Object) iug);
        this.e = (bcaa) amqw.a((Object) bcaa);
        this.f = (ivd) amqw.a((Object) ivd);
        this.g = activity.getResources().getDimensionPixelSize(R.dimen.preview_card_refinement_chip_header_margin);
        this.h = activity.getResources().getDimensionPixelSize(R.dimen.preview_card_refinement_chip_header_bottom_margin);
        this.a = (CardView) layoutInflater.inflate(R.layout.preview_card, viewGroup, false);
        this.b = (LinearLayout) this.a.findViewById(R.id.card_layout);
        this.c = (LinearLayout) this.a.findViewById(R.id.preview_videos);
    }
}
