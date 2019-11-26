package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: absz */
public abstract class absz implements akot {
    public final View a;
    public final ImageView b = e();
    private final TextView c = c();
    private final TextView d = d();

    public absz(Context context) {
        this.a = View.inflate(context, b(), null);
        a(context);
    }

    public void a(akpb akpb) {
    }

    public abstract void a(aygk aygk);

    public abstract int b();

    public abstract TextView c();

    public abstract TextView d();

    public abstract ImageView e();

    public final View K_() {
        return this.a;
    }

    /* Access modifiers changed, original: protected */
    public void a(Context context) {
        Resources resources = context.getResources();
        MarginLayoutParams marginLayoutParams = new MarginLayoutParams(-1, -2);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.live_chat_paid_message_margin);
        marginLayoutParams.setMarginStart(dimensionPixelOffset);
        marginLayoutParams.setMarginEnd(dimensionPixelOffset);
        this.a.setLayoutParams(marginLayoutParams);
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        arml arml;
        audr audr = (audr) obj;
        TextView textView = this.c;
        arml arml2 = null;
        if ((audr.a & 16) != 0) {
            arml = audr.e;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = this.d;
        if ((audr.a & 32) != 0) {
            arml2 = audr.f;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        }
        xpr.a(textView, ajqy.a(arml2));
        if (this.b != null) {
            aygk aygk = audr.h;
            if (aygk == null) {
                aygk = aygk.f;
            }
            a(aygk);
        }
    }
}
