package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: alph */
public final class alph implements akok, akot {
    private final acvx a;
    private final nd b;
    private final View c;
    private final ImageView d = ((ImageView) this.c.findViewById(R.id.icon));
    private final TextView e = ((TextView) this.c.findViewById(R.id.label));
    private final xci f;
    private final akoj g;
    private alpe h;

    public alph(aaas aaas, acvx acvx, nd ndVar, xci xci) {
        this.a = (acvx) amqw.a((Object) acvx);
        this.b = (nd) amqw.a((Object) ndVar);
        this.f = (xci) amqw.a((Object) xci);
        this.c = View.inflate(ndVar.p(), R.layout.share_target, null);
        this.g = new akoj(aaas, this.c, (akok) this);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.c;
    }

    public final boolean a(View view) {
        this.f.d(new alhi());
        if (this.h != null) {
            atss atss = (atss) atst.q.createBuilder();
            atsw atsw = (atsw) atsx.c.createBuilder();
            alpe alpe = this.h;
            String format = String.format("%s/%s", new Object[]{alpe.a(alpe.d), alpe.a()});
            atsw.copyOnWrite();
            atsx atsx = (atsx) atsw.instance;
            if (format != null) {
                atsx.a = 1 | atsx.a;
                atsx.b = format;
                atss.copyOnWrite();
                atst atst = (atst) atss.instance;
                atst.g = (atsx) ((anxl) atsw.build());
                atst.a |= 32;
                atst atst2 = (atst) ((anxl) atss.build());
                byte[] bArr = this.h.c;
                if (bArr != null) {
                    this.a.a(3, new acvs(bArr), atst2);
                }
            } else {
                throw new NullPointerException();
            }
        }
        this.b.f();
        return false;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        alpe alpe = (alpe) obj;
        this.g.a(this.a, alpe.d, null);
        this.a.a(alpe.c, null);
        this.d.setImageDrawable(alpe.a);
        this.e.setText(alpe.b);
        this.h = alpe;
    }
}
