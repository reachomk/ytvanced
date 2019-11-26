package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;

/* renamed from: mla */
public final class mla extends akpl {
    public azgc a;
    private final aaas b;
    private final acvx c;
    private final View d;
    private final TextView e = ((TextView) this.d.findViewById(R.id.heading));
    private final TextView f = ((TextView) this.d.findViewById(R.id.notice));
    private final TextView g = ((TextView) this.d.findViewById(R.id.dismiss_button));
    private final TextView h;

    public mla(aaas aaas, acvx acvx, Context context) {
        this.b = aaas;
        this.c = acvx;
        this.d = LayoutInflater.from(context).inflate(R.layout.watch_break, null);
        this.g.setOnClickListener(new mkz(this));
        this.h = (TextView) this.d.findViewById(R.id.settings_button);
        this.h.setOnClickListener(new mlc(this));
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.d;
    }

    public final void a(axak axak) {
        anxr access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
        axak.a(access$000);
        Object b = axak.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        aphg aphg = (aphg) b;
        if ((aphg.a & 8192) != 0) {
            aaas aaas = this.b;
            apxu apxu = aphg.n;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, null);
            this.c.a(3, new acvs(aphg.r), null);
        }
    }

    private static void a(TextView textView, axak axak) {
        anxr access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
        axak.a(access$000);
        if (axak.h.a(access$000.d)) {
            arml arml;
            access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
            axak.a(access$000);
            Object b = axak.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            aphg aphg = (aphg) b;
            if ((aphg.a & 128) != 0) {
                arml = aphg.g;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            textView.setText(ajqy.a(arml));
            return;
        }
        textView.setVisibility(8);
    }
}
