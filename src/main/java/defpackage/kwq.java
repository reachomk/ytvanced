package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.MetadataBadgeRendererOuterClass;

/* renamed from: kwq */
public final class kwq extends akpl {
    private final akkq a;
    private final eso b;
    private final View c;
    private final ViewGroup d = ((ViewGroup) this.c.findViewById(R.id.channel_banner_container));
    private final ImageView e = ((ImageView) this.c.findViewById(R.id.banner));
    private final ImageView f = ((ImageView) this.c.findViewById(R.id.box_art));
    private final TextView g = ((TextView) this.c.findViewById(R.id.channel_title));
    private final TextView h = ((TextView) this.c.findViewById(R.id.auto_generated_notice));
    private final TextView i = ((TextView) this.c.findViewById(R.id.description));
    private final TextView j = ((TextView) this.c.findViewById(R.id.metadata));
    private final TextView k = ((TextView) this.c.findViewById(R.id.subscribe_button));
    private final TextView l = ((TextView) this.c.findViewById(R.id.subscriber_count));
    private final fap m;

    public kwq(Activity activity, akkq akkq, fas fas, est est) {
        this.a = akkq;
        this.c = LayoutInflater.from(activity).inflate(R.layout.interactive_tabbed_header, null);
        this.b = est.a(this.k, null);
        this.m = fas.a((Context) activity, (ViewStub) this.c.findViewById(R.id.metadata_badge));
    }

    public final View K_() {
        return this.c;
    }

    public final void a(akpb akpb) {
        b();
        this.b.a();
    }

    private final void b() {
        this.f.setBackground(null);
        this.e.setBackground(null);
        this.g.setText(null);
        this.h.setText(null);
        TextView textView = this.i;
        if (textView != null) {
            textView.setText(null);
        }
        textView = this.j;
        if (textView != null) {
            textView.setText(null);
        }
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(akor akor, Object obj) {
        arml arml;
        axak axak;
        attr attr = (attr) obj;
        b();
        aygk aygk = attr.h;
        if (aygk == null) {
            aygk = aygk.f;
        }
        boolean a = aklb.a(aygk);
        if (a) {
            this.a.a(this.e, aygk);
        }
        View view = this.d;
        if (view != null) {
            xpr.a(view, a);
        } else {
            xpr.a(this.e, a);
        }
        aygk = attr.b == 6 ? (aygk) attr.c : aygk.f;
        if (aklb.a(aygk)) {
            this.a.a(this.f, aygk);
            this.f.setVisibility(0);
        } else {
            this.f.setVisibility(8);
        }
        TextView textView = this.g;
        arml arml2 = null;
        if ((attr.a & 2) != 0) {
            arml = attr.d;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = this.h;
        if ((attr.a & 64) != 0) {
            arml = attr.j;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = this.i;
        if (textView != null) {
            if ((attr.a & 4) != 0) {
                arml = attr.e;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            xpr.a(textView, ajqy.a(arml));
        }
        textView = this.j;
        if (textView != null) {
            if ((attr.a & 8) != 0) {
                arml = attr.f;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            xpr.a(textView, ajqy.a(arml));
        }
        if (attr.g.size() > 0) {
            axak = (axak) attr.g.get(0);
            anxr access$000 = anxl.checkIsLite(MetadataBadgeRendererOuterClass.metadataBadgeRenderer);
            axak.a(access$000);
            if (axak.h.a(access$000.d)) {
                fap fap = this.m;
                anxr access$0002 = anxl.checkIsLite(MetadataBadgeRendererOuterClass.metadataBadgeRenderer);
                axak.a(access$0002);
                Object b = axak.h.b(access$0002.d);
                if (b == null) {
                    b = access$0002.b;
                } else {
                    b = access$0002.a(b);
                }
                fap.a((auxa) b);
            }
        }
        for (axak axak2 : attr.i) {
            ajzw a2 = ajzv.a(axak2);
            if (ajzv.b(a2, axwa.class)) {
                axwa axwa = (axwa) ajzv.a(a2, axwa.class);
                this.b.a(axwa, akor.a);
                TextView textView2 = this.l;
                if ((axwa.a & 16) != 0) {
                    arml2 = axwa.i;
                    if (arml2 == null) {
                        arml2 = arml.f;
                    }
                }
                xpr.a(textView2, ajqy.a(arml2));
                return;
            }
        }
    }
}
