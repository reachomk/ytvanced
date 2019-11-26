package defpackage;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RadioButton;
import com.google.android.youtube.R;

/* renamed from: aldo */
public final class aldo extends akpl {
    public final RadioButton a = ((RadioButton) this.b.findViewById(R.id.radio));
    private final View b;
    private final AppCompatImageView c = ((AppCompatImageView) this.b.findViewById(R.id.icon));
    private final akvp d;

    aldo(Context context, akvp akvp) {
        this.b = LayoutInflater.from(context).inflate(R.layout.subscription_notification_primary_option, null);
        this.d = (akvp) amqw.a((Object) akvp);
        this.b.setOnClickListener(new aldr(this));
    }

    public final View K_() {
        return this.b;
    }

    public final void a(akpb akpb) {
        this.a.setOnCheckedChangeListener(null);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(akor akor, Object obj) {
        CharSequence charSequence;
        arml arml;
        axxt axxt = (axxt) obj;
        RadioButton radioButton = this.a;
        aodx aodx = axxt.h;
        if (aodx == null) {
            aodx = aodx.c;
        }
        aodv aodv = aodx.b;
        if (aodv == null) {
            aodv = aodv.c;
        }
        if ((aodv.a & 2) == 0) {
            charSequence = null;
        } else {
            aodx = axxt.h;
            if (aodx == null) {
                aodx = aodx.c;
            }
            aodv = aodx.b;
            if (aodv == null) {
                aodv = aodv.c;
            }
            charSequence = aodv.b;
        }
        radioButton.setContentDescription(charSequence);
        radioButton = this.a;
        if ((axxt.a & 1) != 0) {
            arml = axxt.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        radioButton.setText(ajqy.a(arml));
        aldp aldp = (aldp) akor.a(aldp.o);
        if ((axxt.a & 2) == 0) {
            this.c.setVisibility(8);
        } else {
            AppCompatImageView appCompatImageView = this.c;
            akvp akvp = this.d;
            arwf arwf = axxt.c;
            if (arwf == null) {
                arwf = arwf.c;
            }
            arwh a = arwh.a(arwf.b);
            if (a == null) {
                a = arwh.UNKNOWN;
            }
            appCompatImageView.setImageResource(akvp.a(a));
            ade.a(this.c, xwe.b(this.b.getContext(), !aldp.a(axxt) ? R.attr.ytIconInactive : R.attr.ytCallToAction));
            this.c.setVisibility(0);
        }
        this.a.setOnCheckedChangeListener(null);
        this.a.setChecked(aldp.a(axxt));
        this.a.setOnCheckedChangeListener(new aldq(aldp, axxt));
    }
}
