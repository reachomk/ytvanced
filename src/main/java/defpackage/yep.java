package defpackage;

import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.youtube.conversation.ui.PassThroughTextView;
import com.google.android.youtube.R;

/* renamed from: yep */
public final class yep extends yde {
    public apxu a;
    public final aaas g;
    public apxu m;
    public allb n;
    private final PassThroughTextView o = ((PassThroughTextView) this.i.findViewById(R.id.conversation_event_text));

    /* Access modifiers changed, original: protected|final */
    public final TextView f() {
        return this.o;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        apxu apxu;
        aqnr aqnr = (aqnr) obj;
        super.a_(akor, aqnr);
        this.o.setText(zcz.a(aqnr, this.g));
        apxu apxu2 = null;
        if ((aqnr.a & 128) != 0) {
            apxu = aqnr.i;
            if (apxu == null) {
                apxu = apxu.d;
            }
        } else {
            apxu = null;
        }
        this.a = apxu;
        if ((aqnr.a & 256) != 0) {
            apxu2 = aqnr.j;
            if (apxu2 == null) {
                apxu2 = apxu.d;
            }
        }
        this.m = apxu2;
        this.n = (allb) amqw.a(akor.a("PERMISSION_REQUESTER"));
    }

    /* synthetic */ yep(ViewGroup viewGroup, aaas aaas, akkq akkq, ygu ygu, akmx akmx) {
        super(viewGroup, aaas, akkq, ygu, akmx);
        this.g = (aaas) amqw.a((Object) aaas);
        a((int) R.layout.conversation_text_bubble).setOnClickListener(new yes(this));
        PassThroughTextView passThroughTextView = this.o;
        passThroughTextView.a = true;
        passThroughTextView.setTextColor(-1);
        this.o.setCompoundDrawablePadding(viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.conversation_link_item_icon_padding));
        PassThroughTextView passThroughTextView2;
        if (e()) {
            passThroughTextView2 = this.o;
            passThroughTextView2.setCompoundDrawablesWithIntrinsicBounds(null, null, rz.a(passThroughTextView2.getResources(), R.drawable.quantum_ic_keyboard_arrow_right_white_24, this.o.getContext().getTheme()), null);
            return;
        }
        passThroughTextView2 = this.o;
        passThroughTextView2.setCompoundDrawablesWithIntrinsicBounds(rz.a(passThroughTextView2.getResources(), R.drawable.quantum_ic_keyboard_arrow_left_white_24, this.o.getContext().getTheme()), null, null, null);
    }
}
