package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.youtube.R;

/* renamed from: iuf */
public final class iuf extends akpl {
    private final akkq a;
    private final CardView b;
    private final ImageView c = ((ImageView) amqw.a((ImageView) this.b.findViewById(R.id.thumbnail)));
    private final TextView d = ((TextView) amqw.a((TextView) this.b.findViewById(R.id.title)));
    private final akoj e;

    public iuf(Activity activity, akkq akkq, aaas aaas, ViewGroup viewGroup) {
        this.a = (akkq) amqw.a((Object) akkq);
        this.b = (CardView) LayoutInflater.from(activity).inflate(R.layout.refinement_card, viewGroup, false);
        this.e = new akoj(aaas, this.b);
    }

    public final void a(akpb akpb) {
        this.e.a();
    }

    public final View K_() {
        return this.b;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(akor akor, Object obj) {
        apxu apxu;
        awyy awyy = (awyy) obj;
        akoj akoj = this.e;
        acvx acvx = akor.a;
        arml arml = null;
        if ((awyy.a & 4) != 0) {
            apxu = awyy.d;
            if (apxu == null) {
                apxu = apxu.d;
            }
        } else {
            apxu = null;
        }
        akoj.a(acvx, apxu, akor.b());
        akkq akkq = this.a;
        ImageView imageView = this.c;
        aygk aygk = awyy.b;
        if (aygk == null) {
            aygk = aygk.f;
        }
        akkq.a(imageView, aygk);
        TextView textView = this.d;
        if ((awyy.a & 2) != 0) {
            arml = awyy.c;
            if (arml == null) {
                arml = arml.f;
            }
        }
        textView.setText(ajqy.a(arml));
    }
}
