package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.util.HashMap;
import java.util.Map;

/* renamed from: why */
public final class why implements akot {
    private final akkq a;
    private final aaas b;
    private final View c;
    private final ImageView d = ((ImageView) this.c.findViewById(R.id.logo));
    private final TextView e = ((TextView) this.c.findViewById(R.id.title));
    private final TextView f = ((TextView) this.c.findViewById(R.id.text));
    private final TextView g = ((TextView) this.c.findViewById(R.id.learn_more));
    private final akyy h;
    private final TextView i = ((TextView) this.c.findViewById(R.id.footer));

    public why(Context context, akkq akkq, aaas aaas, akzb akzb) {
        this.a = (akkq) amqw.a((Object) akkq);
        this.b = (aaas) amqw.a((Object) aaas);
        this.c = View.inflate(context, R.layout.backstage_zero_state, null);
        this.h = akzb.a((TextView) this.c.findViewById(R.id.post_button));
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.c;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        arml arml;
        apcz apcz = (apcz) obj;
        akkq akkq = this.a;
        ImageView imageView = this.d;
        aygk aygk = apcz.d;
        if (aygk == null) {
            aygk = aygk.f;
        }
        akkq.a(imageView, aygk);
        TextView textView = this.e;
        Map map = null;
        if ((apcz.a & 1) != 0) {
            arml = apcz.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
        textView = this.f;
        if ((apcz.a & 2) != 0) {
            arml = apcz.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
        textView = this.g;
        if ((apcz.a & 8) != 0) {
            arml = apcz.e;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(aabb.a(arml, this.b, false));
        if ((apcz.a & 8) != 0) {
            arml arml2 = apcz.e;
            if (arml2 == null) {
                arml2 = arml.f;
            }
            CharSequence b = ajqy.b(arml2);
            if (b != null) {
                this.g.setContentDescription(b);
            }
        }
        textView = this.i;
        if ((apcz.a & 16) != 0) {
            arml = apcz.f;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
        anxp anxp = apcz.g;
        if (anxp == null) {
            anxp = axak.a;
        }
        anxr access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
        anxp.a(access$000);
        obj = anxp.h.b(access$000.d);
        if (obj == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(obj);
        }
        aphg aphg = (aphg) obj;
        if (aphg != null) {
            akyy akyy = this.h;
            if (akyy != null) {
                acvx acvx = akor.a;
                akvy akvy = (akvy) akor.a("sectionController");
                if (akvy != null) {
                    map = new HashMap();
                    map.put("com.google.android.libraries.youtube.comment.comment_thread_created_callback", new wey(akvy));
                }
                akyy.a(aphg, acvx, map);
            }
        }
    }
}
