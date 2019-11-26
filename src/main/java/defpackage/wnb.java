package defpackage;

import android.content.Context;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.FeedbackSurveyRendererOuterClass;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: wnb */
public final class wnb implements akot {
    public final LinearLayout a;
    private final Context b;
    private final aaas c;
    private final ArrayList d = new ArrayList();
    private arjw e;

    public wnb(Context context, aaas aaas) {
        this.b = (Context) amqw.a((Object) context);
        this.c = (aaas) amqw.a((Object) aaas);
        this.a = new LinearLayout(context);
        this.a.setOrientation(1);
        this.a.setLayoutParams(new LayoutParams(-1, -2));
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.a;
    }

    public final void a(arjw arjw) {
        this.e = arjw;
        this.a.removeAllViews();
        for (int i = 0; i < arjw.b.size(); i++) {
            wna wna;
            arju arju;
            if (i >= this.d.size()) {
                wna = new wna(this.b, this.a);
                this.d.add(wna);
            } else {
                wna = (wna) this.d.get(i);
            }
            this.a.addView(wna.a);
            axak axak = (axak) arjw.b.get(i);
            anxr access$000 = anxl.checkIsLite(FeedbackSurveyRendererOuterClass.feedbackQuestionRenderer);
            axak.a(access$000);
            if (axak.h.a(access$000.d)) {
                access$000 = anxl.checkIsLite(FeedbackSurveyRendererOuterClass.feedbackQuestionRenderer);
                axak.a(access$000);
                Object b = axak.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                arju = (arju) b;
            } else {
                arju = null;
            }
            wna.a(arju);
        }
        TextView youTubeTextView = new YouTubeTextView(this.b);
        youTubeTextView.d();
        adl.a(youTubeTextView, (int) R.style.f468TextAppearance.YouTube.Caption);
        youTubeTextView.setTextColor(xwe.a(this.b, R.attr.ytTextDisabled, 0));
        arml arml = arjw.c;
        if (arml == null) {
            arml = arml.f;
        }
        xpr.a(youTubeTextView, aabb.a(arml, this.c, false));
        this.a.addView(youTubeTextView);
    }

    private final Map c() {
        if (this.e == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < this.e.b.size(); i++) {
            wna wna = (wna) this.d.get(i);
            if (wna.d != null) {
                for (int i2 = 0; i2 < wna.d.c.size(); i2++) {
                    wnc wnc = (wnc) wna.b.get(i2);
                    if (wnc.e.isChecked()) {
                        hashMap.put(wnc.f.b, wnc.d.getText().toString());
                    }
                }
            }
        }
        return hashMap;
    }

    public final void b() {
        if (!c().isEmpty()) {
            Map hashMap = new HashMap();
            Boolean valueOf = Boolean.valueOf(true);
            hashMap.put("feedback_merge_token", valueOf);
            hashMap.put("feedback_unencrypted", valueOf);
            apvl apvl = (apvl) apvm.c.createBuilder();
            apvh apvh = (apvh) apvi.b.createBuilder();
            for (Entry entry : c().entrySet()) {
                apvj apvj = (apvj) apvk.d.createBuilder();
                String str = (String) entry.getKey();
                apvj.copyOnWrite();
                apvk apvk = (apvk) apvj.instance;
                if (str != null) {
                    apvk.a |= 1;
                    apvk.b = str;
                    String str2 = (String) entry.getValue();
                    apvj.copyOnWrite();
                    apvk apvk2 = (apvk) apvj.instance;
                    if (str2 != null) {
                        apvk2.a |= 2;
                        apvk2.c = str2;
                        apvk apvk3 = (apvk) ((anxl) apvj.build());
                        apvh.copyOnWrite();
                        apvi apvi = (apvi) apvh.instance;
                        if (apvk3 != null) {
                            if (!apvi.a.a()) {
                                apvi.a = anxl.mutableCopy(apvi.a);
                            }
                            apvi.a.add(apvk3);
                        } else {
                            throw new NullPointerException();
                        }
                    }
                    throw new NullPointerException();
                }
                throw new NullPointerException();
            }
            apvl.copyOnWrite();
            apvm apvm = (apvm) apvl.instance;
            apvm.b = (apvi) ((anxl) apvh.build());
            apvm.a = 1 | apvm.a;
            hashMap.put("feedback_token", Collections.singletonList(Base64.encodeToString(((apvm) ((anxl) apvl.build())).toByteArray(), 0)));
            aaas aaas = this.c;
            apxu apxu = this.e.d;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, hashMap);
        }
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        a((arjw) obj);
    }
}
