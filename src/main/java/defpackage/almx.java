package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: almx */
public final class almx implements akot, allj {
    public final alnc a;
    public final TextView b = ((TextView) this.g.findViewById(R.id.dismiss_button));
    public final View c = this.g.findViewById(R.id.content);
    public final GestureDetector d;
    public aylg e;
    public boolean f;
    private final View g;
    private final aloz h;
    private final TextView i;
    private final allh j;

    public almx(Context context, akkq akkq, alnc alnc, allh allh) {
        this.a = (alnc) amqw.a((Object) alnc);
        this.j = (allh) amqw.a((Object) allh);
        this.g = View.inflate(context, R.layout.connection, null);
        this.h = new aloz(akkq, (ImageView) this.g.findViewById(R.id.connection_thumbnail));
        this.i = (TextView) this.g.findViewById(R.id.user_public_name);
        this.d = new GestureDetector(context, new almw(this, xss.a(context.getResources().getDisplayMetrics(), 15)));
        this.b.setOnClickListener(new almz(this));
        this.c.setClickable(true);
        this.c.setOnTouchListener(new almy(this));
    }

    public final void a(allh allh) {
        aylg aylg = this.e;
        if (aylg != null) {
            this.c.setSelected(this.j.b(alps.a(aylg)));
        }
    }

    public final View K_() {
        return this.g;
    }

    public final void a(akpb akpb) {
        this.j.b((allj) this);
    }

    private final void a(int i) {
        long j = (long) i;
        this.c.animate().setDuration(j).translationX(0.0f).start();
        this.b.animate().setDuration(j).alpha(0.0f).setListener(new alna(this)).start();
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        this.e = (aylg) obj;
        this.c.setSelected(this.j.b(alps.a(this.e)));
        a(0);
        obj = alps.b(this.e);
        if (obj instanceof aqke) {
            aqke aqke = (aqke) obj;
            aqtk aqtk = aqke.d;
            if (aqtk == null) {
                aqtk = aqtk.c;
            }
            aloq.a(aqtk, this.h);
            TextView textView = this.i;
            arml arml = aqke.b;
            if (arml == null) {
                arml = arml.f;
            }
            textView.setText(ajqy.a(arml));
            this.f = false;
        } else if (obj instanceof aqkg) {
            arml arml2;
            aqkg aqkg = (aqkg) obj;
            aqtk aqtk2 = aqkg.d;
            if (aqtk2 == null) {
                aqtk2 = aqtk.c;
            }
            aloq.a(aqtk2, this.h);
            TextView textView2 = this.i;
            arml arml3 = null;
            if ((aqkg.a & 1) != 0) {
                arml2 = aqkg.b;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
            } else {
                arml2 = null;
            }
            textView2.setText(ajqy.a(arml2));
            textView2 = this.b;
            if ((aqkg.a & 16) != 0) {
                arml3 = aqkg.f;
                if (arml3 == null) {
                    arml3 = arml.f;
                }
            }
            textView2.setText(ajqy.a(arml3));
            this.f = true;
        }
        this.j.a((allj) this);
    }
}
