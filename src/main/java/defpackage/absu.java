package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;

/* renamed from: absu */
public abstract class absu implements akot {
    public final View a;
    private final Context b;
    private final akvz c;

    public absu(Context context, akvz akvz) {
        this.b = context;
        this.a = View.inflate(context, b(), null);
        this.c = akvz;
    }

    public abstract void a(apxu apxu);

    public abstract int b();

    public abstract void b(apxu apxu);

    public abstract View c();

    public abstract TextView d();

    public abstract ViewGroup e();

    public abstract int f();

    public abstract ViewGroup g();

    public final View K_() {
        return this.a;
    }

    public final void a(akpb akpb) {
        g().removeAllViews();
        e().removeAllViews();
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        arml arml;
        audn audn = (audn) obj;
        TextView d = d();
        if ((audn.a & 16) != 0) {
            arml = audn.e;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        d.setText(ajqy.a(arml));
        anxp anxp = audn.f;
        if (anxp == null) {
            anxp = axak.a;
        }
        anxr access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
        anxp.a(access$000);
        if (anxp.h.a(access$000.d)) {
            absx absx = new absx(this, audn);
            d().setOnClickListener(absx);
            View c = c();
            if (c != null) {
                c.setOnClickListener(absx);
            }
        }
        if ((audn.a & 8) != 0) {
            axak axak;
            akpb akpb = (akpb) this.c.get();
            if ((audn.a & 8) != 0) {
                axak = audn.d;
                if (axak == null) {
                    axak = axak.a;
                }
            } else {
                axak = null;
            }
            int a = akpb.a(ajzv.b(ajzv.a(axak)));
            akor.a("is-auto-mod-message", Boolean.valueOf(true));
            akot a2 = ((akpb) this.c.get()).a(a, g());
            if ((audn.a & 8) != 0) {
                axak = audn.d;
                if (axak == null) {
                    axak = axak.a;
                }
            } else {
                axak = null;
            }
            a2.a_(akor, ajzv.b(ajzv.a(axak)));
            g().addView(a2.K_());
        }
        ViewGroup e = e();
        e.removeAllViews();
        for (axak axak2 : audn.i) {
            anxr access$0002 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
            axak2.a(access$0002);
            Object b = axak2.h.b(access$0002.d);
            if (b == null) {
                b = access$0002.b;
            } else {
                b = access$0002.a(b);
            }
            aphg aphg = (aphg) b;
            if (aphg.b == 1) {
                ((Integer) aphg.c).intValue();
            }
            f();
            Button button = (Button) LayoutInflater.from(this.b).inflate(R.layout.live_chat_auto_mod_button_grey_light, null, false);
            if (aphg.f) {
                button.setEnabled(false);
            } else {
                button.setEnabled(true);
                if ((aphg.a & 2048) != 0) {
                    button.setOnClickListener(new absw(this, aphg));
                }
            }
            arml arml2 = aphg.g;
            if (arml2 == null) {
                arml2 = arml.f;
            }
            button.setText(ajqy.a(arml2));
            e.addView(button);
        }
    }
}
