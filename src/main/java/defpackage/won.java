package defpackage;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.PerksSectionRendererOuterClass;
import java.util.Collections;

/* renamed from: won */
public final class won implements akot {
    public final ViewGroup a;
    public final aaas b;
    private final Context c;
    private final akkq d;
    private final akvp e;
    private final wok f;
    private final float g;
    private final float h;
    private final float i;
    private final float j;
    private final int k;

    public static void a(YouTubeTextView youTubeTextView, CharSequence charSequence) {
        youTubeTextView.setText(charSequence);
        charSequence = youTubeTextView.getText();
        if (!(charSequence instanceof Spanned) || ((ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class)).length == 0) {
            youTubeTextView.e();
        } else {
            youTubeTextView.d();
        }
    }

    public won(Context context, akkq akkq, akvp akvp, wok wok, aaas aaas, View view) {
        this.c = (Context) amqw.a((Object) context);
        this.d = (akkq) amqw.a((Object) akkq);
        this.b = (aaas) amqw.a((Object) aaas);
        this.e = (akvp) amqw.a((Object) akvp);
        this.f = wok;
        if (view == null) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            this.a = linearLayout;
        } else {
            this.a = (ViewGroup) view;
        }
        this.g = (float) context.getResources().getDimensionPixelOffset(R.dimen.membership_text_perk_title_margin);
        this.h = (float) context.getResources().getDimensionPixelOffset(R.dimen.membership_text_perk_subtitle_margin);
        this.i = (float) context.getResources().getDimensionPixelOffset(R.dimen.membership_text_perk_default_margin);
        this.k = context.getResources().getDimensionPixelOffset(R.dimen.membership_offer_perk_picture_margin);
        this.j = (float) context.getResources().getDimensionPixelOffset(R.dimen.membership_text_perk_top_perk_margin);
    }

    public final View K_() {
        return this.a;
    }

    public final void a(avvt avvt) {
        LayoutInflater from = LayoutInflater.from(this.c);
        this.a.removeAllViews();
        Object obj = null;
        for (avvh avvh : avvt.a) {
            anxp anxp = avvh.a == 4 ? (axak) avvh.b : axak.a;
            anxr access$000 = anxl.checkIsLite(PerksSectionRendererOuterClass.perkItemRenderer);
            anxp.a(access$000);
            View view = null;
            if (anxp.h.a(access$000.d)) {
                ViewGroup viewGroup = this.a;
                anxp = avvh.a == 4 ? (axak) avvh.b : axak.a;
                anxr access$0002 = anxl.checkIsLite(PerksSectionRendererOuterClass.perkItemRenderer);
                anxp.a(access$0002);
                Object b = anxp.h.b(access$0002.d);
                if (b == null) {
                    b = access$0002.b;
                } else {
                    b = access$0002.a(b);
                }
                avvr avvr = (avvr) b;
                wok wok = this.f;
                wol wol = new wol((Context) wok.a((Context) wok.a.get(), 1), (akkq) wok.a((akkq) wok.b.get(), 2), (aaas) wok.a(this.b, 3), viewGroup);
                wol.a(avvr);
                view = wol.a;
            } else {
                int i = avvh.a;
                if (i == 1) {
                    arml arml;
                    avvn avvn = (avvn) avvh.b;
                    View view2 = (ViewGroup) from.inflate(R.layout.ypc_perk_text_layout, this.a, false);
                    TextView textView = (YouTubeTextView) view2.findViewById(R.id.text);
                    if ((avvn.a & 1) != 0) {
                        arml = avvn.b;
                        if (arml == null) {
                            arml = arml.f;
                        }
                    }
                    won.a((YouTubeTextView) textView, aabb.a(arml, this.b, false));
                    float f = this.i;
                    int a = avvp.a(avvn.c);
                    if (a == 0) {
                        a = 1;
                    }
                    a--;
                    if (a == 1) {
                        f = this.g;
                        adl.a(textView, (int) R.style.f487TextAppearance.YouTube.Title);
                        textView.setTextSize(2, 18.0f);
                        textView.setTextColor(xwe.a(this.c, R.attr.ytTextPrimary, 0));
                    } else if (a == 2) {
                        f = this.h;
                        adl.a(textView, (int) R.style.f465TextAppearance.YouTube.Body2);
                        textView.setTextSize(2, 16.0f);
                        textView.setTextColor(xwe.a(this.c, R.attr.ytTextPrimary, 0));
                    } else if (a != 4) {
                        adl.a(textView, (int) R.style.f463TextAppearance.YouTube.Body1);
                        textView.setTextColor(xwe.a(this.c, R.attr.ytTextSecondary, 0));
                    } else {
                        adl.a(textView, (int) R.style.f468TextAppearance.YouTube.Caption);
                        textView.setTextColor(xwe.a(this.c, R.attr.ytTextDisabled, 0));
                    }
                    view2.findViewById(R.id.separator).setVisibility(!avvn.e ? 8 : 0);
                    if (avvn.e) {
                        f = this.g;
                        if (obj == null) {
                            MarginLayoutParams marginLayoutParams = new MarginLayoutParams(view2.getLayoutParams());
                            marginLayoutParams.topMargin = (int) this.j;
                            view2.setLayoutParams(marginLayoutParams);
                        }
                    }
                    if ((avvn.a & 4) != 0) {
                        view2.setOnClickListener(new wom(this, avvn, Collections.singletonMap("com.google.android.libraries.youtube.innertube.endpoint.tag", new Object())));
                    }
                    int i2 = (int) f;
                    textView.setPadding(0, i2, 0, i2);
                    view = view2;
                } else if (i == 2) {
                    view = (YouTubeTextView) from.inflate(R.layout.ypc_perk_item_layout, this.a, false);
                    arml arml2 = ((avvl) avvh.b).b;
                    if (arml2 == null) {
                        arml2 = arml.f;
                    }
                    won.a((YouTubeTextView) view, aabb.a(arml2, this.b, false));
                } else if (i == 3) {
                    avvj avvj = (avvj) avvh.b;
                    ImageView imageView;
                    if ((avvj.a & 1) == 0) {
                        view = (ViewGroup) from.inflate(R.layout.ypc_perk_images_extra, this.a, false);
                        for (aygk aygk : avvj.b) {
                            imageView = new ImageView(this.c);
                            imageView.setScaleType(ScaleType.CENTER_CROP);
                            imageView.setAdjustViewBounds(true);
                            int dimensionPixelSize = this.c.getResources().getDimensionPixelSize(R.dimen.membership_offer_perk_picture_height);
                            MarginLayoutParams marginLayoutParams2 = new MarginLayoutParams(dimensionPixelSize, dimensionPixelSize);
                            dimensionPixelSize = this.k;
                            marginLayoutParams2.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                            imageView.setLayoutParams(marginLayoutParams2);
                            view.addView(imageView);
                            this.d.a(imageView, aygk);
                            won.a(imageView, aygk);
                        }
                    } else {
                        view = (ViewGroup) from.inflate(R.layout.ypc_perk_badge_extra, this.a, false);
                        YouTubeTextView youTubeTextView = (YouTubeTextView) view.findViewById(R.id.badge_text);
                        imageView = (ImageView) view.findViewById(R.id.badge_icon);
                        arml arml3 = avvj.c;
                        if (arml3 == null) {
                            arml3 = arml.f;
                        }
                        won.a(youTubeTextView, ajqy.a(arml3));
                        if ((avvj.a & 2) == 0) {
                            imageView.setImageDrawable(xoe.a(ra.a(this.c, this.e.a(arwh.SPONSORSHIPS)), ra.b(this.c, R.color.membership_branding_color_green), Mode.DST_ATOP));
                        } else {
                            akkq akkq = this.d;
                            aygk aygk2 = avvj.d;
                            if (aygk2 == null) {
                                aygk2 = aygk.f;
                            }
                            akkq.a(imageView, aygk2);
                        }
                        aygk aygk3 = avvj.d;
                        if (aygk3 == null) {
                            aygk3 = aygk.f;
                        }
                        won.a(imageView, aygk3);
                    }
                }
            }
            obj = avvh.a == 1 ? 1 : null;
            if (view != null) {
                this.a.addView(view);
            }
        }
    }

    public final void a(akpb akpb) {
        this.a.removeAllViews();
    }

    private static void a(ImageView imageView, aygk aygk) {
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
                return;
            }
        }
        imageView.setContentDescription(null);
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        a((avvt) obj);
    }
}
