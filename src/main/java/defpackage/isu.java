package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.youtube.R;

/* renamed from: isu */
public final class isu extends akpl {
    private final akkq a;
    private final CardView b;
    private final ImageView c = ((ImageView) amqw.a((ImageView) this.b.findViewById(R.id.thumbnail)));
    private final TextView d = ((TextView) amqw.a((TextView) this.b.findViewById(R.id.title)));
    private final akoj e;

    public isu(Activity activity, akkq akkq, aaas aaas, ViewGroup viewGroup) {
        this.a = (akkq) amqw.a((Object) akkq);
        this.b = (CardView) LayoutInflater.from(activity).inflate(R.layout.album_card, viewGroup, false);
        this.e = new akoj(aaas, this.b);
        activity.getResources();
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
        aopf aopf = (aopf) obj;
        akoj akoj = this.e;
        acvx acvx = akor.a;
        arml arml = null;
        if ((aopf.a & 8) != 0) {
            apxu = aopf.e;
            if (apxu == null) {
                apxu = apxu.d;
            }
        } else {
            apxu = null;
        }
        akoj.a(acvx, apxu, akor.b());
        akkq akkq = this.a;
        ImageView imageView = this.c;
        aygk aygk = aopf.b;
        if (aygk == null) {
            aygk = aygk.f;
        }
        akkq.a(imageView, aygk);
        TextView textView = this.d;
        if ((aopf.a & 2) != 0) {
            arml = aopf.c;
            if (arml == null) {
                arml = arml.f;
            }
        }
        textView.setText(ajqy.a(arml));
    }
}
