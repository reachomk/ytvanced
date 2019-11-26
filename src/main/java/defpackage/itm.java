package defpackage;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.MenuRendererOuterClass;

/* renamed from: itm */
public final class itm extends akpl {
    private final Context a;
    private final akkq b;
    private final aaas c;
    private final akvo d;
    private final akvp e;
    private final int f;
    private final FrameLayout g;
    private akoj h;

    public itm(Context context, akkq akkq, aaas aaas, akvo akvo, akvp akvp) {
        this.a = context;
        this.b = akkq;
        this.d = (akvo) amqw.a((Object) akvo);
        this.c = aaas;
        this.e = akvp;
        this.g = new FrameLayout(context);
        this.f = xwe.a(context, R.attr.ytCallToAction, 0);
    }

    public final View K_() {
        return this.g;
    }

    public final void a(akpb akpb) {
        this.h.a();
    }

    private final void a(akor akor, View view, arik arik) {
        anxp anxp = arik.b;
        if (anxp == null) {
            anxp = axak.a;
        }
        anxr access$000 = anxl.checkIsLite(MenuRendererOuterClass.menuRenderer);
        anxp.a(access$000);
        if (anxp.h.a(access$000.d)) {
            View findViewById = view.findViewById(R.id.contextual_menu_anchor);
            anxp = arik.b;
            if (anxp == null) {
                anxp = axak.a;
            }
            access$000 = anxl.checkIsLite(MenuRendererOuterClass.menuRenderer);
            anxp.a(access$000);
            Object b = anxp.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            View view2 = view;
            this.d.a(view2, findViewById, (auvn) b, arik, akor.a);
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.image);
        akkq akkq = this.b;
        aygk aygk = arik.c;
        if (aygk == null) {
            aygk = aygk.f;
        }
        akkq.a(imageView, aygk);
        imageView.setColorFilter(null);
        YouTubeTextView youTubeTextView = (YouTubeTextView) view.findViewById(R.id.box_title);
        arml arml = arik.d;
        if (arml == null) {
            arml = arml.f;
        }
        youTubeTextView.setText(ajqy.a(arml));
        youTubeTextView = (YouTubeTextView) view.findViewById(R.id.claim_text);
        arml = arik.h;
        if (arml == null) {
            arml = arml.f;
        }
        youTubeTextView.setText(ajqy.a(arml));
        youTubeTextView = (YouTubeTextView) view.findViewById(R.id.rating_text);
        arml arml2 = arik.l;
        if (arml2 == null) {
            arml2 = arml.f;
        }
        youTubeTextView.setText(ajqy.a(arml2));
    }

    private final void a(TextView textView, int i, int i2, int i3) {
        Drawable drawable = this.a.getResources().getDrawable(i);
        int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.fact_check_open_in_new_icon_bottom_margin);
        drawable.setBounds(0, 0, i2, i2);
        drawable.mutate().setColorFilter(i3, Mode.SRC_IN);
        itp itp = new itp(drawable, dimensionPixelSize);
        String valueOf = String.valueOf(textView.getText());
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 2);
        stringBuilder.append(valueOf);
        stringBuilder.append("  ");
        SpannableString spannableString = new SpannableString(stringBuilder.toString());
        i3 = spannableString.length();
        spannableString.setSpan(itp, i3 - 1, i3, 33);
        textView.setText(spannableString);
    }

    public final /* synthetic */ void a(akor akor, Object obj) {
        arik arik = (arik) obj;
        this.g.removeAllViews();
        LayoutInflater from = LayoutInflater.from(this.a);
        akor.a.a(arik.o.d(), null);
        int a = arii.a(arik.n);
        FrameLayout frameLayout;
        akvp akvp;
        if (a != 0 && a == 2) {
            this.g.addView(from.inflate(R.layout.fact_check_compact, null));
            frameLayout = this.g;
            a(akor, frameLayout, arik);
            TextView textView = (TextView) frameLayout.findViewById(R.id.box_title);
            akvp = this.e;
            arwf arwf = arik.k;
            if (arwf == null) {
                arwf = arwf.c;
            }
            arwh a2 = arwh.a(arwf.b);
            if (a2 == null) {
                a2 = arwh.UNKNOWN;
            }
            a(textView, akvp.a(a2), this.a.getResources().getDimensionPixelSize(R.dimen.fact_check_open_in_new_icon_size), this.f);
        } else {
            a = arii.a(arik.n);
            if (a == 0 || a != 3) {
                a = arii.a(arik.n);
                if (a == 0) {
                    a = 1;
                }
                String valueOf = String.valueOf(Integer.toString(a - 1));
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 68);
                stringBuilder.append("Unexpected FactCheckRendererStyle value '");
                stringBuilder.append(valueOf);
                stringBuilder.append("'. Defaulting to EXTENSIVE.");
                Log.w("FactCheckPresenter", stringBuilder.toString());
            }
            this.g.addView(from.inflate(R.layout.fact_check_extensive, null));
            frameLayout = this.g;
            a(akor, frameLayout, arik);
            YouTubeTextView youTubeTextView = (YouTubeTextView) frameLayout.findViewById(R.id.article_title);
            arml arml = arik.g;
            if (arml == null) {
                arml = arml.f;
            }
            youTubeTextView.setText(ajqy.a(arml));
            akvp akvp2 = this.e;
            arwf arwf2 = arik.k;
            if (arwf2 == null) {
                arwf2 = arwf.c;
            }
            arwh a3 = arwh.a(arwf2.b);
            if (a3 == null) {
                a3 = arwh.UNKNOWN;
            }
            a(youTubeTextView, akvp2.a(a3), this.a.getResources().getDimensionPixelSize(R.dimen.fact_check_open_in_new_icon_size), this.f);
            ImageView imageView = (ImageView) frameLayout.findViewById(R.id.box_title_icon);
            akvp = this.e;
            arwf arwf3 = arik.e;
            if (arwf3 == null) {
                arwf3 = arwf.c;
            }
            arwh a4 = arwh.a(arwf3.b);
            if (a4 == null) {
                a4 = arwh.UNKNOWN;
            }
            imageView.setImageResource(akvp.a(a4));
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().mutate().setColorFilter(xwe.a(this.a, R.attr.ytIconActiveOther, 0), Mode.SRC_IN);
            }
        }
        this.h = new akoj(this.c, this.g);
        akoj akoj = this.h;
        acvx acvx = akor.a;
        apxu apxu = arik.f;
        if (apxu == null) {
            apxu = apxu.d;
        }
        akoj.a(acvx, apxu, akor.b());
    }
}
