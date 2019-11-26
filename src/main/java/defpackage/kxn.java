package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.widget.FixedAspectRatioImageView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.PrimetimePromoPanelRendererOuterClass;

/* renamed from: kxn */
public final class kxn extends akpl {
    public final View a;
    public final aaas b;
    private final FixedAspectRatioImageView c = ((FixedAspectRatioImageView) this.a.findViewById(R.id.thumbnail));
    private final ImageView d = ((ImageView) this.a.findViewById(R.id.icon));
    private final Context e;
    private final akkq f;
    private final akvp g;
    private final View h = this.a.findViewById(R.id.panel_icon_wrapper);
    private View i;
    private View j;

    public kxn(Context context, akkq akkq, akvp akvp, aaas aaas) {
        this.e = context;
        this.f = akkq;
        this.g = akvp;
        this.a = LayoutInflater.from(context).inflate(R.layout.primetime_promo_panel_layout, null);
        this.b = aaas;
    }

    public final View K_() {
        return this.a;
    }

    private static void a(View view) {
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public final void a(akpb akpb) {
        this.c.setImageBitmap(null);
        this.d.setImageDrawable(null);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(akor akor, Object obj) {
        awnt awnt = (awnt) obj;
        aygk aygk = !xss.b(this.e) ? awnt.b == 5 ? (aygk) awnt.c : aygk.f : awnt.b == 6 ? (aygk) awnt.c : aygk.f;
        this.f.a(this.c, aygk);
        this.c.setOnClickListener(new kxm(this, awnt));
        if ((awnt.a & 2) != 0) {
            ImageView imageView = this.d;
            akvp akvp = this.g;
            arwf arwf = awnt.e;
            if (arwf == null) {
                arwf = arwf.c;
            }
            arwh a = arwh.a(arwf.b);
            if (a == null) {
                a = arwh.UNKNOWN;
            }
            imageView.setImageResource(akvp.a(a));
            this.h.setVisibility(0);
        } else {
            this.h.setVisibility(8);
        }
        if ((awnt.a & 1) != 0) {
            anxp anxp = awnt.d;
            if (anxp == null) {
                anxp = axak.a;
            }
            anxr access$000 = anxl.checkIsLite(PrimetimePromoPanelRendererOuterClass.panelShowStyleMetadataRenderer);
            anxp.a(access$000);
            anxr access$0002;
            Object b;
            TextView textView;
            arml arml;
            if (anxp.h.a(access$000.d)) {
                kxn.a(this.j);
                anxp = awnt.d;
                if (anxp == null) {
                    anxp = axak.a;
                }
                access$0002 = anxl.checkIsLite(PrimetimePromoPanelRendererOuterClass.panelShowStyleMetadataRenderer);
                anxp.a(access$0002);
                b = anxp.h.b(access$0002.d);
                if (b == null) {
                    b = access$0002.b;
                } else {
                    b = access$0002.a(b);
                }
                awnr awnr = (awnr) b;
                if (this.i == null) {
                    this.i = ((ViewStub) this.a.findViewById(R.id.show_metadata)).inflate();
                }
                textView = (TextView) this.i.findViewById(R.id.metadata_text);
                arml = awnr.b;
                if (arml == null) {
                    arml = arml.f;
                }
                xpr.a(textView, ajqy.a(arml));
                this.i.setVisibility(0);
                return;
            }
            anxp = awnt.d;
            if (anxp == null) {
                anxp = axak.a;
            }
            access$000 = anxl.checkIsLite(PrimetimePromoPanelRendererOuterClass.panelAlbumStyleMetadataRenderer);
            anxp.a(access$000);
            if (anxp.h.a(access$000.d)) {
                kxn.a(this.i);
                anxp = awnt.d;
                if (anxp == null) {
                    anxp = axak.a;
                }
                access$0002 = anxl.checkIsLite(PrimetimePromoPanelRendererOuterClass.panelAlbumStyleMetadataRenderer);
                anxp.a(access$0002);
                b = anxp.h.b(access$0002.d);
                if (b == null) {
                    b = access$0002.b;
                } else {
                    b = access$0002.a(b);
                }
                awnp awnp = (awnp) b;
                if (this.j == null) {
                    this.j = ((ViewStub) this.a.findViewById(R.id.album_metadata)).inflate();
                }
                textView = (TextView) this.j.findViewById(R.id.first_line);
                TextView textView2 = (TextView) this.j.findViewById(R.id.second_line);
                arml arml2 = awnp.b;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
                xpr.a(textView, ajqy.a(arml2));
                arml = awnp.c;
                if (arml == null) {
                    arml = arml.f;
                }
                xpr.a(textView2, ajqy.a(arml));
                this.j.setVisibility(0);
            }
            return;
        }
        kxn.a(this.j);
        kxn.a(this.i);
    }
}
