package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.FeedbackSurveyRendererOuterClass;
import java.util.ArrayList;

/* renamed from: wna */
public final class wna implements akot {
    public final ViewGroup a;
    public final ArrayList b = new ArrayList();
    public wnc c = null;
    public arju d;
    private final LayoutInflater e;
    private final TextView f;

    public wna(Context context, ViewGroup viewGroup) {
        this.e = LayoutInflater.from(context);
        this.a = (ViewGroup) this.e.inflate(R.layout.feedback_question_layout, viewGroup, false);
        this.f = (TextView) this.a.findViewById(R.id.question_text);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.a;
    }

    public final void a(arju arju) {
        arml arml;
        this.d = arju;
        TextView textView = this.f;
        if ((arju.a & 1) != 0) {
            arml = arju.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
        int i = 0;
        while (i < arju.c.size()) {
            wnc wnc;
            if (i >= this.b.size()) {
                wnc = new wnc(this, this.e, this.a);
                this.b.add(wnc);
                this.a.addView(wnc.a);
            } else {
                wnc = (wnc) this.b.get(i);
            }
            axak axak = (axak) arju.c.get(i);
            anxr access$000 = anxl.checkIsLite(FeedbackSurveyRendererOuterClass.feedbackOptionRenderer);
            axak.a(access$000);
            Object b = axak.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            arjt arjt = (arjt) b;
            if (wnc.g.d.d) {
                wnc.e = wnc.c;
                wnc.b.setVisibility(8);
            } else {
                wnc.e = wnc.b;
                wnc.c.setVisibility(8);
            }
            wnc.f = arjt;
            wnc.e.setVisibility(0);
            CompoundButton compoundButton = wnc.e;
            arml arml2 = arjt.c;
            if (arml2 == null) {
                arml2 = arml.f;
            }
            compoundButton.setText(ajqy.a(arml2));
            wnc.e.setChecked(false);
            EditText editText = wnc.d;
            arml arml3 = arjt.d;
            if (arml3 == null) {
                arml3 = arml.f;
            }
            editText.setHint(ajqy.a(arml3));
            wnc.d.setText(null);
            wnc.a(true);
            i++;
        }
        while (i < this.b.size()) {
            ((wnc) this.b.get(i)).a(false);
            i++;
        }
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        a((arju) obj);
    }
}
