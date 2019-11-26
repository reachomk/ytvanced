package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ygy */
public final class ygy implements akot {
    private final aaas a;
    private final View b;
    private final TextView c = ((TextView) this.b.findViewById(R.id.invite_more_text));
    private aqmp d;

    public ygy(Context context, aaas aaas) {
        this.a = (aaas) amqw.a((Object) aaas);
        this.b = View.inflate(context, R.layout.invite_more_participants, null);
        View findViewById = this.b.findViewById(R.id.invite_more_button);
        findViewById.setOnClickListener(new ygx(this));
        this.c.setOnClickListener(new yha(this));
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.b;
    }

    public final void b() {
        aqmp aqmp = this.d;
        if (aqmp != null) {
            aphj aphj = aqmp.b;
            if (aphj == null) {
                aphj = aphj.d;
            }
            aphg aphg = aphj.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
            if ((aphg.a & 4096) != 0) {
                apxu apxu = aphg.m;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                Map hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.d);
                this.a.a(apxu, hashMap);
            }
        }
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        arml arml;
        aqmp aqmp = (aqmp) obj;
        this.d = aqmp;
        TextView textView = this.c;
        if ((aqmp.a & 2) != 0) {
            arml = aqmp.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
    }
}
