package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: yee */
public final class yee extends yde {
    private final TextView a = ((TextView) this.i.findViewById(R.id.channel_title));
    public final aaas g;
    private final TextView m = ((TextView) this.i.findViewById(R.id.channel_metadata));
    private final LinearLayout n = ((LinearLayout) this.i.findViewById(R.id.chat_bubble_content));
    private final aloz o;

    public yee(View view, aaas aaas, akkq akkq, ygu ygu, akmx akmx) {
        super(view, aaas, akkq, ygu, akmx);
        a((int) R.layout.conversation_channel_bubble);
        this.g = aaas;
        this.o = new aloz(akkq, (ImageView) this.i.findViewById(R.id.channel_thumbnail));
        this.n.setOnLongClickListener(new yed(this));
    }

    /* Access modifiers changed, original: protected|final */
    public final TextView f() {
        return this.a;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        arml arml;
        aqmx aqmx = (aqmx) obj;
        super.a_(akor, aqmx);
        aygk aygk = null;
        this.a.setText((aqmx.a & 256) != 0 ? aqmx.j : null);
        TextView textView = this.m;
        if ((aqmx.a & 4194304) != 0) {
            arml = aqmx.s;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
        aloz aloz = this.o;
        if ((aqmx.a & 2097152) != 0) {
            aygk = aqmx.r;
            if (aygk == null) {
                aygk = aygk.f;
            }
        }
        aloz.a(aygk);
        this.n.setOnClickListener(new yeg(this, aqmx));
    }
}
