package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.util.Map;

/* renamed from: abub */
public abstract class abub implements akot {
    private final View a;
    private final Context b;
    private final akvp c;
    private final TextView d = ((TextView) this.a.findViewById(R.id.live_chat_vem_text));
    private final ImageView e = ((ImageView) this.a.findViewById(R.id.live_chat_vem_icon));
    private final TextView f = ((TextView) this.a.findViewById(R.id.live_chat_vem_button));
    private final Resources g;

    public abub(Context context, akvp akvp) {
        this.b = context;
        this.c = (akvp) amqw.a((Object) akvp);
        this.a = View.inflate(context, d(), null);
        this.g = context.getResources();
        int dimensionPixelOffset = this.g.getDimensionPixelOffset(R.dimen.live_chat_vem_margin_vertical);
        int dimensionPixelOffset2 = this.g.getDimensionPixelOffset(R.dimen.live_chat_vem_margin_horizontal);
        MarginLayoutParams marginLayoutParams = new MarginLayoutParams(-2, -2);
        marginLayoutParams.topMargin = dimensionPixelOffset;
        marginLayoutParams.bottomMargin = dimensionPixelOffset;
        marginLayoutParams.leftMargin = dimensionPixelOffset2;
        marginLayoutParams.rightMargin = dimensionPixelOffset2;
        this.a.setLayoutParams(marginLayoutParams);
    }

    public abstract aaas b();

    public abstract Map c();

    public abstract int d();

    public final View K_() {
        return this.a;
    }

    public final void a(akpb akpb) {
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        this.f.setVisibility(8);
        this.d.setPadding(0, 0, 0, 0);
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        auel auel = (auel) obj;
        if ((auel.a & 16) != 0) {
            arml arml = auel.e;
            if (arml == null) {
                arml = arml.f;
            }
            this.d.setText(ajqy.a(arml, new abua(this)));
            this.d.setVisibility(0);
            this.d.setMovementMethod(LinkMovementMethod.getInstance());
        }
        if ((auel.a & 32) != 0) {
            anxp anxp = auel.f;
            if (anxp == null) {
                anxp = axak.a;
            }
            anxr access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
            anxp.a(access$000);
            Object b = anxp.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            if ((((aphg) b).a & 128) != 0) {
                anxp = auel.f;
                if (anxp == null) {
                    anxp = axak.a;
                }
                access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
                anxp.a(access$000);
                b = anxp.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                aphg aphg = (aphg) b;
                TextView textView = this.f;
                arml arml2 = aphg.g;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
                textView.setText(ajqy.a(arml2));
                this.f.setOnClickListener(new abud(this, aphg));
                this.f.setVisibility(0);
            }
        } else {
            this.d.setPadding(0, 0, 0, this.g.getDimensionPixelOffset(R.dimen.live_chat_vem_content_margin_bottom));
        }
        if (auel.b == 3) {
            arwh a = arwh.a(((arwf) auel.c).b);
            if (a == null) {
                a = arwh.UNKNOWN;
            }
            if (a != arwh.UNKNOWN) {
                akvp akvp = this.c;
                arwh a2 = arwh.a((auel.b == 3 ? (arwf) auel.c : arwf.c).b);
                if (a2 == null) {
                    a2 = arwh.UNKNOWN;
                }
                if (akvp.a(a2) != 0) {
                    arwf arwf;
                    this.e.setVisibility(0);
                    ImageView imageView = this.e;
                    Context context = this.b;
                    akvp akvp2 = this.c;
                    if (auel.b == 3) {
                        arwf = (arwf) auel.c;
                    } else {
                        arwf = arwf.c;
                    }
                    arwh a3 = arwh.a(arwf.b);
                    if (a3 == null) {
                        a3 = arwh.UNKNOWN;
                    }
                    imageView.setImageDrawable(ra.a(context, akvp2.a(a3)));
                }
            }
        }
    }
}
