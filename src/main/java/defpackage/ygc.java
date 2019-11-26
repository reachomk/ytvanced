package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: ygc */
public final class ygc extends yde {
    private final aaas a;
    private final TextView m = ((TextView) this.i.findViewById(R.id.conversation_event_text));

    public ygc(View view, aaas aaas, akkq akkq, ygu ygu, akmx akmx) {
        super(view, aaas, akkq, ygu, akmx);
        this.a = (aaas) amqw.a((Object) aaas);
        a((int) R.layout.conversation_text_bubble);
        this.m.setOnLongClickListener(new ygb(this));
    }

    /* Access modifiers changed, original: protected|final */
    public final TextView f() {
        return this.m;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        aqoj aqoj = (aqoj) obj;
        super.a_(akor, aqoj);
        this.m.setText(zcz.a(aqoj, this.a));
        this.m.setMovementMethod(new ygd());
    }
}
