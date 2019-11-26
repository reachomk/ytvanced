package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* renamed from: wur */
public final class wur implements akot {
    public final wul a;
    public final View b;
    public final YouTubeTextView c;
    public final YouTubeTextView d;
    private final Context e;
    private final aaas f;
    private final akkq g;
    private final YouTubeTextView h = ((YouTubeTextView) this.b.findViewById(R.id.bullet_point_view));
    private final YouTubeTextView i;
    private final FlexboxLayout j;
    private final YouTubeTextView k;
    private final ViewGroup l;

    public wur(Context context, aaas aaas, akkq akkq, bcaa bcaa) {
        this.e = context;
        this.f = aaas;
        this.g = akkq;
        this.a = (wul) bcaa.get();
        this.b = LayoutInflater.from(context).inflate(R.layout.sponsorships_perk_layout, null, false);
        xpr.a(this.h, (CharSequence) "•");
        this.i = (YouTubeTextView) this.b.findViewById(R.id.title_view);
        this.c = (YouTubeTextView) this.b.findViewById(R.id.description_view);
        this.d = (YouTubeTextView) this.b.findViewById(R.id.fulfillment_instructions_view);
        this.j = (FlexboxLayout) this.b.findViewById(R.id.images_layout);
        this.k = (YouTubeTextView) this.b.findViewById(R.id.image_description_view);
        this.l = (ViewGroup) this.b.findViewById(R.id.loyalty_badges);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.b;
    }

    /* renamed from: a */
    public final void a_(akor akor, axth axth) {
        arml arml;
        xpr.a(this.h, (axth.a & 1) != 0);
        TextView textView = this.i;
        if ((axth.a & 1) != 0) {
            arml = axth.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = this.c;
        if ((axth.a & 2) != 0) {
            arml = axth.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = this.d;
        if ((axth.a & 4) != 0) {
            arml = axth.d;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, aabb.a(arml, this.f, false));
        if ((axth.a & 16) != 0) {
            axak axak = axth.g;
            if (axak == null) {
                axak = axak.a;
            }
            axsz axsz = (axsz) ajzv.a(ajzv.a(axak), axsz.class);
            if (axsz != null) {
                this.a.a(axsz);
                this.l.addView(this.a.a);
                xpr.a(this.j, false);
            }
        }
        this.j.removeAllViews();
        if (axth.e.size() != 0) {
            this.j.addView(this.k);
            textView = this.k;
            if ((axth.a & 8) != 0) {
                arml = axth.f;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            xpr.a(textView, ajqy.a(arml));
            int dimensionPixelSize = this.e.getResources().getDimensionPixelSize(R.dimen.perk_images_padding);
            for (aygk aygk : axth.e) {
                ImageView imageView = new ImageView(this.e);
                imageView.setLayoutParams(new LayoutParams(this.e.getResources().getDimensionPixelSize(R.dimen.perk_images_width), this.e.getResources().getDimensionPixelSize(R.dimen.perk_images_height)));
                imageView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                this.j.addView(imageView);
                this.g.a(imageView, aygk);
                if (!(aygk == null || (aygk.a & 4) == 0)) {
                    aodx aodx = aygk.d;
                    if (aodx == null) {
                        aodx = aodx.c;
                    }
                    if ((aodx.a & 1) != 0) {
                        aodx aodx2 = aygk.d;
                        if (aodx2 == null) {
                            aodx2 = aodx.c;
                        }
                        aodv aodv = aodx2.b;
                        if (aodv == null) {
                            aodv = aodv.c;
                        }
                        imageView.setContentDescription(aodv.b);
                    }
                }
                imageView.setContentDescription(null);
            }
        }
    }
}
