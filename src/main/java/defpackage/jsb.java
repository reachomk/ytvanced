package defpackage;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: jsb */
public final class jsb implements jsf {
    public final aaas a;
    public final vod b;
    public vqx c;
    public aqeg d;
    private final akkq e;
    private final acvx f;
    private final jsh g;
    private final ajqw h;
    private View i;
    private View j;
    private ImageView k;
    private TextView l;
    private View m;
    private View n;

    public jsb(akkq akkq, aaas aaas, acvx acvx, vod vod, Context context) {
        this.e = (akkq) amqw.a((Object) akkq);
        this.a = (aaas) amqw.a((Object) aaas);
        this.f = (acvx) amqw.a((Object) acvx);
        this.b = (vod) amqw.a((Object) vod);
        xoe xoe = new xoe(context);
        this.g = new jsh(akkq, vod, aaas, acvx);
        ajqv a = ajqw.a();
        a.a = context;
        a.c = new akta(aaas);
        this.h = a.a();
    }

    public final void a() {
        this.b.b(this.d);
        View view = this.i;
        if (view != null) {
            view.setVisibility(8);
            this.c.b();
            this.j.setClickable(false);
        }
        this.g.a();
        this.i = null;
        this.d = null;
    }

    public final /* synthetic */ void a(View view, Object obj) {
        aqeg aqeg = (aqeg) obj;
        if (aqeg != null) {
            arml arml;
            arml arml2;
            this.i = xpr.a(view, (int) R.id.compact_companion_extension_stub, (int) R.id.compact_companion_extension);
            this.l = (TextView) this.i.findViewById(R.id.tagline);
            this.k = (ImageView) this.i.findViewById(R.id.primary_icon);
            this.m = this.i.findViewById(R.id.horizontal_rule);
            this.n = this.i.findViewById(R.id.sub_details_button);
            this.j = this.i.findViewById(R.id.unclickable_space);
            this.i.setOnClickListener(new jsd(this));
            this.j.setOnClickListener(jsa.a);
            this.c = new vqx(this.i, (byte) 0);
            this.d = aqeg;
            MovementMethod movementMethod = null;
            this.f.a(this.d.g.d(), null);
            aaas aaas = this.a;
            Object obj2 = this.d;
            aabd.a(aaas, obj2.h, obj2);
            aqef aqef = (aqef) ((anxo) this.d.toBuilder());
            aqef.copyOnWrite();
            ((aqeg) aqef.instance).h = anxl.emptyProtobufList();
            this.d = (aqeg) ((anxl) aqef.build());
            akkq akkq = this.e;
            ImageView imageView = this.k;
            aygk aygk = this.d.b;
            if (aygk == null) {
                aygk = aygk.f;
            }
            akkq.a(imageView, aygk);
            TextView textView = this.l;
            aqeg aqeg2 = this.d;
            if ((aqeg2.a & 2) != 0) {
                arml = aqeg2.c;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            textView.setText(ajqy.a(arml, this.h));
            aqeg aqeg3 = this.d;
            int i = aqeg3.a;
            Object obj3 = 1;
            boolean z = (i & 16) != 0;
            if ((i & 2) != 0) {
                arml2 = aqeg3.c;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
            } else {
                arml2 = null;
            }
            if (!(arml2 == null || arml2.b.size() == 0)) {
                for (armp armp : arml2.b) {
                    if (armp != null && (armp.a & 256) != 0) {
                        break;
                    }
                }
            }
            obj3 = null;
            textView = this.l;
            if (!(obj3 == null || z)) {
                movementMethod = LinkMovementMethod.getInstance();
            }
            textView.setMovementMethod(movementMethod);
            this.i.setClickable(z);
            view = this.i;
            view.setBackground(xoe.b(view.getBackground(), this.d.d, Mode.SRC));
            view = this.m;
            view.setBackground(xoe.b(view.getBackground(), this.d.e, Mode.SRC));
            this.j.setClickable(this.d.j);
            this.i.setVisibility(0);
            if ((aqeg.a & 128) != 0) {
                jsh jsh = this.g;
                View view2 = this.n;
                axak axak = aqeg.i;
                if (axak == null) {
                    axak = axak.a;
                }
                jsh.a(view2, (aqhh) ajzv.a(ajzv.a(axak), aqhh.class));
            }
        }
    }
}
