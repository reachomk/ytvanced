package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.PerksSectionRendererOuterClass;

/* renamed from: wol */
public final class wol implements akot {
    public final LinearLayout a;
    private final akkq b;
    private final ajqw c;
    private final YouTubeTextView d = ((YouTubeTextView) this.a.findViewById(R.id.perk_title));
    private final YouTubeTextView e = ((YouTubeTextView) this.a.findViewById(R.id.perk_public_description));
    private final YouTubeTextView f = ((YouTubeTextView) this.a.findViewById(R.id.perk_sponsors_description));
    private final ImageView g = ((ImageView) this.a.findViewById(R.id.sponsors_only_icon));

    public wol(Context context, akkq akkq, aaas aaas, ViewGroup viewGroup) {
        this.b = akkq;
        this.a = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.ypc_perk_item_v2_layout, viewGroup, false);
        ajqv a = ajqw.a();
        a.a = context;
        a.c = new akta(aaas);
        this.c = a.a();
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.a;
    }

    public final void a(avvr avvr) {
        arml arml;
        YouTubeTextView youTubeTextView = this.d;
        arml arml2 = null;
        if ((avvr.a & 1) != 0) {
            arml = avvr.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        won.a(youTubeTextView, ajqy.a(arml, this.c));
        if ((avvr.a & 2) == 0) {
            this.e.setVisibility(8);
        } else {
            youTubeTextView = this.e;
            arml arml3 = avvr.c;
            if (arml3 == null) {
                arml3 = arml.f;
            }
            won.a(youTubeTextView, ajqy.a(arml3, this.c));
        }
        anxp anxp = avvr.e;
        if (anxp == null) {
            anxp = axak.a;
        }
        anxr access$000 = anxl.checkIsLite(PerksSectionRendererOuterClass.sponsorsDescriptionRenderer);
        anxp.a(access$000);
        if (anxp.h.a(access$000.d)) {
            anxp anxp2 = avvr.e;
            if (anxp2 == null) {
                anxp2 = axak.a;
            }
            anxr access$0002 = anxl.checkIsLite(PerksSectionRendererOuterClass.sponsorsDescriptionRenderer);
            anxp2.a(access$0002);
            Object b = anxp2.h.b(access$0002.d);
            if (b == null) {
                b = access$0002.b;
            } else {
                b = access$0002.a(b);
            }
            avvv avvv = (avvv) b;
            youTubeTextView = this.f;
            if ((avvv.a & 2) != 0) {
                arml2 = avvv.c;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
            }
            won.a(youTubeTextView, ajqy.a(arml2, this.c));
            if ((avvv.a & 1) != 0) {
                akkq akkq = this.b;
                ImageView imageView = this.g;
                aygk aygk = avvv.b;
                if (aygk == null) {
                    aygk = aygk.f;
                }
                akkq.a(imageView, aygk);
                return;
            }
            return;
        }
        this.g.setVisibility(8);
        this.f.setVisibility(8);
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        a((avvr) obj);
    }
}
